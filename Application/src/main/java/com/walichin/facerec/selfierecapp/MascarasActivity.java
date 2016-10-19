package com.walichin.facerec.selfierecapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by walteralejosgongora on 4/7/16.
 */
public class MascarasActivity extends Activity implements AdapterView.OnItemClickListener {

    private GridView imageGrid;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascaras_grid_view);

        imageGrid = (GridView) findViewById(R.id.gridview_mascaras);
        imageGrid.setAdapter(new ImageAdapter(MascarasActivity.this, SharedData.Mascaras_bitmapList));

        // Activate the Click even of the items
        imageGrid.setOnItemClickListener(MascarasActivity.this);

    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        // arg2 = the id of the item in our view (List/Grid) that we clicked
        // arg3 = the id of the item that we have clicked

        //Toast.makeText(getApplicationContext(), "You clicked on position : " + arg2 + " and id : " + arg3, Toast.LENGTH_LONG).show();

        SharedData.imageClicked = arg2;
        final Intent i = new Intent(MascarasActivity.this, ImageDetailActivity.class);
        startActivity(i);

    }
}
