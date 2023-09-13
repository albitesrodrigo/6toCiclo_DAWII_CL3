package com.sistemabackbautista.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tb_motor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Motor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codMotor;

    @Column(length = 200, nullable = false)
    private String desMotor;

}
