package com.walichin.facerec.selfierecapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.net.URL;
import java.util.ArrayList;

public class CameraActivity extends Activity {

    public Activity cameraActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        SharedData.handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                SharedData.progress.dismiss();
                super.handleMessage(msg);
            }
        };

        SharedData.Razors_bitmapList = new ArrayList<Bitmap>();
        SharedData.Mascaras_bitmapList = new ArrayList<Bitmap>();

        try {
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_01.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_02.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_03.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_04.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_05.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_06.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_07.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_08.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_09.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_10.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_11.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_12.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_13.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_14.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_15.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_16.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_17.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_18.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_19.jpeg");
            new Download_Razors().execute("http://walichin.a2hosted.com/walichin/RAZORS/razor_20.jpeg");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_01.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_02.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_03.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_04.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_05.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_06.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_07.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_08.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_09.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_10.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_11.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_12.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_13.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_14.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_15.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_16.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_17.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_18.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_19.jpeg");
            new Download_Mascaras().execute("http://walichin.a2hosted.com/walichin/MASCARAS/mascara_20.jpeg");
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();
        }
    }

    private class Download_Razors extends AsyncTask<String, Void, Bitmap> {
        protected Bitmap doInBackground(String... urls) {
            try {
                Bitmap result = null;
                URL url = new URL(urls[0]);
                if(url != null) {
                    result = BitmapFactory.decodeStream(url.openConnection().getInputStream());
                }
                return result;
            } catch (Exception exception){
                Log.e("Download_Razors: ", exception.toString());
                return null;
            }
        }

        protected void onPostExecute(Bitmap result) {
            SharedData.Razors_bitmapList.add(result);
        }
    }

    private class Download_Mascaras extends AsyncTask<String, Void, Bitmap> {
        protected Bitmap doInBackground(String... urls) {
            try {
                Bitmap result = null;
                URL url = new URL(urls[0]);
                if(url != null) {
                    result = BitmapFactory.decodeStream(url.openConnection().getInputStream());
                }
                return result;
            } catch (Exception exception){
                Log.e("Download_Mascaras: ", exception.toString());
                return null;
            }
        }

        protected void onPostExecute(Bitmap result) {
            SharedData.Mascaras_bitmapList.add(result);
        }
    }

}
