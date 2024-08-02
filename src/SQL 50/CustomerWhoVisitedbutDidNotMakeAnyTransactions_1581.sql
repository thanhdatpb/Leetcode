select v.customer_id, count(v.visit_id) as count_no_trans
from Visits as v left join Transactions as t using(visit_id)
where t.transaction_id is null
group by 1