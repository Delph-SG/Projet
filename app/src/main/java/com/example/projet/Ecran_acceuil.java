package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Ecran_acceuil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecran_acceuil);

        Button co_opt = findViewById(R.id.connex_option);

        Intent option = new Intent(this, option_frag.class);
        Intent connexion = new Intent(this, ecran_connexion.class);

        int etat_co = 0; //pour enregistrer si il y a une connexion (0 = pas de connextion)

        if (etat_co > 0) {

            co_opt.setOnClickListener(view -> startActivity(option)); // si l'utilisateur est connecté, il a accés aux options
        }
        else {
            co_opt.setOnClickListener(view -> startActivity(connexion)); // si l'utilisateur n'est pas connecté, il a accés à l'écran de connexion
        }

    }
}