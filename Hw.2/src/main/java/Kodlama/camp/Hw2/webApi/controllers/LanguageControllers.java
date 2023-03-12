package Kodlama.camp.Hw2.webApi.controllers;

import Kodlama.camp.Hw2.business.Responses.GetAllLanguagesResponse;
import Kodlama.camp.Hw2.business.abstracts.LanguagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/languages")
public class LanguageControllers {
    private LanguagesService languagesService;
@Autowired
    public LanguageControllers(LanguagesService languagesService) {
        this.languagesService = languagesService;
    }

    @GetMapping("/getall")
    public List<GetAllLanguagesResponse> getAll(){
    return languagesService.getAll();
    }
}
