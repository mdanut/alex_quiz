package com.hpm.quizz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.hpm.quizz.model.*;
public class Quizz {
	public static void main(String[] args){
		
		
		
		Data data = new Data();
		System.out.println(data.getAnswer());
	}
}
