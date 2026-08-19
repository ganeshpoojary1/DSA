select c.customer_id
from Customer as c
inner join Product as p
on c.product_key = p.product_key
group by c.customer_id
having count(distinct c.product_key) = (select count(product_key) from Product);