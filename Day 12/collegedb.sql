create table department(id int primary key,name varchar(50));
insert into department values(1,'science'),(2,'arts');

create table student(id int primary key,name varchar(50),deptid int);
insert into student values(1,'alice',1),(2,'bob',2),(3,'charlie',1);

create table marks(id int primary key,studentid int,score int);
insert into marks values(101,1,85),(102,2,78),(103,3,90);

select department.name,avg(marks.score) from department join student on department.id=student.deptid join marks on student.id=marks.studentid group by department.name;
