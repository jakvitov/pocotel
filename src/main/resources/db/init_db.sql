BEGIN;
CREATE TABLE STUDENT (
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(255),
                         surname VARCHAR(255),
                         born DATE,
                         average_grade VARCHAR(255)
);


INSERT INTO STUDENT(name, surname, born, average_grade) VALUES ('John', 'Doe', '2001-02-15', '2.52141');
INSERT INTO STUDENT(name, surname, born, average_grade) VALUES ('Max', 'Mustermann', '2004-04-30', '1.55241');
INSERT INTO STUDENT(name, surname, born, average_grade) VALUES ('Mario', 'Rossi', '1995-11-03', '1.21');
INSERT INTO STUDENT(name, surname, born, average_grade) VALUES ('Ivan', 'Ivanovich', '1999-12-12', '4.41125121');
COMMIT;