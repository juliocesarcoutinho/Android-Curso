package com.curso.cardview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.curso.cardview.Adapter.PostagemAdapter;
import com.curso.cardview.Model.Postagem;
import com.curso.cardview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerPostagem;
    private List< Postagem > postagens = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        // Definir Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        /*LinearLayoutManager layoutManager = new LinearLayoutManager(this);*/
        recyclerPostagem.setLayoutManager( layoutManager );

        //*layoutManager.setOrientation( layoutManager.HORIZONTAL );*/
        /*GridLayoutManager layoutManager = new GridLayoutManager( this, 2 );*/
        /*recyclerPostagem.setLayoutManager( layoutManager );*/

        // definir Adapter
        this.preparaPostagem();

        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclerPostagem.setAdapter( adapter );
    }

    public void preparaPostagem() {

        Postagem p = new Postagem( "#tbt Viagem Legal", "Julio Cesar Coutinho", R.drawable.imagem1 );
        this.postagens.add( p );

        p = new Postagem( "#tbt Viagem Para Portugal", "Priscila Aquino Coutinho", R.drawable.imagem2 );
        this.postagens.add( p );

        p = new Postagem( "#tbt Viagem Com Papi e Mamis", "Rebekah Olivia Aquino Coutinho", R.drawable.imagem3 );
        this.postagens.add( p );

        p = new Postagem( "#tbt Viagem com Papi e Mamis", "Miriã Aquino Coutinho", R.drawable.imagem4 );
        this.postagens.add( p );

    }
}