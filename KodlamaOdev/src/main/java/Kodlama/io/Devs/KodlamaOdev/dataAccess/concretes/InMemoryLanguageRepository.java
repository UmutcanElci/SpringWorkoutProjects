package Kodlama.io.Devs.KodlamaOdev.dataAccess.concretes;

import Kodlama.io.Devs.KodlamaOdev.dataAccess.abstracts.LanguagesRepository;
import Kodlama.io.Devs.KodlamaOdev.entities.concretes.Languages;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Repository
public class InMemoryLanguageRepository implements LanguagesRepository {
List<Languages> languages;
static Scanner in = new Scanner(System.in);

    public InMemoryLanguageRepository() {//obje oluşturulduğudna zaten list de oluşturulmuş olucak
        languages = new ArrayList<>();
        languages.add(new Languages(1,"C#"));
        languages.add(new Languages(2,"Java"));
        languages.add(new Languages(3,"Python"));
    }


    @Override
    public void add(Languages language) {
        languages.add(language);
    }

    @Override
    public void delete(int id) {
        languages.remove(id-1);
    }

    @Override
    public void update(Languages language) {
        languages.set(language.getId()-1,language);
    }

    @Override
    public List<Languages> getAll() {
        return languages;
    }

    @Override
    public Languages getById(int id) {
        return languages.get(id-1);
    }

    public List<Languages> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Languages> languages) {
        this.languages = languages;
    }
}
