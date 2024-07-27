select eu.unique_id, e.name
from Employees as e left join EmployeeUNI as eu using(id)