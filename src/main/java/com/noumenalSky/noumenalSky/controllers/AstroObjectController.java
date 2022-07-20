package com.noumenalSky.noumenalSky.controllers;

import com.noumenalSky.noumenalSky.models.AstroObject;
import com.noumenalSky.noumenalSky.repositories.AstroObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AstroObjectController {

    @Autowired
    private AstroObjectRepository astroObjectRepository;

    @GetMapping("/objects")
    public ResponseEntity<List<AstroObject>> getAllAstroObjects() {
        List<AstroObject> astroObjects = astroObjectRepository.findAll();

        return new ResponseEntity<>(astroObjects, HttpStatus.OK);
    }

    @PostMapping("/objects")
    public ResponseEntity<AstroObject> createObject(@RequestBody AstroObject object) {
        AstroObject astroObject = astroObjectRepository.save(object);
        return new ResponseEntity<>(astroObject, HttpStatus.OK);
    }
}
