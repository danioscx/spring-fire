package io.github.danioscx.ecommerce.client.user.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Setter
@Getter
@Builder
@Entity
@Table(name = "product_images")
public class ProductImages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String url;

    @CreationTimestamp
    @Column(nullable = false, insertable = false, updatable = false)
    private Timestamp uploadDate;

    @ManyToOne
    @JoinColumn(name = "products_id")
    private Products products;

    public ProductImages() {

    }
}
