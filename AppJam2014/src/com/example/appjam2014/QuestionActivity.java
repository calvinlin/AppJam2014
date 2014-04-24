package com.example.appjam2014;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class QuestionActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question);

		Data data;

		Button a = (Button)findViewById(R.id.LocationButton);
		Button b = (Button)findViewById(R.id.InformationButton);
		Button c = (Button)findViewById(R.id.PersonButton);
		Button d = (Button)findViewById(R.id.TimeButton);
		TextView instruction = (TextView)findViewById(R.id.Instruction);

		a.setOnClickListener(this);
		b.setOnClickListener(this);
		c.setOnClickListener(this);
		d.setOnClickListener(this);
		
		instruction.setText("Pick a type:");

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		Intent i;
		switch(v.getId())
		{
		case R.id.LocationButton:
			i = new Intent(this, GridActivity.class);
			i.putExtra("category", 1);
			i.putExtra("variation", 1);
			startActivity(i);
			break;
		case R.id.InformationButton:
			i = new Intent(this, GridActivity.class);
			i.putExtra("category", 1);
			i.putExtra("variation", 2);
			startActivity(i);
			break;
		case R.id.PersonButton:
			i = new Intent(this, GridActivity.class);
			i.putExtra("category", 1);
			i.putExtra("variation", 3);
			startActivity(i);
			break;
		case R.id.TimeButton:
			i = new Intent(this, GridActivity.class);
			i.putExtra("category", 1);
			i.putExtra("variation", 4);
			startActivity(i);
			break;
		}
	}

}
