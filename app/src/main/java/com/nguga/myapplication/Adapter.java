package com.nguga.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;

import java.util.List;

public class Adapter extends AbstractItem<Adapter,Adapter.ViewHolder> {

    public Adapter() {
    }

    @NonNull
    @Override
    public ViewHolder getViewHolder(View v) {
        return  new ViewHolder(v);
    }

    @Override
    public int getType() {
        return R.id.rv_item;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_apliaksi;
    }

    public class ViewHolder extends FastAdapter.ViewHolder<Adapter> {
        EditText etnama,etharga,etumur,etjumlah;
        TextView etRbarang,ethargajl;
        RadioGroup rgtipe;
        RadioButton rbA,rbB,rbC;
        Button tmbl;

        public ViewHolder(View itemView) {
            super(itemView);
            etnama =itemView.findViewById(R.id.nama);
            etharga = itemView.findViewById(R.id.harga);
            etumur = itemView.findViewById(R.id.umur);
            etjumlah = itemView.findViewById(R.id.jumlah);
            etRbarang = itemView.findViewById(R.id.nbarang);
            ethargajl = itemView.findViewById(R.id.Hjual);
            rgtipe = itemView.findViewById(R.id.rg);
            rbA =itemView.findViewById(R.id.rba);
            rbB =itemView.findViewById(R.id.rbb);
            rbC =itemView.findViewById(R.id.rbc);
            tmbl = itemView.findViewById(R.id.button);

            tmbl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int a,b,c;
                    etRbarang.setText(etnama.getText().toString());
                    if(Integer.parseInt(etumur.getText().toString()) > 50){
                        a = Integer.parseInt(etharga.getText().toString()) * 10/100;
                    }else {
                        a = Integer.parseInt(etharga.getText().toString());
                    }

                    if(Integer.parseInt(etjumlah.getText().toString()) >10 ){
                        b = Integer.parseInt(etharga.getText().toString()) * 5/100;
                    }else {
                        b = Integer.parseInt(etharga.getText().toString());
                    }

                    if(rbA.isChecked()){
                        c = Integer.parseInt(etharga.getText().toString()) * 20/100;
                    }else if (rbB.isChecked()){
                        c =Integer.parseInt(etharga.getText().toString()) * 10/100;
                    }else{
                       c= Integer.parseInt(etharga.getText().toString()) * 5/100;
                    }

                    ethargajl.setText(String.valueOf(a+b+c));
                }
            });
        }

        @Override
        public void bindView(Adapter item, List<Object> payloads) {

        }

        @Override
        public void unbindView(Adapter item) {

        }
    }
}
