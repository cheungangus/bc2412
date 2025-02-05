create database SQL_Exercise1;

-- Use database
use SQL_Exercise1;


create table regions (
	region_id int primary key,
    region_name varchar(30)
);
select * from regions;
drop table regions;
insert into regions (region_id ,region_name) values 
(1, 'Germany'),
(2, 'United States'),
(3, 'Japan'),
(4, 'Italy')
;

create table countries(
country_id varchar(10) primary key,
country_name varchar(50),
region_id int,
foreign key (region_id) REFERENCES regions(region_id)

);

select * from countries;
drop table countries;
insert into countries(country_id, country_name, region_id) values
('DE','Germany',1),
('US','United State',2),
('JP','Japan',3),
('IT','Italy',4)
;

create table locations(
location_id int primary key, 
street_address varchar(30),
postal_code varchar(30),
city varchar(30),
state_province varchar (15),
country_id varchar(10),
foreign key (country_id) REFERENCES countries(country_id)
);

select * from locations;
drop table locations;
insert into locations(location_id, street_address, postal_code, 
city, state_province, country_id) values
(1000,'1297 Via Cola di Rie', 989, 'Roma',' ', 'IT' ),
(1100,'93091 Calle della Te', 10934, 'Ven',' ', 'IT' ),
(1200,'2017 Shinjuku-ku', 1689, 'Tokyo','Tokyo JP', ' ' ),
(1400,'2014 jabberwocky Rd', 26192, 'Southlake','Texas', 'US' )
;

create table departments(
department_id int primary key, 
department_name varchar(30), 
manager_id int, 
location_id int,
foreign key (location_id) REFERENCES locations(location_id)
);
select * from departments;
drop table departments;

insert into departments(department_id, department_name,
 manager_id, location_id) values
(10,'Administration',200, 1100),
(20,'Marketing',201, 1200),
(30,'Purchasing',202, 1400);

create table employees(
employee_id int primary key, 
first_name varchar(20),
last_name varchar(20),
email varchar(20),
phone_number varchar(20), 
hire_date date, 
job_id varchar(20), 
salary int, 
commission_pct int, 
manager_id int, 
department_id int,
foreign key (department_id) REFERENCES departments(department_id)

);
select * from employees;
drop table employees;
insert into employees(employee_id, first_name, last_name, email,
phone_number, hire_date, job_id, salary, commission_pct, 
manager_id, department_id) values
(100, 'Steven','King', 'Sking', '515-1234567','1987-06-17','ST_Clerk', 24000.00, 0, 109,10),
(101, 'Neena','Kochhar', 'Nkochhar', '515-1234568','1987-06-18','MK_Rep', 17000.00, 0, 103,20),
(102, 'Lex','De Haan', 'Ldehaan', '515-1234569','1987-06-19','IT_Prog', 17000.00, 0, 108,30),
(103, 'Alexander','Hunold', 'Ahunold', '590-4234567','1987-06-20','MK_Rep', 9000.00, 0, 105,20)
;

create table jobs(
job_id int primary key,
job_title varchar(50), 
Min_salary decimal(13,2), 
Max_salary decimal(13,2)
);
select * from jobs;
drop table jobs;
insert into jobs(job_id, job_title, Min_salary, Max_salary) values
('001', 'Java Developer', '23000','30000'),
('002', 'Java Analyst Programmer', '25000','34000'),
('003', 'Java software Developer', '24000','33000')
;

create table job_history(
employee_id int not null, 
start_date date not null,
primary key (employee_id, start_date),
end_date date, 
job_id varchar(10), 
foreign key (job_id) REFERENCES jobs(job_id),
department_id int,
foreign key (department_id) REFERENCES departments(department_id)

);

select * from job_history;
drop table  job_history;
insert into job_history(employee_id, start_date, end_date, job_id, department_id) values
(102, '1993-01-13', '1998-07-24', 'IT_Prog', 20),
(101, '1989-09-21', '1993-10-27', 'MK_Rep', 10),
(101, '1993-10-28', '1997-03-15', 'MK_Rep', 30),
(100, '1996-02-17', '1999-12-19', 'ST_Clerk', 30),
(103, '1998-03-24', '1999-12-31', 'MK_Rep', 20)
;

select location_id, street_address, city, state_province, country_id
from locations;

select first_name, last_name, department_id from employees;

-- select first_name, last_name, department_id from employees;

select employee_id , last_name, manager_id, last_name from employees;

select first_name, last_name, hire_date from employees 
where hire_date  in  (
select hire_date
from employees 
where hire_date > '1987-06-19');

select d.department_name, count(d.department_id) as number_of_employees from departments d
left join employees e on d.department_id = e.department_id
group by d.department_name;

select jobs.job_title from jobs
inner join job_history on job_id = job_history;

select department_name from departments
union
select city from locations
union
select country_name from countries 
inner join 
employees 
on first_name, last_name, manager_id = e employees;


 