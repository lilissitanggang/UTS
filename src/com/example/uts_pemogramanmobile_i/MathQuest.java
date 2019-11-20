package com.example.uts_pemogramanmobile_i;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MathQuest extends Activity {
	
	Button tombolarit, tombolbangundatar, tombolbarisderet;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_question);

        tombolarit = (Button) findViewById(R.id.aritmetika);
        tombolbangundatar = (Button) findViewById(R.id.bangundatar);
        tombolbarisderet = (Button) findViewById(R.id.barisderet);
        
        tombolarit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (MathQuest.this,Aritmatika.class);
				startActivity(intent);
			}
		});
    
        tombolbangundatar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Bukan jatahku..", Toast.LENGTH_LONG).show();
			}
		});
        
        tombolbarisderet.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Bukan jatah aku", Toast.LENGTH_LONG).show();
			}
		});
}
	
}
