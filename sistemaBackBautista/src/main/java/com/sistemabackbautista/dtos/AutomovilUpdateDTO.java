package com.sistemabackbautista.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AutomovilUpdateDTO {

    private Long codAutomovil;
    private String modelo;
    private Integer anioFabricacion;
    private BigDecimal cilindrada;
    private Integer numPuertas;
    private BigDecimal precio;

    private ColorDTO color;
    private MotorDTO motor;
    private MarcaDTO marca;

}
