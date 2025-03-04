create database JoinExercise004;
use JoinExercise004;

create table members(
member_id int primary key, 
member_name varchar(20), 
join_date date
);
insert into members(member_id, member_name, join_date) values
(101, 'Alice','2022-01-01'),
(102, 'Bob', '2023-03-15'), 
(103, 'Charlie', '2023-02-10'),
(104, 'David', null);
select * from members;

create table books(
book_id int primary key, 
book_title varchar(20),
author varchar(20), 
publish_year int);

insert into books(book_id, book_title, author, publish_year) values
(201,'SQL Mastery', 'Tom Smith', 2020), 
(202,'Python Basics', 'Jane Doe',2021), 
(203, 'Data Science 101', 'Alice Brown', 2019), 
(204, 'Web Development', null, 2023);
select * from books;

create table borrows(
borrow_id int primary key, 
member_id int, 
foreign key(member_id) references members(member_id),
book_id int, 
foreign key(book_id) references books(book_id),
borrow_date date, 
return_date date
);
insert into borrows (borrow_id, member_id, book_id, borrow_date, return_date) values
(1,101,201,'2023-01-05','2023-02-05'),
(2,101,202,'2023-03-10',null),
(3,102,201,'2023-04-01','2023-04-15'),
(4,103,203,'2023-05-20',null);
select * from borrows;

-- 问题：列出所有借阅记录的详细信息，包括会员名称和书籍标题。 borrows,books
select m.member_name, bk.book_title,b.borrow_date
from members m
inner join borrows b on m.member_id = b.member_id
inner join books bk on bk.book_id = b.book_id
;

-- 问题：列出所有书籍及其借阅记录（包括未被借阅的书籍）。
select b.book_title, bw.borrow_date
from books b
left join borrows bw
on b.book_id = bw.book_id
;

-- 问题：找出从未被借阅过的书籍。
select b.book_title,bw.borrow_date
from books b
left join borrows bw 
on b.book_id = bw.book_id
where bw.book_id is null
;

-- 问题：统计每本书的借阅次数（包括未被借阅的书籍）。
select b.book_title, count(br.borrow_id) as borrow_count
from books b
left join borrows br
on br.book_id = b.book_id
group by b.book_title

-- 问题：找出借阅过《SQL_Mastery》的会员名称。
select member_name
from members
where member_id in(
select member_id
from members
where book_id = (
select book.id
from borrows
where book_title = 'SQL Mastery'
)
);

-- 问题：列出 2023 年 3 月之后的借阅记录，包括会员名称和书籍标题。

select m.member_name,bs.book_id, b.book_title,bs.borrow_date
from borrows bs 
inner join members m on m.member_id = bs.member_id
inner join books b on b.book_id = bs.book_id
where bs.borrow_date >= '2023-03-01'; 

-- 问题：列出所有会员及其未归还的书籍（return_date 为 NULL）。

select m.member_name, b.book_title
from members m 
left join borrows bs on m.member_id = bs.member_id and bs.return_date is null
left join books b on b.book_id = bs.book_id
where bs.book_id is not null
;

-- 问题：标记借阅时间是否超过 30 天（超过显示 "Overdue"，否则显示 "On Time"）。
select  m.member_name,b.book_title,
case 
	when return_date is null and datediff('2023-06-01', borrow_date) > 30 then 'Overdue'
	else 'on time'
end as status
from borrows br
inner join members m on br.member_id = m.member_id
inner join books b on br.book_id = b.book_id
;

-- 问题：找出借阅次数超过 1 次的会员。
select b.member_name, count(br.borrow_id) as borrow_count
from borrows br
inner join members b on b.member_id = br.member_id
group by b.member_name
having count(br.borrow_id) > 1;

-- 问题：假设 members 表新增字段 referrer_id（外键指向自身），列出会员及其推荐人。
alter table members
add referrer_id int,
add constraint fk_referror
foreign key (referrer_id) references members(member_id);
select * from members;

update members
set referrer_id = 101
where member_id = 102;

update members
set referrer_id = 102
where member_id = 103;

update members
set referrer_id = 101
where member_id = 104;

select m.member_name ,mr.member_name as referrer
from members m
left join members mr 
on m.referrer_id = mr.member_id;