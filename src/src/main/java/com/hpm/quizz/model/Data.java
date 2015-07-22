package com.hpm.quizz.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.*;

//import net.sf.hibernate.util.HibernateUtil;

//import java.util.List;
//import org.hibernate.Query;
//import org.hibernate.SQLQuery;
/**
 *
 * @author HPM2015
 */
@ManagedBean
@SessionScoped
public class Data {
    private Answers a;
    //private HibernateUtil helper;
    private Session session;
    private String answers;
    private Questions q;
    private String question;
    //private int id;
    Answers ans = new Answers();
    Questions que = new Questions();
    
    
    public String getAnswer(){
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        a = (Answers) session.get(Answers.class, que.getQuestionId());
        this.answers=a.getAnswers();
        return answers;
    }
    
    
    public String getQuestion(){
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        q = (Questions) session.get(Questions.class, 1);
        this.question=q.getQuestion();
        return question;
    }
}