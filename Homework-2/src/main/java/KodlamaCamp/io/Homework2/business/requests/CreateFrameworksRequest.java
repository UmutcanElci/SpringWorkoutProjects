package KodlamaCamp.io.Homework2.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateFrameworksRequest {
    private String name;
    private int languageId;
}
