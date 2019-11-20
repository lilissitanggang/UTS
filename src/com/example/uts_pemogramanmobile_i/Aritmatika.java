package com.example.uts_pemogramanmobile_i;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Aritmatika extends Activity {
	
	 EditText input1,input2;
	    TextView output;
	    Double v1,v2,hasil;
	    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aritmatika);
        input1 = (EditText) findViewById(R.id.inputpertama);
        input2 = (EditText) findViewById(R.id.inputkedua);
        output = (TextView) findViewById(R.id.hasil);
    }
 
    public void konver(){
        //konversi inputan ke double
        v1 = Double.parseDouble(input1.getText().toString());
        v2 = Double.parseDouble(input2.getText().toString());
    }
 
    public void prosestambah(View view) {
        konver();
        hasil = v1+v2;  //perhitungan
        output.setText(Double.toString(hasil));  //output
    }
 
    public void proseskurang(View view) {
        konver();
        hasil = v1-v2;  //perhitungan
        output.setText(Double.toString(hasil));  //output
    }
 
    public void proseskali(View view) {
        konver();
        hasil = v1*v2;  //perhitungan
        output.setText(Double.toString(hasil));  //output
    }
    public void prosesbagi(View view) {
        konver();
        hasil = v1/v2;  //perhitungan
        output.setText(Double.toString(hasil));  //output
    }
}
    