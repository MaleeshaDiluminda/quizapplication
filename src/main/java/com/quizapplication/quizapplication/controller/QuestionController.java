package com.quizapplication.quizapplication.controller;

import com.quizapplication.quizapplication.Question;
import com.quizapplication.quizapplication.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping(value = "allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    
}
