package com.example.spendo.spendo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity (name = "sp_expenses")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Expenses {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idPaymentCard")
    private PaymentCard paymentCard;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "idCategories")
    private Categories categories;

}
