USE practice;

SHOW TABLES;

CREATE TABLE persons (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    card_number VARCHAR(8) REFERENCES identity_card(id_number)
);

CREATE TABLE identity_card (
    id_number CHAR(8) PRIMARY KEY,
    issue_date DATE,
    person_id INT REFERENCES persons(id)
);

CREATE TABLE movie (
    id INT PRIMARY KEY,
    title VARCHAR(100)
);


CREATE TABLE director(
    id INT PRIMARY KEY,
    driector_name VARCHAR(100)
);

CREATE TABLE movie_director (
    movie_id INT REFERENCES movie(id),
    director_id INT REFERENCES director(id),
    PRIMARY KEY (movie_id, director_id)
);

INSERT INTO persons (name, card_number) VALUES ('Lali', 123456);

ALTER TABLE persons MODIFY id INT NOT NULL AUTO_INCREMENT;

INSERT INTO persons (name, card_number) VALUES ('Pisti', 564465);

SELECT * FROM persons;

DELETE FROM persons WHERE id = 2;

UPDATE persons SET name = 'Jani' WHERE id = 1; 

SELECT * FROM persons;


INSERT INTO persons (name, card_number) VALUES ('Peti', 4895614);

INSERT INTO persons (name, card_number) VALUES ('Pisti', 4531218);

SELECT DISTINCT name FROM persons;

SELECT * FROM persons ORDER BY name ASC;

SELECT * FROM persons ORDER BY name DESC;

SELECT * FROM persons ORDER BY id ASC;

SELECT name, COUNT(name) AS count FROM persons GROUP BY name;

CREATE TABLE food_ticket (id INT AUTO_INCREMENT PRIMARY KEY, valid_date DATE , person_id INT REFERENCES persons(id) );

INSERT INTO food_ticket (valid_date, person_id) VALUES ('2021-03-01', 1), ('2021-02-01', 1), ('2021-01-01', 2);

INSERT INTO food_ticket (valid_date, person_id) VALUES ('2021-01-01', 3);

SELECT * FROM food_ticket;

SELECT * FROM persons;

SELECT * FROM persons CROSS JOIN food_ticket;

SELECT * FROM persons p INNER JOIN food_ticket f ON p.id = f.person_id;

SELECT * FROM persons p LEFT JOIN food_ticket f ON p.id = f.person_id;

SELECT * FROM persons p RIGHT JOIN food_ticket f ON p.id = f.person_id;

