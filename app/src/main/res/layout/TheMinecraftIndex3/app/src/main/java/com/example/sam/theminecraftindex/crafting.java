package com.example.sam.theminecraftindex;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class crafting extends AppCompatActivity {


    public Button crafting_table_window;
    public Button Home_Button_window;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crafting);



        crafting_table_window = findViewById(R.id.nextwindow);
        crafting_table_window.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(crafting.this, Table.class));
            }
        });








    }
}
