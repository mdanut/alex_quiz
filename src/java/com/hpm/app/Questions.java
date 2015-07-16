/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpm.app;

/**
 *
 * @author HPM2015
 */


public class Questions {
    private int questionId;
    private String question;
    private int nomberOfCorrectAnswers;
    
    public Questions(){}
    
    public Questions(String question){
        this.question = question;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getNomberOfCorrectAnswers() {
        return nomberOfCorrectAnswers;
    }

    public void setNomberOfCorrectAnswers(int nomberOfCorrectAnswers) {
        this.nomberOfCorrectAnswers = nomberOfCorrectAnswers;
    }
    
    
}
