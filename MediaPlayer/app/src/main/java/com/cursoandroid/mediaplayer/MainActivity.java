package com.cursoandroid.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private SeekBar seekBar;
    private AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create( getApplicationContext(), R.raw.teste );
        inicializarSeekBar();
    }

    private void inicializarSeekBar(){

        seekBar = findViewById(R.id.seekVolume);

        //CONFIGURA AUDIO MANAGER
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        //RECUPERA VOLUME MAXIMO E VOLUME MINIMO
        int volumeMaximo = audioManager.getStreamMaxVolume( AudioManager.STREAM_MUSIC );
        int volumeAtual  = audioManager.getStreamVolume( AudioManager.STREAM_MUSIC );

        //Configurando valores maximo seekBar
        seekBar.setMax( volumeMaximo );

        //Configurando o valor atual
        seekBar.setProgress( volumeAtual );

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume( AudioManager.STREAM_MUSIC, progress, 0);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void executarSom(View view){
        if (mediaPlayer != null){
            mediaPlayer.start();
        }

    }

    public void pausarMusica(View view){
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }

    public void pararMusica (View view){
        if (mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create( getApplicationContext(), R.raw.teste );
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null && mediaPlayer.isPlaying()){
            mediaPlayer.pause();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }
}