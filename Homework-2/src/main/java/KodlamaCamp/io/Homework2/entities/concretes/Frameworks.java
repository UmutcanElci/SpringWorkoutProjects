package KodlamaCamp.io.Homework2.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "frameworks")
public class Frameworks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "framework")
    private String name;
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Languages languages;
}
