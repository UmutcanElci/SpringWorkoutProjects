package kodlama.io.rentApp.business.concretes;

import kodlama.io.rentApp.business.abstracts.ModelService;
import kodlama.io.rentApp.business.requests.CreateModelRequest;
import kodlama.io.rentApp.business.responses.GetAllModelsResponse;
import kodlama.io.rentApp.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentApp.dataAccess.abstracts.ModelRepository;
import kodlama.io.rentApp.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor//Injection
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;//Injection gerçekleşti Model Manager a
    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models = modelRepository.findAll();
        List<GetAllModelsResponse> modelsResponses = models.stream().map(model -> this.modelMapperService.forResponse().map(model,GetAllModelsResponse.class)).collect(Collectors.toList());
        return modelsResponses;
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        Model model = this.modelMapperService.forRequest().map(createModelRequest,Model.class);
        this.modelRepository.save(model);
    }
}
