package com.curso.passandodadosentreactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.idButtonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);


                // passando um objeto ENTRE activity ( inicializado o objeto)
                Usuario usuario = new Usuario( "Julio Cesar Coutinho", "julio@gemmap.com.br" );

                //Passar dados
                intent.putExtra( "nome", "Priscila Aquino Coutinho" );
                intent.putExtra( "idade", 34 );

                //Passando os dados para a outra activity.
                intent.putExtra("objeto", usuario);

                startActivity( intent );

            }
        });
    }
}