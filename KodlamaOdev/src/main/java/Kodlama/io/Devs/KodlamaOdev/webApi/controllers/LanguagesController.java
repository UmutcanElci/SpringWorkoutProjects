package Kodlama.io.Devs.KodlamaOdev.webApi.controllers;

import Kodlama.io.Devs.KodlamaOdev.business.abstracts.LanguageService;
import Kodlama.io.Devs.KodlamaOdev.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/language")
public class LanguagesController {
    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/getall")
    public List<Languages> getAll(){
        return languageService.getAll();
    }
/*
    @PostMapping("/add")
    public void add(Languages language){
        languageService.add(language);
    }

 */

    @PostMapping("/add")
    public List<Languages> add(Languages language){
        languageService.add(language);
        return languageService.getAll();
    }
    @DeleteMapping("/delete")
    public List<Languages> delete(int id){
        languageService.delete(id);
        return languageService.getAll();
    }

    @PutMapping("/update")
    public List<Languages> update(Languages languages){
        languageService.update(languages);
        return languageService.getAll();
    }

    @GetMapping("/getById")
    public Languages getById(int id){
        return languageService.getById(id);
    }
}
