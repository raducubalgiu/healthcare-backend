package healthcare.healtcarebackend.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    private String brand;

    public String image;

    private BigDecimal price;

    private Boolean active;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate created_at;

    private BigDecimal rating;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
