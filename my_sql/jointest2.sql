create database jointest;
use jointest;

create table customers (
customerid int primary key, 
customername varchar(20)
);
select * from customers;
drop table customers;
insert into customers(customerid, customername) values
(1,'alice'),
(2,'bob'),
(3,'charlie'),
(4,'david');

create table orders(
orderid int primary key, 
customerid int, 
foreign key (customerid) references customers(customerid),
orderDate date
);
select * from orders;
drop table orders;
insert into orders(orderid, customerid, orderdate) values
(101, 1, '2023-01-15'),
(102, 1, '2023-02-20'),
(103, 2, '2023-03-10'),
(104, 3, '2024-04-05'),
(105, 3, '2024-05-12');

-- 問題1 ：返回所有下過訂單的客戶名稱和他們的訂單日期。
select customers.customername, orders.orderdate
from customers 
inner join orders
on customers.customerid = orders.customerid;
-- 問題2：返回所有客戶的名稱，以及他們的訂單日期（如果有的話）。如果客戶沒有下過訂單，訂單日期應該顯示為 NULL。
select customers.customername, orders.orderdate
from customers
left join orders
on customers.customerid = orders.customerid
;

create table employees(
employeeid int primary key, 
employeename varchar(20),
departmentid int, 
foreign key (departmentid) references departments(departmentid)
);
select * from employees;
drop table  employees;
insert into employees(employeeid, employeename, departmentid) values
(1001, 'emma', 10), 
(1002, 'liam', 20), 
(1003, 'olivia', 20),
(1004, 'noah', null);

create table departments(
departmentid int primary key, 
departmentname varchar(20)
);
select * from departments;
drop table departments;
insert into departments(departmentid, departmentname) values
(10, 'hr'), 
(20, 'it'),
(30, 'sales');
-- 問題3：返回所有員工的名稱、他們所在的部門名稱，以及他們參與的項目名稱（如果有的話）。如果員工沒有參與任何項目，項目名稱應該顯示為 NULL。
select e.employeename, d.departmentname,p.projectname
from employees e
inner join departments d
on e.departmentid = d.departmentid
left join projects p 
on p.employeeid = e.employeeid;

create table projects(
projectid int primary key, 
projectname varchar(20), 
employeeid int, 
foreign key (employeeid) references employees(employeeid)
);
select * from projects;
drop table projects;
insert into projects(projectid, projectname, employeeid)values
(501, 'website redesign', 1002), 
(502, 'payroll system', 1001), 
(503, 'cloud migration', 1002);


-- 問題4：返回所有在 2023 年下過訂單的客戶名稱和他們的訂單日期。如果客戶在 2023 年沒有下過訂單，則不顯示該客戶。
select  c.customername , o.orderdate
from customers c
inner join orders o
on c.customerid = o.customerid
where year (o.orderdate) = 2023;

-- 問題5：返回所有沒有下過任何訂單的客戶名稱。
select c.customername
from customers c
left join orders o
on c.customerid = o.customerid
where o.orderid is null;


create table products(
productid int primary key , 
productname varchar(20), 
categoryid int,
foreign key (categoryid) references categories(categoryid)
);
select * from products;
insert into products(productid, productname, categoryid) values
(201, 'laptop', 1), 
(202, 't-shirt', 2), 
(203, 'smartphone', 1), 
(204, 'novel', 3);

create table categories(
categoryid int primary key, 
categoryname varchar(20)
);
select * from categories;
drop table creategories;
insert into categories(categoryid, categoryname) values
(1, 'electronics'), 
(2, 'clothing'), 
(3, 'books');

-- 問題6：返回所有產品名稱及其類別名稱，但只顯示類別名稱為 "Electronics" 的產品。
select c.categoryname, p.productname 
from products p 
inner join categories c
on p.categoryid = c.categoryid
where c.categoryname = 'electronics';
-- 問題7：返回每個客戶的名稱以及他們的訂單總數。如果客戶沒有下過訂單，訂單總數應該顯示為 0。
select c.customername, count(o.orderid) as totalorders
from customers c
left join orders o
on c.customerid = o.customerid
group by 
c.customername;
;
-- 問題8：返回每個客戶的名稱以及他們在 2023 年的訂單總數。只顯示在 2023 年下過訂單的客戶。
select c.customername, count(o.orderid) as totalorders
from customers c
left join orders o
on c.customerid = o.customerid
where year (o.orderdate) = 2023
group by c.customername;

-- 問題9：返回所有客戶的名稱以及他們最近一次下訂單的日期。如果客戶沒有下過訂單，最近訂單日期應該顯示為 NULL。
select c.customername, max(o.orderdate) as lastorderdate
from customers c
left join orders o
on c.customerid = o.customerid 
group by 
c.customername
;

create table students(
studentid int primary key, 
studentname varchar(20), 
grade int
);
select * from students;
insert into students(studentid, studentname, grade) values
(501, 'ethan', 10), 
(502, 'sophia',11), 
(503, 'mason', 10);

create table scores(
scoreid int primary key, 
studentid int,
foreign key (studentid) references scores(scoreid), 
subject varchar(20), 
score int
);
select * scores;
insert into scores(scoreid, studentid, subject, score) values
(701, 501, 'math',95), 
(702, 501, 'physics', 88), 
(703, 502, 'chemistry', 92);

-- 問題10：返回所有成績大於 90 分的學生名稱、科目和分數。
select s.studentname, sc.subject, sc.score
from students s
inner join scores sc
on s.studentid = sc.studentid
where sc.score > 90
;
