package Kodlama.camp.Hw2.entites.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "frameworks")
public class Frameworks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "frameworkName")
    private String name;
    @ManyToOne
    @JoinColumn(name = "languagesCol")
    private Languages frameworksLang;
}
