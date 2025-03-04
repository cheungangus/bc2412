create database JoinTest;
use JoinTest;

create table employeesID(
id int primary key);
select * from employeesID;
insert into employeesID (id) values
(1),(2),(3);

create table departmentID(
id int primary key);
select * from departmentID;
insert into departmentID (id) values
(1),(2),(3);

create table employees(
id int primary key, 
name varchar(40), 
dept_id int, 
foreign key (dept_id) references departmentID(id)
);
select * from employees;
drop table employees;
insert into employees(id, name, dept_id) values 
(1,'peter',1),
(2,'tom',2),
(3,'apple',3);

create table department(
id int primary key, 
dept_name varchar(40)
);
select * from department;
insert into department(id, dept_name) values
(1,'HR'),
(2,'IT'),
(3,'admin');

create table customers(
id int, 
name varchar(40)
);
select * from customers;
insert into customers(id, name) values
(1, 'tom'),
(2, 'pom'),
(3, 'jim'),
(4, 'kim');

create table orders(
Orderid int,
customerid int, 
OrderDate date
);
insert into orders(orderid, customerid, orderdate) values
(1,1,'2025-01-11'),
(2,2,'2024-01-12'),
(3,3,null),
(4,4,'2020-02-22');
drop table orders;
Select * from orders;

select customers.name, orders.orderDate
from customers 
inner join orders
on customers.id = orders.customerid
where orderDate is not null;

select customers.name, orders.orderDate
from orders
left join customers
on customers.id = orders.customerid
;


select e.name as employees_name, d.dept_name
from  department d
left join  employees e
on d.id = e.id;
;

select e.name as employees_name, d.dept_name
from department d
inner join employees e
on d.id = e.id
order by d.dept_name;

select e.name as employees_name, d.dept_name
from department d
left join employees e
on d.id = e.id 
;

select count( e.id) as employees_count, d.dept_name
from department d
inner join employees e
on d.id = e.id
group by 
d.dept_name
;

select e.name as employees_name
from employees e
left join department t
on d.id = e.id;
