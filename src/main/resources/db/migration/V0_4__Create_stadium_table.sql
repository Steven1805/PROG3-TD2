create table if not exists "stadiums"
(
    id serial constraint PK_STADIUM primary key,
    name varchar not null
)