create database SQLExercise003;
use SQLExercise003;

create table students(
student_id int primary key , 
first_name varchar(20), 
last_name varchar(20), 
enrollment_date date
);
insert into students(student_id, first_name, last_name, enrollment_date) values
(1,'John','Doe','2023-01-15'),
(2,'Jane','Smith','2023-01-16'),
(3,'Emily','Johnson','2023-01-17');

create table courses(
course_id int primary key ,  
course_name varchar(20), 
credits int
);
insert into courses(course_id,course_name, credits) values
(1,'Database System',3),
(2,'Web Development',4),
(3,'Data Structures',3);

create table enrollments(
enrollment_id int primary key, 
student_id int, 
foreign key ( student_id) references students(student_id),
course_id int, 
foreign key ( course_id) references courses(course_id),
grade char
);
insert into enrollments (enrollment_id, student_id, course_id, grade) values
(1,1,1,'A'),
(2,1,2,'B'),
(3,2,1,'A'),
(4,3,3,'C');
select * from students;
select * from courses;
select * from enrollments;
-- ====================================================================================

create table employees(
employee_id int primary key, 
first_name varchar(20), 
last_name varchar(20),
hire_date date, 
department_id int,
foreign key (department_id) references departments(department_id)
);
insert into employees(employee_id, first_name, last_name, hire_date, department_id) values
(1,'Alice','Brown','2022-05-01',1),
(2,'Bob','White','2021-03-15',2),
(3,'Charlie','Black','2020-11-30',1);

create table departments(
department_id int primary key , 
department_name varchar(20)
);
insert into departments(department_id, department_name) values
(1,'Human Resources'),
(2,'IT');

select * from employees;
select * from departments;
-- ====================================================================================

-- 從 Students 表中選擇所有學生的姓名和入學日期。
select concat(first_name, ' ',last_name) as full_name, enrollment_date 
from students;
-- 從 Enrollments 表中選擇所有學生的姓名、課程名稱和成績。
select concat(s.first_name, ' ', s.last_name) as full_name,c.course_name, e.grade
from enrollments e
inner join students s  on e.student_id = s.student_id
inner join courses c on c.course_id = e.course_id;

-- 計算每個部門的員工人數。
select d.department_name, count(e.employee_id) as total_count
from departments d
left join employees e  on d.department_id = e.department_id
group by d.department_name;

-- 從 Employees 表中選擇在 2021 年以後雇用的所有員工。
select concat(first_name, ' ' ,last_name) as full_name, hire_date 
from employees 
where hire_date > '2021-01-01';
-- ====================================================================================

-- 查詢所有選修了“Web Development”課程的學生姓名和成績。
select concat(s.first_name, ' ',s.last_name) as full_name, c.course_name, e.grade
from courses c
inner join enrollments e on e.course_id = c.course_id
inner join students s on s.student_id = e.student_id
where c.course_name = 'Web Development';

-- 查詢每位學生的平均成績。
SELECT s.first_name, s.last_name, round(AVG(CASE 
    WHEN e.grade = 'A' THEN 4
    WHEN e.grade = 'B' THEN 3
    WHEN e.grade = 'C' THEN 2
    ELSE 0 END),2) AS average_grade
FROM Students s
JOIN Enrollments e ON s.student_id = e.student_id
GROUP BY s.student_id;

-- 查詢入學日期在 2023 年 1 月 16 日之後的所有學生。
select concat(first_name, ' ', last_name) as full_name, enrollment_date
from students
where enrollment_date > '2023-01-16';

-- 查詢所有課程的名稱及其選修人數。
select c.course_name, count(e.student_id) as total_count
from courses c 
inner join enrollments e on e.course_id = c.course_id
group by c.course_name;

-- 查詢所有員工的姓名和他們所屬的部門名稱。
select concat(first_name,' ', last_name) as full_name, department_name
from employees e
left join departments d on d.department_id = e.employee_id;

-- 查詢每個部門的平均雇用日期。
select d.department_name, round (avg(e.hire_date) ,2) as average_hire_date
from departments d
inner join employees e on e.department_id = d.department_id
group by d.department_name;

-- 查詢在“Human Resources”部門工作的所有員工的姓名。
select concat(e.first_name, ' ', e.last_name) as full_name, d.department_name
from employees e
inner join departments d on e.department_id = e.department_id
where d.department_name = 'Human Resources';
-- 查詢最近雇用的員工（按雇用日期排序）。
select concat(e.first_name, ' ', e.last_name) as full_name, e.hire_date
from employees e
order by e.hire_date desc;
-- ====================================================================================
-- 查詢所有學生的姓名及他們所修的課程數量。
select concat(s.first_name, ' ' , s.last_name) as full_name, count(e.course_id)
from students s
inner join enrollments e on s.student_id = e.student_id
group by s.student_id;
-- 查詢選修了超過 1 門課程的學生姓名。
select concat(s.first_name, ' ', s.last_name) as full_name, count(e.course_id)
from students s 
inner join enrollments e on s.student_id = e.student_id
group by s.student_id
having count(e.course_id) > 1;

-- 查詢所有課程的最高成績和最低成績。
select c.course_name,
Max(case when e.grade = 'A' then 4
		when e.grade = 'B' then 3
		when e.grade = 'C' then 2
        else 0 end) as highest_grade,
Min(case when e.grade = 'A' then 4
		when e.grade = 'B' then 3
		when e.grade = 'C' then 2
        else 0 end) as lowest_grade
from courses c
left join enrollments e on c.course_id = e.course_id
group by c.course_name;
        
-- 查詢每位學生的入學年份。
select concat(first_name, ' ',last_name) as full_name, year(enrollment_date)
from students s;
-- ====================================================================================
-- 查詢所有員工的姓名及其雇用年限（以年為單位）。
select concat(first_name, ' ' , last_name) as full_name, 
round(datediff(curdate(),hire_date)/ 365,2) as years_of_service
from employees;

-- 查詢每個部門中雇用的員工數量，並按照數量降序排列。
select d.department_name, count(e.employee_id) as employee_count
from departments d
inner join employees e on e.department_id = d.department_id
group by d.department_id
order by employee_count desc ;

-- 查詢在“IT”部門工作的員工的姓名和雇用日期。
select e.first_name, e.last_name, e.hire_date,d.department_name
from employees e
inner join departments d on d.department_id = e.department_id
where d.department_name = 'IT';
-- 查詢所有雇用日期在 2022 年之前的員工姓名和所屬部門。
select e.first_name, e.last_name,d.department_name, e.hire_date
from employees e
inner join departments d on d.department_id = e.department_id
where e.hire_date < '2022-01-01';
-- ====================================================================================
-- 查詢所有學生的姓名及其選修的課程名稱。
select s.first_name, s.last_name, c.course_name
from students s
inner join enrollments e on e.student_id = s.student_id
inner join courses c on e.course_id = c.course_id;
-- 查詢每位學生的最高成績。
SELECT s.first_name, s.last_name, round(Max(
CASE 
    WHEN e.grade = 'A' THEN 4
    WHEN e.grade = 'B' THEN 3
    WHEN e.grade = 'C' THEN 2
    ELSE 0 END),2) AS Max_grade
FROM Students s
JOIN Enrollments e ON s.student_id = e.student_id
GROUP BY s.student_id;
-- 查詢未選修任何課程的學生姓名。
select s.first_name, s.last_name,e.enrollment_id
from students s 
left join enrollments e on s.student_id = e.student_id
where e.course_id is null;

-- 查詢每門課程的平均成績。
SELECT c.course_name, round(avg(
CASE 
    WHEN e.grade = 'A' THEN 4
    WHEN e.grade = 'B' THEN 3
    WHEN e.grade = 'C' THEN 2
    ELSE 0 END),2) AS Max_grade
FROM courses c
JOIN Enrollments e ON c.course_id = e.course_id
GROUP BY c.course_name;
-- ====================================================================================

-- 查詢所有員工的姓名及其部門的平均雇用日期。
select e.first_name, e.last_name, avg(e.hire_date) as new_hire_date
from employees e
inner join departments d on d.department_id = e.department_id
group by e.first_name, e.last_name,e.department_id;

-- 查詢所有部門的名稱及其最早的雇用員工姓名。
select d.department_name, e.first_name, e.last_name,e.hire_date
from departments d 
inner join employees e on d.department_id = e.department_id
where e.hire_date = (
select min(hire_date)
from employees 
where department_id = d.department_id);

-- 查詢雇用年限超過 5 年的員工姓名和所屬部門。
select e.first_name, e.last_name,e.hire_date
from departments d
inner join employees e on d.department_id = e.department_id
where datediff(curdate(),e.hire_date) / 365 > 5; 

-- 查詢所有員工的姓名及其直屬部門的名稱。
select e.first_name, e.last_name, d.department_name
from departments d
inner join employees e on e.department_id = d.department_id
order by d.department_name;
-- ====================================================================================

-- 查詢所有學生的姓名及其入學日期，按入學日期升序排列。
select s.first_name, s.last_name, s.enrollment_date
from students s
order by enrollment_date;
-- 查詢每位學生所選課程的總學分。
select s.first_name, s.last_name,sum(c.credits) as total_credits
from courses c
inner join enrollments e on e.course_id = c.course_id
inner join students s on s.student_id = e.student_id
group by s.student_id;

-- 查詢選修了“Database Systems”課程的學生姓名和成績。
select s.first_name, s.last_name, c.course_name,e.grade
from courses c
inner join enrollments e on e.course_id = c.course_id
inner join students s on s.student_id = e.student_id
where c.course_name = 'Database System';

-- 查詢所有學生的姓名及其每門課程的成績，按學生姓名和課程名稱升序排列。
select s.first_name, s.last_name, c.course_name, e.grade
from courses c
inner join enrollments e on e.course_id = c.course_id
inner join students s on s.student_id = e.student_id
order by s.first_name, s.last_name;

-- 查詢所有部門的名稱及其雇用員工的姓名，按部門名稱升序排列。
select d.department_name,e.first_name, e.last_name
from departments d
inner join employees e on e.department_id = d.department_id
order by d.department_name;
-- 查詢每位員工的姓名及其在公司工作的年限，按年限降序排列。
select first_name, last_name, 
datediff(curdate(),hire_date) / 365 as work_years
from employees
order by work_years;

-- 查詢每個部門的最晚雇用日期及其部門名稱。
select d.department_name, max(e.hire_date)
from departments d
inner join employees e on e.department_id = d.department_id
group by d. department_name;

-- 查詢在 2023 年以後雇用的所有員工的姓名及部門名稱。
select first_name, last_name, department_name,hire_date
from employees e 
inner join departments d on e.department_id = d.department_id
where hire_date > '2023-01-01';