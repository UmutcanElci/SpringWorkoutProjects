package Kodlama.camp.Hw2.dataAccess.abstracts;

import Kodlama.camp.Hw2.entites.concretes.Languages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguagesRepository extends JpaRepository<Languages,Integer> {
}
