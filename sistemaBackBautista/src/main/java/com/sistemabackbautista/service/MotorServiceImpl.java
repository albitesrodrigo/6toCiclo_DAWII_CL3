package com.sistemabackbautista.service;

import com.sistemabackbautista.dtos.MotorCreateDTO;
import com.sistemabackbautista.dtos.MotorDTO;
import com.sistemabackbautista.dtos.MotorUpdateDTO;
import com.sistemabackbautista.mappers.MotorMapper;
import com.sistemabackbautista.model.Motor;
import com.sistemabackbautista.repository.MotorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class MotorServiceImpl implements MotorService {

    @Autowired
    private MotorRepository motorRepository;

    @Override
    public List<MotorDTO> listarMotores() {
        return MotorMapper.instancia.listaMotorAListaMotorDTO( motorRepository.findAll());
    }

    @Override
    public MotorDTO obtenerMotorPorID(long id) {
        Optional<Motor> motor= motorRepository.findById(id);
        MotorDTO motorDTO =null;
        if(motor.isPresent()){
            motorDTO = MotorMapper.instancia.motorAMotorDTO(motor.get());
        }
        return  motorDTO;
    }

    @Override
    public MotorDTO registrarMotor(MotorCreateDTO motorCreateDTO) {
        Motor motor=MotorMapper.instancia.motorCreateDTOAMotor(motorCreateDTO);
        Motor respuestaEntity=motorRepository.save(motor);
        MotorDTO respuestaDTO= MotorMapper.instancia.motorAMotorDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public MotorDTO actualizarMotor(MotorUpdateDTO motorUpdateDTO) {
        Motor motor=MotorMapper.instancia.motorUpdateDTOAMotor(motorUpdateDTO);
        Motor respuestaEntity=motorRepository.save(motor);
        MotorDTO respuestaDTO= MotorMapper.instancia.motorAMotorDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public MotorDTO eliminarMotor(long id) {
        Optional<Motor> motorOptional = motorRepository.findById(id);
        if (motorOptional.isPresent()) {
            MotorDTO mortorDTO = MotorMapper.instancia.motorAMotorDTO(motorOptional.get());
            motorRepository.delete(motorOptional.get());
            return mortorDTO;
        } else {
            throw new NoSuchElementException("No se pudo realizar la eliminación para el ID proporcionado");
        }
    }
}
