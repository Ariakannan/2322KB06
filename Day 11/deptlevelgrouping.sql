create table employee(id int primary key,name varchar(50),department varchar(50),salary int);
insert into employee values(1,'john','hr',40000),(2,'sara','it',60000),(3,'mike','finance',55000),(4,'lily','it',58000),(5,'alex','hr',42000);

select department,count(*),avg(salary),max(salary),min(salary) from employee group by department;
