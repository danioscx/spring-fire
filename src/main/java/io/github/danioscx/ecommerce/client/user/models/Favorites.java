package io.github.danioscx.ecommerce.client.user.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Builder
@Entity
@Table(name = "favorites")
public class Favorites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    @OneToOne
    @JoinColumn(name = "products_id")
    private Products products;

    public Favorites() {

    }
}
