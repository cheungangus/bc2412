create database SQLExercise2;
use SQLExercise2;

create table workers(
worker_id int not null primary key auto_increment, 
first_name varchar(20), 
last_name varchar(20), 
salary numeric(10,2), 
joining_date datetime, 
department char(20)
);

insert into workers (first_name, last_name, salary, joining_date, department) values
('Monika', 'Arora',100000,'21-02-20 09:00:00','HR'),
('Niharika', 'Verma',80000,'21-06-11 09:00:00','Admin'),
('Vishal','Singhal',300000,'21-02-20 09:00:00','HR'),
('Mohan','Sarah',300000,'12-03-19 09:00:00','Admin'),
('Amitabh','Singh',500000,'21-02-20 09:00:00','Admin'),
('Vivek','Bhati',490000,'21-06-11 09:00:00','Admin'),
('Vipul','Diwan',200000,'21-06-11 09:00:00','Account'),
('Satish','Kumar',750000,'21-01-20 09:00:00','Account'),
('Geetika','Chauhan',90000,'21-04-11 09:00:00','Admin');
select * from workers;
create table bonus(
worker_ref_id int, 
bonus_amount numeric(10), 
bonus_date datetime, 
foreign key(worker_ref_id) references workers(worker_id)
);
-- Q1
insert into bonus(worker_ref_id, bonus_amount,bonus_date) values
(6,32000,'2021-11-02'),
(6,20000,'2021-11-02'),
(5,21000,'2021-11-02'),
(9,30000,'2021-11-02'),
(8,4500,'2022-11-02');
select * from  bonus;

-- Q2
select salary
from workers
order by salary desc 
limit 1
offset 1;

-- Q3
with dept_table as (
select department, max(salary) as max_salary
from workers
group by department
)
select * 
from workers w, dept_table d
where w.department = d.department
and w.salary = d.max_salary;

-- Q4 
with salary_table as (
select salary
from workers
group by salary 
having count(salary) > 1 )
select w.first_name, w.last_name
from workers w, salary_table s
where w.salary = s.salary;

-- Q5 
with bonus_table as (
select worker_ref_id, sum(bonus_amount) as bonus
from bonus
group by worker_ref_id)
select w.first_name, w.last_name, w.salary + IFNULL(b.bonus,0)
from workers w
left join bonus_table b on w.worker_id = b.bonus;