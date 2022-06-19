package com.noumenalSky.noumenalSky.controllers;

import com.noumenalSky.noumenalSky.models.AstroObject;
import com.noumenalSky.noumenalSky.repositories.AstroObjectRepository;
import com.noumenalSky.noumenalSky.repositories.CharacteristicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class AstroObjectController {

    @Autowired
    private AstroObjectRepository astroObjectRepository;
    @Autowired
    private CharacteristicRepository characteristicRepository;

    @GetMapping("/astroObjects")
    public List<AstroObject> getAllAstroObjects() {
        return astroObjectRepository.findAll();
    }

    @GetMapping("/astroObjects/{id}")
    public Optional<AstroObject> getOneAstroObject(
            @PathVariable(value = "id")
            Long astroObjectId) {
        return astroObjectRepository.findById(astroObjectId);
    }

    @PostMapping("/astroObjects")
    public AstroObject addAstroObject(@RequestBody AstroObject astroObject) {
        // Destructure characteristics and save each new one created.
        return astroObjectRepository.save(astroObject);
    }
}
