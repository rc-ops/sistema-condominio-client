package ops.rc.condominioclient.entities;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reuniao implements Serializable {

    @SerializedName("finalidade")
    private String finalidade;
    @SerializedName("data")
    private Date data;
}
