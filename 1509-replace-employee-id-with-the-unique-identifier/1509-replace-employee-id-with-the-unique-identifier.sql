# Write your MySQL query statement below
SELECT unique_id,name
FROM Employees as emp
LEFT JOIN EmployeeUNI as uni
ON emp.id=uni.id;
