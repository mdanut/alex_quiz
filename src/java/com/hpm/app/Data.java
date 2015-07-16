/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpm.app;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
/**
 *
 * @author HPM2015
 */
@ManagedBean
@SessionScoped
public class Data {
    private Answers a;
    private HibernateUtil helper;
    private Session session;
    private String answers;
    private Questions q;
    private String question;
    
    
    public String getAnswer(){
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        a = (Answers) session.get(Answers.class, 1);
        this.answers=a.getAnswers();
        return answers;
    }
    
    
    public String getQuestion(){
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        q = (Questions) session.get(Questions.class, 1);
        this.question=q.getQuestion();
        return question;
    }
    
   /* 
    public List getList(){
        SQLQuery query = session.createSQLQuery("SELECT answer FROM answers WHERE id = 1");
        query.addEntity()
    }
    */
    /*
    public void addAnswers(){
        ans = new Answers(1,"Steve",-1);
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(ans);
        session.getTransaction().commit();
        session.close();
    }
    */
   
}
