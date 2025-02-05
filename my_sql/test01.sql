-- 關鍵字的特定順序 * select選取 -> from來源 -> where篩選條件 -> group by分組 -> having條件 -> order by順序 -> limit限制 * 

select * from student;  -- select=選取 ； * = 全部； from student = 從student 表格查詢; 
select 姓名,班級,成績 from student; -- 姓名,班級,成績 回傳三項資料
select 姓名,班級,成績 from student limit 5 ; -- limit 5 =返回前5行
select 姓名,班級,成績 from student limit 5 offset 5; -- 略過前5行，直接由第六行開始alter

select 姓名,班級,成績 from student where 班級 = '1年2班' ; --  where 班級 = ‘1年2班’  ->篩選出只顯示‘1年2班’資料
select 姓名,班級,成績 from student where 班級 <> '1年2班' ; --  where 班級 <> ‘1年2班’  ->篩選出‘1年2班’以外的資料
select 姓名,班級,成績 from student where 班級 <> '1年2班' order by, 班級,成績 ; --  order by, 班級,成績 -> asc正序
select 姓名,班級,成績 from student where 班級 <> '1年2班' DESC , 班級,成績 ; --  order by, 班級,成績 -> 倒序

select 姓名,班級,成績 from student where 姓名 = '張飛' ; --  where 姓名 = '1年2班'  -> 直接更改篩選條件
select 姓名,班級,成績 from student where 姓名 like '張%' ; --  where 姓名 like '張%''  -> 篩選出帶有張的資料(%代表零個或多個字元)
select 姓名,班級,成績 from student where 姓名 like '張%_' ; --  where 姓名 like '張%_' ->篩選出帶有張的資料(_代表一個字元)
select 姓名,班級,成績 from student where 成績 >= 80; -- where 成績 >= 80 -> 篩選出80分以上的資料
select 姓名,班級,成績 from student where 成績 >= 80 and 成績 < 90; -- where 成績 >= 80 and 成績 < 90 -> 篩選出80分至90分的資料
select 姓名,班級,成績 from student where 成績 between 80 and 90 ; -- where 成績 between 80 and 90 -> 篩選出80分至90分之間的資料
select 姓名,班級,成績 from student 
where 成績 between 80 and 90 and 班級 = '1年2班' or 班級 = '1年3班'; -- -> 篩選出80分至90分之間'1年2班' 或 '1年3班'的資料
-- 可以加（） 更改篩選順序
select 姓名,班級,成績 from student where 成績 between 80 and 90 and (班級 in ('1年2班' , '1年3班')); -- ->對上述簡化
select 姓名,班級,成績 from student where 成績 80 or 90 or 100  (成績 in (80，90，100)); -- ->對上述簡化

select sum(), avg(), min(), max() from student; -- sum()求和, avg()求平均, min()最小, max()最大, count()
select sum() as 總和, avg()as 平均 from student; -- sum() as 總和 = 別名
select round(avg(成績),1) as 平均 from student; -- round(avg(成績),1) = 保留一位小數

select round(avg(成績),1) as 平均 from student group by 班級 having ; -- group by 班級 having 
select count(*) from student; -- count(*) = 總行數 （會自動忽略空白的儲存格）
select count(distinct 社團) from student; -- distinct 移除重複的結果 但不會移除null
select distinct 社團 from student where 社團 is not null ; -- where 社團 is not null = 移除 null

-- =======================================================================================================================
-- 建立表格
create table student (
	id integer primary key, -- primary key 不能由重複的數值， 不能是null
    name varchar(20), -- (20) 字符上限
    major varchar(20)
);

insert into student (id,name,major ) values (1, 'Vincent', 'english');

-- update : 
update student 
set major  = 生化
where major = '生物' or '化學'; 
-- set major  = 生化 -> 更改後的內容
-- where major = '生物' or '化學' -> 內容的位置  (不寫where的話就會即沒有增加條件，內容就會全部進行更改)

-- delete 
delete from student
where id = 4 and major = ‘物理’;  --  where id = 4 and major = ‘物理’ : 使用where 進行篩選

select * from student;
drop table student; -- 刪除表格




