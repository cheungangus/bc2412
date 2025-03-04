create database SQLExercise3;
use SQLExercise3;
create table customers(
id int primary key, 
customer_name varchar(255), 
city_id int, 
customer_address varchar(255), 
contact_person varchar(255) not null, 
email varchar(128), 
phone varchar(128)
);

insert into customers
( id, customer_name ,city_id, customer_address, contact_person , email, phone) values
(1,'Drogerie Wien', 1, 'Deckergasse 15A', 'Emil Steinbach','emil@drogeriewien.com',094234234),
(2,'Cosmetics Store', 4, 'Watling Street 347', 'Jeremy Corbyn', 'jeremy@c-store.org',093923923),
(3, 'Kosmetikstudio', 3,'Rothenbaumchaussee 53', 'Willy Brandt', 'willy@kosmetikstudio.com',0941562222),
(4, 'Neue Kosmetik', 1,'Karlsplatz 2', 'null', 'info@neuekosmetik.com',09109253), 
(5, 'Bio Kosmetik', 2, 'MotzstraBe 23', 'Clara Zetkin', 'clara@biokosmetik.org', 093825825),
(6, 'K-Wien', 1,'Karntner StraBe 204', 'Maria RauchKallat','maria@kwien.org',093427002),
(7,'Natural Cosmetics',4,'Clerkenwell Road 14B', 'Glenda Jackson', 'glena.j@natural-cosmetics.com',093555123),
(8,'Kosmetik Plus', 2, 'Unter den Linden 1', 'Angela Merkel','angela@k-plus.com',094727727),
(9,'New Line Cosmetics',4,'Devonshire Street 92', 'Oliver Cromwell','oliver@nlc.org',093202404);

create table products(
id int primary key, 
sku varchar(32), 
product_name varchar(128), 
product_description text, 
current_price decimal(8,2), 
quantity_in_stock int
);
insert into products (id, sku, product_name, product_description, current_price, quantity_in_stock) values
(1,330120, 'Game Of Thrones  DECAY', 'Game Of Thrones alette', 65, 122),
(2,330121, 'Advanced  ESTEE ',' Night Repair  Complex II', 98,51),
(3,330122,'Rose Deep Hydration FRESH', 'Rose Deep Hydration Facial Toner', 45, 34), 
(4,330123,'Pore-Perfecting - TATCHA', 'Pore-Perfecting  &  Duo', 25,393),
(5,330124,'Capture Youth- Dior', 'Capture youth serum collection', 95,74),
(6,330125,'Slice of Glow', 'Slice of Glow Set', 45,50),
(7,330126,'Healthy Skin', 'Healthy Skin', 68,154),
(8,330127,'Power Pair!','IT is your Skincare power',80,0),
(9,330128,'Dewy Skin Mist', 'Limited Edition Dewy',20,281),
(10,330129,'Silk Pillowcase', 'silk Pillowcase Duo',170,0);

create table invoices (
id int primary key, 
invoice_number varchar(255), 
customer_id int, 
foreign key (customer_id) references customers(id), 
user_account_id int, 
total_price decimal(8,2), 
time_issued datetime, 
time_due datetime, 
time_paid datetime, 
time_canceled datetime, 
time_refunded datetime
);
insert into invoices (id, invoice_number, customer_id, user_account_id, total_price,
time_issued, time_due, time_paid, time_canceled, time_refunded) values
(1,10090,7,4,1436,null,null,null,null,null),
(2,10091,9,2,1000,null,null,null,null,null),
(3,10092,3,2,360,null,null,null,null,null),
(4,10093,5,2,1675,null,null,null,null,null),
(5,10094,6,2,9500,null,null,null,null,null),
(6,10095,4,2,150,null,null,null,null,null);

create table invoice_items(
id int primary key, 
invoice_id int, 
foreign key (invoice_id) references invoices(id), 
product_id int, 
foreign key (product_id) references products(id), 
quantity int, 
price decimal(8,2), 
line_total_price decimal(8,2)
);
insert into invoice_items(id, invoice_id, product_id, quantity, price, line_total_price) values
(1,1,1,20,65,1300),
(2,1,7,2,68,136),
(3,1,5,10,100,1000),
(4,3,10,2,180,360),
(5,4,1,5,65,325),
(6,4,2,10,95,950),
(7,4,5,4,100,400),
(8,5,10,100,95,9500),
(9,6,4,6,25,150);
select * from customers;
select * from products;
select * from invoices;
select * from invoice_items;


-- Q1 
select 'customer',c.id, c.customer_name
from customers c
where not exists(
select *
from invoices i
where i.customer_id = c.id)

union

select 'product', p.id,p.product_name
from products p
where not exists(
select * 
from invoice_items t
where t.product_id = p.id);

-- Q2
create table employees(
id int not null auto_increment primary key, 
employee_name varchar(20) not null ,
salary numeric(8,2), 
phone numeric(15), 
email varchar(20), 
dept_id int not null
);
insert into employees( employee_name, salary , phone, email, dept_id) values
('John',20000,90034212,'john@gmail.com',1),
('mary',30000,31924591,'mary@gmail.com',1),
('steve',22000,59210241,'steve@gmail.com',3),
('sunny',40000,58201281,'sunny@gmail.com',4);
create table departments(
id int not null auto_increment primary key, 
dept_code varchar(10) not null, 
dept_name varchar(20) not null
);
insert into departments(dept_code, dept_name) values
('HR','Human Resources'),
('AD','Admin'), 
('SA','Sales'),
('IT','Infomation')
;
select * from departments;
drop table departments;
insert into departments(dept_code, dept_name) values('IT2', 'Infomation2');

select d.dept_code as deparment_name, count(e.dept_id) as number_of_employees
from departments d
left join employees e on d.id = e.id
group by d.dept_code;
