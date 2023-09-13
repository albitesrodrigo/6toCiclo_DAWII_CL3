package com.sistemabackbautista.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tb_marca")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codMarca;

    @Column(length = 200, nullable = false)
    private String desMarca;

}
