DROP DATABASE IF EXISTS znakstore;
CREATE DATABASE znakstore;
USE znakstore;

CREATE TABLE users(
	id INT AUTO_INCREMENT,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(63) NOT NULL,
    firstname VARCHAR(50) NOT NULL,
    surname VARCHAR(50) NOT NULL,
    birthday DATE NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO users(email, password, firstname, surname, birthday) VALUES ('idontknow1@gmail.com', '12345678', 'Alexey', 'Alexeeff', '1989-09-30');
INSERT INTO users(email, password, firstname, surname, birthday) VALUES ('idontknow2@gmail.com', '12345678', 'Dmitry', 'Dmitrieff', '1992-05-03');
INSERT INTO users(email, password, firstname, surname, birthday) VALUES ('idontknow3@gmail.com', '12345678', 'Fiodor', 'Fiodoroff', '1994-07-12');
INSERT INTO users(email, password, firstname, surname, birthday) VALUES ('idontknow4@gmail.com', '12345678', 'Ivan', 'Ivanoff', '1992-11-11');
INSERT INTO users(email, password, firstname, surname, birthday) VALUES ('idontknow5@gmail.com', '12345678', 'Sergey', 'Sergeeff', '1990-11-29');

SELECT * FROM users;















