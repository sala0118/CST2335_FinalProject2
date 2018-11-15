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

public class SearchedList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searched_list);

        Button saveToFavourite = (Button)findViewById(R.id.saveToFavourite);

        saveToFavourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchedList.this, FavouriteFoodList.class);
                startActivity(intent);


                AlertDialog.Builder builder = new AlertDialog.Builder(SearchedList.this);

                //Chain together various setter methods to set the dialog characteristics

                builder.setMessage(R.string.save_message) //Add a dialog message to strings.xml

                        .setTitle(R.string.save_title)

                        .setPositiveButton(R.string.Yes, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {

                                Intent intent = new Intent(SearchedList.this, MainFoodActivity.class);
                                startActivity(intent);

                                finish();

                            }

                        })

                        .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {

                                // User cancelled the dialog

                            }

                        })

                        .show();
            }
        });

    }


}
