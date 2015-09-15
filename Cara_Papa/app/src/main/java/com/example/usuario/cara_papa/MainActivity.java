package com.example.usuario.cara_papa;

import android.app.Activity;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends Activity {

    CheckBox ojos;
    ImageView Im1;

    CheckBox Manos;
    ImageView Im2;

    CheckBox bigote;
    ImageView Im3;

    CheckBox nariz;
    ImageView Im4;

    CheckBox som;
    ImageView Im5;

    CheckBox zap;
    ImageView Im6;

    CheckBox ore;
    ImageView Im7;

    CheckBox cej;
    ImageView Im8;

    CheckBox gaf;
    ImageView Im9;

    CheckBox boc;
    ImageView Im10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ojos = (CheckBox) findViewById(R.id.ojo);
        Im1 = (ImageView) findViewById(R.id.Ojoim);

        Manos = (CheckBox) findViewById(R.id.Man);
        Im2 = (ImageView) findViewById(R.id.Manim);

        bigote = (CheckBox) findViewById(R.id.bigo);
        Im3 = (ImageView) findViewById(R.id.Bigim);

        nariz = (CheckBox) findViewById(R.id.Nar);
        Im4 = (ImageView) findViewById(R.id.NarIm);

        som = (CheckBox) findViewById(R.id.Som);
        Im5 = (ImageView) findViewById(R.id.SomIm);

        zap = (CheckBox) findViewById(R.id.Zap);
        Im6 = (ImageView) findViewById(R.id.ZapIm);

        ore = (CheckBox) findViewById(R.id.Ore);
        Im7 = (ImageView) findViewById(R.id.OreIm);

        cej = (CheckBox) findViewById(R.id.Cej);
        Im8 = (ImageView) findViewById(R.id.CejIm);

        gaf = (CheckBox) findViewById(R.id.Gaf);
        Im9 = (ImageView) findViewById(R.id.GafIm);

        boc = (CheckBox) findViewById(R.id.Boc);
        Im10 = (ImageView) findViewById(R.id.BocIm);

    }

    public void parteCuerpo(View v) {
        //when play is clicked show stop button and hide play button

        if (ojos.isChecked()) {
            Im1.setVisibility(View.VISIBLE);
        } else {
            Im1.setVisibility(View.INVISIBLE);
        }

        if (Manos.isChecked()) {
            Im2.setVisibility(View.VISIBLE);
        } else {
            Im2.setVisibility(View.INVISIBLE);
        }

        if (bigote.isChecked()) {
            Im3.setVisibility(View.VISIBLE);
        } else {
            Im3.setVisibility(View.INVISIBLE);
        }

        if (nariz.isChecked()) {
            Im4.setVisibility(View.VISIBLE);
        } else {
            Im4.setVisibility(View.INVISIBLE);
        }

        if (som.isChecked()) {
            Im5.setVisibility(View.VISIBLE);
        } else {
            Im5.setVisibility(View.INVISIBLE);
        }
        if (zap.isChecked()) {
            Im6.setVisibility(View.VISIBLE);
        } else {
            Im6.setVisibility(View.INVISIBLE);
        }
        if (ore.isChecked()) {
            Im7.setVisibility(View.VISIBLE);
        } else {
            Im7.setVisibility(View.INVISIBLE);
        }
        if (cej.isChecked()) {
            Im8.setVisibility(View.VISIBLE);
        } else {
            Im8.setVisibility(View.INVISIBLE);
        }
        if (gaf.isChecked()) {
            Im9.setVisibility(View.VISIBLE);
        } else {
            Im9.setVisibility(View.INVISIBLE);
        }
        if (boc.isChecked()) {
            Im10.setVisibility(View.VISIBLE);
        } else {
            Im10.setVisibility(View.INVISIBLE);
        }

    }
}

