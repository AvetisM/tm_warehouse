create table if not exists price_type (
    id serial primary key not null,
    name varchar (100) not null unique,
    code varchar (100) not null unique
);