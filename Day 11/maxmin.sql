create table product(id int primary key,name varchar(50),price int);
insert into product values(1,'pen',10),(2,'notebook',50),(3,'eraser',5),(4,'bag',300);

select max(price),min(price) from product;
