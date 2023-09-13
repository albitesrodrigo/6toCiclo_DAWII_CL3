package com.sistemabackbautista.controller;

import com.sistemabackbautista.dtos.MarcaCreateDTO;
import com.sistemabackbautista.dtos.MarcaDTO;
import com.sistemabackbautista.dtos.MarcaUpdateDTO;
import com.sistemabackbautista.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping("marcas")
    public ResponseEntity<List<MarcaDTO>> listarMarcas(){
        return   new ResponseEntity<>(marcaService.listarMarcas(), HttpStatus.OK);
    }

    @GetMapping("/marcas/{marcaId}")
    public ResponseEntity<MarcaDTO> obtenerCategoriaPorId(@PathVariable("marcaId") long marcaId){
        return  new ResponseEntity<> ( marcaService.obtenerMarcaPorID(marcaId),HttpStatus.OK);
    }

    @PostMapping("marcas")
    public ResponseEntity<MarcaDTO> registrarMarca(@RequestBody MarcaCreateDTO marcaCreateDTO){
        return  new ResponseEntity <>( marcaService.registrarMarca(marcaCreateDTO) ,HttpStatus.OK) ;
    }

    @PutMapping("marcas")
    public ResponseEntity<MarcaDTO> actualizarMarca(@RequestBody MarcaUpdateDTO marcaUpdateDTO){
        return new ResponseEntity<>(marcaService.actualizarMarca(marcaUpdateDTO),HttpStatus.OK);
    }

    @DeleteMapping("/marcas/{marcaId}")
    public ResponseEntity<MarcaDTO> eliminarMarca(@PathVariable("marcaId") long marcaId) {
        return new ResponseEntity<>( marcaService.eliminarMarca(marcaId),HttpStatus.OK);
    }
}
