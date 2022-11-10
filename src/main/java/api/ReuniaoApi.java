package api;

import java.util.List;
import ops.rc.condominioclient.entities.Reuniao;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ReuniaoApi {

    @GET("/reunioes")
    Call<List<Reuniao>> findAll();

    @GET("/reunioes/pesquisa/codigo/{codigo}")
    Call<Reuniao> findReuniaoById(@Path("codigo") int codigo);

    @POST("/reunioes/nova")
    Call<Void> createReuniao(@Body Reuniao problema);

    @PUT("/reunioes/atualizar/{codigo}")
    Call<Void> updateReuniao(@Path("cpf") int codigo, @Body Reuniao problema);

    @DELETE("/reunioes/deletar/{codigo}")
    Call<Void> deleteReuniao(@Path("codigo") int codigo);
}
