package com.example.sam.theminecraftindex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Table extends AppCompatActivity {

    public Button Backbut;
    TextView Item_Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);


        Backbut = findViewById(R.id.button);
        Backbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(Table.this, crafting.class));
            }

    });



    }
}



