package com.example.magiclearning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Second extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		Button button1=(Button)findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent1 = new
				Intent(Second.this,Fift.class);
				startActivity(intent1);
				
			}
		});
       
		Button button2=(Button)findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent2 = new
				Intent(Second.this,Six.class);
				startActivity(intent2);
				
			}
		});
		

		Button button3=(Button)findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent3 = new
				Intent(Second.this,Seven.class);
				startActivity(intent3);
				
			}
		});
		
		Button button4=(Button)findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent4 = new
				Intent(Second.this,Eight.class);
				startActivity(intent4);
				
			}
		});
		
		Button button5=(Button)findViewById(R.id.button5);
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent5 = new
				Intent(Second.this,Nine.class);
				startActivity(intent5);
				
			}
		});
	}
	
}
