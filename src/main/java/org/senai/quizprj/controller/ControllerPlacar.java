package org.senai.quizprj.controller;

import org.senai.quizprj.entity.Placar;
import org.senai.quizprj.repository.PlacarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/api/placar")
@CrossOrigin("*")
public class ControllerPlacar {

    @Autowired
    PlacarRepository pRepository;

    @PostMapping("/")
    public @ResponseBody Integer addPlacar(@RequestBody Placar placar) {
        pRepository.save(placar);
        return placar.getId();
    }

    @GetMapping("/")
    public @ResponseBody Iterable<Placar> buscar() {
        return pRepository.findAll();
    }

}