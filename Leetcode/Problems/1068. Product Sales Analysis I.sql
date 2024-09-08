/*
Problem     : Product Sales Analysis I
Difficulty  : Easy
URL         : https://leetcode.com/problems/product-sales-analysis-i/description
*/

SELECT product_name, year, price
FROM sales
LEFT JOIN product
using (product_id)