create table if not exists purchase_items (
    id serial primary key not null,
    quantity int,
    price decimal,
    amount decimal,
    item_id int not null references item(id),
    purchase_id int not null references purchase(id)
);