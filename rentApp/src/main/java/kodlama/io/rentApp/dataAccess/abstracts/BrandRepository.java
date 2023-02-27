package kodlama.io.rentApp.dataAccess.abstracts;

import kodlama.io.rentApp.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {//Integer veri tipi (ID ya da primary key de diyebiliriz)
    //BrandDao da denir
    //Spirng JPA yı kullanrak veri işlemleri efektif bir şekilde kullanabiliyoruz
}
