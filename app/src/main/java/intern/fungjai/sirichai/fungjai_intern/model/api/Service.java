package intern.fungjai.sirichai.fungjai_intern.model.api;

import java.util.List;

import intern.fungjai.sirichai.fungjai_intern.model.pojo.DataModel;
import intern.fungjai.sirichai.fungjai_intern.model.utilities.Constants;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET(Constants.MUSIC_LIST)
    Call<List<DataModel>> getMusicList();
}
