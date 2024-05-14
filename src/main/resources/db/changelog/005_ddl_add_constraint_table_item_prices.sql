alter table item_prices
add constraint unique_item_price unique (period, item_id, price_type_id);