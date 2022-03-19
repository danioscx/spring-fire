package io.github.danioscx.ecommerce.client.user.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Builder
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column
    private String phoneNumber;

    @Column(nullable = false)
    @JsonIgnore
    private String password;

    @OneToMany(mappedBy = "user_address")
    private List<Address> addresses;

    @OneToMany(mappedBy = "user_favorites")
    private List<Favorites> favorites;

    @OneToMany(mappedBy = "user_cart")
    private List<Carts> carts;

    public Users() {

    }
}
