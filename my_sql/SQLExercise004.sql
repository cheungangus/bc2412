create database SQLExercise004;
use SQLExercise004;

create table books(
book_id int primary key, 
title varchar(50), 
author_id int, 
foreign key (author_id) references authors(author_id),
publication_year int
);
insert into books(book_id, title, author_id, publication_year) values
(1,'The Great Gatsby',1,1925),
(2,'To Kill a Mockingbird',2,1960),
(3,'1984',3,1949);
select * from books;
create table authors(
author_id int primary key , 
first_name varchar(20), 
last_name varchar(20)
);
insert into authors(author_id,first_name, last_name) values
(1,'F.Scott','Fitzgerald'),
(2,'Harper','Lee'),
(3,'George','Orwell');

create table borrowers(
borrower_id int primary key, 
first_name varchar(20), 
last_name varchar(20)
);
insert into borrowers(borrower_id, first_name, last_name)values
(1,'Alice','Johnson'),
(2,'Bob','Smith');

create table loans(
loan_id int primary key , 
book_id int, 
foreign key(book_id) references books(book_id),
borrower_id int, 
foreign key(borrower_id) references borrowers(borrower_id),
loan_date date, 
return_date date
);
insert into loans(loan_id, book_id, borrower_id, loan_date, return_date) values
(1,1,1,'2023-01-10',null),
(2,2,2,'2023-01-15','2023-02-01');