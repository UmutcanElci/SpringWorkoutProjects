package KodlamaCamp.io.Homework2.business.concretes;

import KodlamaCamp.io.Homework2.business.abtracts.FrameworksService;
import KodlamaCamp.io.Homework2.business.requests.CreateFrameworksRequest;
import KodlamaCamp.io.Homework2.business.requests.UpdateFrameworksRequest;
import KodlamaCamp.io.Homework2.business.responses.GetAllFramewroksResponse;
import KodlamaCamp.io.Homework2.core.mappers.ModelMapperService;
import KodlamaCamp.io.Homework2.dataAccess.abstracts.FrameworksRepository;
import KodlamaCamp.io.Homework2.entities.concretes.Frameworks;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FrameworksManager implements FrameworksService {
    private FrameworksRepository frameworksRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllFramewroksResponse> getAll() {
        List<Frameworks> frameworks = frameworksRepository.findAll();
        List<GetAllFramewroksResponse> framewroksResponses = frameworks.stream()
                .map(frameworks1 ->this.modelMapperService.forResponse().map(frameworks1, GetAllFramewroksResponse.class))
                .collect(Collectors.toList());
        return framewroksResponses;
    }

    @Override
    public void add(CreateFrameworksRequest createFrameworksRequest) {
        Frameworks frameworks = this.modelMapperService.forRequest().map(createFrameworksRequest,Frameworks.class);
        this.frameworksRepository.save(frameworks);
    }

    @Override
    public void deleteById(int id) {
        frameworksRepository.deleteById(id);
    }

    @Override
    public void update(UpdateFrameworksRequest updateFrameworksRequest) {
        Frameworks frameworks = this.modelMapperService.forRequest().map(updateFrameworksRequest,Frameworks.class);
        this.frameworksRepository.save(frameworks);
    }


}
