create database JoinExercise002;
use JoinExercise002;

create table customers(
customer_id int primary key, 
customer_name varchar(20), 
city varchar(20)
);
select * from customers;
insert into customers(customer_id, customer_name,city) values 
(1,'John', 'NewYork'),
(2,'Maria', 'London'),
(3,'Tom', 'Paris'),
(4,'Lucy', Null);

create table orders(
order_id int primary key, 
order_date date, 
customer_id int, 
foreign key (customer_id) references customers(customer_id),
total_amount int
);
select * from orders;
insert into orders(order_id, order_date, customer_id, total_amount) values
(101,'2023-01-05',1,200),
(102,'2023-02-12',2,350),
(103,'2023-03-20',1,150),
(104,'2023-04-01',null,500);

create table products(
product_id int primary key, 
product_name varchar(20), 
price int
);
select * from products;
insert into products(product_id, product_name, price) values
(1001,'Laptop', 1000),
(1002,'Phone', 800), 
(1003,'Headphones',150);

create table order_details(
order_id int, 
product_id int , 
quantity int ,
primary key (order_id,product_id),
foreign key (order_id) references orders(order_id),
foreign key (product_id) references products(product_id)
);
select * from order_details;
insert into order_details(order_id, product_id, quantity) values
(101,1001,1),
(101,1003,2),
(102,1002,3),
(103,1003,5);

-- 问题：列出所有订单的详细信息，包括客户名称、订单日期和总金额。
select  c.customer_name, o.order_date, o. total_amount
from customers c
inner join orders o
on c.customer_id = o.customer_id
;
-- 问题：找出没有下过订单的客户。
select c.customer_name
from customers c
left join orders o
on c.customer_id = o.customer_id
where o.order_id is null
;

-- 问题：计算每个客户的总消费金额（包括没有订单的客户）。
select c.customer_name, coalesce(sum(o.total_amount),0) as total_spent
from customers c
left join orders o
on c.customer_id = o.customer_id
group by c.customer_name
;

-- 问题：列出订单 101 的详细信息，包括客户名称、产品名称和数量。
select c.customer_name, p.product_name, od.quantity
from orders o
inner join customers c on o.customer_id = c.customer_id
inner join order_details od  on o.order_id = od.order_id
inner join products p on od.product_id = p.product_id
where o.order_id =101;

-- 问题：找出购买过 “Laptop” 的客户名称。
select customer_name
from customers
where customer_id in(
select o.customer_id
from orders o
inner join order_details od on o.order_id = od.order_id
inner join products p on od.product_id = p.product_id
where p.product_name = 'Laptop')
;
select customer_name
from customers
where customer_id in(
select o.customer_id
from orders o
inner join order_details od on o.order_id = od.order_id
inner join products p on p.product_id =  od.product_id
where p.product_name = 'Phone')
;

-- 问题：找出没有购买任何产品的订单。
select o.order_id
from orders o
left join customers c
on o.customer_id = c.customer_id
where o.customer_id is null
;

-- 问题：标记订单金额是否超过 300（超过显示 "High"，否则显示 "Low"）。
select o.order_id,o.total_amount,
case 
when o.total_amount > 300 then 'hight' else 'low'
end as amount_level
from orders o
;

-- 问题：列出 2023 年 2 月之后（含）的订单，包括客户名称和城市。
select c.customer_name, c.city,o.order_date
from orders o
left join customers c 
on  c.customer_id = o.customer_id
where o.order_date >'2023-02-01'
;

-- 问题：找出总消费金额超过 300 的客户。
select c.customer_name,sum(o.total_amount) as total_spent
from customers c
inner join orders o
on c.customer_id = o.customer_id
group by c.customer_name
having sum(o.total_amount) > 300;

alter table customers
add referrer_id int,
add constraint fk_referrer
foreign key(referrer_id) references customers(customer_id);

select * from customers;
drop table customers;
drop table orders;
drop table order_details;

update customers
set referrer_id = 1
where customer_id = 2;
update customers
set referrer_id = 2
where customer_id = 3;
update customers
set referrer_id = 1
where customer_id = 4;

select c.customer_name, r.customer_name as referrer
from customers c
left join customers r 
on c.referrer_id = r.customer_id;

