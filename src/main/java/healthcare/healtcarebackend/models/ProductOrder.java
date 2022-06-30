package healthcare.healtcarebackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@RequiredArgsConstructor
@Data
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Product product;

    @ManyToOne
    @JsonIgnore
    private Order order;

    @NotNull
    private BigDecimal quantity = BigDecimal.ONE;

    @NotNull
    private BigDecimal totalPrice = BigDecimal.ZERO;


}
