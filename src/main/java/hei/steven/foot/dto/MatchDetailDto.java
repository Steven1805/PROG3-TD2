package hei.steven.foot.dto;

import lombok.*;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchDetailDto {

    private int id;
    private TeamDto team1;
    private TeamDto team2;
    private Timestamp datetime;
    private List<GoalDto> team1Goals;
    private List<GoalDto> team2Goals;
}
