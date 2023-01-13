create table if not exists "teams"
(
    id integer constraint PK_TEAMS primary key,
    name varchar not null
)