--Method 1:
select e.name, b.bonus
from Employee as e left join Bonus as b using(empId)
where ifnull(b.bonus, 0) < 1000


--Method 2:
select e.name, b.bonus
from Employee as e left join Bonus as b on e.empId = b.empId
where b.bonus < 1000 or bonus is null