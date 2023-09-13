package com.sistemabackbautista.service;

import com.sistemabackbautista.dtos.ColorCreateDTO;
import com.sistemabackbautista.dtos.ColorDTO;
import com.sistemabackbautista.dtos.ColorUpdateDTO;

import java.util.List;

public interface ColorService {

    List<ColorDTO> listarColores();
    ColorDTO obtenerColorPorID(long id);
    ColorDTO registrarColor(ColorCreateDTO colorCreateDTO);
    ColorDTO actualizarColor(ColorUpdateDTO colorUpdateDTO);
    ColorDTO eliminarColor(long id);

}
