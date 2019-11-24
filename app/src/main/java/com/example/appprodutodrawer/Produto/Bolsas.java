package com.example.appprodutodrawer.Produto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.appprodutodrawer.R;




public class Bolsas extends AppCompatActivity {

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolsas);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1 = findViewById(R.id.comprar1);
                Context contexto = getApplicationContext();
                Toast.makeText(getApplicationContext(),  "O Objeto Foi Comprado com Sucesso", Toast.LENGTH_SHORT).show();


            }
        }
    }
}


