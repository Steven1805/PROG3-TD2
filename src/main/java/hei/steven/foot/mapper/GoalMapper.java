package hei.steven.foot.mapper;

import hei.steven.foot.dto.GoalDto;
import hei.steven.foot.models.Goal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GoalMapper {
    @Autowired
    private PlayerMapper playerMapper;

    public GoalDto toGoalDto(Goal goal){
        return new GoalDto().builder()
                .minute(goal.getMinute())
                .player(playerMapper.toPlayerDto(goal.getPlayer()))
                .build();
    }
}
