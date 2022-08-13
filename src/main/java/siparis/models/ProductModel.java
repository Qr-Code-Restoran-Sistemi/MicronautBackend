package siparis.models;



import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import lombok.*;
import org.bson.types.ObjectId;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductModel {
    @NotBlank
    private String urun;
    @NotBlank
    private int fiyat;
    @NotBlank
    private String[] icindekiler;
}
