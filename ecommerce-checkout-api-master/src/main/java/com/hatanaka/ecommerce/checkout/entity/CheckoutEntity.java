package com.hatanaka.ecommerce.checkout.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Data
@Entity
public class CheckoutEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String code;

    @Enumerated(value = EnumType.STRING)
    @Column
    private  Status status;
    public enum Status {
        CREATED,APPROVED
    }
}
