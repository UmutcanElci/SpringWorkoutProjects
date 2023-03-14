package kodlama.io.rentApp.dataAccess.abstracts;

import kodlama.io.rentApp.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {//Integer veri tipi (ID ya da primary key de diyebiliriz)
    //BrandDao da denir
    //Spirng JPA yı kullanrak veri işlemleri efektif bir şekilde kullanabiliyoruz
    boolean existsByName(String name);
    //Burada spring Jpa Bize özel key wordler sunar exists gördüğü anda bize sorgu oluşturur true false döndüren
    //Neye göre Name alanına göre yani Brand sınıfımıza gider ve ara Name diye bir alan bulabilecek mi diye var sa true yoksa false olarak geri döner
    //existsBy keyword mesela bizim sınıfımızda date e ulaşmak istiyoruz o zaman existsByDate dediğimiz anda Date ya da date aramaya başlar
    //spring jpa keywords
    //bu keywords bize kurallar koyma konusunda işimizi kolaylaştırıyor
}
