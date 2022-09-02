package com.graphql.r2dbc.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import org.springframework.data.relational.core.mapping.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Table (name="obras")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ObraEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "obra_id")
    private Long id;

    @Column
    @NotNull
    @NotBlank
    private String titulo;

    @Column
    @Positive(message = "El precio debe ser un número mayor que 0 (cero)")
    private Double precio;

}
