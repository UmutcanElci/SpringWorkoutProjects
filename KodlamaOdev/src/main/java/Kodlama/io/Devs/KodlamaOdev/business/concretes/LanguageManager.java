package Kodlama.io.Devs.KodlamaOdev.business.concretes;

import Kodlama.io.Devs.KodlamaOdev.business.abstracts.LanguageService;
import Kodlama.io.Devs.KodlamaOdev.dataAccess.abstracts.LanguagesRepository;
import Kodlama.io.Devs.KodlamaOdev.entities.concretes.Languages;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguagesRepository languagesRepository;

    public LanguageManager(LanguagesRepository languagesRepository) {
        this.languagesRepository = languagesRepository;
    }

    @Override
    public void add(Languages languages) {
        languagesRepository.add(languages);
    }

    @Override
    public void delete(int id) {
        languagesRepository.delete(id);
    }

    @Override
    public void update(Languages languages) {
        languagesRepository.update(languages);
    }

    @Override
    public List<Languages> getAll() {
        return languagesRepository.getAll();
    }

    @Override
    public Languages getById(int id) {
        return languagesRepository.getById(id);
    }
}
