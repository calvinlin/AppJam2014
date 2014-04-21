package com.example.appjam2014;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.os.Build;

public class EndActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_end);

		Button say = (Button)findViewById(R.id.SayButton);
		Button again = (Button)findViewById(R.id.AgainButton);
		
		say.setOnClickListener(this);
		again.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) 
	{
		Intent i;
		
		switch(v.getId())
		{
		case R.id.SayButton:
//			i = new Intent(this, QuestionActivity.class);
//			startActivity(i);
//			break;
		case R.id.AgainButton:
//			i = new Intent(this, WantActivity.class);
//			startActivity(i);
//			break;
			break;
		}


}
