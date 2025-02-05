-- this is a comment line
-- MySQLWorkbench is a client side -> connect (ip/port/id/password) -> MySQL Server (7x24)

-- MySQL DBMS -> case insensitive

create database bootcamp_2412;

-- Use database
use bootcamp_2412;

-- MySQL Server may contains many databases, one database may contains many tables
-- varchar = String
create table customers (
	id integer,
    first_name varchar(20),
    last_name varchar(20),
    email varchar(50),
    dob date
);

-- * means all columns
select * from customers;

insert into customers (id, first_name, last_name, email, dob) values (1, 'Vincent', 'Lau', 'vincentlau@gmail.com', '1999-12-31');
insert into customers (id, first_name, last_name, email, dob) values (2, 'Lucas', 'Lau', 'lucaslau@gmail.com', '1999-10-31');
insert into customers (id, first_name, last_name, email, dob) values (3, 'Sally', 'Wong', 'sallywong@gmail.com', '2000-01-31');

-- delete all data from table
delete from customers;

-- delete data by criteria
delete from customers where last_name = 'Wong';

-- select specific columns
-- select is to choose columns
select id, first_name, dob from customers;

-- where is to control rows
select id, first_name, dob from customers where dob < '2000-01-01';

-- SELECT doesn't change the data in harddisk. SQL is just using a program to retrieve the data in harddisk
-- insert, delete change the data in harddisk

-- More than one criteria
select * from customers where last_name = 'Lau' and dob > '1999-12-01';
select * from customers where last_name = 'Lau' or first_name = 'Sally';

-- and has higher priority to execute
select * from customers where last_name = 'Lau' or first_name = 'Sally' and dob > '2000-01-01';
select * from customers where (last_name = 'Lau' or first_name = 'Sally') and dob > '2000-01-01';

-- Not equals to
select * from customers where last_name <> 'Wong';

-- order by (default asc)
select * from customers order by first_name;
-- order by asc
select * from customers order by first_name asc;
-- order by desc (~0.38ms)
select * from customers order by first_name desc;
select * from customers where dob > '2000-01-01' order by id desc; -- stream.filter().sorted()

-- table: orders
-- id, amount, order_date, customer_id
create table orders (
	id integer,
    amount decimal(13,2), -- 11 is for integer digit, 2 is for deimcal places
    order_date datetime,
    customer_id integer
);

drop table orders;

select * from orders;

insert into orders (id, amount, order_date, customer_id) 
values (1, 100.9, STR_TO_DATE('2020-12-31 23:10:59', '%Y-%m-%d %H:%i:%s'), 1);

insert into orders (id, amount, order_date, customer_id) 
values (2, 999.9, current_time(), 3);

insert into orders (id, amount, order_date, customer_id) 
values (3, 1999.2, current_time(), 3);

insert into orders values (4, 9999.9, current_time(), 3);

insert into orders values 
	(5, 12000, current_time(), 3), 
    (6, 15000, current_time(), 3)
    ;
    
-- sum(), avg(), min(), max(), count() -> aggregate function -> result data structure changed
select sum(amount) from orders;
select avg(amount) from orders;
select min(amount) from orders;
select max(amount) from orders;
select count(amount) from orders;

-- NOT OK
select sum(amount), id from orders;

-- OK
select sum(amount) as total_amt
, round(avg(amount),2) as avg_amt
, min(amount) as lowest_amt
, max(amount) as highest_amt
, count(amount) as order_count
, 1
, 'hello' 
from orders 
where amount > 1000;

-- SQL sequence
-- 1. FROM
-- 2. WHERE
-- 3. GROUP BY (HAVING)
-- 4. ORDER BY
-- 5. SELECT COLUMNS

-- Math
select floor(o.amount), o.* from orders o; -- down to nearest integer
select ceil(o.amount), o.* from orders o; -- up to nearest integer
select abs(-4), abs(4) from dual;

-- String
select concat(c.first_name, ' ', c.last_name) as full_name
, length(c.last_name) as length_of_lastname
, upper(c.first_name) as uppercase_firstname
, lower(c.first_name) as lowercase_firstname
, replace(c.email, '@', '$') as new_email
, substring(c.first_name, 1, 1) as first_name_initial
, left(c.first_name, 2) as left_first_name
, right(c.first_name, 2) as right_first_name
, instr(c.first_name, 'V') as firstname_contains_cap_letter
, instr(c.first_name, 'v') as firstname_contains_small_letter
, c.* 
from customers c;

-- LIKE
-- % means any characters
select *
from customers
where first_name like '%V%';

select *
from customers
where first_name like '%v%';

select *
from customers
where first_name like '%V%T';

-- DATE
select o.*, date_add(o.order_date, interval 3 month) as follow_up_date
from orders o;

select o.*, date_sub(o.order_date, interval 3 day) as follow_up_date
from orders o;

select o.*, date_add(o.order_date, interval 2 year) as follow_up_date
from orders o;

-- Separate the data into groups, by a column (customer_id)
-- After group by, you can only select the column that you used for "Group"
select customer_id, count(1) as order_count, avg(amount) as average_order_amount, max(amount), min(amount)
from orders
group by customer_id;

-- from -> where -> group by -> select
select customer_id, sum(amount) as total_order_amt, count(1) as order_count
from orders
where amount < 5000
group by customer_id;

-- 3 5
-- 1 1

-- Database Type: Relational DB (Structure -> schema -> row x column)
-- INNER JOIN (customers x orders)
-- 1. Find order count by customer, show customer ID, first_name, last_name, order count
select *
from customers c inner join orders o on o.customer_id = c.id;

-- 3 customers x 6 orders
select c.id as customer_id, c.first_name, c.last_name, count(1) as order_count
from customers c inner join orders o on o.customer_id = c.id -- "on" before join
where o.amount < 5000 -- "where" after join, but before group
group by c.id, c.first_name, c.last_name;

select c.id, c.first_name, c.last_name, count(1) as order_count
from customers c, orders o
where c.id = o.customer_id
and o.amount < 5000
group by c.id, c.first_name, c.last_name;

-- group by + having
select c.id as customer_id, c.first_name, c.last_name, count(1) as order_count
from customers c inner join orders o on o.customer_id = c.id -- "on" before join
where o.amount < 5000 -- filter record (rows)
group by c.id, c.first_name, c.last_name
having count(1) > 1 -- after group by -> filter group
order by c.id;

-- distinct 
select distinct customer_id
from orders;

select distinct last_name
from customers;

insert into customers (id, first_name, last_name, email, dob) values (4, 'Vincent', 'Lau', 'vincentlau2@gmail.com', '1999-01-31');

select last_name, first_name, count(1)
from customers
group by last_name, first_name;

-- Distinct column should exist in "group by"

-- select distinct id
-- from customers
-- group by last_name, first_name;

-- LEFT JOIN (Show all records of the left table)
-- Find all customers with his orders
select c.*, o.*
from customers c left join orders o on c.id = o.customer_id;

select o.*, c.*
from orders o left join customers c on c.id = o.customer_id;

-- RIGHT JOIN
select c.*, o.*
from customers c right join orders o on c.id = o.customer_id;

select o.*, c.*
from orders o right join customers c on c.id = o.customer_id;

-- Find the customer who didn't place order
-- left join + where
select c.*
from customers c left join orders o on c.id = o.customer_id
where o.id is null;

select *
from orders;

select o.amount from orders o;

-- Add PK for customers, orders
ALTER TABLE customers ADD CONSTRAINT pk_customer_id PRIMARY KEY (id);
ALTER TABLE orders ADD CONSTRAINT pk_order_id PRIMARY KEY (id);
-- Add FK for Orders
ALTER TABLE orders ADD CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES customers(id);

-- Not allowed. FK fail.
-- insert into orders values (7, 400.0, current_time(), 99);


