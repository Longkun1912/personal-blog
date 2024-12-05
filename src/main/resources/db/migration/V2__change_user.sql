-- Modify the users table
alter table users
drop column name,
    add column first_name varchar(255),
    add column last_name varchar(255);