--SELECT SYSDATE from dual;

--SELECT * FROM ACCESS;

SELECT * FROM employees;


-- CREATE TABLE employees (
--     employee_id INT PRIMARY KEY,
--     first_name VARCHAR(50),
--     last_name VARCHAR(50),
--     email VARCHAR(100) UNIQUE,
--     phone_number VARCHAR(20),
--     hire_date DATE,
--     salary DECIMAL(10,2),
--     department VARCHAR(50)
-- );

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (1, 'John', 'Doe', 'john.doe@example.com', '1234567890', TO_DATE('2023-01-15', 'YYYY-MM-DD'), 55000.00, 'IT');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (2, 'Alice', 'Smith', 'alice.smith@example.com', '1234567891', TO_DATE('2023-02-20', 'YYYY-MM-DD'), 62000.00, 'HR');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (3, 'Bob', 'Johnson', 'bob.johnson@example.com', '1234567892', TO_DATE('2023-03-10', 'YYYY-MM-DD'), 70000.00, 'Finance');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (4, 'Emma', 'Brown', 'emma.brown@example.com', '1234567893', TO_DATE('2023-04-05', 'YYYY-MM-DD'), 48000.00, 'Marketing');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (5, 'Michael', 'Williams', 'michael.williams@example.com', '1234567894', TO_DATE('2023-05-22', 'YYYY-MM-DD'), 75000.00, 'Sales');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (6, 'Sophia', 'Miller', 'sophia.miller@example.com', '1234567895', TO_DATE('2023-06-15', 'YYYY-MM-DD'), 53000.00, 'IT');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (7, 'Daniel', 'Garcia', 'daniel.garcia@example.com', '1234567896', TO_DATE('2023-07-01', 'YYYY-MM-DD'), 67000.00, 'Finance');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (8, 'Olivia', 'Martinez', 'olivia.martinez@example.com', '1234567897', TO_DATE('2023-08-20', 'YYYY-MM-DD'), 72000.00, 'HR');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (9, 'James', 'Anderson', 'james.anderson@example.com', '1234567898', TO_DATE('2023-09-12', 'YYYY-MM-DD'), 50000.00, 'Marketing');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (10, 'Liam', 'White', 'liam.white@example.com', '1234567899', TO_DATE('2023-10-05', 'YYYY-MM-DD'), 68000.00, 'IT');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (11, 'Charlotte', 'Harris', 'charlotte.harris@example.com', '1234567800', TO_DATE('2023-11-18', 'YYYY-MM-DD'), 56000.00, 'Finance');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (12, 'Benjamin', 'Clark', 'benjamin.clark@example.com', '1234567801', TO_DATE('2023-12-22', 'YYYY-MM-DD'), 74000.00, 'Sales');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (13, 'Amelia', 'Lewis', 'amelia.lewis@example.com', '1234567802', TO_DATE('2024-01-10', 'YYYY-MM-DD'), 52000.00, 'HR');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (14, 'Lucas', 'Walker', 'lucas.walker@example.com', '1234567803', TO_DATE('2024-02-15', 'YYYY-MM-DD'), 65000.00, 'IT');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (15, 'Harper', 'Hall', 'harper.hall@example.com', '1234567804', TO_DATE('2024-03-20', 'YYYY-MM-DD'), 59000.00, 'Marketing');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (16, 'Henry', 'Allen', 'henry.allen@example.com', '1234567805', TO_DATE('2024-04-25', 'YYYY-MM-DD'), 71000.00, 'Finance');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (17, 'Evelyn', 'Young', 'evelyn.young@example.com', '1234567806', TO_DATE('2024-05-30', 'YYYY-MM-DD'), 56000.00, 'HR');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (18, 'Jack', 'King', 'jack.king@example.com', '1234567807', TO_DATE('2024-06-05', 'YYYY-MM-DD'), 63000.00, 'IT');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (19, 'Mia', 'Scott', 'mia.scott@example.com', '1234567808', TO_DATE('2024-07-10', 'YYYY-MM-DD'), 58000.00, 'Marketing');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (20, 'Alexander', 'Green', 'alexander.green@example.com', '1234567809', TO_DATE('2024-08-15', 'YYYY-MM-DD'), 77000.00, 'Sales');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (21, 'Avery', 'Baker', 'avery.baker@example.com', '1234567810', TO_DATE('2024-09-20', 'YYYY-MM-DD'), 55000.00, 'HR');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (22, 'William', 'Adams', 'william.adams@example.com', '1234567811', TO_DATE('2024-10-25', 'YYYY-MM-DD'), 69000.00, 'Finance');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (23, 'Ella', 'Nelson', 'ella.nelson@example.com', '1234567812', TO_DATE('2024-11-30', 'YYYY-MM-DD'), 61000.00, 'IT');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (24, 'Mason', 'Carter', 'mason.carter@example.com', '1234567813', TO_DATE('2024-12-05', 'YYYY-MM-DD'), 64000.00, 'Marketing');

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, salary, department) 
VALUES (25, 'Scarlett', 'Mitchell', 'scarlett.mitchell@example.com', '1234567814', TO_DATE('2025-01-10', 'YYYY-MM-DD'), 57000.00, 'HR');