create table if not exists "goals"
(
    benificiary_team_id serial constraint FK_TEAM_GOAL
        references teams(id),

    player_id integer constraint FK_PLAYER_GOAL
            references players(id),

    match_id integer constraint FK_MATCH_GOAL
            references matchs(id),
    minute integer NOT NULL
)