--CREATE DATABASE
    --CREATE DATABASE intern_db;

--CREATE TABLE
    --CREATE TABLE users
    -- (id SERIAL PRIMARY KEY,
    -- username VARCHAR(50) UNIQUE NOT NULL,
    -- password VARCHAR(250) NOT NULL,
    -- role VARCHAR(20) DEFAULT 'USER' NOT NULL CHECK(role IN ('USER','ADMIN')));


-- Password is Bcrypt as followed by intern assignment.
INSERT INTO users (username, password,role)
VALUES
    ('intern','$2a$12$jOpNKSDemyUsPSzp2gtCfegt.7EW33ZlmI4kX60t0gT.wlaQFDPhm','USER'),
    ('admin','$2a$12$drRXRaMrmgFLX.gZH2I4VeYNAmE2xnqFtxsLeDdI/LylNdIwhsRN.','ADMIN');