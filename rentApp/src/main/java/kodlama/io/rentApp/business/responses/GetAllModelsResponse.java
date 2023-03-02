package kodlama.io.rentApp.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllModelsResponse {
    private int id;
    private String name;
    private String brandName;//Marka nın id sini getirilmseini istemiyoruz onun yerine Bizim brand sınıfımız daki yani Marka sınıfımız daki markanın ismini istiyorum
}
