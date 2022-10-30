package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository //bu sınıf bir DataAccess nesnesidir
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand>brands;

    public InMemoryBrandRepository() {
        brands =new ArrayList<Brand>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(1, "MERCEDES"));
        brands.add(new Brand(1, "AUDI"));
        brands.add(new Brand(1, "HONDA"));
        brands.add(new Brand(1, "SKODA"));


    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
