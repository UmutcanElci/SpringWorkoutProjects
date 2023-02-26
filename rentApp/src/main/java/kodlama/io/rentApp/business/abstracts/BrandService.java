package kodlama.io.rentApp.business.abstracts;

import kodlama.io.rentApp.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BrandService {
    List<Brand> getall();
}
