package com.sistemabackbautista.service;

import com.sistemabackbautista.dtos.ColorCreateDTO;
import com.sistemabackbautista.dtos.ColorDTO;
import com.sistemabackbautista.dtos.ColorUpdateDTO;
import com.sistemabackbautista.mappers.ColorMapper;
import com.sistemabackbautista.model.Color;
import com.sistemabackbautista.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ColorServiceImpl implements ColorService {

    @Autowired
    private ColorRepository colorRepository;
    @Override
    public List<ColorDTO> listarColores() {
        return ColorMapper.instancia.listaColorAListaColorDTO( colorRepository.findAll());
    }

    @Override
    public ColorDTO obtenerColorPorID(long id) {
        Optional<Color> color= colorRepository.findById(id);
        ColorDTO colorDTO =null;
        if(color.isPresent()){
            colorDTO = ColorMapper.instancia.colorAColorDTO(color.get());
        }
        return  colorDTO;
    }

    @Override
    public ColorDTO registrarColor(ColorCreateDTO colorCreateDTO) {
        Color color=ColorMapper.instancia.colorCreateDTOAColor(colorCreateDTO);
        Color respuestaEntity=colorRepository.save(color);
        ColorDTO respuestaDTO= ColorMapper.instancia.colorAColorDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public ColorDTO actualizarColor(ColorUpdateDTO colorUpdateDTO) {
        Color color=ColorMapper.instancia.colorUpdateDTOAColor(colorUpdateDTO);
        Color respuestaEntity=colorRepository.save(color);
        ColorDTO respuestaDTO= ColorMapper.instancia.colorAColorDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public ColorDTO eliminarColor(long id) {
        Optional<Color> colorOptional = colorRepository.findById(id);
        if (colorOptional.isPresent()) {
            ColorDTO colorDTO = ColorMapper.instancia.colorAColorDTO(colorOptional.get());
            colorRepository.delete(colorOptional.get());
            return colorDTO;
        } else {
            throw new NoSuchElementException("No se pudo realizar la eliminación para el ID proporcionado");
        }
    }
}
