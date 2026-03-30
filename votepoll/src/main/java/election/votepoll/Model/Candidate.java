package election.votepoll.Model;

import jakarta.persistence.*;
import lombok.Data;

import javax.management.relation.Role;


@Entity
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String party;
    private String symbol;
    private String details;

    @ManyToOne
    private Election election;

    @ManyToOne
    private Position position;
}
