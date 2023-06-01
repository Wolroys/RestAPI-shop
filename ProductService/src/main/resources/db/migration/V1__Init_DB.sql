create table if not exists category (
    id bigserial not null,
     title varchar(255),
      primary key (id)
);

create table if not exists item (
    id bigserial not null,
    created_at timestamp(6),
    price integer,
    title varchar(255),
    updated_at timestamp(6),
    category_id bigint,
    primary key (id)
);

create table orders (
    id bigserial not null,
    address varchar(255),
    phone_number varchar(255),
    status varchar(64),
    total_price bigint,
    username varchar(255),
    primary key (id)
);

create table item_order (
    id bigserial not null,
    created_at timestamp(6),
    price bigint,
    quantity integer,
    updated_at timestamp(6),
    item_id bigint,
    order_id bigint,
    primary key (id)
);

alter table if exists item add constraint FK2n9w8d0dp4bsfra9dcg0046l4 foreign key (category_id) references category;

alter table if exists item_order add constraint FKpa5oshd7o9daefimqp43h2n9n foreign key (item_id) references item

alter table if exists item_order add constraint FK8cvi933jxg2n8ojl4wxnt1ri5 foreign key (order_id) references orders

insert into category (title) values ('drinks');

insert into item (title, price, category_id, created_at) values ('Coca-cola', 80, 1, current_timestamp);
