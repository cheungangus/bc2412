create database SQL_Exercise2;

-- Use database
use SQL_Exercise2;

show databases;

create table worker(
worker_id integer not null primary key auto_increment, 
first_name char(25), 
last_name char(25), 
salary numeric(15), 
joining_date datetime, 
department char(25)
);
select * from worker;
insert into worker
(first_name, last_name, salary, joining_date, department) values
('Monika', 'Arora', 100000, '21-02-20 09:00:00', 'HR'),
('Niharika', 'Verma', 80000, '21-06-11 09:00:00', 'Admin'),
('Vishal', 'Singhal', 300000, '21-02-20 09:00:00', 'HR'),
('Mohan', 'Sarah', 300000, '12-03-19 09:00:00', 'Admin'),
('Amitabh', 'Singh', 500000, '21-02-20 09:00:00', 'Admin'),
('Vivek', 'Bhati', 490000, '21-06-11 09:00:00', 'Admin'),
('Vipul', 'Diwan', 200000, '21-06-11 09:00:00', 'Account'),
('Satish', 'Kumar', 75000, '21-01-20 09:00:00', 'Account'),
('Geetika', 'Chauhan', 90000, '21-04-11 09:00:00', 'Admin');

create table bonus(
worker_ref_id integer, 
bonus_amount numeric(10), 
bonus_date datetime, 
foreign key (worker_ref_id) references worker(worker_id));

select * from bonus;
drop table bonus;
-- Q1
insert into bonus
(worker_ref_id, bonus_amount, bonus_date) values
(6,32000, '21-02-02'), 
(6,20000, '22-02-02'), 
(5,21000, '21-02-02'), 
(9,30000, '21-02-02'), 
(8,4500, '22-02-02'); 

-- Q2 Write an SQL query to show the second hightest salary amont all workers
select first_name, last_name, salary from worker order by salary DESC ;

-- Q3 Write an SQL query to print the name of employees having the hightest salary in each department.
select first_name, last_name, salary, department 
from worker 
group by first_name, last_name, salary, department
order by department,salary DESC ;

-- Q4 Write an SQL query to fetch the list of employees with the same salary.
select first_name, last_name, salary
from worker 
where salary = 300000 
;

-- Q5 Write an SQL query to find the worker names with salaries + bonus in 2021
select first_name, last_name, (salary+ b.bonus_amount) as total_compensation
from worker, bonus b
where b.bonus_date like '2021%';

-- Q6 (Complete Task 1-5 first) 
-- 		Try to delete all the records in table worker
-- 		Study the reason why the date cannot be delted
alter table worker
drop worker;
select * from worker;

-- Q7 (complete Task 6 first)
-- 		Try to drop table worker
--  	Study the reason why the table cannot be deleted
drop table  worker;