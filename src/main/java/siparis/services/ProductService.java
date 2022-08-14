package siparis.services;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import lombok.NonNull;
import java.util.List;

import siparis.models.ProductModel;
import siparis.repositories.ProductRepository;

import java.util.Optional;

@Singleton
public class ProductService {

    @Inject
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<ProductModel> list() {
        return productRepository.findAll();
    }

    public ProductModel save(ProductModel productModel) {
        if (productModel.getId() == null) {
            return productRepository.save(productModel);
        } else {
            return productRepository.update(productModel);
        }
    }

    public Optional<ProductModel> find(@NonNull String id) {
        return productRepository.findById(id);
    }

    public Iterable<ProductModel> findByProductInList(List<String> Urun) {
        return productRepository.findByProductInList(Urun);
    }
}
