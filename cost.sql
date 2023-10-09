create database cost;

use cost;

CREATE TABLE person (
   person_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    birthplace VARCHAR(255),
    birthdate DATE,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE expense (
   expense_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    location VARCHAR(255) NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    spender_id BIGINT NOT NULL,
    FOREIGN KEY (spender_id) REFERENCES person(person_id)
);

INSERT INTO person (name, birthplace,birthdate, email) VALUES 
('Gothard Barbi', 'New York','1998-10-07', 'barbii@gmail.com'),
('Ilyes Tamas', 'Los Angeles','1997-03-07', 'tamas@gmail.com');

INSERT INTO expense (location, amount, spender_id) VALUES
('Restaurant', 50.00, '2'),
('Grocery Store', 30.00, '1');

select * from person;
select * from expense;
drop database cost;
ALTER TABLE expense MODIFY COLUMN amount FLOAT;

