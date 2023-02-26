package YazilimKamp.io.rentACar.webApi.controllers;

import YazilimKamp.io.rentACar.business.abstracts.BrandService;
import YazilimKamp.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController//Annotation  spring framework uygulamamız çalıştığında kimde controller olduğunu buluyor ve anlıyorki burası erişim noktası
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

    @GetMapping("/getall")
    public List<Brand> getAll(){
        return brandService.getAll();
    }
    /*
    Şimdi biz /api/brands/getAll adresine istek attık bunun için brandService yani busness a gidicez, oda iş kurallarını çalıştıracak
    ordan da repository e gidice ve veriyi bize vericek
     */
}
