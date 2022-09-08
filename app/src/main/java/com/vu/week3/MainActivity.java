package com.vu.week3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DocClass> dogsArray;
    private RecyclerView rcView;
    private Toolbar miactionbar;
    private ImageView ivEstrella;
    private TextView tvEstrellaNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcView          = findViewById(R.id.rcView);
        miactionbar     = findViewById(R.id.miactionbar);
        setSupportActionBar(miactionbar);
        ivEstrella      = findViewById(R.id.ivEstrella);
        tvEstrellaNum   = findViewById(R.id.tvEstrellaNum);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rcView.setLayoutManager(llm);
        initLista();
        iniAdaptador();
        ivEstrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UltimosChuchos.class);
                startActivity(intent);
            }
        });
        tvEstrellaNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UltimosChuchos.class);
                startActivity(intent);
            }
        });

    }
    public void iniAdaptador(){
        DogAdaptador dogAdaptador = new DogAdaptador(dogsArray);
        rcView.setAdapter(dogAdaptador);
    }
    public void initLista(){
        dogsArray = new ArrayList<DocClass>();
        dogsArray.add(new DocClass(R.drawable.uno, 1, "dyna"));
        dogsArray.add(new DocClass(R.drawable.dos, 2, "lasy"));
        dogsArray.add(new DocClass(R.drawable.tres, 0, "thor"));
    }
}