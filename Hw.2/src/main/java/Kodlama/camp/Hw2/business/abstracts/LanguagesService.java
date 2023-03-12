package Kodlama.camp.Hw2.business.abstracts;

import Kodlama.camp.Hw2.business.Responses.GetAllLanguagesResponse;

import java.util.List;

public interface LanguagesService {
    List<GetAllLanguagesResponse> getAll();

}
