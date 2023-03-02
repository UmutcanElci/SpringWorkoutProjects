package kodlama.io.rentApp.business.abstracts;

import kodlama.io.rentApp.business.requests.CreateModelRequest;
import kodlama.io.rentApp.business.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
    void add(CreateModelRequest createModelRequest);
}
