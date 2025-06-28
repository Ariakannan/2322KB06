create table department (
  id int primary key,
  name varchar(50)
);

create table employee (
  id int primary key,
  name varchar(50),
  deptid int,
  salary int,
  foreign key (deptid) references department(id)
);

insert into department values
(1, 'hr'),
(2, 'it'),
(3, 'finance');

insert into employee values
(201, 'john', 1, 40000),
(202, 'sara', 2, 60000),
(203, 'mike', 3, 55000),
(204, 'lily', 2, 58000),
(205, 'alex', 1, 42000);
