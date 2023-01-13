package hei.steven.foot.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String name;
    @OneToMany(fetch=FetchType.LAZY,mappedBy = "team")
    @OrderBy("number")
    private List<Player> players;
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
            name="team_sponsors",
            joinColumns =  @JoinColumn(name="team_id"),
            inverseJoinColumns = @JoinColumn(name="sponsor_id")
    )
    private List<Sponsor> sponsors;
}
