package com.utn.productos_api.dto;

import com.utn.productos_api.model.Categoria;
import com.utn.productos_api.model.Producto;
import io.swagger.v3.oas.annotations.media.Schema;

public record ProductoResponseDTO(
        @Schema(description = "ID del producto",
                example = "20",
                required = true)
        Long id,

        @Schema(description = "Nombre del producto",
                example = "PlayStation 5",
                required = true)
        String nombre,

        @Schema(description = "Descripcion del producto",
                example = "Consola de última generación con soporte para juegos en 4K y almacenamiento SSD",
                required = false)
        String descripcion,

        @Schema(description = "Precio unitario del producto",
                example = "899.99",
                required = true)
        Double precio,

        @Schema(description = "Stock actual del producto",
                example = "200",
                required = true)
        Integer stock,

        @Schema(description = "Categoria del producto",
                example = "ELECTRONICA",
                required = true)
        Categoria categoria

) {
    public static ProductoResponseDTO fromEntity(Producto producto) {
        return new ProductoResponseDTO(
                producto.getId(),
                producto.getNombre(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getStock(),
                producto.getCategoria()
        );
    }
}
