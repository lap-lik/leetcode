-- Write your PostgreSQL query statement below
SELECT e.name AS Employee
FROM employee AS e
JOIN employee AS m ON e.managerId = m.id
WHERE e.salary > m.salary