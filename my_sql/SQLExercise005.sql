create database SQLExercise005;
use SQLExercise005;

create table Customers(
customer_id int primary key, 
customer_name varchar(20), 
email varchar(30),
phone int
);

create table Orders(
Order_id int primary key, 
Order_date date, 
amount numeric,
customer_id int,
foreign key(customer_id) references Customers(customer_id)
);

insert into Customers( customer_id, customer_name, email,phone) values
(1,'Alice Smith','alice@example.com',123456789),
(2,'Bob Johnson','bob@example.com',234567890),
(3,'Charlie Brown','charlie@example.com',345678901);

insert into Orders(order_id,Order_date, amount, customer_id) value
(101,'2023-01-15','250.00',1),
(102,'2023-02-20','150.00',1),
(103,'2023-03-05','300.00',2),
(104,'2023-03-10','450.00',3);

create table products(
product_id int primary key, 
product_name varchar(20), 
price int 
);
select * from products;

insert into products( product_id, product_name, price) values
(1,'Laptop',800.00), 
(2,'Smartphone',500.00),
(3,'Tablet',300.00);

create table orderdetails(
orderdetail_id int primary key, 
order_id int,
product_id int, 
quantity int, 
totalprice numeric,
foreign key(order_id) references orders(order_id), 
foreign key(product_id) references products(product_id)
);
insert into orderdetails( orderdetail_id,order_id, product_id, quantity, totalprice) values
(1,101,1,1,800),
(2,101,2,1,500),
(3,102,3,2,600),
(4,103,1,1,800),
(5,104,2,1,500);

create table categories(
category_id int primary key, 
category_name varchar(20)
);

insert into categories (category_id, category_name) values
(1,'Electronics'),
(2,'Mobile');

drop table categories;
alter table products
drop foreign key fk_categories;

create table reviews(
review_id int primary key, 
product_id int, 
customer_id int, 
rating int , 
comment varchar(20),
foreign key (product_id) references products(product_id), 
foreign key (customer_id) references customers(customer_id)
);

insert into reviews(review_id, product_id, customer_id, rating, comment) values
(1,1,1,5,'Greate laptop'),
(2,2,2,4,'Good smartphone'),
(3,1,3,3,'Average quality');

create table shipping(
shipping_id int primary key, 
shipping_method varchar(20),
shipping_cost numeric
);
insert into shipping( shipping_id, shipping_method, shipping_cost) values
(1,'standard', 5), 
(2,'express', 15), 
(3, 'overnight',25);
-- =================================================================================

-- 查詢所有客戶的名稱和電子郵件。
select customer_name, email from Customers;
-- 查詢所有訂單的詳細資訊，包括客戶名稱。
select o.order_id,o.Order_date, o.amount, c.customer_name 
from Orders o
inner join customers c on c.customer_id = o.customer_id;
-- 查詢每位客戶的總訂單金額。
select customer_name, o.amount
from orders o
inner join customers c on c.customer_id = o.customer_id;
-- 查詢在 2023 年 2 月以後下的所有訂單。
select *
from orders
where order_date > '2023-02-01';



-- 查詢所有客戶的名稱、電子郵件和電話。
select customer_name, email,phone from Customers;
-- 查詢所有產品的名稱和價格。
select product_name, price from products;
-- 查詢所有訂單的詳細資訊，包括客戶名稱和產品名稱。
select o.order_id,o.Order_date, o.amount, c.customer_name, p.product_name
from orders o
inner join customers c on c.customer_id = o.customer_id
inner join products p on p.product_id = o.order_id;
-- 查詢每位客戶的訂單數量。
select c.customer_name,count(o.order_id) as ordercount
from customers c 
left join orders o on o.customer_id = c.customer_id
group by c.customer_id;
-- 查詢價格高於 400 的產品。
select product_name, price 
from products 
where price > '400';
-- 查詢所有客戶的總訂單金額，並按金額降序排列。
select c.customer_name, sum(o.amount) as totalamount
from orders o  
inner join customers c on c.customer_id = o.customer_id
group by c.customer_id
order by totalamount desc;
-- 查詢在 2023 年 2 月以後下的所有訂單，並按訂單日期升序排列。
select * 
from orders 
where order_date >'2023-02-01'
order by order_date desc;



-- 查詢所有客戶的名稱和電話。
select name, phone from customers;
-- 查詢所有產品的名稱和價格。
select product_name, price from products;
-- 查詢每個訂單的詳細資訊，包括客戶名稱和產品名稱。
select o.order_id,o.Order_date, c.customer_name, 
p.product_name,od.quantity, od.totalprice
from orders o
inner join orderdetails od on o.order_id = od.order_id
inner join customers c on c.customer_id = o.customer_id
inner join products p on p.product_id = od.product_id;

-- 查詢每位客戶的訂單數量和總金額。
select c.customer_name,
count(o.order_id) as totalcount, 
sum(od.totalprice) as totalamount
from customers c
inner join orders o on o.customer_id = c.customer_id
inner join orderdetails od on o.order_id = od.order_id
group by o.order_id;

select c.customer_name, 
count(o.order_id) as ordercount,
sum(od.totalprice) as totalamount
from customers c
left join orders o on c.customer_id = o.customer_id
left join orderdetails od on o.order_id = od.order_id
group by c.customer_id;

-- 查詢價格高於 400 的產品。
select product_name, price
from products where price > 400;
-- 查詢在 2023 年 2 月以後下的所有訂單的詳細資訊。
select o.order_id, o.order_date,p.product_name, od.totalprice
from orders o
inner join orderdetails od on od.order_id = o.order_id
inner join products p on p.product_id = od.product_id
where o.order_date > '2023-02-01';

-- 查詢每個產品的銷售數量，並按照數量降序排列。
select p.product_name, od.quantity
from orderdetails od
inner join products p on p.product_id = od.product_id
order by od.quantity;

select p.product_name, sum(od.quantity) as totalsold
from products p
inner join orderdetails od on p.product_id = od.product_id
group by p.product_id
order by totalsold desc;

-- 查詢每位客戶的最新訂單日期。
select c.customer_name,order_date
from customers c
inner join orders o on o.customer_id = c.customer_id
order by order_date desc;

select c.customer_name, max(o.order_date) as lastestorderdate
from customers c
left join orders o on c.customer_id = o.customer_id
group by c.customer_id;


-- 查詢所有客戶的名稱、電子郵件和電話。
select customer_name, email, phone
from customers;
-- 查詢所有產品的名稱和價格。
select product_name, price
from products;
-- 查詢每個產品的類別名稱。
select c.category_name, p.product_name
from categories c
inner join products p on c.category_id = p.category_id;

alter table products
add category_id int;
alter table products
add constraint fk_categories
foreign key (category_id)
references categories (category_id);
select * from products;

update products
set category_id = 1
where product_id = 1;
update products
set category_id = 2
where product_id = 2;
update products
set category_id = 1
where product_id = 3;

-- 查詢每位客戶的訂單數量和總金額。
select c.customer_name, 
sum(od.quantity) as totalquantity, 
sum(od.totalprice) as totalamount
from orderDetails od
inner join orders o on od.order_id = o.order_id
inner join customers c on c.customer_id = o.customer_id
group by c.customer_id,c.customer_name;

select c.customer_name,
count(o.order_id) as ordercount,
sum(od.totalprice) as totalamount
from customers c
left join orders o on c.customer_id = o.customer_id
left join orderdetails od on o.order_id = od.order_id
group by c.customer_id;

-- 查詢所有在電子類別下的產品。
select category_name, product_name
from categories c
inner join products p on c.category_id = p.category_id
where category_name = 'Electronics';

select * from products where category_id = 1;

-- 查詢每個類別的產品數量。
select c.category_name,
sum(od.quantity) as totalquantity
from categories c
left join products p on c.category_id = p.category_id
left join orderdetails od on od.product_id = p.product_id
group by c.category_name, p.product_name, c.category_id;

select c.category_name, count(p.product_id) as productcount
from categories c
left join products p on c.category_id = p.category_id
group by c.category_id;

-- 查詢在 2023 年 2 月以後下的所有訂單的詳細資訊。
select c.customer_name, p.product_name,od.quantity,p.price,o.order_date
from  orders o
left join customers c on o.customer_id = c.customer_id
left join orderdetails od on od.order_id = o.order_id
left join products p on p.product_id = od.product_id
where o.Order_date > '2023-02-01';

select o.order_id, o.order_date, c.customer_name, od.totalprice
from orders o 
inner join customers c on o.customer_id =c.customer_id
inner join orderdetails od on o.order_id = od.order_id
where o.order_date > '2023-02-01';

-- 查詢每位客戶的最新訂單日期和訂單數量。
select c.customer_name, 
max(o.order_date) as updateorders,
count(o.order_id) as ordercount
from customers c  
left join orders o on c.customer_id = o.customer_id
group by c.customer_id;

-- 查詢所有客戶的名稱和電話。
select customer_name, phone from customers;
-- 查詢所有產品的名稱、價格和類別名稱。
select p.product_name, p.price, c.category_name
from products p
inner join categories c on c.category_id = p.category_id;
-- 查詢每位客戶的訂單數量和總金額。
select c.customer_id,c.customer_name,
count(o.order_id) as ordercount, 
sum(od.totalprice) as totalamount
from customers c
left join orders o on c.customer_id = o.customer_id
left join orderdetails od on od.order_id = o.order_id
group by c.customer_id;
-- 查詢每個類別的產品數量。
select category_name, product_name,count(od.quantity)
from categories c
left join products p on p.category_id = c.category_id
left join orderdetails od on od.product_id = p.product_id
group by p.product_id,c.category_id;

select c.category_name, count(p.product_id) as productcount
from categories c
left join products p on c.category_id =p.category_id
group by c.category_id;

-- 查詢所有產品的平均評分。
select product_name, round(avg(r.rating),2) as averagerating
from reviews r 
left join products p on p.product_id = r.product_id
group by r.product_id;

select p.product_name, round(avg(r.rating),2) as averagerating
from products p
left join reviews r on p.product_id = r.product_id
group by p.product_id;

-- 查詢每位客戶的最新評價及其產品名稱。
select c.customer_name, r.comment, p.product_name,r.rating
from customers c
inner join reviews r on r.customer_id = c.customer_id
inner join products p on p.product_id = r.product_id
where r.review_id in (
select max(r.review_id)
from reviews r
group by product_id);

select c.customer_name, p.product_name, r.rating, r.comment 
from reviews r
inner join customers c on r.customer_id = c.customer_id
inner join products p on r.product_id = p.product_id
where r.review_id in(
select max(r.review_id)
from reviews r 
group by product_id);

-- 查詢價格高於 400 的產品及其評價。
select p.product_name, r.comment,p.price,r.rating
from products p
inner join reviews r on p.product_id = r.product_id
where p.price > 400; 

select p.product_name, p.price, r.rating, r.comment
from products p
left join reviews r on p.product_id = r.product_id
where p.price > 400;

-- 查詢在 2023 年 2 月以後下的所有訂單的詳細資訊，並包含評價。
select p.product_name, r.comment,o.order_date
from orderdetails od 
left join Orders o on o.order_id = od.order_id
left join products p on od.product_id = p.product_id
left join reviews r on r.product_id = p.product_id
where o.order_date > '2023-02-01';

select o.order_id, o.order_date, c.customer_name, 
od.totalprice, r.rating, r.comment
from orders o 
inner join customers c on c.customer_id = o.customer_id
inner join orderdetails od on o.order_id = od.order_id
left join reviews r on od.product_id = r.product_id
where o.order_date > '2023-02-01';

-- 查詢所有客戶的名稱和電話。
select customer_name, phone from customers;
-- 查詢所有產品的名稱、價格和類別名稱。
select p.product_name, p.price, c.category_name
from products p
inner join categories c on c.category_id = p.category_id;
-- 查詢每位客戶的訂單數量和總金額。
select c.customer_name,count(o.order_id), sum(od.totalprice)
from orders o
left join customers c on o.order_id = c.customer_id
left join orderdetails od on od.order_id = o.order_id
group by c.customer_id;
select * from customers;

-- 查詢每個類別的產品數量。
-- 查詢所有訂單的運送方式和運費。
-- 查詢價格高於 400 的產品及其類別名稱。
-- 查詢每位客戶的最新訂單日期。
-- 查詢每個運送方式的總運費。