package com.sistemabackbautista.controller;

import com.sistemabackbautista.dtos.ColorCreateDTO;
import com.sistemabackbautista.dtos.ColorDTO;
import com.sistemabackbautista.dtos.ColorUpdateDTO;
import com.sistemabackbautista.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ColorController {

    @Autowired
    private ColorService colorService;

    @GetMapping("colores")
    public ResponseEntity<List<ColorDTO>> listarColores(){
        return   new ResponseEntity<>(colorService.listarColores(), HttpStatus.OK);
    }

    @GetMapping("/colores/{colorId}")
    public ResponseEntity<ColorDTO> obtenerColorPorId(@PathVariable("colorId") long colorId){
        return  new ResponseEntity<> ( colorService.obtenerColorPorID(colorId),HttpStatus.OK);
    }

    @PostMapping("colores")
    public ResponseEntity<ColorDTO> registrarColor(@RequestBody ColorCreateDTO colorCreateDTO){
        return  new ResponseEntity <>( colorService.registrarColor(colorCreateDTO) ,HttpStatus.OK) ;
    }

    @PutMapping("colores")
    public ResponseEntity<ColorDTO> actualizarColor(@RequestBody ColorUpdateDTO colorUpdateDTO){
        return new ResponseEntity<>(colorService.actualizarColor(colorUpdateDTO),HttpStatus.OK);
    }

    @DeleteMapping("/colores/{colorId}")
    public ResponseEntity<ColorDTO> eliminarColor(@PathVariable("colorId") long colorId) {
        return new ResponseEntity<>( colorService.eliminarColor(colorId),HttpStatus.OK);
    }
}
