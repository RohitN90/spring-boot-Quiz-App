package com.rohit.quizApp.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.quizApp.Modal.Questions;
import com.rohit.quizApp.Repo.QuestionDAO;

@Service
public class QuestionService {
	
	@Autowired
	QuestionDAO dao;

	public List<Questions> getQuestions() {
		// TODO Auto-generated method stub
		List<Questions> all = dao.findAll();
		return all;
	}
	
	public List<Questions> getQuestionByCatigory(String name){
		return dao.findByCatigory(name);
	}

	public String addQuestion(Questions questions) {
		 dao.save(questions);
		 return "Sucesses";
	}

	public String removeQuestion(int id) {
		dao.deleteById(id);
		return "Deleted :)";
	}
	
	
}
