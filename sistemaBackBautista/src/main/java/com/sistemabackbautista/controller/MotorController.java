package com.sistemabackbautista.controller;

import com.sistemabackbautista.dtos.*;
import com.sistemabackbautista.service.MotorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class MotorController {

    @Autowired
    private MotorService motorService;

    @GetMapping("motores")
    public ResponseEntity<List<MotorDTO>> listarMarcas(){
        return   new ResponseEntity<>(motorService.listarMotores(), HttpStatus.OK);
    }

    @GetMapping("/motores/{motorId}")
    public ResponseEntity<MotorDTO> obtenerMarcaPorId(@PathVariable("motorId") long motorId){
        return  new ResponseEntity<> ( motorService.obtenerMotorPorID(motorId),HttpStatus.OK);
    }

    @PostMapping("motores")
    public ResponseEntity<MotorDTO> registrarMotor(@RequestBody MotorCreateDTO motorCreateDTO){
        return  new ResponseEntity <>( motorService.registrarMotor(motorCreateDTO) ,HttpStatus.OK) ;
    }

    @PutMapping("motores")
    public ResponseEntity<MotorDTO> actualizarMotor(@RequestBody MotorUpdateDTO motorUpdateDTO){
        return new ResponseEntity<>(motorService.actualizarMotor(motorUpdateDTO),HttpStatus.OK);
    }

    @DeleteMapping("/motores/{motorId}")
    public ResponseEntity<MotorDTO> eliminarMotor(@PathVariable("motorId") long motorId) {
        return new ResponseEntity<>( motorService.eliminarMotor(motorId),HttpStatus.OK);
    }
}
