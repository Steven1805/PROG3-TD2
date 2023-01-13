package hei.steven.foot.mapper;

import hei.steven.foot.dto.PlayerDto;
import hei.steven.foot.dto.SponsorDto;
import hei.steven.foot.dto.TeamDto;
import hei.steven.foot.models.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamMapper {
    @Autowired
    private PlayerMapper playerMapper;
    @Autowired
    private SponsorMapper sponsorMapper;

    public TeamDto toListItemTeamDto(Team team){
        return new TeamDto().builder()
                .id(team.getId())
                .name(team.getName())
                .build();
    }
    public TeamDto toTeamDto(Team team){
        List<PlayerDto> players = team.getPlayers().stream().map(playerMapper::toPlayerDto)
                .toList();
        List<SponsorDto> sponsors = team.getSponsors().stream().map(sponsorMapper::toSponsorDto)
                .toList();
        return new TeamDto().builder().
                id(team.getId())
                .name(team.getName())
                .players(players)
                .sponsors(sponsors)
                .build();
    }
}
