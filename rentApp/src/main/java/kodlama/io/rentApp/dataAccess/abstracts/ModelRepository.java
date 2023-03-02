package kodlama.io.rentApp.dataAccess.abstracts;

import kodlama.io.rentApp.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model,Integer> {
}
