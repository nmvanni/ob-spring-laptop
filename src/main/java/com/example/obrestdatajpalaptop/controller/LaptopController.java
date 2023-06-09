package com.example.obrestdatajpalaptop.controller;

import com.example.obrestdatajpalaptop.entities.Laptop;
import com.example.obrestdatajpalaptop.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController (LaptopRepository laptopRepository){
        this.laptopRepository = laptopRepository;
    }

    //CROD sobre la entidad Laptop

    //Buscar todas las laptops

    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }
}
