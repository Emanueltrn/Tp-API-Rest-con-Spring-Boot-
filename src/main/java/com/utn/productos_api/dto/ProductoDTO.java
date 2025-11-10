package com.utn.productos_api.dto;

import com.utn.productos_api.model.Categoria;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ProductoDTO (
        @NotNull(message = "El nombre no puede ser nulo")
        @NotBlank(message = "El nombre no puede estar vacío")
        @Size(min = 3, max = 100, message = "El nombre debe tener entre 3 y 100 caracteres")
        @Schema(description = "Nombre del producto",
                example = "PlayStation 5",
                required = true)
        String nombre,

        @Size(max = 500, message = "El descripcion puede tener hasta 500 caracteres")
        @Schema(description = "Descripcion del producto",
                example = "Consola de última generación con soporte para juegos en 4K y almacenamiento SSD",
                required = false,
                maximum = "500 carácteres")
        String descripcion,

        @NotNull(message = "El precio no puede ser nulo")
        @DecimalMin(value = "0.01")
        @Schema(description = "Precio unitario del producto",
                example = "899.99",
                required = true,
                minimum = "0.01")
        Double precio,

        @NotNull(message = "El stock no puede ser nulo")
        @DecimalMin(value = "0")
        @Schema(description = "Stock actual del producto",
                example = "200",
                required = true,
                minimum = "0")
        Integer stock,

        @NotNull(message = "La categoria no puede ser nula")
        @Schema(description = "Categoria del producto",
                example = "ELECTRONICA",
                required = true)
        Categoria categoria

){ }
