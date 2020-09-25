package com.hackaton.track1.controller;


import com.hackaton.track1.model.Persona;
import com.hackaton.track1.repository.RepoPersona;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin({"*"})
@RestController
@Timed
public class ConPersona {

    @Autowired
    RepoPersona repoPersona;

    public ConPersona(RepoPersona repoPersona){
        repoPersona = repoPersona;
    }

    @Timed(value = "persona.hackaton.request", extraTags = {"application", "micrometer-hackaton"} , longTask = true)
    @GetMapping("/find")
    public List<Persona> find(){
        return repoPersona.findAll();
    }
}
