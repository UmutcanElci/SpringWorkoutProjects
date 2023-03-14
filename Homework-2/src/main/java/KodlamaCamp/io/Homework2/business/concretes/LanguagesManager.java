package KodlamaCamp.io.Homework2.business.concretes;

import KodlamaCamp.io.Homework2.business.abtracts.LanguagesService;
import KodlamaCamp.io.Homework2.dataAccess.abstracts.LanguagesRepository;
import KodlamaCamp.io.Homework2.entities.concretes.Languages;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@AllArgsConstructor
@Service
public class LanguagesManager implements LanguagesService {
    private LanguagesRepository languagesRepository;
    @Override
    public List<Languages> getAll() {
        return languagesRepository.findAll();
    }
}
