package Kodlama.camp.Hw2.business.Responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllFrameworksResponse {
    private Integer id;
    private String name;
}
