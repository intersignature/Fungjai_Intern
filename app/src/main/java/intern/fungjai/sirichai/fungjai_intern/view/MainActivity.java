package intern.fungjai.sirichai.fungjai_intern.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import intern.fungjai.sirichai.fungjai_intern.R;
import intern.fungjai.sirichai.fungjai_intern.controller.Controller;

public class MainActivity extends AppCompatActivity {

    private Controller controller;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configRecyclerView();

        controller = new Controller(MainActivity.this, recyclerView);
        controller.getData();
    }

    private void configRecyclerView() {

        recyclerView = findViewById(R.id.showDataRV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
