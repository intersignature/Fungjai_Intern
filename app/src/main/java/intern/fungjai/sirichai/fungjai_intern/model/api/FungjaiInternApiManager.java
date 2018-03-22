package intern.fungjai.sirichai.fungjai_intern.model.api;

import intern.fungjai.sirichai.fungjai_intern.model.utilities.Constants;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FungjaiInternApiManager {

    public static Service service = null;

    public static Service getFungjaiInternApi() {
        if (service == null){
            OkHttpClient client = new OkHttpClient
                    .Builder()
                    .build();

            Retrofit retrofit = new Retrofit
                    .Builder()
                    .client(client)
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            service = retrofit.create(Service.class);
        }
        return service;
    }
}
