package KodlamaCamp.io.Homework2.business.abtracts;

import KodlamaCamp.io.Homework2.business.requests.CreateLanguagesRequest;
import KodlamaCamp.io.Homework2.business.responses.GetAllLanguagesResponse;
import KodlamaCamp.io.Homework2.entities.concretes.Languages;

import java.util.List;

public interface LanguagesService {
    List<GetAllLanguagesResponse> getAll();
    void add(CreateLanguagesRequest createLanguagesRequest);

}
