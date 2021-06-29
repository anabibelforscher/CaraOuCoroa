package com.anabibelforscher.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    private Button mBotaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        jogarMoeda();

        mBotaoVoltar = findViewById(R.id.botaoVoltar);
        mBotaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


    public void jogarMoeda (){
        ImageView moeda = findViewById(R.id.imagemMoeda);
        int numero = new Random().nextInt(2);
        String [] facesMoeda = {"cara","coroa"};
        String opcoes = facesMoeda[numero];
        switch (opcoes){
            case "cara":
                moeda.setImageResource(R.drawable.moeda_cara);
                break;
            case "coroa":
                moeda.setImageResource(R.drawable.moeda_coroa);
                break;
        }
    }

}