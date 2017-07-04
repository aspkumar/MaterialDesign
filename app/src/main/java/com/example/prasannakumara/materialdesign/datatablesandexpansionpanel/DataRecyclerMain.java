package com.example.prasannakumara.materialdesign.datatablesandexpansionpanel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.prasannakumara.materialdesign.R;

import java.util.ArrayList;

/**
 * Created by PrasannakumarA on 6/27/2017.
 */

public class DataRecyclerMain extends AppCompatActivity {
    ArrayList<employeesDetailPOJO> employeeDat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_recyclerview);
        employeeDat = new ArrayList<>();
        employeeDat.add(new employeesDetailPOJO("sdfasfd", 2134));
        employeeDat.add(new employeesDetailPOJO("sadsdfasfd", 21234));
        employeeDat.add(new employeesDetailPOJO("assdfasfd", 23134));
        employeeDat.add(new employeesDetailPOJO("csdfasfd", 21534));
        employeeDat.add(new employeesDetailPOJO("fgsdfasfd", 26134));
        employeeDat.add(new employeesDetailPOJO("tyusdfasfd", 27134));
        employeeDat.add(new employeesDetailPOJO("jmkhjsdfasfd", 28134));
        employeeDat.add(new employeesDetailPOJO("ghjsdfasfd", 21934));
        employeeDat.add(new employeesDetailPOJO("hjsdfasfd", 21134));
        employeeDat.add(new employeesDetailPOJO("tyusdfasfd", 132134));
        employeeDat.add(new employeesDetailPOJO("serwydfasfd", 342134));
        employeeDat.add(new employeesDetailPOJO("nmsdfasfd", 22134));
        employeeDat.add(new employeesDetailPOJO("iosdfasfd", 452134));
        employeeDat.add(new employeesDetailPOJO("piosdfasfd", 682134));
        employeeDat.add(new employeesDetailPOJO("sdfsdfasfd", 9892134));

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.data_RV);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(employeeDat);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(recyclerAdapter);

    }
}

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    public RecyclerAdapter(ArrayList<employeesDetailPOJO> employDetails) {
        this.employDetails = employDetails;
    }

    ArrayList<employeesDetailPOJO> employDetails;


    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data_recyclerview, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.MyViewHolder holder, int position) {
        holder.empname.setText(employDetails.get(position).getName());
        holder.empid.setText(String.valueOf(employDetails.get(position).getId()));
    }

    @Override
    public int getItemCount() {
        return employDetails.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView empname, empid;

        public MyViewHolder(View itemView) {
            super(itemView);
            empname = (TextView) itemView.findViewById(R.id.emp_name_data);
            empid = (TextView) itemView.findViewById(R.id.emp_id_TV_data);
        }
    }
}
