package com.sistemabackbautista.service;

import com.sistemabackbautista.dtos.MarcaCreateDTO;
import com.sistemabackbautista.dtos.MarcaDTO;
import com.sistemabackbautista.dtos.MarcaUpdateDTO;

import java.util.List;

public interface MarcaService {

    List<MarcaDTO> listarMarcas();
    MarcaDTO obtenerMarcaPorID(long id);
    MarcaDTO registrarMarca(MarcaCreateDTO marcaCreateDTO);
    MarcaDTO actualizarMarca(MarcaUpdateDTO marcaUpdateDTO);
    MarcaDTO eliminarMarca(long id);

}
