package KodlamaCamp.io.Homework2.webApi.controllers;

import KodlamaCamp.io.Homework2.business.abtracts.FrameworksService;
import KodlamaCamp.io.Homework2.business.requests.CreateFrameworksRequest;
import KodlamaCamp.io.Homework2.business.requests.UpdateFrameworksRequest;
import KodlamaCamp.io.Homework2.business.responses.GetAllFramewroksResponse;
import KodlamaCamp.io.Homework2.core.mappers.ModelMapperService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(CreateFrameworksRequest createFrameworksRequest){
        frameworksService.add(createFrameworksRequest);
    }
    @DeleteMapping("/delete")
    public void deleteById(int id){
        frameworksService.deleteById(id);
    }
    @PostMapping("/update")
    public void update(UpdateFrameworksRequest updateFrameworksRequest){
        frameworksService.update(updateFrameworksRequest);
    }
}
