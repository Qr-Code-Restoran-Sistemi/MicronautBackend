package siparis.repositories;

import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;
import org.bson.types.ObjectId;
import siparis.models.ProductModel;


@MongoRepository
public interface ProductRepository extends CrudRepository<ProductModel, ObjectId>{

}
