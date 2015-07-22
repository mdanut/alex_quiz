package com.hpm.quizz.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author HPM2015
 */

public class Answers { //test  
    private int answersId; 
    private String answers;
    private double score;
    
    public Answers(){}
    
    public Answers(int answerId, String answers, double score){
        this.answers = answers;
    }
    
    public int getAnswersId() {
        return answersId;
    }

    public void setAnswersId(int answersId) {
        this.answersId = answersId;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
}