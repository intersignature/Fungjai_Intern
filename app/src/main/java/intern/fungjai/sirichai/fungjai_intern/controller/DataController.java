package intern.fungjai.sirichai.fungjai_intern.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import intern.fungjai.sirichai.fungjai_intern.model.api.FungjaiInternApiManager;
import intern.fungjai.sirichai.fungjai_intern.model.pojo.DataModel;
import intern.fungjai.sirichai.fungjai_intern.model.recyclerview.FungjaiInternRecyclerViewAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataController implements Callback<List<DataModel>> {

    private List<DataModel> datas;
    private Context context;
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;

    public DataController(Context context, RecyclerView recyclerView) {
        this.context = context;
        this.recyclerView = recyclerView;
    }

    public void getData() {
        datas = new ArrayList<>();
        final Call<List<DataModel>> dataModel = FungjaiInternApiManager.getFungjaiInternApi().getMusicList();
        dataModel.enqueue(this);
    }

    @Override
    public void onResponse(@NonNull Call<List<DataModel>> call, @NonNull Response<List<DataModel>> response) {
        datas = response.body();
        adapter = new FungjaiInternRecyclerViewAdapter(datas, context);
        recyclerView.setAdapter(adapter);
        Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(@NonNull Call<List<DataModel>> call, @NonNull Throwable t) {
        Toast.makeText(context, "Fail", Toast.LENGTH_SHORT).show();
    }
}
