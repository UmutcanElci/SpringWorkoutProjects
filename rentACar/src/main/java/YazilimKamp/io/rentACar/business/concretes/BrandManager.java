package YazilimKamp.io.rentACar.business.concretes;

import YazilimKamp.io.rentACar.business.abstracts.BrandService;
import YazilimKamp.io.rentACar.dataAccess.abstracts.BrandRepository;
import YazilimKamp.io.rentACar.entities.concretes.Brand;

import java.util.List;

public class BrandManager implements BrandService {
    //BrandServiceImpl gibi de yazılabilir
    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    @Override
    public List<Brand> getAll() {
        //iş kuralları -listeleme gibi
        return brandRepository.getAll();
    }

}
