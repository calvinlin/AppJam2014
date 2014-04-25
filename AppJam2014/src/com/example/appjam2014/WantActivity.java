package com.example.appjam2014;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class WantActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_want);
		
		Button a = (Button)findViewById(R.id.INeedSomethingButton);
		Button b = (Button)findViewById(R.id.IWantToEatButton);
		Button c = (Button)findViewById(R.id.IWantToDoButton);

		a.setOnClickListener(this);
		b.setOnClickListener(this);
		c.setOnClickListener(this);
				
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i;
		switch(v.getId())
		{
		case R.id.INeedSomethingButton:
			i = new Intent(this, GridActivity.class);
			i.putExtra("category", 2);
			i.putExtra("variation", 1);
			startActivity(i);
			break;
		case R.id.IWantToEatButton:
			i = new Intent(this, GridActivity.class);
			i.putExtra("category", 2);
			i.putExtra("variation", 2);
			startActivity(i);
			break;
		case R.id.IWantToDoButton:
			i = new Intent(this, GridActivity.class);
			i.putExtra("category", 2);
			i.putExtra("variation", 3);
			startActivity(i);
			break;
		}
	}


}
