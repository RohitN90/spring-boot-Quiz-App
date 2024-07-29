package com.rohit.quizApp.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rohit.quizApp.Modal.Questions;

@Repository
public interface QuestionDAO extends JpaRepository<Questions, Integer>{
	
	List<Questions> findByCatigory(String catigory);
	
	@Query(value = "SELECT * FROM questionforquiz q WHERE q.catigory =:catigory ORDER BY RANDOM() LIMIT :numOfQuestions", nativeQuery = true)
	List<Questions> findByCatigory(String catigory, int numOfQuestions);

}
