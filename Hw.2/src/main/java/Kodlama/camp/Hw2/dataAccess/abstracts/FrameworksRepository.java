package Kodlama.camp.Hw2.dataAccess.abstracts;

import Kodlama.camp.Hw2.entites.concretes.Frameworks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrameworksRepository extends JpaRepository<Frameworks,Integer> {
}
