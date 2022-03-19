package io.github.danioscx.ecommerce.client.user.models;

import io.github.danioscx.ecommerce.client.merchant.models.Merchants;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Setter
@Getter
@Builder
@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private int stock;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @CreationTimestamp
    @Column(nullable = false, insertable = false, updatable = false)
    private Timestamp createdAt;



    @OneToMany(mappedBy = "products")
    private List<ProductImages> productImages;

    @ManyToOne
    @JoinColumn(name = "merchants_id")
    private Merchants merchants;

    @OneToOne(mappedBy = "")
    private Favorites favorites;

    public Products() {

    }
}
