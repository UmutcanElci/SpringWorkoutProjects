package kodlama.io.rentApp.business.concretes;

import kodlama.io.rentApp.business.abstracts.BrandService;
import kodlama.io.rentApp.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentApp.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getall() {
        //İş Kuralları
        return brandRepository.findAll();
    }
}
