/*
Problem     : Analyzing the sales by product and date
Difficulty  : 6 Kyu
URL         : https://www.codewars.com/kata/5dac87a0abe9f1001f39e36d/train/sql
*/

SELECT * FROM
(
SELECT 
  p.name as product_name, 
  extract(year from s.date) as year, 
  extract(month from s.date) as month, 
  extract(day from s.date) as day, 
  sum(d.count*p.price) as total 
FROM sales_details as d
LEFT JOIN sales as s
ON d.sale_id = s.id
LEFT JOIN products as p
ON p.id = d.product_id
GROUP BY ROLLUP(1,2,3,4)
ORDER BY 1 DESC
OFFSET 1
) as abcd
ORDER BY 1,2,3,4;