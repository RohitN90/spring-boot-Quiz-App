package com.rohit.quizApp.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "questionforquiz")
public class Questions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionid;
	
	private String question;
	private String optiona;
	private String optionb;
	private String optionc;
	private String optiond;
	private char correctanswer;
	private String catigory;
	
	public String getCatigory() {
		return catigory;
	}
	public void setCatigory(String catigory) {
		this.catigory = catigory;
	}
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptiona() {
		return optiona;
	}
	public void setOptiona(String optiona) {
		this.optiona = optiona;
	}
	public String getOptionb() {
		return optionb;
	}
	public void setOptionb(String optionb) {
		this.optionb = optionb;
	}
	public String getOptionc() {
		return optionc;
	}
	public void setOptionc(String optionc) {
		this.optionc = optionc;
	}
	public String getOptiond() {
		return optiond;
	}
	public void setOptiond(String optiond) {
		this.optiond = optiond;
	}
	public char getCorrectanswer() {
		return correctanswer;
	}
	public void setCorrectanswer(char correctanswer) {
		this.correctanswer = correctanswer;
	}
	
	

}
