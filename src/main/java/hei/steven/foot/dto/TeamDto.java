package hei.steven.foot.dto;

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
public class TeamDto {
    private int id;
    private String name;
    private List<PlayerDto> players;
    private List<SponsorDto> sponsors;
}
