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

public class FavouriteFoodList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_food_list);

        Button delete = (Button)findViewById(R.id.deleteFromFavourite);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                toastMessage("Sure to delete? ");
                Snackbar.make(v, "Deleting...", Snackbar.LENGTH_SHORT).show();

            }
        });
    }

    private void toastMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }

}
