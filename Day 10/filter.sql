create table customer(id int primary key,name varchar(50),city varchar(50),age int);
insert into customer values(1,'alice','delhi',30),(2,'bob','mumbai',25),(3,'charlie','delhi',40),(4,'david','pune',28);
select * from customer where city='delhi';
