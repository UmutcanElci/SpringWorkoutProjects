package KodlamaCamp.io.Homework2.dataAccess.abstracts;

import KodlamaCamp.io.Homework2.entities.concretes.Languages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguagesRepository extends JpaRepository<Languages,Integer> {

}
