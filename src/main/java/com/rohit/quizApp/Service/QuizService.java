package com.rohit.quizApp.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rohit.quizApp.Modal.QuestionWrapper;
import com.rohit.quizApp.Modal.Questions;
import com.rohit.quizApp.Modal.Quiz;
import com.rohit.quizApp.Repo.QuestionDAO;
import com.rohit.quizApp.Repo.QuizDAO;

@Service
public class QuizService {

	@Autowired
	QuizDAO quiz;
	
	@Autowired
	QuestionDAO questions;

	public ResponseEntity<String> createQuiz(String catigory, int numOfQuestions, String title) {
		// TODO Auto-generated method stub
		
		List<Questions> ques = questions.findByCatigory(catigory, numOfQuestions);
		
		Quiz q = new Quiz();
		q.setTitle(title);
		q.setQuestions(ques);
		quiz.save(q);
		return new ResponseEntity<>("Success", HttpStatus.CREATED);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuestions(Integer id) {
		// TODO Auto-generated method stub
		Optional<Quiz> quizQ = quiz.findById(id);
		List<Questions> questions2 = quizQ.get().getQuestions();
		List<QuestionWrapper> questionFroUser = new ArrayList<>();
		for(Questions q : questions2) {
			QuestionWrapper qw = new QuestionWrapper(q.getQuestionid(), q.getQuestion(), q.getOptiona(), q.getOptionb(), q.getOptionc(), q.getOptiond());
			questionFroUser.add(qw);
		}
		return new ResponseEntity<>(questionFroUser, HttpStatus.OK);
	}

	
}
