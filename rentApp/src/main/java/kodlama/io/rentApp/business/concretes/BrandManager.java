package kodlama.io.rentApp.business.concretes;

import kodlama.io.rentApp.business.abstracts.BrandService;
import kodlama.io.rentApp.business.requests.CreateBrandRequest;
import kodlama.io.rentApp.business.responses.GetAllBrandsResponse;
import kodlama.io.rentApp.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentApp.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BrandManager implements BrandService {//Interface den gelen işlemlerin aksiyona geçtiğin yer ise burasıdır
    private BrandRepository brandRepository;
    /*
    Bir soyut yani servie isminde bir interface imiz var orada gerçekleştirmek istediğimiz işlemlerin imzalarını yazarız
    burada is somut sınıfımız da ki Manager ya da ServiceImpl gibi iki türlü isimlendirme görebiliriz interface de olan imzaları
    burada işlevsel hale getiririz.
    Verileri BrandRepository katmanını enjekte ederek erişiyoruz
     */
    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    /*
    Normalde spring in şu anki versiyonunda Autowired yazmasakta olur spring bunu kendisi anlayabiliyor ama mantığını anlamak için yazmak daha iyi
    Autowired enjekte ettiğimz nesne için bellekte bir tane instance oluşumu sırasında onun örneğini ister basitçe IoC sayesinde bellekte her veri için farklı obje oluşturmak yerine
    tek obje üzerinden gidilir
     */
    @Override
    public List<GetAllBrandsResponse> getAll() {
        //İş Kuralları
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses = new ArrayList<>();

        for (Brand brand : brands){
            GetAllBrandsResponse response = new GetAllBrandsResponse();
            response.setId(brand.getId());
            response.setName(brand.getName());
            brandsResponses.add(response);
        }
        return brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest request) {
        Brand brand = new Brand();
        brand.setName(request.getName());
        this.brandRepository.save(brand);
    }
}
