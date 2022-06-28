DROP TABLE IF EXISTS test2.WORKER_QUIRKS;
DROP TABLE IF EXISTS test2.RECRUITER_QUIRKS;
DROP TABLE IF EXISTS test2.USER_MATCH_ALGO;
DROP TABLE IF EXISTS test2.WORK_EXP;
DROP TABLE IF EXISTS USERS_METRICS;
DROP TABLE IF EXISTS test2.USERS_METRICS;

CREATE TABLE IF NOT EXISTS test2.USERS_METRICS														
(
	user_id SERIAL,
	username VARCHAR(16) NOT NULL,
	first_name VARCHAR(16) NOT NULL,
	Last_name VARCHAR(16) NOT NULL,
	email VARCHAR(32) NOT NULL,
	password VARCHAR(16) NOT NULL,
	birth_date DATE NOT NULL,
	gender CHAR(1) NOT NULL,
	is_recruiter BOOLEAN NOT NULL,
	swipes_per_day CHAR(2),
	is_premium BOOLEAN NOT NULL,
	is_boosted BOOLEAN NOT NULL,
	PRIMARY KEY (user_id)
)

--proffession VARCHAR(24),
--industry_name VARCHAR(),
TABLESPACE pg_default;

ALTER TABLE IF EXISTS test2.USERS_METRICS
    OWNER to postgres;


-----------------------------------------

CREATE TABLE IF NOT EXISTS test2.WORK_EXP																							
(
	work_exp_id SERIAL,
	user_id INT NOT NULL,
	company_name VARCHAR(16) NOT NULL,
	date_started DATE NOT NULL, 
	date_ended DATE,
	company_role VARCHAR(16) NOT NULL,
	company_email VARCHAR(32), 
	company_phone VARCHAR(16),
	company_address VARCHAR(64),
	company_website VARCHAR(32),
	PRIMARY KEY (work_exp_id),
	FOREIGN KEY(user_id) REFERENCES test2.USERS_METRICS(user_id)
)
TABLESPACE pg_default;

ALTER TABLE IF EXISTS test2.WORK_EXP
    OWNER to postgres;



CREATE TABLE IF NOT EXISTS test2.WORKER_QUIRKS																							
(
	user_id INT NOT NULL,
	school CHAR(32),
	major_1 CHAR(32),
	major_2 CHAR(32),
	minor_1 CHAR(32),
	minor_2 CHAR(32),
	passions_1 CHAR(64),
	passions_2 CHAR(64),
	passions_3 CHAR(64),
	passions_4 CHAR(64),
	passions_5 CHAR(64),
	linked_in_link CHAR(128),
	proffession VARCHAR(24),
	industry_name VARCHAR(32),
	soft_skill_1 CHAR(64),
	soft_skill_2 CHAR(64),
	soft_skill_3 CHAR(64),
	hard_skill_1 CHAR(64),
	hard_skill_2 CHAR(64),
	hard_skill_3 CHAR(64),
	hard_skill_4 CHAR(64),
	hard_skill_5 CHAR(64),
	PRIMARY KEY(user_id), 
	CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES test2.USERS_METRICS(user_id)
)

TABLESPACE pg_default;
ALTER TABLE IF EXISTS test2.WORKER_QUIRKS																		
    OWNER to postgres;


CREATE TABLE IF NOT EXISTS test2.RECRUITER_QUIRKS																																									
(
	listing_id SERIAL,
	user_id serial,
	company_name VARCHAR(16) NOT NULL,
	job_postion VARCHAR(16) NOT NULL,
	salary VARCHAR(16),
	location_job VARCHAR(64),
	is_on_site BOOLEAN NOT NULL,
	linked_in_link VARCHAR(32),
	glass_door_link VARCHAR(32),
	work_exp_years_req CHAR(2),
	industry_name VARCHAR(32),
	soft_skill_1 CHAR(64),
	soft_skill_2 CHAR(64),
	soft_skill_3 CHAR(64),
	hard_skill_1 CHAR(64),
	hard_skill_2 CHAR(64),
	hard_skill_3 CHAR(64),
	hard_skill_4 CHAR(64),
	hard_skill_5 CHAR(64),
	major_1 CHAR(32),
	major_2 CHAR(32),
	major_3 CHAR(32),
	major_4 CHAR(32),
	major_5 CHAR(32),
	PRIMARY KEY(user_id), 
	CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES test2.USERS_METRICS(user_id)
)
TABLESPACE pg_default;
ALTER TABLE IF EXISTS test2.RECRUITER_QUIRKS
    OWNER to postgres;



CREATE TABLE IF NOT EXISTS test2.USER_MATCH_ALGO
(
	match_id SERIAL,
	user_id_worker INT NOT NULL,
	user_id_recruiter INT NOT NULL,
	recruiter_l_worker BOOLEAN NOT NULL,
	worker_l_recruiter BOOLEAN NOT NULL,
	PRIMARY KEY(match_id),
	FOREIGN KEY(user_id_worker) REFERENCES test2.USERS_METRICS(user_id),
	FOREIGN KEY(user_id_recruiter) REFERENCES test2.USERS_METRICS(user_id)
	
)
TABLESPACE pg_default;

ALTER TABLE IF EXISTS test2.USER_MATCH_ALGO
    OWNER to postgres;