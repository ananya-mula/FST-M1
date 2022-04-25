REM   Script: Activity9
REM   Activity 9

select * from orders;

select sum(PURCHASE_AMOUNT) as Total_AMOUNT from orders;

select avg(PURCHASE_AMOUNT) as AVG_AMOUNT from orders;

select max(PURCHASE_AMOUNT) as MAX_AMOUNT from orders;

select min(PURCHASE_AMOUNT) as MIN_AMOUNT from orders;

select count(distinct salesman_id) as Salesman_No from orders;

select customer_id, max(PURCHASE_AMOUNT) as MAX_AMOUNT from orders group by customer_id;

select salesman_id, max(PURCHASE_AMOUNT) as MAX_AMOUNT from orders where ORDER_DATE = To_DATE('2012/08/17', 'YYYY/MM/DD') group by salesman_id,order_date;

SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders 
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

CREATE table salesman (salesman_id int, 
salesman_name varchar2(32), 
salesman_city varchar2(32), 
commission int);

desc salesman


CREATE table salesman (salesman_id int, 
salesman_name varchar2(32), 
salesman_city varchar2(32), 
commission int);

desc salesman


insert into salesman values (5001,James Hoog, New York,15);

insert into salesman values (5001,'James Hoog', 'New York',15);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman;

select salesman_id, salesman_city from salesman;

select * from salesman WHERE salesman_city = 'Paris';

select salesman_id, salesman_city from salesman;

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

CREATE table salesman (salesman_id int, 
salesman_name varchar2(32), 
salesman_city varchar2(32), 
commission int);

desc salesman


insert into salesman values (5001,James Hoog, New York,15);

insert into salesman values (5001,'James Hoog', 'New York',15);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman;

select salesman_id, salesman_city from salesman;

select * from salesman WHERE salesman_city = 'Paris';

select salesman_id, salesman_city from salesman;

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

SELECT * FROM salesman;

CREATE table salesman (salesman_id int, 
salesman_name varchar2(32), 
salesman_city varchar2(32), 
commission int);

desc salesman


insert into salesman values (5001,James Hoog, New York,15);

insert into salesman values (5001,'James Hoog', 'New York',15);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman;

select salesman_id, salesman_city from salesman;

select * from salesman WHERE salesman_city = 'Paris';

select salesman_id, salesman_city from salesman;

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

SELECT * FROM salesman;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select * from orders;

select distinct salesman_id from orders;

select * from orders order by order_date;

select * from orders order by purchase_amount desc;

select * from orders where purchase_amount < 500;

select * from orders where purchase_amount between 1000 and 2000;

select * from orders;

select * from salesman;

create table customers (customer_id int primary key, customer_name varchar(32),city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

select c.customer_name,s.salesman_id from customers c INNER JOIN  salesman s on c.salesman_id = s.salesman_id;

select c.customer_name,c.grade,s.salesman_id from customers c INNER JOIN  salesman s on c.salesman_id = s.salesman_id where c.grade < 300;

select c.customer_name,c.grade,s.salesman_id from customers c INNER JOIN  salesman s on c.salesman_id = s.salesman_id where c.grade < 300 order by c.customer_id;

select c.customer_id,c.customer_name,c.grade,s.salesman_id from customers c INNER JOIN  salesman s on c.salesman_id = s.salesman_id where c.grade < 300 order by c.customer_id;

select c.customer_id,c.customer_name,c.grade,s.salesman_id from customers c  
LEFT OUTER JOIN  salesman s on c.salesman_id = s.salesman_id where c.grade < 300 order by c.customer_id;

select * from salesman;

select c.customer_id,c.customer_name,c.grade,s.salesman_id from customers c  
INNER JOIN  salesman s on c.salesman_id = s.salesman_id where s.commision > 12 order by c.customer_id;

select c.customer_id,c.customer_name,c.grade,s.salesman_id from customers c  
INNER JOIN  salesman s on c.salesman_id = s.salesman_id where s.commision > 12;

select c.customer_id,c.customer_name,c.grade,s.salesman_id from customers c  
LEFT OUTER JOIN  salesman s on c.salesman_id = s.salesman_id where c.grade < 300 order by c.customer_id;

select * from salesman;

select c.customer_id,c.customer_name,c.grade,s.salesman_id from customers c  
INNER JOIN  salesman s on c.salesman_id = s.salesman_id where s.commission > 12;

select c.customer_id,c.customer_name,c.grade,s.salesman_id,s.commission from customers c  
INNER JOIN  salesman s on c.salesman_id = s.salesman_id where s.commission > 12;

select * from orders;

select * from salesman;

select * from orders;

select * from salesman;

select * from customers;

select a.order_no,a.order_date,a.purchase_amount,b.customer_id, b.customer_name,c.salesman_id from orders a  
INNER JOIN customers b on a.customer_id = b.customer_id  
INNER JOIN salesman c on b.salesman_id = c.salesman_id;

select a.order_no,a.order_date,a.purchase_amount,b.customer_id, b.customer_name,c.salesman_id,c.commission from orders a  
INNER JOIN customers b on a.customer_id = b.customer_id  
INNER JOIN salesman c on a.salesman_id = c.salesman_id;

