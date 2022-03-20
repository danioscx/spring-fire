package io.github.danioscx.ecommerce.client.member.models;

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
@Table(name = "members")
public class Members {

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

    @OneToMany(mappedBy = "members")
    private List<Address> addresses;

    @OneToMany(mappedBy = "members")
    private List<Favorites> favorites;

    @OneToMany(mappedBy = "members")
    private List<Carts> carts;

    public Members() {

    }
}
