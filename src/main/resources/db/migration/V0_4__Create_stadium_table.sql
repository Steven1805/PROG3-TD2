create table if not exists "stadiums"
(
    id integer constraint PK_STADIUM primary key,
    name varchar not null
)