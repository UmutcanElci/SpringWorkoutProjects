package kodlama.io.rentApp.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "brands")
public class Brand {
    //Entities çoğunlukla veri tabanında oluşturduğumuz nesneler diyebiliriz
    @Id//PK primary key anlamına geliyor
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Her veri eklendiğinde takip etmek yerine otomatik üretmesini sağlar ( RDBS !!)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    //Elimiz de bir tane marka var mesela Fiat(Brand object) şimdi bu Fiat ın modelleri vardı 2020 2015 2000 vb... şimdi bizim arabamızın markasından bir tane olabilir ama modelinden sonsuz olabilir
    //Ama sınıf tasarımızda biz mesela Fiat marka araç 2020 model id si 1 bu aracın id sinin 1 olduğunu Model sınıfımızada söylemeliyiz
    @OneToMany(mappedBy = "brand")//İlişkilendirme - Model listesinde handi alanda ilişkilendirelecek
    private List<Model> models;//Bir markanın birden fazla modeli olabilir

    //Brand --> id,name,quantity
    //GetAllBrandsResponse --> id , name
    /*
    şimdi bizim 3 tane kolonumuzun olduğunu düşünelim ve bu kolonlarıdan yani verilerden quantity i göstermek istemiyoruz son kullanıcıya ne yaparız?
    Bunun için Ayrı bir sınıf oluşturduk response diye bunun olayı son kullanıcıya gösterilecek oaln verileri içeriyor. O verileri almak içinde kendi ana modelimizden yani Entity deki
    verileri bu oluşturduğumuz response sınıfına atarız
    Buna mapping deniyor (Yine kabaca)
     */

}
