package com.example.projet;

import static android.widget.Toast.LENGTH_SHORT;
import static com.example.projet.R.string.bla;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class crea_compte_entreprise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crea_compte_entreprise);

        Button val = findViewById(R.id.btn_val_entr);

        val.setOnClickListener(view -> Toast.makeText(this, bla, LENGTH_SHORT).show());



    }
}