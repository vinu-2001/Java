Create table Person ( id int Primary key, first_name varchar(20) not null, last_name varchar(20) not null, address varchar(20) not null, city varchar(20) not null );

describe person;

insert into person (id,first_name,last_name,address,city)
values(101,'Mayur','Auti','Ghatkopar','Mumbai'),
(102,'Raj','Mahajani','Belapur','Mumbai'),
(103,'Madhu','Bhalerao','Mulund','Pune'),
(104,'Prajkta','Paranjape','Vitthalwadi','Pandharpur'),
(105,'Suraj','Suryawanshi','Bhandup','Mumbai');

Select * from person