# Write your MySQL query statement below
SELECT p.project_id,Round(AVG(e.experience_years),2) as average_years
FROM 
Project as p
Left Join
Employee as e
on p.employee_id=e.employee_id
Group by p.project_id