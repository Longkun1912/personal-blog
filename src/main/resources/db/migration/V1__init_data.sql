create table roles (
    id serial primary key,
    name varchar(255)
);

create table users (
    id uuid primary key,
    name varchar(255),
    email varchar(255),
    country varchar(100),
    mobile varchar(100),
    avatar text,
    gender varchar(50),
    password varchar(255),
    created_at timestamp,
    updated_at timestamp
);

create table user_roles (
    user_id uuid,
    role_id serial,
    primary key (user_id, role_id),
    foreign key (user_id) references users(id),
    foreign key (role_id) references roles(id)
)