package hei.steven.foot.mapper;

import hei.steven.foot.dto.SponsorDto;
import hei.steven.foot.models.Sponsor;
import org.springframework.stereotype.Component;

@Component
public class SponsorMapper {

    public SponsorDto toSponsorDto(Sponsor sponsor){
        return new SponsorDto().builder()
                .id(sponsor.getId())
                .name(sponsor.getName())
                .build();
    }
}
