package intern.fungjai.sirichai.fungjai_intern.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FungjaiInternApi {

    public static Service service = null;

    public static Service getService() {
        if (service == null){
            OkHttpClient client = new OkHttpClient
                    .Builder()
                    .build();

            Retrofit retrofit = new Retrofit
                    .Builder()
                    .client(client)
                    .baseUrl(Service.urlBase)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            service = retrofit.create(Service.class);
        }
        return service;
    }
}
