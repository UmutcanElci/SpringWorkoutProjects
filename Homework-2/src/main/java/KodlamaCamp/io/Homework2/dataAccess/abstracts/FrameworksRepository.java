package KodlamaCamp.io.Homework2.dataAccess.abstracts;

import KodlamaCamp.io.Homework2.entities.concretes.Frameworks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrameworksRepository extends JpaRepository<Frameworks,Integer>{
}
