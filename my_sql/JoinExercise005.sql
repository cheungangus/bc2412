create database JoinExercise005;
use JoinExercise005;

create table employees(
employee_id int primary key auto_increment, 
first_name varchar(50),
last_name varchar(50), 
salary decimal(10,2), 
department_id int, 
foreign key (department_id) references departments(department_id)
);
insert into employees (first_name, last_name, salary, department_id) values
('john', 'doe', 60000.00,1), 
('jane', 'smith', 75000.00,2),
('alice','johnson', 50000.00,3),
('bob','brown',80000.00,4),
('charlie', 'davis',55000.00,1),
('eve','wilson',72000.00,2);

create table departments(
department_id int primary key auto_increment,
department_name varchar(50)
);
insert into departments (department_name) values
('Human Resources'),('IT'),('Sales'),('Marketing');

-- 練習題 1：查詢所有員工 題目：從 employees 表中選擇所有欄位的記錄。
select * from employees;

-- 練習題 2：查詢特定員工 題目：選擇 first_name 和 last_name 兩個欄位，並按 last_name 排序。
select first_name, last_name from employees order by last_name;

-- 練習題 3：薪水篩選 題目：從 employees 表中選擇所有 department_id 為 2 的員工。
select * from employees where department_id = 2;

-- 練習題 4：計算總數 題目：計算 employees 表中員工的總數。
select count(*) from employees;

-- 練習題 5：平均薪水 題目：查詢每個部門的平均薪水。
select department_id, avg(salary) as department_salary
from employees
group by department_id;

-- 練習題 6：多表查詢 題目：從 employees 和 departments 表中查詢員工姓名及其對應的部門名稱。
select e.first_name, e.last_name, d.department_name
from employees e 
inner join departments d
on e.department_id = d.department_id;

-- 練習題 7：更新薪水 題目：將某位員工的薪水更新為 70000。
update employees
set salary = 70000
where salary = 55000;

-- 練習題 8：新增員工 題目：向 employees 表中插入一條新記錄
insert into employees(first_name, last_name, salary, department_id)values
('tom','dally',23400.00,2);

-- 練習題 9：刪除員工 題目：刪除 employee_id 為 6 的員工。
delete from employees
where employee_id = 6;

-- 練習題 10：查詢薪水高於特定值的員工 題目：查詢薪水高於 60000 的員工姓名和薪水。
select concat(first_name, ' ',last_name) as full_name, salary
from employees
where salary > 60000;

-- 練習題 11：查詢部門中薪水最高的員工 題目：查詢每個部門中薪水最高的員工姓名和薪水。
select concat(first_name, ' ' ,last_name) as full_name ,salary, department_id
from employees
where salary in (
	select max(salary)
    from employees
group by department_id
);

-- 練習題 12：部門薪水總和 題目：查詢每個部門的總薪水。
select department_id, sum(salary) as total_salary 
from employees
group by department_id;

-- 練習題 13：查詢部門名稱和員工數量 題目：查詢每個部門及其對應的員工數量。
select d.department_name,count(e.employee_id) as total_count
from departments d
left join employees e on e.department_id = d.department_id
group by d.department_name;

-- 練習題 14：查找沒有員工的部門 題目：查詢沒有任何員工的部門。
select e. employee_id, d.department_name
from employees e 
left join departments d on e.department_id = d.department_id
where e.employee_id is null;

-- 練習題 15：查詢員工的全名 題目：查詢所有員工的全名（名和姓連接）。
select Concat(first_name,' ', last_name) as full_name
from employees;

-- 練習題 16：查詢薪水的百分比 題目：查詢每位員工的薪水佔其部門薪水總和的百分比。
select e.first_name, e.last_name, e.salary, 
(e.salary / sum(salary) over(partition by e.department_id) *100)
as salary_percentage
from employees e;

-- 練習題 17：查詢各部門的最高薪水 題目：查詢每個部門的最高薪水和對應的員工姓名。
select concat(e.first_name, ' ', e.last_name)as full_name, d.department_name,e.salary
from employees e
inner join departments d
on e.department_id = d.department_id
where salary in(
select max(e.salary)
from employees e
group by e.department_id);

SELECT d.department_name, e.salary, CONCAT(e.first_name, ' ', e.last_name) AS employee_name
FROM employees e
JOIN departments d ON e.department_id = d.department_id
WHERE e.salary = (SELECT MAX(salary) FROM employees WHERE department_id = d.department_id);

-- 練習題 18：更新多個員工的薪水 題目：將所有 IT 部門員工的薪水提高 10%。
update employees
set salary = salary * 1.10
where department_id = (
select d.department_name
from departments d
where d.department_name ='IT');

UPDATE employees
SET salary = salary * 1.10
WHERE department_id = (SELECT department_id FROM departments WHERE department_name = 'IT');

-- 練習題 19：刪除特定部門的所有員工 題目：刪除 Sales 部門的所有員工。
delete from employees
where depatment_id= 
(select department_id
from departments 
where department_name = 'sales');

-- 練習題 20：查詢員工姓名和部門名稱，並按部門名稱排序 題目：查詢員工的全名及其部門名稱，並按部門名稱排序。
select concat(first_name, ' ',last_name) as full_name, d.department_name
from employees e
inner join departments d
on e.department_id = d.department_id 
order by d.department_name;