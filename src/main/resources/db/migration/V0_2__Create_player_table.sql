create table if not exists "players"
(
    id serial constraint PK_PLAYER primary key,
    name varchar NOT NULL,
    number integer NOT NULL,
    is_goalkeeper boolean DEFAULT FALSE,
    team_id integer constraint FK_PLAYER_TEAM
        references teams(id)
)