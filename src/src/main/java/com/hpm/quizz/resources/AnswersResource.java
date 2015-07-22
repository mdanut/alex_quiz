package com.hpm.quizz.resources;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hpm.quizz.model.Answers;
import com.hpm.quizz.model.Data;
import com.hpm.quizz.service.QuestionsService;

@Path("/answers")
public class AnswersResource {
	QuestionsService questionService = new QuestionsService();
	Data data = new Data();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getAnswers(){
		return data.getAnswer();
	}
	
}
