-- Table: test2.users

 --DROP TABLE IF EXISTS test2.users;

CREATE TABLE IF NOT EXISTS test2.users
(
	id serial,
	username VARCHAR(25) NOT NULL,
	PRIMARY KEY (id)
	
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS test2.users
    OWNER to postgres;
	
DROP TABLE IF EXISTS test2.admin;

CREATE TABLE IF NOT EXISTS test2.address
(
	user_id int NOT NULL,
	street VARCHAR(30) NOT NULL,
	city VARCHAR(30) NOT NULL,
  	state VARCHAR(30) NOT NULL,
  	PRIMARY KEY (user_id),
  	CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES test2.users (id) 
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS test2.address
    OWNER to postgres;
	
--INSERT into test2.users(username) 
--VALUES('adam');
