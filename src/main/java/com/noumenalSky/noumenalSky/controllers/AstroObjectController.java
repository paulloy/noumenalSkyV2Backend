package com.noumenalSky.noumenalSky.controllers;

import com.noumenalSky.noumenalSky.repositories.ObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/objects")
public class AstroObjectController {

    @Autowired
    private ObjectRepository objectRepository;

    @GetMapping
    public List<Object> getAllObjects() {
        return objectRepository.findAll();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Object> getById(@PathVariable(value = "id") Long id) {
//        Optional<Object> object = objectRepository.findById(id);
//
//        if (object.isPresent()) {
//            return ResponseEntity.ok().body(object.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

    @PostMapping
    public Object saveObject(@Validated @RequestBody Object object) {
        return objectRepository.save(object);
    }
}
