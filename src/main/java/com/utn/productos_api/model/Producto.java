package com.utn.productos_api.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer stock;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

}
