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
public class Problema implements Serializable {

    @SerializedName("problema")
    private String problema;
    @SerializedName("dataInicio")
    private Date dataInicio;
    @SerializedName("dataResolucao")
    private Date dataResolucao;
    @SerializedName("descricao")
    private String descricao;
    @SerializedName("situacaoProblema")
    private String situacaoProblema;
}
