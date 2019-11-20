package com.example.uts_pemogramanmobile_i;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MiniQuest extends Activity{
	
	CheckBox check1,check2,check3,check4;
	Button B1,B2;
	TextView Text2, Text4;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_mini);
	        
	        check1 = (CheckBox) findViewById(R.id.cbox1);
	        check2 = (CheckBox) findViewById(R.id.cbox2);
	        check3 = (CheckBox) findViewById(R.id.cbox3);
	        check4 = (CheckBox) findViewById(R.id.cbox4);
	        B1 = (Button) findViewById(R.id.Button1);
	        B2 = (Button) findViewById(R.id.button2);
	        Text2 = (TextView) findViewById(R.id.Text2);
	        Text4 = (TextView) findViewById(R.id.Text4);
	        
	        
	        B1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					if(!check1.isChecked() && !check2.isChecked())
					{
						Toast.makeText(getApplicationContext(), "pilih salah satu jawaban  ", Toast.LENGTH_LONG).show();
					}else{
						String a = "";
						if (check1.isChecked()){
							a += "Selamat anda benar";
							
						}
						String b = "";
						if(check2.isChecked()){
							b += "Anda salah";
						}
						
						Text2.setText("anda memilih:\n" + a + "" + b + "");
					}
				}
			});
	        
	        B2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					if(!check3.isChecked() && !check4.isChecked())
					{
						Toast.makeText(getApplicationContext(), "pilih salah satu jawaban  ", Toast.LENGTH_LONG).show();
					}else{
						String c = "";
						if (check3.isChecked()){
							c += "selamat anda benar";
							
						}
						String d = "";
						if(check4.isChecked()){
							d += "Anda Buta memilih tidak";
						}
						
						Text4.setText("anda memilih:\n" + c + "" + d + "");
				}
			}
	        
	    });


	 }
}