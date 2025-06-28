
create table employee(id int primary key,name varchar(50),department varchar(50),salary int);
insert into employee values(101,'john','hr',40000),(102,'sara','it',60000),(103,'mike','finance',55000),(104,'lily','it',58000),(105,'alex','hr',42000);
select * from employee where department='it';
select * from employee order by salary desc;
