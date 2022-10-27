package com.curso.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageView;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageView = findViewById(R.id.image);
        imageButton = findViewById(R.id.btnVoltar);

        //Recuperando Dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if ( numero == 0 ){ //Cara
            imageView.setImageResource( R.drawable.moeda_cara );
        } else { //Coroa
            imageView.setImageResource( R.drawable.moeda_coroa );
        }

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}