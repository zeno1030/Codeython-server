package clofi.codeython.problem.repository;

import clofi.codeython.problem.domain.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemRepository extends JpaRepository<Problem, Long> {

    Problem findByProblemNo(Long problemNo);

    boolean existsByTitle(String title);
}
