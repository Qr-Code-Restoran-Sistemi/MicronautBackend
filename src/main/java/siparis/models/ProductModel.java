package siparis.models;



import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.*;
import org.bson.types.ObjectId;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedEntity
public class ProductModel {
    @Id
    @GeneratedValue
    private ObjectId id;
    @NotBlank
    private String urun;
    @NotBlank
    private int fiyat;
    @NotBlank
    private String[] icindekiler;
}
