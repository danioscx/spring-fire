package io.github.danioscx.ecommerce.client.member.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@Builder
@Entity
@Table(name = "carts")
public class Carts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Members members;

    public Carts() {

    }
}
