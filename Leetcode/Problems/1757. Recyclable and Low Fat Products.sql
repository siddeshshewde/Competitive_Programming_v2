/*
Problem  : Recyclable and Low Fat Products
Link     : https://leetcode.com/problems/recyclable-and-low-fat-products/description/
*/

SELECT product_id
FROM Products
WHERE low_fats = "Y" and recyclable = "Y";

/*
Runtime: 982 ms
Beats: 56.64% 
*/