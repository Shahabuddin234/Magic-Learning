package com.example.magiclearning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button2=(Button)findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent1 = new
				Intent(MainActivity.this,Second.class);
				startActivity(intent1);
				
			}
		});
       
		Button button3=(Button)findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent2 = new
				Intent(MainActivity.this,Third.class);
				startActivity(intent2);
				
			}
		});
		

		Button button4=(Button)findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent4 = new
				Intent(MainActivity.this,Fourth.class);
				startActivity(intent4);
				
			}
		});
	}

	
}
