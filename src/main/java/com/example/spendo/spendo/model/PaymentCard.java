package com.example.spendo.spendo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity (name = "sp_payment_card")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;


    @OneToMany (mappedBy = "paymentCard", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Expenses> expenses;


}
