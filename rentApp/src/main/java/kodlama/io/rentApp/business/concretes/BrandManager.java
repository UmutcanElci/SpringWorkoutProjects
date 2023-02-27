package kodlama.io.rentApp.business.concretes;

import kodlama.io.rentApp.business.abstracts.BrandService;
import kodlama.io.rentApp.business.requests.CreateBrandRequest;
import kodlama.io.rentApp.business.requests.UpdateBrandRequest;
import kodlama.io.rentApp.business.responses.GetAllBrandsResponse;
import kodlama.io.rentApp.business.responses.GetByIdBrandResponse;
import kodlama.io.rentApp.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentApp.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentApp.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {//Interface den gelen işlemlerin aksiyona geçtiğin yer ise burasıdır
    private BrandRepository brandRepository;
    /*
    Bir soyut yani servie isminde bir interface imiz var orada gerçekleştirmek istediğimiz işlemlerin imzalarını yazarız
    burada is somut sınıfımız da ki Manager ya da ServiceImpl gibi iki türlü isimlendirme görebiliriz interface de olan imzaları
    burada işlevsel hale getiririz.
    Verileri BrandRepository katmanını enjekte ederek erişiyoruz
     */
    private ModelMapperService modelMapperService;


    /*
    Normalde spring in şu anki versiyonunda Autowired yazmasakta olur spring bunu kendisi anlayabiliyor ama mantığını anlamak için yazmak daha iyi
    Autowired enjekte ettiğimz nesne için bellekte bir tane instance oluşumu sırasında onun örneğini ister basitçe IoC sayesinde bellekte her veri için farklı obje oluşturmak yerine
    tek obje üzerinden gidilir.
     */
    @Override
    public List<GetAllBrandsResponse> getAll() {
        //İş Kuralları

        List<Brand> brands = brandRepository.findAll();
        /*
        List<GetAllBrandsResponse> brandsResponses = new ArrayList<>();
         */

        /*
        for (Brand brand : brands){
            GetAllBrandsResponse response = new GetAllBrandsResponse();
            response.setId(brand.getId());
            response.setName(brand.getName());
            brandsResponses.add(response);
        }//Şimdi biz kullanıcıya bizim izin verdiğimiz verileri göstermek istiyoruz bu verileri göstermek için ise  Brand sınıfından istediğimiz verileri GetAllBrandsResponse sınıfına atıp kullanabiliriz
         */
        //Tabi bu veriler her artığında biz buraya sürekli ekleme yapmamız gerekecek bu dağınıklıktan keçınılası için Mapperları kullanabiliyoruz
        //Biz şimdi response vermek istediğimiz verileri biliyoruz ne yapıcaz o verileri Response sınıfımıza aktarmak sitiyoruz mapper bu katarımı yapmamızı sağlıyor

        List<GetAllBrandsResponse> brandsResponses = brands.stream().map(brand -> this.modelMapperService.forResponse().map(brand,GetAllBrandsResponse.class)).collect(Collectors.toList());
        return brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest request) {//Reflection da denir burda yaptığımız işleve yani mapper işlevine
        Brand brand = this.modelMapperService.forRequest().map(request,Brand.class);//Şimdi bizim bir requestimiz var kullanıcınmın girdiği bunu Brand sınıfına çevir anlamına geliyor
        /*
        Brand brand = new Brand();
        brand.setName(request.getName());
         */
        this.brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest update) {
        Brand brand = this.modelMapperService.forRequest().map(update,Brand.class);//Update i brand sınıfına çevirdi
        this.brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();//Başta bize sorun gösteriyor çünkü belirsiz bir id de girebiliriz
        //Bunun için orElseThrow u kullanrak eğer aranan id yok ise bize hata yı exception u yolla demek istiyoruz!
        GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand,GetByIdBrandResponse.class);//Brand i IdResponse e çevirdik
        return response;
    }
}
