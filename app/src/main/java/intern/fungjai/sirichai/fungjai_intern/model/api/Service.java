package intern.fungjai.sirichai.fungjai_intern.model.api;

import java.util.List;

import intern.fungjai.sirichai.fungjai_intern.model.pojo.DataModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    String urlBase = "https://us-central1-fjawesomeintern.cloudfunctions.net/";
    @GET("musiclist")
    Call<List<DataModel>> getMusicList();
}
