package com.example.prasannakumara.materialdesign.customdialogcolorpallette;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.prasannakumara.materialdesign.R;


public class CustomDialog extends Activity {
 
    private Button buttonClick;
 
    public void onCreate(Bundle savedInstanceState) {
 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog_main);
 
        buttonClick = (Button) findViewById(R.id.buttonClick);
//        ImageView img1= (ImageView) findViewById(R.id.sample_IMG);
        ColorFilter filter = new LightingColorFilter( Color.BLACK, Color.BLACK);
//        img1.setColorFilter(filter);
        // add listener to button 
        buttonClick.setOnClickListener(new OnClickListener() {
 
            @Override
            public void onClick(View arg0) {

                // Create custom dialog object
                final Dialog dialog = new Dialog(CustomDialog.this);
                // Include dialog.xml file
                dialog.setContentView(R.layout.dialog);

//                Toast.makeText(getApplicationContext(), String.valueOf(size),Toast.LENGTH_SHORT).show();

                // Set dialog title
                dialog.setTitle("Custom Dialog");
 
             /*   // set values for custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.textDialog);
                text.setText("Custom dialog Android example.");
                ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
                image.setImageResource(R.mipmap.ic_launcher);
 */
                dialog.show();
                 
//                Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                // if decline button is clicked, close the custom dialog
            /*    declineButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Close dialog
                        dialog.dismiss();
                    }
                });
 */
                 
            }
 
        });
 
    }
 
}
