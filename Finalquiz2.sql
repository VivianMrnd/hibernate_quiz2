create database finalquiz2;
use finalquiz2;

create table personDetail(
id int primary key auto_increment,
lastname varchar(255) not null,
firstname varchar(255) not null,
middlename varchar(255),
age int not null
);
-- drop table personDetail;
insert into personDetail(lastname, firstname, middlename, age) values ("Miranda", "Vivian", "Mascarinas", 20);

select * from personDetail;
-- select firstname from personDetail;
