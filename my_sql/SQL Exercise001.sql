create database SQLExercise001; 
use SQLExercise001;

create table students(
student_id int, 
student_name varchar(20), -- (20) 字符上限
class varchar(20),
result int, 
club_id int);

insert into students(student_id, student_name, class, result, club_id) values
(10001,'王小明','1年2班',92,101),		(10002,'李小惠','1年1班',78,103),	(10003,'劉小衫','1年3班',58,102),	(10004,'楊大牛','1年3班',98,101),
(10005,'趙阿平','1年2班',89,null),	(10006,'李阿婷','1年1班',84,103),	(10007,'李小如','1年1班',86,102),	(10008,'王阿強','1年2班',94,104),
(10009,'張小杰','1年2班',68,103),		(10010,'沈阿俊','1年1班',72,101),	(10011,'王大福','1年3班',84,102),	(10012,'江小花','1年2班',89,103),
(10013,'葉小美','1年3班',91,101),		(10014,'張靜','1年1班',92,104),	(10015,'林小玉','1年3班',52,103),	(10016,'張小婷','1年1班',85,null),
(10017,'黃小宇','1年2班',76,102),		(10018,'周阿虎','1年3班',64,101) -- 欄位順序需要相互對應
;

select * from students;  -- select=選取 ； * = 全部； from student = 從student 表格查詢; 
select student_name,class,result from students; -- student_name, class, result 回傳三項資料
select student_name,class,result from students limit 5 ; -- limit 5 = 返回前5行
select student_name,class,result from students limit 5 offset 5; -- 略過前5行，直接由第六行開始

select student_name,class,result from students where class = '1年2班' ; --  where class = ‘1年2班’  -> 篩選出只顯示‘1年2班’資料
select student_name,class,result from students where class <> '1年2班' ; --  where class <> '1年2班'  -> 篩選出‘1年2班’以外的資料

select student_name,class,result from students where class <> '1年2班' order by class,result;
--  order by class,result -> 默認為ASC正序(由低到高) -> 先將class進行排序再排result
select student_name,class,result from students where class <> '1年2班' order by class,result DESC ; 
--  order by class,result DESC -> 倒序(由高到低)

select student_name,class,result from students where student_name like '張%'; 
--  where 姓名 like '張%'  -> 篩選出帶有張的資料(%代表零個或多個字元,需與like連用)
select student_name,class,result from students where student_name like '張_' ; 
--  where 姓名 like '張_' ->篩選出帶有張的資料(_代表一個字元,需與like連用)


select student_name,class,result 
from students 
where result >= 80 and result < 90; 
-- where result >= 80 and result < 90 -> 篩選出80分至90分的資料

select student_name,class,result 
from students 
where result between 80 and 90 and class = '1年2班' ; 
-- 簡化: where result >= 80 and result < 90 -> 篩選出80分至90分的資料,可再使用and加入篩選條件e.g. class = '1年2班'

select student_name, class, result
from students
where result between 80 and 90 and (class ='1年1班' or class = '1年2班'); 
-- 因and的優先層級比or高,所以加上()更改篩選順序

select student_name,class,result 
from students 
where result between 80 and 90 and (class in ('1年2班' , '1年3班')); 
-- 使用in 簡化

-- 聚合函數 需搭配group by , having or order by 使用
select min(result) from students; -- min()求最小
select max(result) from students; -- max()求最大

select sum(result) from students; -- sum()求和
select sum(result) as '成績總和' from students; -- 可以用 as 設成別名 

select avg(result) from students; -- avg()求平均
select round(avg(result),2) as 成績平均 from students; -- round(avg(result),1) = 保留一位小數, 整數為可以忽略不寫
select round(avg(result),1) as 成績平均 from students group by class; -- 使用group by進行分組  
select round(avg(result),1) as 成績平均 from students group by class having 成績平均 >= 80 order by 成績平均 desc ;

select count(result) from students; -- count()統計; null值會忽略不計
select count(distinct club_id) from students; -- distinct 移除重複的結果 但不會移除null
select distinct club_id from students where club_id is not null ; 
-- where club_id is not null = 移除 null

-- CONCAT 
-- 用於將兩個或多個字串連接成一個字串。特別是在需要生成合併格式的輸出時。

select concat(student_name, ' ' , class) as name from students; -- as name 重新命名



-- 關鍵字的特定順序  
-- 1. select 指定要查詢的列 -> 2. from 要查詢的數據表 -> 3. where 指定過濾條件，用於限制返回的紀錄 -> 
-- 4. group by 對結果進行分組 -> 5. having 對分組後的結果進行過濾 -> 6. order by 指定结果的排序方式 -> 7. LIMIT / OFFSET：限制返回的记录数或指定起始位置。
 

-- =======================================================================================================================
create table clubs (
	club_id int primary key, -- primary key 不能由重複的數值， 不能是null
    club_name varchar(20) 
);

insert into clubs (club_id,club_name ) values 
(101,'吉他社'),(102,'籃球社'),(103,'美術社'),(104,null);

-- update : 更新資料
update clubs 
set club_name = '舞蹈社' -- 新增的命名(更改後的內容)
where club_id = 104; -- 使用where 確定篩選條件 (內容的位置 (不寫where的話就會即沒有增加條件，內容就會全部進行更改)

-- delete 
delete from clubs
where club_id = 3 ;  --  where club_id = 3  : 使用where選定club_id = 3時 並進行刪除

-- 跨表格查詢  inner join; left join 
select s.student_name, s.club_id,c.club_name
from students s
left join clubs c
on s.organization = c.club_id
where class = '1年1班';
-- 返回左表students s 中所有的紀錄，及右表clubs c中匹配的紀錄，如右表沒有匹配的紀錄結果將顯示為null

select s.student_name, s.club_id,c.club_name
from students s
inner join clubs c
on s.club_id = c.club_id
where class = '1年1班';
-- 當再兩個表都有對應的紀錄時，紀錄會包含在結果中


/* 
DQL
DQL（資料查詢語言，Data Query Language）主要包括用於查詢和檢索資料庫中數據。
select , where , order by , group by , having , join , distinct, limit , subquery
特點:
1. 以讀取為主: 主要用於從資料庫中檢索數據，並不對數據進行任何修改或刪除。
2. 靈活的查詢能力 : 支援多種查詢條件和操作，包括選擇特定列、過濾條件（WHERE）、排序（ORDER BY）、分組（GROUP BY）等，使得用戶能夠靈活地檢索所需數據。
3. 使用聚合函數 : 支援聚合函數（如 COUNT、SUM、AVG 等），可以對查詢結果進行統計和分析。
4. 多表查詢 : 可以通過 JOIN 操作從多個表中獲取相關數據，支持不同類型的連接（如 INNER JOIN、LEFT JOIN 等）。
5. 結果集的排序和限制 : 提供 ORDER BY 進行結果排序，並允許使用 LIMIT 限制返回的記錄數量，便於控制查詢結果的顯示。
6. 子查詢支持 : 允許在查詢中嵌套其他查詢（子查詢），使得查詢更加靈活和強大。
7. 使用 DISTINCT 消除重複 : 可以使用 DISTINCT 關鍵字消除查詢結果中的重複記錄，確保返回的數據是唯一的。

DML
DML（資料操作語言，Data Manipulation Language）主要包括對數據的插入、更新和刪除等操作。
insert, update, delete, 
特點 : 
1.數據修改：主要用於對資料庫中的數據進行修改和更新。
2.事務控制：操作通常與事務控制語句（如 COMMIT 和 ROLLBACK）一起使用，以確保數據的一致性和完整性。
3.靈活性：提供了靈活的數據操作方式，可以對單條或多條記錄進行操作。

DDL
DDL（資料定義語言，Data Definition Language）用於定義和管理資料庫結構。主要是創建、修改和刪除資料庫中的表格及其他結構。
create , alter , drop 
1.結構定義：主要用於定義資料庫的結構，包括資料表、欄位及其數據類型。
2.不可逆性：某些操作（如 DROP）是不可逆的，一旦執行將永久刪除資料庫對象及其數據。
3.事務性：大多數資料庫系統不支持 DDL 操作的事務控制，執行後即生效。
(事務性指的是一組操作的完整性和一致性。指一系列必須一起執行的操作，這些操作要麼全部成功，要麼全部失敗。)
4.自動生成：在創建資料表時，可以自動生成索引、主鍵等約束。

*/