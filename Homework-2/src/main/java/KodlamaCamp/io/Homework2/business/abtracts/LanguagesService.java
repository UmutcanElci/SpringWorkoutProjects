package KodlamaCamp.io.Homework2.business.abtracts;

import KodlamaCamp.io.Homework2.business.requests.CreateLanguagesRequest;
import KodlamaCamp.io.Homework2.business.requests.UpdateLanguagesRequest;
import KodlamaCamp.io.Homework2.business.responses.GetAllLanguagesResponse;

import java.util.List;

public interface LanguagesService {
    List<GetAllLanguagesResponse> getAll();
    void add(CreateLanguagesRequest createLanguagesRequest);
    void deleteById(int id);
    void update(UpdateLanguagesRequest updateLanguagesRequest);

}
