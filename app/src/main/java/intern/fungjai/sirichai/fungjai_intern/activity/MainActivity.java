package intern.fungjai.sirichai.fungjai_intern.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import intern.fungjai.sirichai.fungjai_intern.R;
import intern.fungjai.sirichai.fungjai_intern.controller.DataController;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configRecyclerView();

        DataController controller = new DataController(MainActivity.this, recyclerView);
        controller.getData();
    }

    private void configRecyclerView() {
        recyclerView = findViewById(R.id.showDataRV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
