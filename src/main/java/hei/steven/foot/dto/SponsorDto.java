package hei.steven.foot.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SponsorDto {
    private int id;
    private String name;
}
