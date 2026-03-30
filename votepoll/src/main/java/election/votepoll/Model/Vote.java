package election.votepoll.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long voterId;

    @ManyToOne
    private User user;

    @ManyToOne
    private Candidate candidate;

    @ManyToOne
    private Election election;

    @ManyToOne
    private Position position;

    private LocalDateTime timestamp;
}
