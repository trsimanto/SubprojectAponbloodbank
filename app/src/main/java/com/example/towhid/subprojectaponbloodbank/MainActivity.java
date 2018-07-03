package com.example.towhid.subprojectaponbloodbank;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private GridViewAdapter gridViewAdapter;
    private List<BloodBank> bloodBanksList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById(R.id.gridview_blood_bank);
        getBloodBankList();//get list of BloodBank
        setAdapters();

    }

    private void setAdapters() {
        gridViewAdapter =new GridViewAdapter(this,R.layout.item_grid_blood_bank,bloodBanksList);
        gridView.setAdapter(gridViewAdapter);
    }

    private List<BloodBank> getBloodBankList() {
        final String[] colors = getResources().getStringArray(R.array.blood_card_color);
        bloodBanksList=new ArrayList<>();
        for (int i=0;i<40;i++)
        bloodBanksList.add(new BloodBank(Color.parseColor(colors[i]),"Islimia Hospital","12345678900","Notun Bajar Dhaka"));



        return bloodBanksList;
    };
}
