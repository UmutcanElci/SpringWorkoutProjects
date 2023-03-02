package kodlama.io.rentApp.webApi;

import kodlama.io.rentApp.business.abstracts.BrandService;
import kodlama.io.rentApp.business.requests.CreateBrandRequest;
import kodlama.io.rentApp.business.requests.UpdateBrandRequest;
import kodlama.io.rentApp.business.responses.GetAllBrandsResponse;
import kodlama.io.rentApp.business.responses.GetByIdBrandResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//Annotation  spring framework uygulamamız çalıştığında kimde controller olduğunu buluyor ve anlıyorki burası erişim noktası
@RestController
@RequestMapping("/api/brands")//Peki erişim noktasına nasıl ulaşırız? bunun içinde ona bir adress veriyoruz
public class BrandsController {
    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    //anlamı şu an BrandService olduğu için autowired parametrelerine bakıyor uygulamayı tarar ve implimitasyonları bulur ve onların new lenmiş halini verir
    //yani burda IoC kullanıyoruz bunun amacı biz sürekli bir object oluşturmak yerine her yeni veri için , onun yerine bellek te tek obje oluşturarak hepsini o
    //obje üzerinden dönyor(Kaba bir açıklama!)

    @GetMapping()
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    /*
    Şimdi biz /api/brands/getAll adresine istek attık bunun için brandService yani busness a gidicez, oda iş kurallarını çalıştıracak
    ordan da repository e gidice ve veriyi bize vericek
     */
    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)//200
    public void add(CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }

    @GetMapping("/{id}")//Eğer süslü parantezin içine koyarsak bu variable demek
    public GetByIdBrandResponse getAll(@PathVariable int id){//Path Variable demek ise dönülen response u bu path den dön demek yani id miz 2 olsun o zaman pathmiz şu şekilde döner /api/brands/2
        return brandService.getById(id);
    }

    @PutMapping()//bu mapler aslında birer standart biz bir web uygulamasına bir işlev yaptırmak istiyorsak o işlevin karşısına geicek mapler vardır bize daha kolaylık sağlar
    public  void update(@RequestBody UpdateBrandRequest updateBrandRequest){
        this.brandService.update(updateBrandRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.brandService.delete(id);
    }

}