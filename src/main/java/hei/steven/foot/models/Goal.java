package hei.steven.foot.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "match_goals")
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne(optional = false)
    @JoinColumn(name="match_id")
    private Match match;
    @ManyToOne(optional = false)
    @JoinColumn(name="player_id")
    private Player player;
    @ManyToOne(optional = false)
    @JoinColumn(name="benificiary_team_id")
    private Team beneficiaryTeam;
    @Column(nullable = false)
    private int minute;
}
