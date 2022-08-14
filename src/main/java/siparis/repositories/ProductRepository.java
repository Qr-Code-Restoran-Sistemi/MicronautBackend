package siparis.repositories;

import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;
import siparis.models.ProductModel;

import java.util.List;

@MongoRepository
public interface ProductRepository extends CrudRepository<ProductModel, String>{

    Iterable<ProductModel> findByProductInList(List<String> urun);
}
