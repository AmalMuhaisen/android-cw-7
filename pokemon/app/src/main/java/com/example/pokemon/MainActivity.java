package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<pokemon> pokeball = new ArrayList<>();
        pokemon po1 = new pokemon("butterfree",R.drawable.butterfree,45,50,395);
        pokemon po2 = new pokemon("charizard",R.drawable.charizard,84,78,534);
        pokemon po3 = new pokemon("kakuna",R.drawable.kakuna,25,50,205);
        pokemon po4 = new pokemon("machamp",R.drawable.machamp,130,80,505);
        pokemon po5 = new pokemon("wartortle",R.drawable.wartortle,63,80,405);

        RecyclerView re = findViewById(R.id.ReVi);
    }
}