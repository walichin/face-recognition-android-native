package com.walichin.facerec.selfierecapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.ImageView;

public class ImageDetailActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_detail);

        ImageView imageView = (ImageView) findViewById(R.id.imageViewDetail);

        if (Camera2BasicFragment.mGender.equals("Male")) {
            imageView.setImageBitmap(SharedData.Razors_bitmapList.get(SharedData.imageClicked));
        } else if (Camera2BasicFragment.mGender.equals("Female")) {
            imageView.setImageBitmap(SharedData.Mascaras_bitmapList.get(SharedData.imageClicked));
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//        return true;
//    }

}
