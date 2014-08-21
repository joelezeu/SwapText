package com.swap.text;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	EditText swap, clear;
	Button bswap, bclear;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bswap = (Button)findViewById(R.id.button1);
		bclear = (Button)findViewById(R.id.button2);
		
		swap = (EditText)findViewById(R.id.eTSwap);
		clear = (EditText)findViewById(R.id.eTClear);
		
		bswap.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Intent i = new Intent();
				String st = swap.getText().toString();
				String st2 = clear.getText().toString();
//				swap.setText(st2);
//				clear.setText(st);
				if(st.equalsIgnoreCase("") && st2.equalsIgnoreCase("")){
					Toast.makeText(getApplicationContext(), "Input a text", Toast.LENGTH_LONG).show();
				}else if(!(st.equalsIgnoreCase("")) && !(st2.equalsIgnoreCase(""))){
					
					Toast.makeText(getApplicationContext(), "Text have been swap from Clear to Swap", Toast.LENGTH_LONG).show();
				}else if(!(st.equalsIgnoreCase("")) && (st2.equalsIgnoreCase(""))){
					Toast.makeText(getApplicationContext(), "Text have been swaped from Swap to Clear", Toast.LENGTH_LONG).show();
					clear.setText(st);
				}else if(st.equalsIgnoreCase("") && !(st2.equalsIgnoreCase(""))){
					swap.setText(st2);
				}
					
//				 switch(v.getId()){  
//			        case R.id.button1:  
//			            if(bswap.isPressed()){  
//			            	Toast.makeText(getApplicationContext(), "Your Boxes have been swaped", Toast.LENGTH_LONG).show();  
//			            }else {
//			            	Toast.makeText(getApplicationContext(), "Didn't make the toast", Toast.LENGTH_LONG).show();
//			            	bswap.setText("");
//			            }
//			            break; 
//				 }
			}
		});
		
		bclear.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//EditText et =(EditText) findViewById(R.id.button2);
				clear.setText("");
				swap.setText("");
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
