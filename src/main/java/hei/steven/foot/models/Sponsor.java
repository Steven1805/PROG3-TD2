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
@Table(name = "sponsors")
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String name;
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
            name="team_sponsors",
            joinColumns =  @JoinColumn(name="sponsor_id"),
            inverseJoinColumns = @JoinColumn(name="team_id")
    )
    private List<Team> sponsoredTeams;
}
