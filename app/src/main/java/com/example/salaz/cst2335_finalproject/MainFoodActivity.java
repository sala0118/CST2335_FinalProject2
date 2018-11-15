package com.example.salaz.cst2335_finalproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainFoodActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_food);    //?????

        Button searchButton = (Button)findViewById(R.id.searchButton);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainFoodActivity.this, SearchedList.class);
                startActivity(intent);

                Snackbar.make(v, "Searching...", Snackbar.LENGTH_SHORT).show();

            }
        });
    }

    public void add(View view){

    }
}
