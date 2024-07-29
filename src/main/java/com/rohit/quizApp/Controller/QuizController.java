package com.rohit.quizApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.quizApp.Modal.QuestionWrapper;
import com.rohit.quizApp.Service.QuizService;


@RestController
@RequestMapping("quiz")
public class QuizController {

	@Autowired
	QuizService service;
	
	@PostMapping("create")
	public ResponseEntity<String> createQuiz(@RequestParam String catigory, @RequestParam int numOfQuestions, @RequestParam String title){
		return service.createQuiz(catigory, numOfQuestions, title);
	}
	
	@GetMapping("get/{id}")
	public ResponseEntity<List<QuestionWrapper>> getQuestions(@PathVariable Integer id){
		return service.getQuestions(id);
	}
}
