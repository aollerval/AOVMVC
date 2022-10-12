package com.example.aovmvc.Controller;

import com.example.aovmvc.Service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Controller
@RequestMapping("/api/v1/qn")
public class QuestionnaireController {

    private QuestionnaireService questionnaireService;

    @Autowired
    public QuestionnaireController(QuestionnaireService questionnaireService) {
        this.questionnaireService = questionnaireService;
    }


    @GetMapping("/questionnaire")
    public String getQuestionnaire( Model model){

        HashMap<String, String> questions = new HashMap<>();
        questions.put("1", "How are you?");
        questions.put("2", "How old are you?");
        model.addAttribute("questions", questions);
        return "questionnaire";
    }

}
