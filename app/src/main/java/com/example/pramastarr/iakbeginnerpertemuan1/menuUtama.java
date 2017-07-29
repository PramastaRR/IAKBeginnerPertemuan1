package com.example.pramastarr.iakbeginnerpertemuan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        setTitle("Menu Utama"); // mengatur judul

    }

    public void goto_happyBirthday (View view)
    {
        // pindah ke activity happyBirthday
        Intent intent = new Intent(menuUtama.this, happyBirthday.class);
        startActivity(intent);
    }

    public void goto_belajarWeight (View view)
    {
        // pindah ke activity belajarWeight
        Intent intent = new Intent(menuUtama.this, belajarWeight.class);
        startActivity(intent);
    }

    public void goto_pemesananKamar (View view)
    {
        // pindah ke activity pemesananKamar
        Intent intent = new Intent(menuUtama.this, pemesananKamar.class);
        startActivity(intent);
    }

    public void goto_backgroundTransparan (View view){
        // pindah ke activity transparent_act
        Intent intent = new Intent(menuUtama.this, transparent_act.class);
        startActivity(intent);
    }
}
