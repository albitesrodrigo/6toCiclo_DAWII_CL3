package com.sistemabackbautista.mappers;

import com.sistemabackbautista.dtos.MarcaCreateDTO;
import com.sistemabackbautista.dtos.MarcaDTO;
import com.sistemabackbautista.dtos.MarcaUpdateDTO;
import com.sistemabackbautista.model.Marca;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MarcaMapper {

    MarcaMapper instancia= Mappers.getMapper(MarcaMapper.class);

    MarcaDTO marcaAMarcaDTO(Marca marca);
    Marca marcaDTOAMarca(MarcaDTO marcaDTO);
    Marca  marcaCreateDTOAMarca(MarcaCreateDTO marcaCreateDTO);
    Marca marcaUpdateDTOAMarca(MarcaUpdateDTO marcaUpdateDTO);
    List<MarcaDTO> listaMarcaAListaMarcaDTO (List<Marca> listaMarca);

}
