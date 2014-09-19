DROP DATABASE IF EXISTS middleware;
CREATE DATABASE IF NOT EXISTS middleware;

CREATE TABLE middleware.transactions
(
	id			BIGINT(20) UNSIGNED,
	datetime 		DATETIME,
	transaction_type	CHAR(1),
	commerce_code		VARCHAR(20),
	commerce_name		VARCHAR(20),
	card_number		VARCHAR(20),
	card_type		CHAR(1),
	currency_code		CHAR(3),
	amount			NUMERIC(15,2)
);
