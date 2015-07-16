/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpm;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HPM2015
 */
@Entity
@Table(name = "answers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Answers.findAll", query = "SELECT a FROM Answers a"),
    @NamedQuery(name = "Answers.findByAnswer", query = "SELECT a FROM Answers a WHERE a.answer = :answer"),
    @NamedQuery(name = "Answers.findByScore", query = "SELECT a FROM Answers a WHERE a.score = :score")})
public class Answers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "answer")
    private String answer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "score")
    private double score;
    @JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Questions id;

    public Answers() {
    }

    public Answers(String answer) {
        this.answer = answer;
    }

    public Answers(String answer, double score) {
        this.answer = answer;
        this.score = score;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Questions getId() {
        return id;
    }

    public void setId(Questions id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (answer != null ? answer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Answers)) {
            return false;
        }
        Answers other = (Answers) object;
        if ((this.answer == null && other.answer != null) || (this.answer != null && !this.answer.equals(other.answer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hpm.Answers[ answer=" + answer + " ]";
    }
    
}
