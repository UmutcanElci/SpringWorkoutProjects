package Kodlama.io.Devs.KodlamaOdev.dataAccess.abstracts;

import Kodlama.io.Devs.KodlamaOdev.entities.concretes.Languages;

import java.util.List;

public interface LanguagesRepository {
    void add(Languages language);

    void delete(int id);
    void update(Languages language);
    List<Languages> getAll();
    Languages getById(int id);
}
