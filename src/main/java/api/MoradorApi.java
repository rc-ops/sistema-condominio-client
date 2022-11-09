package api;

import java.util.List;
import ops.rc.condominioclient.entities.Morador;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface MoradorApi {

    @GET("/moradores")
    Call<List<Morador>> findAll();

    @GET("/moradores/pesquisa/cpf/{cpf}")
    Call<Morador> findMoradorByCpf(@Path("cpf") String cpf);
    
    @POST("/moradores/novo")
    Call<Void> createMorador(@Body Morador morador);
    
    @PUT("/moradores/atualizar/{cpf}") // Talvez dê erro
    Call<Void> updateMorador(@Path("cpf") String cpf, @Body Morador morador);
    
    @DELETE("/moradores/deletar/{cpf}")
    Call<Void> deleteMorador(@Path("cpf") String cpf);
}
