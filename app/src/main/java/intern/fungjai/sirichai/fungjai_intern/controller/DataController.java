package intern.fungjai.sirichai.fungjai_intern.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import intern.fungjai.sirichai.fungjai_intern.model.api.FungjaiInternApiManager;
import intern.fungjai.sirichai.fungjai_intern.model.pojo.MusicData;
import intern.fungjai.sirichai.fungjai_intern.model.recyclerview.FungjaiInternRecyclerViewAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataController implements Callback<List<MusicData>> {

    private List<MusicData> datas;
    private Context context;
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;

    public DataController(Context context, RecyclerView recyclerView) {
        this.context = context;
        this.recyclerView = recyclerView;
    }

    public void getData() {
        datas = new ArrayList<>();
        final Call<List<MusicData>> dataModel = FungjaiInternApiManager.getFungjaiInternApi().getMusicList();
        dataModel.enqueue(this);
    }

    @Override
    public void onResponse(@NonNull Call<List<MusicData>> call, @NonNull Response<List<MusicData>> response) {
        datas = response.body();
        adapter = new FungjaiInternRecyclerViewAdapter(datas, context);
        recyclerView.setAdapter(adapter);
        Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(@NonNull Call<List<MusicData>> call, @NonNull Throwable t) {
        Toast.makeText(context, "Fail", Toast.LENGTH_SHORT).show();
    }
}
