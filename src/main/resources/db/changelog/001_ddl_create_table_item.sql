create table if not exists item (
    id serial primary key not null,
    name varchar (100) not null unique,
    description varchar(1024)
);