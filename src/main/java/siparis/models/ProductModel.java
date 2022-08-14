package siparis.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.*;
import org.bson.types.ObjectId;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedEntity("Tatlilar2")
public class ProductModel {
    @Id
    @GeneratedValue
    private ObjectId id;
    private String urun;
    private String[] icindekiler;
    private int fiyat;
}
