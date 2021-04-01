package com.example.tugasrecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SiswaAdapter adapter;
    private ArrayList<Siswa> siswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        recyclerView =findViewById(R.id.recycleView);
        adapter = new SiswaAdapter(siswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData(){
        siswaArrayList = new ArrayList<>();
        siswaArrayList.add(new Siswa("Ucup", "8572384553", "ucoep@gmail.com"));
        siswaArrayList.add(new Siswa("Budi", "8757317627", "boedi@gmail.com"));
        siswaArrayList.add(new Siswa("Udin", "8864683352", "euydin@gmail.com"));
        siswaArrayList.add(new Siswa("Saipudin", "8560217150", "saipudin@gmail.com"));
        siswaArrayList.add(new Siswa("Saitama", "8429348583", "botax@gmail.com"));
        siswaArrayList.add(new Siswa("Sukijan", "8624699141", "janjane@gmail.com"));
    }
}
