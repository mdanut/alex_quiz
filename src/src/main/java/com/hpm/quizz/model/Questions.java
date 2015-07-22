package com.hpm.quizz.model;


/**
 *
 * @author HPM2015
 */


public class Questions {
    private int questionId;
    private String question;
    private int nomberOfCorrectAnswers;
    
    public Questions(int questionId, String question, int nomberOfCorrectAnswers){
    	this.questionId = questionId;
    	this.question = question;
    	this.nomberOfCorrectAnswers = nomberOfCorrectAnswers;
    }
    
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