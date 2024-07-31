package com.example.spendo.spendo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "sp_investments")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Investments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idUser")
    @NotNull
    private User user;

}
