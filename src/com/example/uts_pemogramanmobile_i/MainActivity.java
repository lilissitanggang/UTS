package com.example.uts_pemogramanmobile_i;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button TombolProfil, TombolMiniQuest, TombolMath, TombolExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TombolProfil = (Button) findViewById(R.id.profile);
        TombolMiniQuest = (Button) findViewById(R.id.MiniQuest);
        TombolMath = (Button) findViewById(R.id.Math);
        TombolExit = (Button) findViewById(R.id.exit);
        
        
        TombolProfil.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (MainActivity.this,Profileku.class);
				startActivity(intent);
			}
		});
        
        
        TombolMiniQuest.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent intent2 = new Intent (MainActivity.this,MiniQuest.class);
				startActivity(intent2);
			}
		});
        
        TombolMath.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent3 = new Intent (MainActivity.this,MathQuest.class);
				startActivity(intent3);
			}
		});
        
        TombolExit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
    }
}

