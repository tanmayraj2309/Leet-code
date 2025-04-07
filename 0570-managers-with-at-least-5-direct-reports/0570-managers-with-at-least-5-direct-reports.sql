# Write your MySQL query statement below
select e.name 
from Employee as e
join Employee as m
on e.id= m.managerId
Group By m.managerId
Having count(m.managerId)>=5

