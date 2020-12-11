select status, COUNT(*) as 'So luong ' from orders 
group by status;

select status, sum(quantityOrdered * priceEach) as amount
from orders 
inner join orderdetails on orders.ordernumber = orderdetails.ordernumber
group by status;

-- Tong tien cua tung don hang
select orderNumber, sum(quantityOrdered * priceEach) as total
from orderdetails
group by orderNumber;