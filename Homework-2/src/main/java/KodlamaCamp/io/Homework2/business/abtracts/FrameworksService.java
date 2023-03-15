package KodlamaCamp.io.Homework2.business.abtracts;

import KodlamaCamp.io.Homework2.business.requests.CreateFrameworksRequest;
import KodlamaCamp.io.Homework2.business.requests.UpdateFrameworksRequest;
import KodlamaCamp.io.Homework2.business.requests.UpdateLanguagesRequest;
import KodlamaCamp.io.Homework2.business.responses.GetAllFramewroksResponse;

import java.util.List;

public interface FrameworksService {
    List<GetAllFramewroksResponse> getAll();
    void add(CreateFrameworksRequest createFrameworksRequest);
    void deleteById(int id);
    void update(UpdateFrameworksRequest updateFrameworksRequest);


}
