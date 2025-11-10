package com.utn.productos_api.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public enum Categoria {
    ELECTRONICA,
    ROPA,
    ALIMENTOS,
    HOGAR,
    DEPORTES;

    @Override
    public String toString() {
        return name(); // devuelve solo "HOGAR"
    }
}
