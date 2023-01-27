package org.senai.quizprj.repository;

import org.senai.quizprj.entity.Quiz;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepository extends CrudRepository<Quiz,Integer>{
    
}