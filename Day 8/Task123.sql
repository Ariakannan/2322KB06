create table student (
  studentid int primary key,
  name varchar(50),
  age int
);

create table course (
  courseid int primary key,
  coursename varchar(50),
  fee int
);

insert into student values
(1, 'alice', 20),
(2, 'bob', 21),
(3, 'charlie', 19),
(4, 'david', 22),
(5, 'eve', 20);

select * from student;

insert into course values
(101, 'math', 1000),
(102, 'science', 1200),
(103, 'english', 900),
(104, 'history', 800),
(105, 'art', 1100);

select * from course;
update course set fee = 1300 where courseid = 102;



