package com.sistemabackbautista.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tb_automovil")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Automovil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codAutomovil;

    @Column(length = 200, nullable = false)
    private String modelo;

    @Column(nullable = false)
    private Integer anioFabricacion;

    @Column(nullable = false)
    private BigDecimal cilindrada;

    @Column(nullable = false)
    private Integer numPuertas;

    @Column(nullable = false)
    private BigDecimal precio;

    @ManyToOne
    @JoinColumn(name="codColor")
    private Color color;

    @ManyToOne
    @JoinColumn(name="codMotor")
    private Motor motor;

    @ManyToOne
    @JoinColumn(name="codMarca")
    private Marca marca;
}
