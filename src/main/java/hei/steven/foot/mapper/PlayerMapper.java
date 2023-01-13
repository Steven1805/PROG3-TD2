package hei.steven.foot.mapper;

import hei.steven.foot.dto.PlayerDto;
import hei.steven.foot.models.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {

    public PlayerDto toPlayerDto(Player player){
        return new PlayerDto().builder()
                .id(player.getId())
                .name(player.getName())
                .build();
    }
}
