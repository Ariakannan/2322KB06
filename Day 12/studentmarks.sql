create table student(id int primary key,name varchar(50));
insert into student values(1,'alice'),(2,'bob'),(3,'charlie');

create table marks(id int primary key,studentid int,score int);
insert into marks values(101,1,85),(102,2,90),(103,3,78);

select student.name,marks.score from student join marks on student.id=marks.studentid;
