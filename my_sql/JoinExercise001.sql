create database JoinExercise001;
use JoinExercise001;

create table customers(
customer_id int primary key,
first_name varchar(20), 
last_name varchar(20)
);
insert into  customers(customer_id, first_name, last_name) values
(1, 'john',	'Doe'), 
(2, 'Jane',	'Smith'), 
(3, 'Alice', 	'Johnson');

create table orders(
order_id int primary key, 
customer_id int, 
foreign key (customer_id) references customers(customer_id), 
amount int
);
insert into orders(order_id, customer_id, amount) values
(101,	1,	250), 
(102,	1,	150), 
(103,	2,	300);


create table products(
product_id int primary key, 
product_name varchar(20), 
price int
);
insert into products(product_id, product_name, price) values
(1,	'Widget', 10), 
(2,	'Gadget', 20), 
(3,	'Thingamajig', 30);

create table order_items(
order_item_id int primary key, 
order_id int, 
foreign key( order_id) references orders(order_id), 
product_id int, 
foreign key(product_id) references products(product_id), 
quantity int
);
insert into order_items(order_item_id, order_id, product_id, quantity) values
(1,	101,	1, 	2), 
(2,	101,	2, 	1), 
(3,	102,	3,	1),
(4,	103,	1,	1);

-- 查询: 获取每个客户及其订单信息。
select c.first_name,c.last_name , o.amount
from customers c
Inner Join orders o
on c.customer_id = o.customer_id
;

-- 查询: 获取每个客户及其订单信息，如果没有订单，则显示客户信息。
select o.order_id, o.amount,c.first_name, c.last_name
from  customers c
Left join orders o
on o.customer_id = c.customer_id
;

-- 查询: 获取每个订单的产品信息及数量。
select o.order_id, p.product_name,p.price, o.quantity
from products p
inner join order_items o
on p.product_id = o.product_id
;

-- 查询: 获取每个客户及其订单信息，显示所有客户的信息，即使某些客户没有订单。

select c.first_name, c.last_name,o.order_id,o.amount
from customers c
left join orders o
on c.customer_id = o.customer_id
;

-- 查询: 统计每个客户的订单数量。
select c.customer_id, c.first_name, c.last_name, count(o.order_id) as order_count
from customers c
inner join orders o
on c.customer_id = o.customer_id
group by c.customer_id;

-- 查询: 获取订单数量大于 0 的客户信息。
select c.first_name, c.last_name, count(o.order_id) as order_count
from customers c
inner join orders o
on c.customer_id = o.customer_id
group by c.customer_id
having order_count > 0
;