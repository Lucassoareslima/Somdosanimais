package com.somdosanimais.lucas.somdosanimais;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView cao;
    private ImageView gato;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView vaca;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao = (ImageView)findViewById(R.id.cao);
        gato = (ImageView)findViewById(R.id.gato);
        leao = (ImageView)findViewById(R.id.leao);
        macaco = (ImageView)findViewById(R.id.macaco);
        ovelha = (ImageView)findViewById(R.id.ovelha);
        vaca = (ImageView)findViewById(R.id.vaca);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);

    }
    @Override
    public void onClick (View v){

        switch (v.getId()){

            case R.id.cao:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
                   tocar();
                break;



            case R.id.gato:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
                tocar();
                break;


            case R.id.leao:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                tocar();
                break;

            case R.id.macaco:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                tocar();
                break;

            case R.id.ovelha:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                tocar();
                break;

            case R.id.vaca:
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                tocar();
                break;

        }

    }



    public void tocar(){
        if(mediaPlayer != null){
            mediaPlayer.start();
        }
    }
}
