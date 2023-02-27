package kodlama.io.rentApp.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//DTO
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
    private String name;
}
