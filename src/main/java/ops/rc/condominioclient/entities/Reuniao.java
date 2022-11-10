package ops.rc.condominioclient.entities;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reuniao implements Serializable {

    @SerializedName("codigo")
    private int codigo;
    @SerializedName("finalidade")
    private String finalidade;
    @SerializedName("data")
    private String data;
}
