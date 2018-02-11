package com.example.fajri.movieactivity.activity;

/**
 * Created by fajri on 1/20/18.
 */
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;

import com.example.fajri.movieactivity.R;

//import com.example.andre.project.R;

public class AlertDialogManager {
    public void showAlertDialog(Context context, String title, String message,
                                Boolean status) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        if(status != null)
          alertDialog.setIcon((status) ? R.mipmap.ic_action_bell : R.mipmap.ic_action_bell);
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alertDialog.show();
    }
}
