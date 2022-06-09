Create table Fees (std_id int primary key,
std_name Varchar(20),
course_name Varchar(20),
total_fees int,
paid_fees int ,
remain_fees int);

insert into Fees(std_id,std_name,course_name,total_fees,paid_fees,remain_fees)
Values(101,'Mayur Auti','BscIT',10000,7000,3000),
(102,'Fardin Shaikh','BscCS',12000,10000,2000),
(103,'Rupesh Patil','Bsc',8000,6000,2000),
(104,'Suraj Jadhav','BCom',5000,4000,1000);

select * from Fees;

--  count
Select Count(std_name) from Fees;

-- sum 
Select sum(paid_fees) From Fees;

-- Min
select min(total_fees) from Fees;

-- Max
select max(Remain_fees) from Fees;

-- Avarage
Select avg(total_fees) from Fees;
