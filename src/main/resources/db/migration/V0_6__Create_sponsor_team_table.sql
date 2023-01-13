create table if not exists "team_sponsors"
(
    team_id integer constraint FK_TEAM_TEAMSPONSOR
        references teams(id),

    sponsor_id integer constraint FK_SPONSOR_TEAMSPONSOR
            references sponsors(id)
);