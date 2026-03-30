package election.votepoll.Model;

import jakarta.persistence.*;

import javax.management.relation.Role;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @Column(unique = true)
    private String voterId;

    private String password;
    private String constituency;

    @Enumerated(EnumType.STRING)
    private Role role;
}
