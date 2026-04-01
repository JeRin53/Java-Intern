package election.votepoll.Repository;

import election.votepoll.Model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    List<Candidate> findByElectionIdAndPositionId(Long electionId, Long positionId);
    @Query("SELECT MAX(c.voteCount) FROM Candidate c")
    Integer findMaxVotes();

    List<Candidate> findByVoteCount(Integer voteCount);
}
