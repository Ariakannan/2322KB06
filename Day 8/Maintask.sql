create table books (
  id int primary key,
  title varchar(100),
  author varchar(50)
);

create table members (
  id int primary key,
  name varchar(50),
  joindate date
);

create table issue (
  id int primary key,
  bookid int,
  memberid int,
  date date,
  foreign key (bookid) references books(id),
  foreign key (memberid) references members(id)
);
insert into books values
(1, 'java basics', 'james gosling'),
(2, 'database systems', 'elmasri'),
(3, 'clean code', 'robert martin');

insert into members values
(1, 'alice', '2024-01-15'),
(2, 'bob', '2024-02-10');

insert into issue values
(101, 1, 1, '2024-03-01'),
(102, 2, 2, '2024-03-05');

