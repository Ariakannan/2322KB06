create table student(id int primary key,name varchar(50),courseid int);
insert into student values(1,'alice',101),(2,'bob',102),(3,'charlie',101),(4,'david',103);

create table course(id int primary key,name varchar(50));
insert into course values(101,'math'),(102,'science'),(103,'history');

select courseid,count(*) from student group by courseid;
