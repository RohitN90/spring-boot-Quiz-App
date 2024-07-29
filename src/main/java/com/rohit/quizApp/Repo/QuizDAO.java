package com.rohit.quizApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.quizApp.Modal.Quiz;

public interface QuizDAO extends JpaRepository<Quiz, Integer>{

}
