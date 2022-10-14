package com.curso.cardview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.curso.cardview.Adapter.PostagemAdapter;
import com.curso.cardview.R;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerPostagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        // Definir Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager( layoutManager );

        // definir Adapter
        PostagemAdapter adapter = new PostagemAdapter();
        recyclerPostagem.setAdapter( adapter );
    }
}