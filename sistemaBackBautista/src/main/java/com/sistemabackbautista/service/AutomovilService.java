package com.sistemabackbautista.service;

import com.sistemabackbautista.dtos.AutomovilCreateDTO;
import com.sistemabackbautista.dtos.AutomovilDTO;
import com.sistemabackbautista.dtos.AutomovilUpdateDTO;

import java.util.List;

public interface AutomovilService {

    List<AutomovilDTO> listarAutomoviles();
    AutomovilDTO obtenerAutomovilPorID(long id);
    AutomovilDTO registrarAutomovil(AutomovilCreateDTO automovilCreateDTO);
    AutomovilDTO actualizarAutomovil(AutomovilUpdateDTO automovilUpdateDTO);
    AutomovilDTO eliminarAutomovil(long id);

}
