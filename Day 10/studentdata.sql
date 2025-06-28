create table student(id int primary key,name varchar(50),marks int);
insert into student values(1,'alice',85),(2,'bob',78),(3,'charlie',92),(4,'david',67);

create table course(id int primary key,name varchar(50),fee int);
insert into course values(101,'math',1000),(102,'science',1200),(103,'english',900),(104,'history',800);

create table books(id int primary key,title varchar(100),author varchar(50));
insert into books values(1,'java basics','gosling'),(2,'database systems','elmasri'),(3,'clean code','martin'),(4,'java advanced','smith');

select * from student where marks>80;
select * from course order by fee asc;
select * from books where title like '%java%';
