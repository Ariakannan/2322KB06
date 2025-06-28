create table student(id int primary key,name varchar(50),age int);
insert into student values(1,'alice',20),(2,'bob',22),(3,'charlie',19),(4,'david',21);

create table marks(id int primary key,studentid int,score int);
insert into marks values(101,1,85),(102,2,90),(103,3,78),(104,4,88);

create table course(id int primary key,name varchar(50));
insert into course values(201,'math'),(202,'science'),(203,'history');

create table enrollment(id int primary key,studentid int,courseid int);
insert into enrollment values(301,1,201),(302,2,202),(303,3,201),(304,4,203);


select student.name,marks.score,course.name from student
join marks on student.id=marks.studentid
join enrollment on student.id=enrollment.studentid
join course on enrollment.courseid=course.id
where marks.score>80 and course.name='math';

select student.name,student.age,marks.score from student
joi
