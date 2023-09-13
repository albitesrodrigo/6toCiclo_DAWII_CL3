package com.sistemabackbautista.mappers;

import com.sistemabackbautista.dtos.ColorCreateDTO;
import com.sistemabackbautista.dtos.ColorDTO;
import com.sistemabackbautista.dtos.ColorUpdateDTO;
import com.sistemabackbautista.model.Color;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ColorMapper {

    ColorMapper instancia = Mappers.getMapper(ColorMapper.class);

    ColorDTO colorAColorDTO(Color color);
    Color colorDTOAColor(ColorDTO colorDTO);
    Color  colorCreateDTOAColor(ColorCreateDTO colorCreateDTO);
    Color colorUpdateDTOAColor(ColorUpdateDTO colorUpdateDTO);
    List<ColorDTO> listaColorAListaColorDTO (List<Color> listaColor);


}
