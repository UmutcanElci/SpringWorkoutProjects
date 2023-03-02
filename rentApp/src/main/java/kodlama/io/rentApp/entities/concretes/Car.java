package kodlama.io.rentApp.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "car")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "plate", unique = true)//unique değeri plakanın aynı tek olduğunu yani aynı plaka da başka bir araba girilemez !
    private String plate;//Plaka
    @Column(name = "dailyPrice")
    private double dailyPrice;//Günlük kiralama bedeli
    @Column(name = "modelYear")
    private int modelYear;
    @Column(name = "state")
    private int state;//Kiralama Durumu = 1 - Available 2 - Rented 3 - Maintenance
    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

}
