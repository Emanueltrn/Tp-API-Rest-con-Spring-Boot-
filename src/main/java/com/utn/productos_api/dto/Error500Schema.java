package com.utn.productos_api.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import java.util.List;

public record Error500Schema(
        @Schema(description = "Tiempo exacto en que ocurrió el error",
                example = "2025-11-09T23:51:42.2327012")
        LocalDateTime timestamp,

        @Schema(description = "Estado del error",
                example = "500")
        int status,

        @Schema(description = "Mensaje de tipo de error",
                example = "Error interno del servidor")
        String error,

        @Schema(description = "Lista de detalles sobre el error",
                example = "[\n" +
                        "    \"JSON parse error: Invalid numeric value: Leading zeroes not allowed\"\n" +
                        "  ]")
        List<String> detalles,

        @Schema(description = "Ruta en la cual se produjo el error",
                example = "/api/productos")
        String ruta
) {
}
