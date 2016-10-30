package com.uis.thanl2.maidonthego;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ImageButton cottonButton, denimButton, linenButton, nylonButton, polyesterButton, satinButton, silkButton, woolButton;
    TextView nameOfStain;
    ListView stainListView;
    private static final String[] stains = {"BBQ sauce", "Baseball dirt", "Blood", "Chewing gum", "Chocolate", "Coffee", "Cranberry Juice", "Grass Stains", "Grease", "Ink", "Ketchup", "Kool Aid",  "Lip stick",  "Mustard",  "Soy Sauce",  "Strawberry Jam",  "Sweat Tea",  "Tomato Sauce",  "Urine",  "Wine"};
    Map <String,String> map;


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


        nameOfStain = (TextView) this.findViewById(R.id.nameOfStain);
        stainListView = (ListView) this.findViewById(R.id.stainListView);

        //hashmap
        map =  new HashMap<String,String>();

        final ArrayList <String> stainList = new ArrayList<>();
        for (int i = 0; i < stains.length; i++){
            stainList.add(stains[i]);
        }

        final ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, stainList);
        stainListView.setAdapter(adapter);

        stainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("hi there");
            }
        });
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
