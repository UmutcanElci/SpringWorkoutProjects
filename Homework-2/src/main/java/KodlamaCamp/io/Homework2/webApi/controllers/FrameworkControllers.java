package KodlamaCamp.io.Homework2.webApi.controllers;

import KodlamaCamp.io.Homework2.business.abtracts.FrameworksService;
import KodlamaCamp.io.Homework2.business.requests.CreateFrameworksRequest;
import KodlamaCamp.io.Homework2.business.responses.GetAllFramewroksResponse;
import KodlamaCamp.io.Homework2.core.mappers.ModelMapperService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/frameworks")
public class FrameworkControllers {
    private FrameworksService frameworksService;
    private ModelMapperService modelMapperService;
    @GetMapping("/getall")
    public List<GetAllFramewroksResponse> getall(){
        return frameworksService.getAll();
    }
    @PostMapping("/add")
    public void add(CreateFrameworksRequest createFrameworksRequest){
        frameworksService.add(createFrameworksRequest);
    }
}
