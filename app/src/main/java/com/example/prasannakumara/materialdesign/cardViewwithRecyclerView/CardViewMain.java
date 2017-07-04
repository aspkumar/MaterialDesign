package com.example.prasannakumara.materialdesign.cardViewwithRecyclerView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.prasannakumara.materialdesign.R;

import java.util.ArrayList;

/**
 * Created by PrasannakumarA on 6/27/2017.
 */

public class CardViewMain extends AppCompatActivity{

    ArrayList<String> itemNames;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityrecyclermain);

        itemNames =new ArrayList<>();
        for (int i=0;i<10;i++)
        {
            itemNames.add(String.valueOf(i));
        }




    }
}
