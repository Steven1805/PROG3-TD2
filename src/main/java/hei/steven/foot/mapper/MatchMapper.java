package hei.steven.foot.mapper;

import hei.steven.foot.dto.GoalDto;
import hei.steven.foot.dto.MatchDetailDto;
import hei.steven.foot.dto.MatchDto;
import hei.steven.foot.models.Goal;
import hei.steven.foot.models.Match;
import hei.steven.foot.services.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MatchMapper {

    @Autowired
    private TeamMapper teamMapper;
    @Autowired
    private GoalService goalService;

    @Autowired
    private GoalMapper goalMapper;
    public MatchDto toMatchDto(Match match){
        return new MatchDto().builder().
                id(match.getId())
                .team1(teamMapper.toTeamDto(match.getTeam1()))
                .team2(teamMapper.toTeamDto(match.getTeam2()))
                .datetime(match.getDatetime())
                .build();
    }

    public MatchDetailDto toMatchDetailDto(Match match){
        List<GoalDto> goalTeam1 = goalService.findByMatchAndBeneficiaryTeam(match,match.getTeam1())
                .stream().map(goalMapper::toGoalDto).toList();
        List<GoalDto> goalTeam2 = goalService.findByMatchAndBeneficiaryTeam(match,match.getTeam2())
                .stream().map(goalMapper::toGoalDto).toList();

        return new MatchDetailDto().builder()
                .id(match.getId())
                .team1(teamMapper.toTeamDto(match.getTeam1()))
                .team2(teamMapper.toTeamDto(match.getTeam2()))
                .datetime(match.getDatetime())
                .team1Goals(goalTeam1)
                .team2Goals(goalTeam2)
                .build();
    }
}
