package com.quizapplication.quizapplication.controller;

import com.quizapplication.quizapplication.Question;
import com.quizapplication.quizapplication.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping(value = "allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions( );
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable("category") String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public Question addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);

    }
}
