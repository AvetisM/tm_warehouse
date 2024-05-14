create table if not exists purchase (
    id serial primary key not null,
    date timestamp without time zone default now(),
    description varchar(1024),
    amount decimal
);