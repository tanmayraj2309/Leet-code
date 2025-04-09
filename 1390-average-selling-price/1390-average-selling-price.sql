# Write your MySQL query statement below
SELECT p.product_id, IFNULL(Round(sum(units*price)/sum(units),2),0) as average_price
FROM 
Prices as p
LEFT JOIN 
UnitsSold as u
on p. product_id=u. product_id 
AND u. purchase_date BETWEEN  start_date AND end_date
Group By product_id