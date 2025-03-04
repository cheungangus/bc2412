create database JoinExercise003;
use JoinExercise003;

create table students(
student_id int primary key,
student_name varchar(20),
major_id int ,
foreign key (major_id) references majors(major_id)
);
select * from students;
insert into students(student_id,student_name, major_id) values
(1,'Alice',101), 
(2,'Bob',102), 
(3,'Charlie',Null),
(4,'David',103);

create table majors(
major_id int primary key, 
major_name varchar(20)
);
insert into majors(major_id, major_name) values
(101,'Computer Science'), 
(102,'Mathematics'), 
(103,'Physics'),
(104,'Literature');

create table courses(
course_id int primary key, 
course_name varchar(20), 
teacher_id int, 
foreign key (teacher_id) references teachers(teacher_id)
);
insert into courses (course_id, course_name, teacher_id) values
(201, 'Database', 301),
(202, 'Calculus', 302),
(203, 'Quantum' , 303),
(204, 'Poetry' , Null);

create table teachers(
teacher_id int primary key,
teacher_name varchar(20)
);
select * from teachers;
drop table teachers;
insert into teachers(teacher_id, teacher_name) values
(301, 'Dr.Smith'),
(302, 'Prof.Lee'),
(303, 'Ms.Brown');

create table enrollments(
enrollment_id int primary key, 
student_id int, 
course_id int, 
grade int,
foreign key (student_id) references students(student_id),
foreign key (course_id) references courses(course_id)
);
insert into enrollments(enrollment_id, student_id, course_id, grade) values
(1,1,201,85),
(2,1,202,90),
(3,2,202,78),
(4,4,203,95),
(5,4,204,Null);

-- 问题：列出所有课程及其教师名称（包括未分配教师的课程）。
select t.teacher_name, c.course_name
from courses c
left join teachers t 
on c.teacher_id = t.teacher_id
;

-- 问题：找出选修了 “Database” 课程的学生姓名。 students , enrollments,course
select s.student_name
from students s
where exists( select 1 
from enrollments e
inner join courses c on c.course_id = e.course_id
where e.student_id = s.student_id and c.course_name = 'Database');

-- 问题：找出每门课程的最高分及其对应的学生姓名。 students, enrollments,course

select c.course_name, s.student_name, e.grade
from enrollments e
inner join courses c on c.course_id = e.course_id
inner join students s on s.student_id = e.student_id
where (e.course_id, e.grade) in (
select course_id, max(grade)
from enrollments
group by course_id);

select c.course_name, s.student_name, e.grade
from enrollments e 
inner join courses c on c.course_id = e.course_id
inner join students s on s.student_id = e.student_id
where (e.course_id, e.grade) in(
select course_id, min(grade)
from enrollments
group by course_id) ;


-- 问题：列出所有学生及其专业名称（包括未选择专业的学生）。
select s.student_id,s.student_name, m.major_name
from students s
left join majors m
on s.major_id = m.major_id
;
-- 问题：统计每个专业的学生人数（包括没有学生的专业）。
select m.major_name, count(s.student_id) as total_count
from majors m
left join students s 
on s.major_id = m.major_id
group by m.major_name
;

-- 问题：找出没有选任何课程的学生。
select s.student_name
from students s
left join enrollments e
on s.student_id = e.student_id
where enrollment_id is null
;

-- 问题：列出所有选课记录，显示学生姓名、课程名称和成绩。 students, enrollments, course
select s.student_name, c.course_name, e.grade
from students s
inner join enrollments e on s.student_id = e.student_id
inner join courses c on c.course_id = e.course_id
;

-- 问题：列出所有学生及其所选课程数量（包括未选课的学生）。 students, enrollments
select s.student_name, count(e.enrollment_id)
from students s
left join enrollments e 
on s.student_id = e.student_id
group by s.student_name
;

-- 问题：将成绩分为 “优秀”（≥90）、“及格”（≥60）和 “不及格”（<60）。
select s.student_name, c.course_name, grade,
case 
	when grade >= 90 then 'excellent'
    when grade >= 60 then 'good'
    when grade <= 60 then 'fail'
End as level
from enrollments e
inner join students s on s.student_id = e.student_id
inner join courses c on c.course_id = e.course_id
where grade is not null;

-- 问题：假设 students 表新增字段 mentor_id（外键指向自身），列出学生及其导师姓名。

alter table students 
add mentor_id int,
add constraint fk_mentor
foreign key (mentor_id) references students(student_id);

update students
set mentor_id = 1
where student_id = 2;
update students
set mentor_id = 2
where student_id = 3;
update students
set mentor_id = 1
where student_id = 4;
select * from students;

select s.student_name, m.student_name as mentor_name
from students s
left join students m
on s.mentor_id = m.student_id;

