package com.hpm.quizz.resources;
import com.hpm.quizz.model.*;
import com.hpm.quizz.service.*;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/questions")
public class QuestionResource {
	
	
	QuestionsService questionService = new QuestionsService();
	Data data = new Data();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	
	/*
	public List<Questions> getQuestions(){
		return questionService.getQuestions();
	}
	*/
	
	public List<Questions> getQuestion(){
		return questionService.getQuestionsHardCoded();
	}
	
}
	
	

