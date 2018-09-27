package com.webdevpro.library.controllers;

import com.webdevpro.library.models.Cat;
import com.webdevpro.library.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/cats")

public class CatController {
    @Autowired
    private CatRepository catRepository; //automatisch aanmaken

    @PostMapping
    public Cat create(@RequestBody Cat newCat) {
        this.catRepository.save(newCat);
        return newCat;
    }

    @GetMapping
    public Collection<Cat> list() {
        return this.catRepository.findAll();
    }

    @GetMapping("{id}")
    public Cat findById(@PathVariable long id) {
        Cat result = this.catRepository.findById(id);
        return result;
    }

    @PutMapping("{id}")
    public Cat updateById(@PathVariable long id, @RequestBody Cat update) {
        return this.catRepository.update(id, update);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable long id) {
        this.catRepository.deleteById(id);
    }

}
