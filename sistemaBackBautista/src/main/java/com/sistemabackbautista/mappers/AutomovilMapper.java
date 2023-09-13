package com.sistemabackbautista.mappers;

import com.sistemabackbautista.dtos.AutomovilCreateDTO;
import com.sistemabackbautista.dtos.AutomovilDTO;
import com.sistemabackbautista.dtos.AutomovilUpdateDTO;
import com.sistemabackbautista.model.Automovil;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AutomovilMapper {

    AutomovilMapper instancia= Mappers.getMapper(AutomovilMapper.class);

    AutomovilDTO automovilAAutomovilDTO(Automovil automovil);
    Automovil automovilDTOAAutomovil(AutomovilDTO automovilDTO);
    Automovil automovilCreateDTOAAutomovil(AutomovilCreateDTO automovilCreateDTO);
    Automovil automovilUpdateDTOAAutomovil(AutomovilUpdateDTO automovilUpdateDTO);
    List<AutomovilDTO> listaAutomovilAListaAutomovilDTO (List<Automovil> listaAutomovil);

}
