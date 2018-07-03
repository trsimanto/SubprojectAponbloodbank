package com.example.towhid.subprojectaponbloodbank;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class GridViewAdapter extends ArrayAdapter <BloodBank>{
    public GridViewAdapter(Context context, int resource, List<BloodBank> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
        if (null==view){
            LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.item_grid_blood_bank,null);
        }
        BloodBank bloodBank=getItem(position);
        RelativeLayout relativeLayout=(RelativeLayout)view.findViewById(R.id.blood_bank_card_color_id);
        TextView bloodBankName=(TextView)view.findViewById(R.id.blood_bank_name);
        TextView bloodBankPhoneNumber=(TextView)view.findViewById(R.id.blood_bank_number);
        TextView bloodBankAddress=(TextView)view.findViewById(R.id.blood_bank_address);



        bloodBankName.setText(bloodBank.getBloodBankName());
        bloodBankPhoneNumber.setText(bloodBank.getBloodBankPhoneNumber());
        bloodBankAddress.setText(bloodBank.getBloodBankAdress());
        relativeLayout.setBackgroundColor(bloodBank.getColor());


        return view;

    }
}
