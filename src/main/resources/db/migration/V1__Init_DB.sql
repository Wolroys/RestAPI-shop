create table item (
    id bigserial not null,
    name varchar(255),
    options varchar(255),
    quantity integer not null,
    reviews varchar(255),
    primary key (id)
);