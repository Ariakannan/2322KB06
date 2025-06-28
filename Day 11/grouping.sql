create table sales(id int primary key,productid int,qty int,saledate date);
insert into sales values(1,1,10,'2025-01-01'),(2,2,5,'2025-01-01'),(3,1,7,'2025-01-02'),(4,3,20,'2025-01-02');

select productid,sum(qty) from sales group by productid;
