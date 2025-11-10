package com.utn.productos_api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public record ActualizarStockDTO(
        @NotNull(message = "El stock no puede ser nulo")
        @DecimalMin(value = "0")
        @Schema(description = "Stock actual del producto",
                example = "200",
                required = true,
                minimum = "0")
        Integer stock

) { }
