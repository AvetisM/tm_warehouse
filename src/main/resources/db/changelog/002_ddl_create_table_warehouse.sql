create table if not exists warehouse (
    id serial primary key not null,
    name varchar (100) not null unique
);