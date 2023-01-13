package hei.steven.foot.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "matchs")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="team1_id")
    private Team team1;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="team2_id")
    private Team team2;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="stadium_id")
    private Stadium stadium;
    @Column
    private Timestamp datetime;
}
