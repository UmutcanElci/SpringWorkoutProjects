package kodlama.io.rentApp.business.abstracts;

import kodlama.io.rentApp.business.requests.CreateBrandRequest;
import kodlama.io.rentApp.business.requests.UpdateBrandRequest;
import kodlama.io.rentApp.business.responses.GetAllBrandsResponse;
import kodlama.io.rentApp.business.responses.GetByIdBrandResponse;

import java.util.List;

public interface BrandService {//Veri erişim işlemleri burada gerçekleşir
    List<GetAllBrandsResponse> getAll();
    GetByIdBrandResponse getById(int id);
    void add(CreateBrandRequest request);

    void update(UpdateBrandRequest update);
    void delete(int id);

}
