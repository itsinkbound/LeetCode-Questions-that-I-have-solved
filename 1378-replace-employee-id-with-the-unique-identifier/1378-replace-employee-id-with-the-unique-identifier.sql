# Write your MySQL query statement below
select unique_id,e.name
from employees e left join employeeUNI u
on e.id = u.id;