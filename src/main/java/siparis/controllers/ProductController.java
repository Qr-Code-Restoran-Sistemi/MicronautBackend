package siparis.controllers;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.annotation.Status;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import siparis.models.ProductModel;
import siparis.services.ProductService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller("/Product")
@ExecuteOn(TaskExecutors.IO)
public class ProductController {
    @Inject
    private final ProductService productService;

    @Get("/UrunleriGoster")
    Iterable<ProductModel> list() {
        return productService.list();
    }

    @Post("/UrunEkle")
    @Status(HttpStatus.CREATED)
    ProductModel save(@NonNull @NotNull @Valid ProductModel productModel) {
        return productService.save(productModel);
    }

    @Put("/UrunDegistir")
    ProductModel update(@NonNull @NotNull @Valid ProductModel productModel) {
        return productService.save(productModel);
    }

    @Get("/{id}")
    Optional<ProductModel> find(@PathVariable ObjectId id) {
        return productService.find(id);
    }

}
