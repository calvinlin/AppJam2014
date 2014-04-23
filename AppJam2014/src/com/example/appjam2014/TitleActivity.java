package com.example.appjam2014;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TitleActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_title);

		
		//sets up buttons
		Button question = (Button)findViewById(R.id.QuestionButton);
		Button want = (Button)findViewById(R.id.WantButton);
		Button statement = (Button)findViewById(R.id.StatementButton);
		Button emergency = (Button)findViewById(R.id.EmergencyButton);
		
		//waits for click
		question.setOnClickListener(this);
		want.setOnClickListener(this);
		statement.setOnClickListener(this);
		emergency.setOnClickListener(this);
	}
	


	@Override
	public void onClick(View v) 
	{
		Intent i;
		
		switch(v.getId())
		{
		case R.id.QuestionButton:
//			i = new Intent(this, QuestionActivity.class);
			i = new Intent(this, GridActivity.class);
			startActivity(i);
			break;
		case R.id.WantButton:
//			i = new Intent(this, WantActivity.class);
//			startActivity(i);
//			break;
		case R.id.StatementButton:
//			i = new Intent(this, StatementActivity.class);
//			startActivity(i);
//			break;
		case R.id.EmergencyButton:
//			i = new Intent(this, EmergencyActivity.class);
//			startActivity(i);
//			break;
			i = new Intent(this, EndActivity.class);
			startActivity(i);
			break;
		}
		
	}
}
