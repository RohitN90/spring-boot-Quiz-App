package com.rohit.quizApp.Controller;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.quizApp.Modal.Questions;
import com.rohit.quizApp.Service.QuestionService;


@RestController
@RequestMapping("/api")
public class QuestionController {
	
	@Autowired
	QuestionService service;


    @GetMapping("hello")
    public String printHello(){
        return "Hello Rohit !";
    }
    
    @GetMapping("questions")
    public List<Questions> getAllQuestions(){
    	return service.getQuestions();
    }
    
    @GetMapping("/questions/{catigory}")
    public List<Questions> getAllQuestionsByCatigory(@PathVariable String catigory){
    	return service.getQuestionByCatigory(catigory);
    }
    
    
    @PostMapping("addQuestion")
    public String addQuestion(@RequestBody Questions question) {
    	String responce = service.addQuestion(question);
    	return responce;
    }
    
    @DeleteMapping("question/{id}")
    public String removeQuestion(@PathVariable  int id) {
    	return service.removeQuestion(id);
    }

}
