package Kodlama.camp.Hw2.business.concretes;

import Kodlama.camp.Hw2.business.Responses.GetAllLanguagesResponse;
import Kodlama.camp.Hw2.business.abstracts.LanguagesService;
import Kodlama.camp.Hw2.core.mappers.ModelMapperService;
import Kodlama.camp.Hw2.dataAccess.abstracts.LanguagesRepository;
import Kodlama.camp.Hw2.entites.concretes.Languages;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LanguagesManager implements LanguagesService {
    private LanguagesRepository languagesRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllLanguagesResponse> getAll() {
        List<Languages> languages = languagesRepository.findAll();
        List<GetAllLanguagesResponse> languagesResponses = languages.stream().map(languages1 -> this.modelMapperService.forResponse().map(languages1, GetAllLanguagesResponse.class)).toList();
        return languagesResponses;
    }
}
