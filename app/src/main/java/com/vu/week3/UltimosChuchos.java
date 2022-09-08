package com.vu.week3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UltimosChuchos extends AppCompatActivity {

    private Toolbar miactionbar;
    private ImageView ivEstrella;
    private TextView tvEstrellaNum;
    private RecyclerView rcView;
    private ArrayList<DocClass> dogsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultimos_chuchos);
        miactionbar     = findViewById(R.id.miactionbar);
        setSupportActionBar(miactionbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ivEstrella      = findViewById(R.id.ivEstrella);
        tvEstrellaNum   = findViewById(R.id.tvEstrellaNum);
        rcView          = findViewById(R.id.rcView);

        ivEstrella.setVisibility(View.INVISIBLE);
        tvEstrellaNum.setVisibility(View.INVISIBLE);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rcView.setLayoutManager(llm);
        initLista();
        iniAdaptador();

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