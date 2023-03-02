package kodlama.io.rentApp.business.rules;

import kodlama.io.rentApp.core.utilities.exception.BusinessException;
import kodlama.io.rentApp.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service//IoC ye yerleşmesi için yani obje çağrılacak ve kullanılacak
public class BrandBusninessRules {
    //İş kuralları
    private BrandRepository brandRepository;//Biz eğer veri tabanımız daki bir değeri(burada Brand name) kontrol etmek istiyosak onu brandRepository den yani bizim veri tabanımızla iletişime geçen sınıfdan yapmalıyız
    //Sınıf la iletişime geçmek için se Injection yapmamız lazım
    //Şimdi biz repository de istenen veri deki ismini kontrol etmek istiyoruz fakat brand Repository de yani o sınıfın için den name e ulaşmak için bir method yok
    //Key word kullanıcaz brandRepositoryde açıklama mevcut
    public void checkIfBrandNameExists(String brandName){
        if (this.brandRepository.existsByName(brandName)){
            throw new BusinessException("Brand name already exists");//Java exception types
            //Oluşacak hataları kendi exceptionlarımızı oluştuurarak ayırıyoruz
        }
    }
}
