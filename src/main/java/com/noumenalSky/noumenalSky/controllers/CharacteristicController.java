package com.noumenalSky.noumenalSky.controllers;

import com.noumenalSky.noumenalSky.models.Characteristic;
import com.noumenalSky.noumenalSky.repositories.CharacteristicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class CharacteristicController {

    @Autowired
    private CharacteristicRepository characteristicRepository;

    @GetMapping("/characteristics")
    public List<Characteristic> getAllCharacteristics() {
        return characteristicRepository.findAll();
    }

    @PostMapping("/characteristics")
    public Characteristic addCharacteristic(@RequestBody Characteristic characteristic) {
        return characteristicRepository.save(characteristic);
    }

}
