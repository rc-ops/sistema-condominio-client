package ops.rc.condominioclient.entities;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Morador implements Serializable {

    @SerializedName("cpf")
    private String cpf;
    @SerializedName("nome")
    private String nome;
    @SerializedName("sobrenome")
    private String sobrenome;
    @SerializedName("telefones")
    private String telefones;
    @SerializedName("emails")
    private String emails;
    @SerializedName("apartamento")
    private int apartamento;
    @SerializedName("observacoes")
    private String observacoes;
    @SerializedName("pendencias")
    private String pendencias;
    @SerializedName("situacaoMorador")
    private String situacaoMorador;
}
