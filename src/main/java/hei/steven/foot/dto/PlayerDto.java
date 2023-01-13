package hei.steven.foot.dto;
import hei.steven.foot.models.Team;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerDto {
    private int id;
    private String name;
    private int number;
}
