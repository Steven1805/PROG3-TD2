create table if not exists "sponsors"
(
    id integer constraint PK_SPONSOR primary key,
    name varchar not null
)