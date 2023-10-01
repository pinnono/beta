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

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private itemAdapter itemAdap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = (RecyclerView) findViewById(R.id.reclycreView);
        itemAdap = new itemAdapter(this);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        itemAdap.setData(getData());
        recyclerView.setAdapter(itemAdap);
        recyclerView.setLayoutManager(llm);
    }
    public void pagina1(View v) {
        Toast.makeText(getApplicationContext(), "Ya estás en el menú principal!", Toast.LENGTH_SHORT).show();
    }
    public void pagina2(View v){
        Intent pagina2 = new Intent(this, MainActivity3.class);
        startActivity(pagina2);
    }
    private List<item> getData() {
        List<item> list = new ArrayList<>();
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        list.add(new item(R.drawable.mancuernas, "mancuernas"));
        return list;
    }
}