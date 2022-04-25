REM   Script: Activity2
REM   activity 2 & 3

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

