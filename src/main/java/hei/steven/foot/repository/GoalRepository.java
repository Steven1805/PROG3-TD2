package hei.steven.foot.repository;

import hei.steven.foot.models.Goal;
import hei.steven.foot.models.Match;
import hei.steven.foot.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoalRepository extends JpaRepository<Goal, Integer> {
    List<Goal> findByMatchAndBeneficiaryTeam(Match match, Team team);
}
