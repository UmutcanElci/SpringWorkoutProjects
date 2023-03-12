package Kodlama.camp.Hw2.business.concretes;

import Kodlama.camp.Hw2.business.Responses.GetAllFrameworksResponse;
import Kodlama.camp.Hw2.business.abstracts.FrameworksService;
import Kodlama.camp.Hw2.core.mappers.ModelMapperService;
import Kodlama.camp.Hw2.dataAccess.abstracts.FrameworksRepository;
import Kodlama.camp.Hw2.entites.concretes.Frameworks;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@AllArgsConstructor
@Service
public class FrameworksManager implements FrameworksService {
    private FrameworksRepository frameworksRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllFrameworksResponse> getAll() {
        List<Frameworks> frameworks = frameworksRepository.findAll();

        List<GetAllFrameworksResponse> frameworksResponses = frameworks.stream().map(frameworks1 -> this.modelMapperService.forResponse().map(frameworks1,GetAllFrameworksResponse.class)).collect(Collectors.toList());
        return frameworksResponses;
    }
}
