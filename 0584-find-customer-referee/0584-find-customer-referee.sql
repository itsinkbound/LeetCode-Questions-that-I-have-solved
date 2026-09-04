# Write your MySQL query statement below
-- select name from Customer
-- where referee_id is null or referee_id != 2;

#Coalesce is something that we can note
#used to get non null values, what we can do is get the null values and change it to zeroes.

select name from customer
where coalesce(referee_id,0) != 2;