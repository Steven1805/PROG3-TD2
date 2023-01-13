create table if not exists "teams"
(
    id serial constraint PK_TEAMS primary key,
    name varchar not null
)