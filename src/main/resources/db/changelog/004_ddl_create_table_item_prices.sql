create table if not exists item_prices (
    id serial primary key not null,
    period timestamp without time zone default now(),
    price decimal,
    item_id int not null references item(id),
    price_type_id int not null references price_type(id)
);