package hei.steven.foot.dto;

import hei.steven.foot.models.Goal;
import hei.steven.foot.models.Stadium;
import hei.steven.foot.models.Team;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchDto {

    private int id;
    private TeamDto team1;
    private TeamDto team2;
    private Timestamp datetime;
}
