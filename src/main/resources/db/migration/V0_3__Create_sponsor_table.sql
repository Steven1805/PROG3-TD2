create table if not exists "sponsors"
(
    id serial constraint PK_SPONSOR primary key,
    name varchar not null
)