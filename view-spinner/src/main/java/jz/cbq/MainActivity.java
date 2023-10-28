package jz.cbq;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String[] boys = {"CBH", "SongWenJie", "WangWenZhao"};
    private String[] girls = {"CB", "CBQ"};
    private Spinner spB;
    private Spinner spG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spB = findViewById(R.id.sp_choice_b);
        spB.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, boys));

        spG = findViewById(R.id.sp_choice_g);
        spG.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, girls));

    }
}