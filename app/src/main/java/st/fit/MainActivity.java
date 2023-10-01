package st.fit;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pagina1(View v){
        Intent pagina1 = new Intent(this,MainActivity2.class);
        startActivity(pagina1);
    }
    public void info(View v){
        Intent info = new Intent(this, MainActivity4.class);
        startActivity(info);
    }

}