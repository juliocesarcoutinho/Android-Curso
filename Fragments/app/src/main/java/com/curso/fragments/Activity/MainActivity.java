package com.curso.fragments.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.FragmentTransitionSupport;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.curso.fragments.Fragment.ContatosFragment;
import com.curso.fragments.Fragment.ConversasFragment;
import com.curso.fragments.R;

public class MainActivity extends AppCompatActivity {

        private Button buttonConversas;
        private Button buttonContatos;
        private ConversasFragment conversasFragment;
        private ContatosFragment contatosFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContatos = findViewById( R.id.buttonContatos );
        buttonConversas = findViewById( R.id.buttonConversas );

        conversasFragment = new ConversasFragment();
        //Configurara o objeto do fragmento
        FragmentTransaction trasition = getSupportFragmentManager().beginTransaction();
        trasition.replace( R.id.frameConteudo, conversasFragment );
        trasition.commit();

        buttonContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view ) {

                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace( R.id.frameConteudo, contatosFragment );
                transaction.commit();

            }
        });

        buttonConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                conversasFragment = new ConversasFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace( R.id.frameConteudo, conversasFragment );
                transaction.commit();

            }
        });

        getSupportActionBar().setElevation(0);
    }
}