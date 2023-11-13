package com.quizapplication.quizapplication.dao;

import com.quizapplication.quizapplication.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
