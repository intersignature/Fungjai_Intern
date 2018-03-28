package intern.fungjai.sirichai.fungjai_intern.api;

import java.util.List;

import intern.fungjai.sirichai.fungjai_intern.pojo.MusicData;
import intern.fungjai.sirichai.fungjai_intern.utilities.Constants;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET(Constants.MUSIC_LIST)
    Call<List<MusicData>> getMusicList();
}
