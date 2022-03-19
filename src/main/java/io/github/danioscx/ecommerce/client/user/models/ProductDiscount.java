package io.github.danioscx.ecommerce.client.user.models;

import io.github.danioscx.ecommerce.client.user.utils.DiscountType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Setter
@Getter
@Builder
@Entity
@Table(name = "products_discount")
public class ProductDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Timestamp availableAt;

    @Column(nullable = false, columnDefinition = "default 'percent'")
    @Enumerated(value = EnumType.STRING)
    private DiscountType discountType = DiscountType.PERCENT;


    public ProductDiscount() {

    }
}
