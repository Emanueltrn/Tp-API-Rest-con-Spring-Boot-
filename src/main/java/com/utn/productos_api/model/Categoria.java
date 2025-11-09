package com.utn.productos_api.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor

public enum Categoria {
    ELECTRONICA("Electrónica"),
    ROPA("Ropa"),
    ALIMENTOS("Alimentos"),
    HOGAR("Hogar"),
    DEPORTES("Deportes");

    private final String descripcion;

}
