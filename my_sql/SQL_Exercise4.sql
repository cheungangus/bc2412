create database SQL_Exercise4;
use SQL_Exercise4;

create table players(
player_id integer not null unique,
group_id integer not null
);
select * from players;
insert into players(player_id, group_id) values
(20,2),
(30,1),
(40,3),
(45,1),
(50,2),
(65,1);

create table matches(
match_id integer not null unique, 
first_player integer not null, 
second_player integer not null, 
first_score integer not null, 
second_score integer not null
);
select * from matches;
drop table matches;
insert into matches(match_id, first_player, second_player, first_score, second_score) values
(1,30,45,10,12),
(2,20,50,5,5),
(13,65,45,10,10),
(5,30,65,3,15),
(42,45,65,8,4);