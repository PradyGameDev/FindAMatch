package com.pradyumnashome.findamatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PlacesFeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_feed);
    }

    //Open a dialog/activity that allows a user to create a new sports area.
    public void onAddPlaceButtonClick(View v) {
        Intent addNewPlaceDialogIntent = new Intent(this, AddNewPlaceActivity.class);
        startActivity(addNewPlaceDialogIntent);
    }
}
