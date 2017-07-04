/*
package com.example.prasannakumara.materialdesign.colorpicker;

import com.example.colorpicker2.ColorPickerDialog.OnColorChangedListener;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
public class MainActivity extends Activity {
private RelativeLayout layout; 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main); 
Button btn=(Button) findViewById(R.id.btnforclo1); 
layout=(RelativeLayout) findViewById(R.id.l1); 
btn.setOnClickListener(new OnClickListener() { 
@Override 
public void onClick(View v) { 
ColorPickerDialog cpd=new ColorPickerDialog(MainActivity.this, listener, 0); 
cpd.show(); 
} 
}); 
} 
@Override 
protected void onResume() { 
super.onResume(); 
layout.setBackgroundColor(ColorAh); 
} 
OnColorChangedListener listener=new OnColorChangedListener() { 
@Override 
public void colorChanged(int color) { 
Toast.makeText(MainActivity.this, &quot;&quot;+color, Toast.LENGTH_LONG).show(); 
ColorAh=color; 
layout.setBackgroundColor(ColorAh); 
} 
}; 
private int ColorAh=Color.BLACK; 
}*/
