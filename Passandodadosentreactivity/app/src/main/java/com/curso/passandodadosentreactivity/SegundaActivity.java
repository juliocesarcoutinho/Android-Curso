package com.curso.passandodadosentreactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome;
    private TextView textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

        // Recuperar Dados enviados
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString( "nome" );
        int idade = dados.getInt( "idade" );

        //Recuperar objeto
        Usuario usuario = (Usuario) dados.getSerializable("objeto");
        textNome.setText(usuario.getEmail());

        //Configurar Valores
        //textNome.setText( nome );
        textIdade.setText( String.valueOf(idade));
    }
}