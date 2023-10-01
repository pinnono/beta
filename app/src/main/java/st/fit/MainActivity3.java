package st.fit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private itemAdapter itemAdap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recyclerView = (RecyclerView) findViewById(R.id.reclycreView2);
        itemAdap = new itemAdapter(this);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        itemAdap.setData(getData());
        recyclerView.setAdapter(itemAdap);
        recyclerView.setLayoutManager(llm);
    }

    private List<item> getData() {
        List<item> list = new ArrayList<>();
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        return list;
    }
    public void pagina1(View v) {
        Intent pagina1 = new Intent(this, MainActivity2.class);
        startActivity(pagina1);
    }
    public void pagina2(View v){
        Toast.makeText(getApplicationContext(), "Ya estás en los guardados!", Toast.LENGTH_SHORT).show();
    }
}