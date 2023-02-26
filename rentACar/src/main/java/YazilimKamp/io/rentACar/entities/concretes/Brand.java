package YazilimKamp.io.rentACar.entities.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
    //Entities çoğunlukla veri tabanında oluşturduğumuz nesneler diyebiliriz
    private int id;
    private String name;

}
