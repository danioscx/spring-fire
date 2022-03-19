package io.github.danioscx.ecommerce.client.merchant.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;

@Setter
@Getter
@Builder
@Entity
@Table(name = "open_time")
public class OpenTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String day;

    @Column(nullable = false)
    private Time startTime;

    @Column(nullable = false)
    private Time closeTime;

    @Column(nullable = false)
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "merchants_id")
    private Merchants merchants;

    public OpenTime() {

    }
}
