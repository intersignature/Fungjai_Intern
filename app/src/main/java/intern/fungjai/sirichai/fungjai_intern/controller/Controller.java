package intern.fungjai.sirichai.fungjai_intern.controller;

import android.content.Context;
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

public class Controller {

    private Context context;
    private List<DataModel> datas;
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;
    public Controller(Context context, RecyclerView recyclerView) {
        this.context = context;
        this.recyclerView = recyclerView;
    }

    public void getData() {
        datas = new ArrayList<>();
        final Call<List<DataModel>> dataModel = FungjaiInternApiManager.getFungjaiInternApi().getMusicList();
        dataModel.enqueue(new Callback<List<DataModel>>() {
            @Override
            public void onResponse(Call<List<DataModel>> call, Response<List<DataModel>> response) {
                datas = response.body();
                adapter = new FungjaiInternRecyclerViewAdapter(datas, context);
                recyclerView.setAdapter(adapter);
                Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<DataModel>> call, Throwable t) {
                Toast.makeText(context, "Fail", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
