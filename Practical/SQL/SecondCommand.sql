use java;
-- DDL: Create 
Create table Product (
product_id int primary key,
product_name varchar(20) not null,
make_of_date date not null,
exp_date date not null,
country_origin varchar(20) not null
);
desc Product;

-- DDL: Alter and Remane
Alter table Product rename to product;
Alter table product rename Column exp_date to expire_date;
Alter table product add exp_date date;


-- DML: Insert
insert into product (product_id,product_name,make_of_date,expire_date,country_origin,exp_date)
values(102,'Coke',06/01/2022,07/12/2022,'United States',08/01/2022),
(103,'Chipes',22/10/2021,30/12/2022,'Cambodia',12/10/2021),
(104,'Sauce',18/03/2021,17/03/2022,'Bulgeria',20/03/2021),
(105,'Butter',10/12/2021,11/02/2022,'Scotland',12/12/2021)
;
-- DML: Select
Select * from product;

-- DML: Update
update product set make_of_date = '2022/01/06' where product_id=101;
update product set expire_date = '2022/12/07',exp_date='2022/01/08' where product_id=101;

-- DML: Delete
 delete from product where product_id=105; 
 
 -- DDL:truncate
 Truncate table product;
 
  -- DDL: Drop
  Drop table product;
 
 