package KodlamaCamp.io.Homework2.webApi.controllers;

import KodlamaCamp.io.Homework2.business.abtracts.LanguagesService;
import KodlamaCamp.io.Homework2.business.requests.CreateLanguagesRequest;
import KodlamaCamp.io.Homework2.business.responses.GetAllLanguagesResponse;
import KodlamaCamp.io.Homework2.core.mappers.ModelMapperService;
import KodlamaCamp.io.Homework2.entities.concretes.Languages;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/languages")
public class LanguageControllers {
    private LanguagesService languagesService;
    private ModelMapperService modelMapperService;
    @GetMapping("/getall")
    public List<GetAllLanguagesResponse> getAll(){
        return languagesService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateLanguagesRequest createLanguagesResponse){
        languagesService.add(createLanguagesResponse);
    }
}
