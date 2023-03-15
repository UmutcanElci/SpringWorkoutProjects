package KodlamaCamp.io.Homework2.business.concretes;

import KodlamaCamp.io.Homework2.business.abtracts.LanguagesService;
import KodlamaCamp.io.Homework2.business.requests.CreateLanguagesRequest;
import KodlamaCamp.io.Homework2.business.requests.UpdateLanguagesRequest;
import KodlamaCamp.io.Homework2.business.responses.GetAllLanguagesResponse;
import KodlamaCamp.io.Homework2.core.mappers.ModelMapperService;
import KodlamaCamp.io.Homework2.dataAccess.abstracts.LanguagesRepository;

import KodlamaCamp.io.Homework2.entities.concretes.Languages;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class LanguagesManager implements LanguagesService{
    private LanguagesRepository languagesRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllLanguagesResponse> getAll() {
        List<Languages> languages = languagesRepository.findAll();
        List<GetAllLanguagesResponse> getAllLanguagesResponses = languages.stream().
                map(languages1 -> this.modelMapperService.forResponse().map(languages1, GetAllLanguagesResponse.class)).
                collect(Collectors.toList());
        return getAllLanguagesResponses;
    }

    @Override
    public void add(CreateLanguagesRequest createLanguagesRequest) {
        Languages languages = this.modelMapperService.forRequest().map(createLanguagesRequest,Languages.class);
        this.languagesRepository.save(languages);
    }

    @Override
    public void deleteById(int id) {
        languagesRepository.deleteById(id);
    }

    @Override
    public void update(UpdateLanguagesRequest updateLanguagesRequest) {
        Languages languages = this.modelMapperService.forRequest().map(updateLanguagesRequest,Languages.class);
        this.languagesRepository.save(languages);
    }


}
