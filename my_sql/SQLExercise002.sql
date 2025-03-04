create database SQLExercise002;
use SQLExercise002;

create table customers(
customer_id int primary key, 
customer_name varchar(20), 
city varchar(20), 
country varchar(20)
);
insert into customers( customer_id, customer_name, city, country) values
(1,'Alice','NewYork','USA'),
(2,'Bob','London','UK'),
(3,'Charlie','Paris','France'),
(4,'David','Berlin','Germany');

create table orders(
order_id int primary key, 
customer_id int, 
foreign key(customer_id)references customers(customer_id),
order_date date, 
total_amount int, 
status varchar(20)
);
insert into orders(order_id, customer_id, order_date, total_amount,status) values
(101,1,'2023-01-05',200,'Delivered'),
(102,1,'2023-02-10',350,'Processing'),
(103,2,'2023-03-15',150,'Cancelled'),
(104,3,'2023-04-20',500,'Delivered'),
(105,null,'2023-05-25',100,'Delivered');

create table products(
product_id int primary key, 
product_name varchar(20), 
price int, 
category varchar(20)
);
insert into products(product_id, product_name, price, category) values
(201, 'Laptop',1000,'Electronics'),
(202, 'Phone',800,'Electronics'),
(203, 'Shirt',50,'Apparel'),
(204, 'Shoes',120,'Apparel');

create table order_details(
order_id int , 
product_id int, 
quantity int,
primary key ( order_id, product_id), 
foreign key(order_id) references orders(order_id), 
foreign key(product_id) references products(product_id)
);
insert into order_details(order_id, product_id, quantity) values
(101,201,1),
(101,203,2),
(102,202,1),
(103,203,3),
(104,204,4);

select * from customers;
select * from orders;
select * from products;
select * from order_details;

-- 问题：列出所有客户及其所在城市和国家。
select customer_name, city, country
from customers ;

-- 问题：列出所有订单的客户名称、订单日期和金额。
select c.customer_name, o.order_date, o.total_amount
from orders o
inner join customers c on c.customer_id = o.customer_id;

-- 问题：列出所有客户及其订单（包括没有订单的客户）。
select o.order_id ,c.customer_name,o.total_amount
from orders o
left join customers c on c.customer_id = o.customer_id;

SELECT c.customer_name, o.order_id, o.total_amount
FROM customers c
LEFT JOIN orders o ON c.customer_id = o.customer_id;

-- 问题：计算每个客户的总消费金额。
select c.customer_name,sum(o.total_amount) as total_spent
from customers c
left join orders o on c.customer_id = o.customer_id
group by c.customer_name;

-- 问题：找出购买过 “Electronics” 类产品的客户。
select c.customer_id, c.customer_name
from customers c
inner join orders o on c.customer_id = o.customer_id
inner join order_details od on o.order_id = od.order_id
inner join products p on p.product_id = od.product_id
where category = 'Electronics';

select c.customer_name
from customers c
where customer_id in(
select o.customer_id
from orders o 
inner join order_details od on o.order_id = od.order_id
inner join products p on p.product_id = od.product_id
where category = 'Electronics'
);

-- 问题：标记订单金额是否大于 300（显示 “High” 或 “Low”）。
select 
order_id, 
total_amount, 
case 
when total_amount > 300 then 'High'
else 'Low'
	end as values_level
from orders;
	
-- 问题：找出总消费金额超过 300 的客户。
select c.customer_name,sum(o.total_amount) as total_spent
from customers c
inner join orders o on o.customer_id = c.customer_id 
group by c.customer_name
having sum(o.total_amount) > 300;

-- 问题：列出订单 101 的详细信息（客户名称、产品名称、数量）。
select o.order_id,c.customer_name, p.product_name, od.quantity
from order_details od
inner join orders o on o.order_id = od.order_id
inner join products p on p.product_id = od.product_id
inner join customers c on c.customer_id = o.customer_id
where o.order_id = 101;

SELECT 
  c.customer_name,
  p.product_name,
  od.quantity
FROM orders o
JOIN customers c ON o.customer_id = c.customer_id
JOIN order_details od ON o.order_id = od.order_id
JOIN products p ON od.product_id = p.product_id
WHERE o.order_id = 101;

-- 问题：找出没有订单的客户。
select o.order_id, c.customer_name, o.customer_id
from customers c 
left join orders o  on c.customer_id = o.customer_id
where o.order_id is null;

-- 问题：找出总消费金额最高的客户名称。
select c.customer_name, sum(o.total_amount) as Top_spent
from orders o
inner join customers c on c.customer_id = o.customer_id
group by c.customer_id
order by Top_spent desc
limit 1;

select c.customer_name
from customers c
where c.customer_id = (
select o.customer_id
from orders o
group by o.customer_id
order by sum(o.total_amount) desc
limit 1);

-- 问题：统计每个客户的订单数量（包括没有订单的客户）。
select c.customer_name, count(order_id) as order_count
from customers c
left join orders o on c.customer_id = o.customer_id
group by c.customer_name;
-- 问题：标记 2023 年第一季度的订单（1月1日-3月31日）为 “Q1”，其他为 “其他季度”。
select order_id, order_date,
case when order_date between '2023-01-01' and '2023-03-31'  then 'Q1'
	 else '其他季度'
     end as quarter_label
from orders;
-- 问题：找出总消费金额高于平均值的客户。
-- 问题：统计每个产品类别的总销售额。
-- 问题：找出订单数量超过 1 且总金额大于 300 的客户。
-- 问题：假设客户表新增字段 referrer_id（外键指向自身），列出客户及其推荐人。
-- 问题：找出从未购买过 “Apparel” 类产品的客户。
select c.customer_name,p.product_name
from products p
inner join orders o on od.order_id = o.order_id
inner join customers c on c.customer_id = o.customer_id
inner join order_details od on p.product_id = od.product_id
where p.product_name = 'Apparel';
-- 问题：按订单金额区间统计订单数量（<100, 100-300, >300）。
select 
case 
when total_amount < 100 then '<100'
when total_amount between 100 and 300 then '100-300'
else '>300'
	end as amount_range, 
    count(order_id) as order_count
    from orders
    group by amount_range;
-- 问题：列出所有 “Delivered” 状态的订单及其客户名称和产品名称。
-- 问题：统计每个客户的总消费金额（无订单显示 0）。



