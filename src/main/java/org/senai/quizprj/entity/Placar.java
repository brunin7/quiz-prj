package org.senai.quizprj.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@jakarta.persistence.Entity
public class Placar {
    /**
     *
     */
    @jakarta.persistence.Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String pessoa;
    private int acertos;
    private int erros;


    public String getPessoa() {
        return pessoa;
    }
    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }
    public int getAcertos() {
        return acertos;
    }
    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }
    public int getErros() {
        return erros;
    }
    public void setErros(int erros) {
        this.erros = erros;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    
    
}