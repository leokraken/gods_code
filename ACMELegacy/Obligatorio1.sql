DROP DATABASE IF EXISTS middleware;
CREATE DATABASE IF NOT EXISTS middleware;

CREATE TABLE middleware.transactions
(
	id					BIGINT NOT NULL PRIMARY KEY,
	datetime 			DATETIME NOT NULL,
	transaction_type	CHAR(1) NOT NULL,
	commerce_code		VARCHAR(20) NOT NULL,
	commerce_name		VARCHAR(20) NOT NULL,
	card_number			VARCHAR(20) NOT NULL,
	card_type			CHAR(1) NOT NULL,
	currency_code		CHAR(3) NOT NULL,
	amount				NUMERIC(15,2) NOT NULL
);