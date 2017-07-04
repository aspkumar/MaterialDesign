package com.example.prasannakumara.materialdesign.buttons;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.prasannakumara.materialdesign.R;

/**
 * Created by PrasannakumarA on 6/27/2017.
 */

public class ButtonsMain extends AppCompatActivity {

    FloatingActionButton fabButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

       fabButton=(FloatingActionButton) findViewById(R.id.fab_button);
        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Floating Action Button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
