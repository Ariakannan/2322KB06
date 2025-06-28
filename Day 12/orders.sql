create table customer(id int primary key,name varchar(50));
insert into customer values(1,'alice'),(2,'bob');

create table orders(id int primary key,customerid int,product varchar(50));
insert into orders values(201,1,'pen'),(202,2,'book'),(203,1,'notebook');

select customer.name,orders.product from customer join orders on customer.id=orders.customerid;
