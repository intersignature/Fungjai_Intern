package intern.fungjai.sirichai.fungjai_intern.api;

import java.util.List;

import intern.fungjai.sirichai.fungjai_intern.model.DataModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    String urlBase = "https://us-central1-fjawesomeintern.cloudfunctions.net/";
    @GET("musiclist")
    Call<List<DataModel>> getMusicList();
}
