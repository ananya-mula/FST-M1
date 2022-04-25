REM   Script: Activity3
REM   activity 3,4,5

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

