create database SQL_Exercise3;
use SQL_Exercise3;

show databases;

create table customerId(
id int primary key );
insert into customerId(id) values(1),(2),(3),(4),(5),(6),(7),(8),(9);
select * from customerId;

create table productId(
id int primary key);
insert into productId values(1),(2),(3),(4),(5),(6),(7),(8),(9),(10);
drop table productId;
select * from productId;

create table invoiceId(
id int primary key);
insert into invoiceId values(1),(2),(3),(4),(5),(6),(7),(8),(9),(10);
drop table invoiceId;
select * from invoiceId;



select * from customerId;
drop table customerId;

create table customer (
id int primary key,
customer_name varchar(255),
city_id int, 
foreign key (city_id) references customerId(id), 
contact_address varchar(255),
contact_person varchar(255),
email varchar(128),
phone varchar(128)
);

select * from customer;
insert into customer  (id, customer_name, city_id, contact_address,
contact_person, email, phone) values
(1,'Drogerie Wien',1, 'Deckergasse 15A', 'Emil Steinbach', 'emil@drogeriewien.com', '094234234'),
(2,'Cosmetics Store',4,'Watling Street 345','Jeremy Corbyn','jeremy@c-store.org','093923923'),
(3,'Kosmetikstudio',3,'Rothenbaumchaussee 53','Willy Brandt','willy@kosmetikstudio.com','0941562222'),
(4,'Neue Kosmetik',1,'Karlsplatz 2',null,'info@neuekosmetik.com','094109253'),
(5,'bio Kosmetik',2,'MotzstraBe 23','Clara Zetkin','clara@biokosmetik.org','093825825'),
(6,'K-Wien',1,'Karntner StraBe 204','Maria Rauch-Kallat','maria@kwien.org','093427002'),
(7,'Natural Cosmetics',4,'Clerkenwell Road 14B','Glenda jackson','glena.j@natural-cosmetics.com','093555123'),
(8,'Kosmetik Plus',2,'Unter den Linden 1','Angela Merkel','angela@k-plus.com','094727727'),
(9,'New Line Cosmetics',4,'Devonshire Street 92','Oliver Cromwell','oliver@nlc.org','093202404');
drop table customer;

delete from customer;
insert into customer  (id, customer_name, city_id, contact_address,
contact_person, email, phone) values
(1,'Drogerie Wien',1, 'Deckergasse 15A', 'Emil Steinbach', 'abc@gmail.com', '12345678'),
(2, 'John', 4, 'Deckergasse 1A','9upper', 'abck@gmail.com',1234567),
(3, 'Mary',8,'Deckergasse 18A','9upper', 'abcd@gmail.com',123456789);

create table product(
id int primary key,
sku varchar(32),
product_name varchar(128),
product_description text,
current_price decimal(8,2),
quantity_in_stock int
);
select * from product;
insert into product (id, sku, product_name, product_description,current_price, quantity_in_stock )values
(1,'330120','Game Of Thrones-URBAN DECAY','Game Of Thrones Eyeshadow Palette', 65, 122 ),
(2,'330121','Advanced Night repair - ESTEE LAUDER','Advanced Night Repair Synchronized Recovery Complex II', 98, 51 ),
(3,'330122','Rose Deep Hydration - Fresh','Rose Deep Hydration Facial Toner', 45, 34 ),
(4,'330123','Pore-Perfecting Moisturizer - TATCHA','Pore-Perfecting Moisturizer & Cleanser Duo', 25, 393 ),
(5,'330124','Capture Youth - Dior','Capture Youth Serum Collection', 95, 74 ),
(6,'330125','Slice of Glow - GLOW RECIPE','Slice of Glow Set', 45, 40 ),
(7,'330126','Healthy Skin - KIEHL S SINCE 1851','Healthy Skin Squad', 68, 154 ),
(8,'330127','Power Pair! - IT COSMETICS','IT is Your Skincare Power Pair! Best-Selling Moisturizer & Eye Cream Duo', 80, 0 ),
(9,'330128','Dewy Skin Mist-TATCHA','Limited Edition Dewy Skin Mist Mini', 20, 281 ),
(10,'330129','Silk Pillowcase - SLIP','Silk Pillowcase Duo + Scrunchies Kit', 170, 0 );
drop table product;
delete from product;
insert into product (id, sku, product_name, product_description,current_price, quantity_in_stock )values
(1,'330120','9Up Product', 'completely 9up', 60,122),
(2,'330121','9Upper product', 'completely 9upper', 50,50),
(3,'330122','9Upper products', 'Super 9Upper', 40,600),
(4,'330123','9Upper productss','supper completely 9Upper',30,500);

create table invoice(
id int primary key,
invoice_number varchar(255), 
customer_id int, 
foreign key (customer_id) references customerId (id), 
user_account_id int, 
total_price decimal(8,2), 
time_issued varchar(100) null, 
time_due varchar(100) null,
time_paid varchar(100) null, 
time_canceled varchar(100) null, 
time_refunded varchar(100) null
);
select * from invoice;

insert into invoice (id, invoice_number, customer_id, user_account_id, total_price, time_issued, 
time_due, time_paid, time_canceled, time_refunded) values
(1,'in_25181b07ba800c8d2fc96fe991807d9',7,4,1436,'7/20/2019 3:05:07 PM','7/27/2019 9:24:12 AM', '7/25/2019 09:42:12 AM',null,null),
(2,'8fba0000fd456b27502b9f81e9d52481',9,2,1000,'7/20/2019 3:07:11 PM', '7/27/2019 3:07:11 AM', '7/20/2019 03:10:32 PM',null,null),
(3,'3b6638118246bcfd3dfcd9be487599',3,2,360,'7/20/2019 3:06:15 PM', '7/27/2019 3:06:15 PM', '7/31/2019 09:22:11 PM',null,null),
(4,'dfe7f0a01a682196cac0120a9adbb550',5,2,1675,'7/20/2019 3:06:34 PM','7/27/2019 3:06:34 PM', null,null,null),
(5,'2a24cc2ad4440d698878a0a1a71f70fa',6,2,9500,'7/20/2019 3:06:042 PM','7/27/2019 3:06:42 PM', null, '7/22/2019 11:17:02 AM',null),
(6,'cbd304872ca6257716bcab8fc43204d7',4,2,150,'7/20/2019 3:08:15 PM', '7/27/2019 3:08:15 PM','7/27/2019 1:42:45 PM',null, '7/27/2019 2:11:20 PM');
drop table invoice;
delete from invoice;
insert into invoice (id, invoice_number, customer_id, user_account_id, total_price, time_issued, 
time_due, time_paid, time_canceled, time_refunded) values
(1, 123456780,2,41,1423,null,null,null,null,null),
(2, 123456780,3,42,1400,null,null,null,null,null),
(3, 123456780,2,43,17000,null,null,null,null,null);

create table invoice_item(
id int primary key, 
invoice_id int,
foreign key (invoice_id) references invoiceId(id), 
product_id int,
foreign key (product_id) references productId(id), 
quantity int, 
price decimal(8,2), 
line_total_price decimal(8,2)
);

select * from invoice_item;
insert into invoice_item(id, invoice_id, product_id, quantity, price, line_total_price) values
(1,1,1,20,65,1300),
(2,1,7,2,68,136),
(3,1,5,10,100,1000),
(4,3,10,2,180,360),
(5,4,1,5,65,325),
(6,4,1,10,95,950),
(7,4,5,4,100,400),
(8,5,10,100,95,9500),
(9,6,4,6,25,150);

drop table invoice_item;

delete from invoice_item;
insert into invoice_item(id, invoice_id, product_id, quantity, price, line_total_price) values
(1,1,1,40,23,920),
(2,1,2,4,20,80),
(3,1,3,4,10,40),
(4,1,2,4,30,120);

select id, customer_name from customer
where customer_name  <> 'Drogerie Wien'
union
select id,customer_id from invoice;

select id  from product
where id <> 4
union
select product_id from invoice_item;

create table employee( 
id integer not null auto_increment primary key, 
employee_name varchar(30) not null, 
salary numeric(8,2), 
phone numeric(15), 
email varchar(50), 
dept_id integer not null
);
delete from employee;

insert into employee(id, employee_name, salary, phone, email, dept_id) values
(1,'john', 20000, 90234567,'john@gmail.com',1),
(2,'mary', 10000, 90234561,'mary@gmail.com',1),
(3,'steve', 30000, 90234562,'steve@gmail.com',3),
(4,'sunny', 40000, 90234563,'sunny@gmail.com',4);

create table department(
id integer not null auto_increment primary key, 
dept_code varchar(3) not null, 
dept_name varchar(200) not null
);
delete from department;
select * from department;
insert into department(id, dept_code, dept_name) values
(1,'HR','Human resources'),
(2,'9Up','9up department'),
(3,'SA','sales resources'),
(4,'IT','Information Technology department');

select d.dept_name,
count(e.dept_id) as employee_count
from department d
left join 
employee e on d.id = e.dept_id
group by
d.dept_name;

delete from department where id = 5;
insert into department(id, dept_code, dept_name) values
(5,'IT','Information Technology department');
