package com.sistemabackbautista.mappers;

import com.sistemabackbautista.dtos.MotorCreateDTO;
import com.sistemabackbautista.dtos.MotorDTO;
import com.sistemabackbautista.dtos.MotorUpdateDTO;
import com.sistemabackbautista.model.Motor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MotorMapper {

    MotorMapper instancia= Mappers.getMapper(MotorMapper.class);

    MotorDTO motorAMotorDTO(Motor motor);
    Motor motorDTOAMotor(MotorDTO motorDTO);
    Motor  motorCreateDTOAMotor(MotorCreateDTO motorCreateDTO);
    Motor motorUpdateDTOAMotor(MotorUpdateDTO motorUpdateDTO);
    List<MotorDTO> listaMotorAListaMotorDTO (List<Motor> listaMotor);

}
