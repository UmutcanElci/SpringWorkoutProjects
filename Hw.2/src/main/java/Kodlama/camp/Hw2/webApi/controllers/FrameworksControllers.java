package Kodlama.camp.Hw2.webApi.controllers;

import Kodlama.camp.Hw2.business.Responses.GetAllFrameworksResponse;
import Kodlama.camp.Hw2.business.abstracts.FrameworksService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/frameworks")
public class FrameworksControllers {
    private FrameworksService frameworksService;
    @GetMapping("/getall")
    public List<GetAllFrameworksResponse> getAll(){
        return frameworksService.getAll();
    }
}
