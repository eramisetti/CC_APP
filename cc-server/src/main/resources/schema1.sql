create table user_roles(
username varchar(100),
role varchar(100)
);

create table user(
	user_id BIGINT primary key not null,
	first_name varchar(100),
	last_name varchar(100),
	user_name varchar(100),
	password varchar(100),
	corp_email varchar(50),
	personal_email varchar(50),
	company_name varchar(100),
	company_location varchar(100),
	corp_email_validated BOOLEAN,
	personal_email_validated BOOLEAN,
	createdBy varchar(50),
	modifiedBy varchar(50),
	created DATE,
	modified DATE,
	active BOOLEAN,
	
	CONSTRAINT user_name_unique UNIQUE (user_name),
	CONSTRAINT user_company_unique UNIQUE (company_name),
	CONSTRAINT user_cemail_unique UNIQUE (corp_email),
	CONSTRAINT user_pemail_unique UNIQUE (personal_email)
);