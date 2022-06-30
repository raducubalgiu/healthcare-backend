package healthcare.healtcarebackend.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    @OneToOne
    private Product product;

    private BigDecimal quantity = BigDecimal.ONE;

    private BigDecimal totalPrice = BigDecimal.ZERO;

    private String get1() {
        return "1";
    }
}
