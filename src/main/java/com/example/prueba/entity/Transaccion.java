package com.example.prueba.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Builder
public class Transaccion {
    @Id
    private String idTransaccion;

    private String nombreDocumento;

    private Date fechaRegistro;

    private String estado;
}
