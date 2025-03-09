# Write your MySQL query statement below
SELECT customer_id,count(v.visit_id) as count_no_trans
FROM Visits as v
LEFT JOIN
Transactions as t
 ON v.visit_id    = t.visit_id    
WHERE transaction_id IS NULL
GROUP BY customer_id;