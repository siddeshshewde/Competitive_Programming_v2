/*
https://sqlzoo.net/wiki/SELECT_basics
*/

1. Introducing the world table of countries
SELECT population FROM world
WHERE name = 'Germany';

2. Scandinavia
SELECT name, population FROM world
WHERE name IN ('Sweden', 'Norway', 'Denmark');

3. Just the right size
SELECT name, area FROM world
WHERE area BETWEEN 200000 AND 250000
