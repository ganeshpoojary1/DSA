# Write your MySQL query statement below
SELECT e.employee_id,e.department_id
FROM Employee e
INNER JOIN Employee e1
ON e.employee_id=e1.employee_id
GROUP BY employee_id,department_id
HAVING COUNT(e.employee_id)=1
OR MAX(e.primary_flag)='Y'