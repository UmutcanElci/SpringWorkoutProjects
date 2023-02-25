package YazilimKamp.io.rentACar.webApi.controllers;

import YazilimKamp.io.rentACar.business.abstracts.BrandService;
import YazilimKamp.io.rentACar.entities.concretes.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;
import java.util.List;

@RestController//Annotation  spring framework uygulamamız çalıştığında kimde controller olduğunu buluyor ve anlıyorki burası erişim noktası
@RequestMapping("/api/brands")//Peki erişim noktasına nasıl ulaşırız? bunun içinde ona bir adress veriyoruz
public class BrandsController {
    private BrandService brandService;

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<Brand> getAll(){
        return brandService.getAll();
    }
    /*
    Şimdi biz /api/brands/getAll adresine istek attık
     */
}
