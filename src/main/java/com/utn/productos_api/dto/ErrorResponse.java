package com.utn.productos_api.dto;

import java.time.LocalDateTime;
import java.util.List;

public record ErrorResponse(
        LocalDateTime timestamp,
        int status,
        String error,
        List<String> detalles,
        String ruta
) {
    public static ErrorResponse simple(int status, String error, String detalles, String ruta) {
        return new ErrorResponse(LocalDateTime.now(), status, error, List.of(detalles), ruta);
    }

    public static ErrorResponse of(int status, String error, List<String> detalles, String ruta) {
        return new ErrorResponse(LocalDateTime.now(), status, error, detalles, ruta);
    }

}
