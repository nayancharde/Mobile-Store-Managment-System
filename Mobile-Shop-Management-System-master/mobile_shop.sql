CREATE DATABASE IF NOT EXISTS mobile_shop;
USE mobile_shop;

CREATE TABLE IF NOT EXISTS users (
    user_id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    user_type VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS managers (
    user_id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    user_type VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS phones (
    phone_id VARCHAR(50) PRIMARY KEY,
    brand_name VARCHAR(100) NOT NULL,
    name VARCHAR(100) NOT NULL,
    os VARCHAR(100) NOT NULL,
    display_size VARCHAR(100) NOT NULL,
    camera VARCHAR(100) NOT NULL,
    processor VARCHAR(100) NOT NULL,
    ram VARCHAR(100) NOT NULL,
    storage VARCHAR(100) NOT NULL,
    battery VARCHAR(100) NOT NULL,
    price VARCHAR(100) NOT NULL,
    category VARCHAR(100) NOT NULL
);
