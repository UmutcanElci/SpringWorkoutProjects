package YazilimKamp.io.rentACar.business.abstracts;
import YazilimKamp.io.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
