package com.example.prasannakumara.materialdesign;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.prasannakumara.materialdesign.bottomnavigationview.BottmNav;
import com.example.prasannakumara.materialdesign.bottomsheet.BottonSheetMain;
import com.example.prasannakumara.materialdesign.buttons.ButtonsMain;
import com.example.prasannakumara.materialdesign.cardViewwithRecyclerView.CardViewMain;
import com.example.prasannakumara.materialdesign.chipset.DeleteChipActivity;
import com.example.prasannakumara.materialdesign.customdialogcolorpallette.CustomDialog;
import com.example.prasannakumara.materialdesign.datatablesandexpansionpanel.DataRecyclerMain;
import com.example.prasannakumara.materialdesign.fluid2d.*;
import com.example.prasannakumara.materialdesign.fluid2d.MainActivity;
import com.example.prasannakumara.materialdesign.realmdatabase.LoginActiviy;
import com.example.prasannakumara.materialdesign.ripppleeffect.RippleMain;
import com.example.prasannakumara.materialdesign.steppers.SteppersMain;
import com.example.prasannakumara.materialdesign.tooltip.TooltipMain;

import java.util.ArrayList;

/**
 * Created by PrasannakumarA on 5/10/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHoldre> {


    private Activity activity;
    private Context context;
    private ArrayList<ComponetsNameModel> inputstring;

    public RecyclerViewAdapter(Context context, ArrayList<ComponetsNameModel> inputstring) {
        this.context = context;
        this.inputstring = inputstring;
    }


    @Override
    public MyViewHoldre onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_recyclerlist_view, parent, false);
        return new MyViewHoldre(view);
    }

    @Override
    public void onBindViewHolder(MyViewHoldre holder, final int position) {
        holder.componetName.setText(inputstring.get(position).displayName);

        final String val = inputstring.get(position).clickName;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            Intent intent = null;

            @Override
            public void onClick(View v) {
//
//        try {
//           intent =new Intent(context, Class.forName(val));
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
                if (position == 0) {
                    Intent intent = new Intent(context, BottonSheetMain.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(context, DeleteChipActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }
                if (position == 2) {
                    Intent tooltipIntent = new Intent(context, TooltipMain.class);
                    tooltipIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(tooltipIntent);
                }
                if (position == 3) {
                    Intent rippleIntent = new Intent(context, RippleMain.class);
                    rippleIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(rippleIntent);
                }
                if (position == 4) {
                    Intent botomIntent = new Intent(context, BottmNav.class);
                    botomIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(botomIntent);
                }
                if (position == 5) {
                    Intent stepperIntent = new Intent(context, SteppersMain.class);
                    stepperIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(stepperIntent);
                }
                if (position == 6) {
                    Intent stepperAPIIntent = new Intent(context, com.example.prasannakumara.materialdesign.paginationusingRV.MainActivity.class);
                    stepperAPIIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(stepperAPIIntent);
                }
                if (position == 7) {
                    Intent bottomsheetIntent = new Intent(context, BottmNav.class);
                    bottomsheetIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(bottomsheetIntent);
                }
                if (position == 8) {
                    Intent buttonIntent = new Intent(context, ButtonsMain.class);
                    buttonIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(buttonIntent);
                }
                if (position == 9) {
                    Intent cardIntent = new Intent(context, CardViewMain.class);
                    cardIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(cardIntent);
                }
                if (position == 10)
                {
                    Intent dataintent=new Intent(context, DataRecyclerMain.class);
                    dataintent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(dataintent);
                }
                if(position==11)
                {
                    Intent dialogsIntent=new Intent(context, CustomDialog.class);
                    dialogsIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(dialogsIntent);
                }
                if(position==12)
                {
                    Intent realmIntent=new Intent(context, LoginActiviy.class);
                    realmIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(realmIntent);
                }
                if(position==13)
                {
                    Intent fluidIntent=new Intent(context,MainActivity.class);
                    fluidIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(fluidIntent);
                }

            }
        });

    }



    @Override
    public int getItemCount() {
        return inputstring.size();
    }

    public class MyViewHoldre extends RecyclerView.ViewHolder {
        TextView componetName;

        public MyViewHoldre(View itemView) {
            super(itemView);
            componetName = (TextView) itemView.findViewById(R.id.component_name);

        }
    }
}
