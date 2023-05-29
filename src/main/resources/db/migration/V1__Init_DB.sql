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

alter table if exists item add constraint FK2n9w8d0dp4bsfra9dcg0046l4 foreign key (category_id) references category;