package com.hpm.quizz.service;
import java.util.ArrayList;
import java.util.List;
import com.hpm.quizz.model.*;
public class QuestionsService {
	/*
	public List<Questions> getQuestions(){
		Questions question = new Questions();
		List<Questions> questionList = new ArrayList<>();
		questionList.add(question);
		return questionList;
	}*/
	
	public List<Questions> getQuestionsHardCoded(){
		Questions question = new Questions(1,"Choose the correct HTML element for the largest heading:", 1);
		Questions question2 = new Questions(2,".Care din urmatoarele functii citeste intreg continutul unui fisier",2);
		List<Questions> questionList = new ArrayList<>();
		questionList.add(question);
		questionList.add(question2);
		return questionList;
	}
}
