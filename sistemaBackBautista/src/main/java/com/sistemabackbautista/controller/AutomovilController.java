package com.sistemabackbautista.controller;

import com.sistemabackbautista.dtos.AutomovilCreateDTO;
import com.sistemabackbautista.dtos.AutomovilDTO;
import com.sistemabackbautista.dtos.AutomovilUpdateDTO;
import com.sistemabackbautista.service.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AutomovilController {

    @Autowired
    private AutomovilService automovilService;

    @GetMapping("automoviles")
    public ResponseEntity<List<AutomovilDTO>> listarAutomoviles(){
        return   new ResponseEntity<>(automovilService.listarAutomoviles(), HttpStatus.OK);
    }

    @GetMapping("/automoviles/{automovilId}")
    public ResponseEntity<AutomovilDTO> obtenerAutomovilPorId(@PathVariable("automovilId") long automovilId){
        return  new ResponseEntity<> ( automovilService.obtenerAutomovilPorID(automovilId),HttpStatus.OK);
    }

    @PostMapping("automoviles")
    public ResponseEntity<AutomovilDTO> registrarAutomovil(@RequestBody AutomovilCreateDTO automovilCreateDTO){
        return  new ResponseEntity <>( automovilService.registrarAutomovil(automovilCreateDTO) ,HttpStatus.OK) ;
    }

    @PutMapping("automoviles")
    public ResponseEntity<AutomovilDTO> actualizarAutomovil(@RequestBody AutomovilUpdateDTO automovilUpdateDTO){
        return new ResponseEntity<>(automovilService.actualizarAutomovil(automovilUpdateDTO),HttpStatus.OK);
    }

    @DeleteMapping("/automoviles/{automovilId}")
    public ResponseEntity<AutomovilDTO> eliminarAutomovil(@PathVariable("automovilId") long automovilId) {
        return new ResponseEntity<>( automovilService.eliminarAutomovil(automovilId),HttpStatus.OK);
    }
}
