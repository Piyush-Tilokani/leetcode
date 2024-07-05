# Write your MySQL query statement below
-- Join approach
-- select p.product_name, s.year, s.price from sales as s left join product as p
-- on s.product_id = p.product_id;

-- join using where
select p.product_name, s.year, s.price from sales as s, product as p
where s.product_id = p.product_id;