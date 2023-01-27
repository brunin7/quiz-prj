package org.senai.quizprj.controller;

import java.util.Optional;

import org.senai.quizprj.entity.Quiz;
import org.senai.quizprj.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/quiz")
@CrossOrigin("*")

public class QuizController {

    @Autowired
    public
    QuizRepository quizRepository;

    @PostMapping("/")
    public @ResponseBody Integer addQuiz(@RequestBody Quiz objQuiz){
        quizRepository.save (objQuiz);
        return objQuiz.getId();
    }

    @GetMapping("/")
    public @ResponseBody Iterable<Quiz> buscarQuiz(){
        return quizRepository.findAll ();
    }

    @PutMapping("/")
    public @ResponseBody Quiz atualizarQuiz(@RequestBody Quiz objQuiz) {
        quizRepository.save(objQuiz);
        return objQuiz;
    }

    @DeleteMapping("/{id}")
    public @ResponseBody String apagarQuiz(@PathVariable Integer id) {
        quizRepository.deleteById(id);
        return "Ok ao apagar";
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public @ResponseBody Optional<Quiz> localizarQuiz(@PathVariable Integer id) {
        return quizRepository.findById(id);
    }

}


