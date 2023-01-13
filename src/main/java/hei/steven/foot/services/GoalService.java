package hei.steven.foot.services;

import hei.steven.foot.models.Goal;
import hei.steven.foot.models.Match;
import hei.steven.foot.models.Team;
import hei.steven.foot.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalService {
    @Autowired
    private GoalRepository goalRepository;

    public List<Goal> findByMatchAndBeneficiaryTeam(Match match, Team team){
        return goalRepository.findByMatchAndBeneficiaryTeam(match,team);
    }
}
