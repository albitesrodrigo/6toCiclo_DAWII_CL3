package com.sistemabackbautista.service;

import com.sistemabackbautista.dtos.MotorCreateDTO;
import com.sistemabackbautista.dtos.MotorDTO;
import com.sistemabackbautista.dtos.MotorUpdateDTO;

import java.util.List;

public interface MotorService {

    List<MotorDTO> listarMotores();
    MotorDTO obtenerMotorPorID(long id);
    MotorDTO registrarMotor(MotorCreateDTO motorCreateDTO);
    MotorDTO actualizarMotor(MotorUpdateDTO motorUpdateDTO);
    MotorDTO eliminarMotor(long id);

}
