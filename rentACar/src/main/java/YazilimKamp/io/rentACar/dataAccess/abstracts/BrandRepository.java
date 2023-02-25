package YazilimKamp.io.rentACar.dataAccess.abstracts;

import YazilimKamp.io.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    //BrandDao da denir
    List<Brand> getAll();

}
