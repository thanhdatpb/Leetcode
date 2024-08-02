select Today.id
from Weather as Today join Weather as Yesterday
                           on (DATE_SUB(Today.recordDate, INTERVAL 1 DAY) = Yesterday.recordDate)
where Today.temperature > Yesterday.temperature;