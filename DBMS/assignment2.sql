drop table orders;
create table customer(cust_id int primary key,cust_name varchar(20));
create table orders(order_id serial primary key,cust_id int, product_name varchar(20));
insert into customer values
(101,'Jason'),
(102,'Emily'),
(103,'John'),
(104,'Ram'),
(105,'Ajay'),
(106,'Tina'),
(107,'Louis');

select * from customer;

insert into orders (cust_id,product_name) values
(101,'Tshirt'),
(101,'Toothpaste'),
(102,'Sugar'),
(103,'Biscuits'),
(103,'Orange Juice'),
(105,'Noodles'),
(106,'Dress'),
(106,'Rice'),
(106,'Notebooks'),
(108,'Cheese'),
(109,'Water Colours'),
(110,'Bread');

select * from orders;

select customer.cust_id,customer.cust_name,orders.cust_id,orders.product_name,orders.order_id from customer inner join orders on customer.cust_id=orders.cust_id; --inner join

select customer.cust_id,customer.cust_name,orders.cust_id,orders.product_name,orders.order_id from customer left join orders on customer.cust_id=orders.cust_id;--left join

select customer.cust_id,customer.cust_name,orders.cust_id,orders.product_name,orders.order_id from customer right join orders on customer.cust_id=orders.cust_id;--right join

select customer.cust_id,customer.cust_name,orders.cust_id,orders.product_name,orders.order_id from customer full join orders on customer.cust_id=orders.cust_id;--full join

--aliases
select distinct product_name as products from orders;

--index
create index orderIndex on orders(order_id,cust_id);


