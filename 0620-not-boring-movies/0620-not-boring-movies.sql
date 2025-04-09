# Write your MySQL query statement below
SELECT id,movie,description,rating
from Cinema
where id%2=1 AND description!="boring" 
ORDER BY rating DESC;