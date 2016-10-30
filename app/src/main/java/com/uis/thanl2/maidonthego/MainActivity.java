package com.uis.thanl2.maidonthego;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton cottonButton, denimButton, linenButton, nylonButton, polyesterButton, satinButton, silkButton, woolButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find buttons by view
        cottonButton = (ImageButton) this.findViewById(R.id.cottonButton);
        denimButton = (ImageButton) this.findViewById(R.id.denimButton);
        linenButton = (ImageButton) this.findViewById(R.id.linenButton);
        nylonButton = (ImageButton) this.findViewById(R.id.nylonButton);
        polyesterButton = (ImageButton) this.findViewById(R.id.polyesterButton);
        satinButton = (ImageButton) this.findViewById(R.id.satinButton);
        silkButton = (ImageButton) this.findViewById(R.id.silkButton);
        woolButton = (ImageButton) this.findViewById(R.id.woolButton);
    }

    public void selectCotton(View view) {
        System.out.println("hi from cotton");
    }

    public void selectDenim(View view) {
        System.out.println("hi from denim");
    }

    public void selectLinen(View view){
        System.out.println("hi from linen");
    }

    public void selectNylon(View view) {
        System.out.println("hi from nylon");
    }

    public void selectPolyester(View view) {
        System.out.println("hi from polyester");
    }

    public void selectSatin(View view) {
        System.out.println("hi from satin");
    }

    public void selectSilk(View view) {
        System.out.println("hi from silk");
    }

    public void selectWool(View view) {
        System.out.println("hi from wool");
    }



}
