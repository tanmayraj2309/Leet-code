# Write your MySQL query statement below
SELECt name 
FROM Customer
WHERE 
referee_id != 2 OR referee_id IS NULL;