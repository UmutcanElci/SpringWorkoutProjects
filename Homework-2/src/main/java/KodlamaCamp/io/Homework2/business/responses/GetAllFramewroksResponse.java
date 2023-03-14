package KodlamaCamp.io.Homework2.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllFramewroksResponse {
    private int id;
    private String name;
    private String LanguagesName;
}
