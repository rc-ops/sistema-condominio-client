package api;

import java.util.List;
import ops.rc.condominioclient.entities.Morador;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MoradorApi {
    @GET("/moradores")
    Call<List<Morador>> findAll();
    @POST("/moradores/novo")
    Call<Void> createMorador(@Body Morador morador);
}
