package com.walichin.facerec.selfierecapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;

import java.util.ArrayList;

/**
 * Created by walteralejosgongora on 4/7/16.
 */
public class SharedData {

    public static Handler handler;
    public static ProgressDialog progress;

    public static ArrayList<Bitmap> Mascaras_bitmapList;
    public static ArrayList<Bitmap> Razors_bitmapList;
    public static int imageClicked;

    public static void MensajeProcInfo(Context context) {

        SharedData.progress = new ProgressDialog(context);
        SharedData.progress.setTitle("Detection in progress");
        SharedData.progress.setMessage("Please wait a moment...");
        SharedData.progress.setCancelable(false);
        SharedData.progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        SharedData.progress.show();
    }

}
