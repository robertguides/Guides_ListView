package com.example.guides.guides_listview.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.guides.guides_listview.Adapter.CustomAdapter;
import com.example.guides.guides_listview.Model.College;
import com.example.guides.guides_listview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] colleges;
    String[] years;
    int[] logos;

    ListView list_Colleges;

    CustomAdapter adapter;

    ArrayList<College> listColleges;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colleges=getResources().getStringArray(R.array.Colleges);
        years=getResources().getStringArray(R.array.year);

        list_Colleges= (ListView) findViewById(R.id.LiColleges);
        listColleges = new ArrayList<College>();

        logos = new int[]{R.drawable.pig, R.drawable.pig2, R.drawable.pig3, R.drawable.pig4, R.drawable.pig};

        for(int i = 0; i < colleges.length ; i++){
            listColleges.add(new College(logos[i], colleges[i], years[i]));
        }

        adapter = new CustomAdapter(this, listColleges);
        list_Colleges.setAdapter(adapter);

        list_Colleges.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "You clicked " + colleges[i];
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
