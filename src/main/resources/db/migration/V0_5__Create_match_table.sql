create table if not exists "matchs"
(
    id serial constraint PK_MATCH primary key,
    team1_id integer constraint FK_MATCH_TEAM1
        references teams(id),
    team2_id integer constraint FK_MATCH_TEAM2
            references teams(id),
    stadium_id integer constraint FK_MATCH_STADIUM
        references stadiums(id)
);