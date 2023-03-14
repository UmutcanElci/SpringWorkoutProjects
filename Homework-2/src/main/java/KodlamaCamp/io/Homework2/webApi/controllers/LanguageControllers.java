package KodlamaCamp.io.Homework2.webApi.controllers;

import KodlamaCamp.io.Homework2.business.abtracts.LanguagesService;
import KodlamaCamp.io.Homework2.entities.concretes.Languages;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/languages")
public class LanguageControllers {
    private LanguagesService languagesService;
    @GetMapping("/getall")
    public List<Languages> getAll(){
        return languagesService.getAll();
    }
}
