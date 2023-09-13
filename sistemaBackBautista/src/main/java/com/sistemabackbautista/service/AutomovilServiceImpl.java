package com.sistemabackbautista.service;

import com.sistemabackbautista.dtos.AutomovilCreateDTO;
import com.sistemabackbautista.dtos.AutomovilDTO;
import com.sistemabackbautista.dtos.AutomovilUpdateDTO;
import com.sistemabackbautista.mappers.AutomovilMapper;
import com.sistemabackbautista.model.Automovil;
import com.sistemabackbautista.repository.AutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class AutomovilServiceImpl implements AutomovilService{

    @Autowired
    private AutomovilRepository automovilRepository;

    @Override
    public List<AutomovilDTO> listarAutomoviles() {
        return AutomovilMapper.instancia.listaAutomovilAListaAutomovilDTO(automovilRepository.findAll());
    }

    @Override
    public AutomovilDTO obtenerAutomovilPorID(long id) {
        Optional<Automovil> automovil= automovilRepository.findById(id);
        AutomovilDTO automovilDTO =null;
        if(automovil.isPresent()){
            automovilDTO = AutomovilMapper.instancia.automovilAAutomovilDTO(automovil.get());
        }
        return  automovilDTO;
    }

    @Override
    public AutomovilDTO registrarAutomovil(AutomovilCreateDTO automovilCreateDTO) {
        Automovil automovil=AutomovilMapper.instancia.automovilCreateDTOAAutomovil(automovilCreateDTO);
        Automovil respuestaEntity=automovilRepository.save(automovil);
        AutomovilDTO respuestaDTO= AutomovilMapper.instancia.automovilAAutomovilDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public AutomovilDTO actualizarAutomovil(AutomovilUpdateDTO automovilUpdateDTO) {
        Automovil automovil=AutomovilMapper.instancia.automovilUpdateDTOAAutomovil(automovilUpdateDTO);
        Automovil respuestaEntity=automovilRepository.save(automovil);
        AutomovilDTO respuestaDTO= AutomovilMapper.instancia.automovilAAutomovilDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public AutomovilDTO eliminarAutomovil(long id) {
        Optional<Automovil> automovilOptional = automovilRepository.findById(id);
        if (automovilOptional.isPresent()) {
            AutomovilDTO productoDTO = AutomovilMapper.instancia.automovilAAutomovilDTO(automovilOptional.get());
            automovilRepository.delete(automovilOptional.get());
            return productoDTO;
        } else {
            throw new NoSuchElementException("No se pudo realizar la eliminación para el ID proporcionado");
        }
    }
}
