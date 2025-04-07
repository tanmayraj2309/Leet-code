SELECT 
  s.user_id,
  IFNULL(ROUND(SUM(c.action = 'confirmed') / COUNT(c.action), 2), 0) AS confirmation_rate
FROM 
  signups AS s
LEFT JOIN 
  confirmations AS c 
ON 
  s.user_id = c.user_id
GROUP BY 
  s.user_id;
