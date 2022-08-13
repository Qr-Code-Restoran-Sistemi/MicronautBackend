package siparis.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.*;

import javax.validation.constraints.NotBlank;
import java.lang.annotation.Documented;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedEntity
public class OrderModel {
    @Id
    @GeneratedValue
    private String id;
    @NotBlank
    @JsonProperty
    private int masaNo;
    @JsonProperty
    private ProductModel[] urun;
    @NotBlank
    @JsonProperty
    private String[] ekstralar;
    @JsonProperty
    @NotBlank
    private String not;
    @JsonProperty
    @NotBlank
    private int toplamFiyat;
    @NotBlank
    @JsonProperty
    private boolean siparisAktifMi;


}
