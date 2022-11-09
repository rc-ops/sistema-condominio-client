package api;

import java.util.List;
import ops.rc.condominioclient.entities.Problema;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ProblemaApi {
    
    @GET("/problemas")
    Call<List<Problema>> findAll();

    @GET("/problemas/pesquisa/codigo/{codigo}")
    Call<Problema> findProblemaById(@Path("codigo") int codigo);

    @POST("/problemas/novo")
    Call<Void> createProblema(@Body Problema problema);

    @PUT("/problemas/atualizar/{codigo}")
    Call<Void> updateProblema(@Path("cpf") int codigo, @Body Problema problema);

    @DELETE("/problemas/deletar/{codigo}")
    Call<Void> deleteProblema(@Path("codigo") int codigo);

}
