package com.pquiz.Quizly.dao;

import com.pquiz.Quizly.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
