package com.hpm.quizz.model;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
13. * Hibernate Utility class with a convenient method to get Session Factory object.
14. *
15. * @author nb
16. */
@SuppressWarnings("deprecation")
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
 
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml)
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception.
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
