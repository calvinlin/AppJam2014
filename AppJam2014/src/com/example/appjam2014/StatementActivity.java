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
import android.widget.TextView;
import android.os.Build;

public class StatementActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_statement);

		Button a = (Button)findViewById(R.id.FeelingButton);
		Button b = (Button)findViewById(R.id.CommentButton);
		TextView instruction = (TextView)findViewById(R.id.Instruction);

		a.setOnClickListener(this);
		b.setOnClickListener(this);
		instruction.setText("Pick a type:");
				
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i;
		switch(v.getId())
		{
		case R.id.FeelingButton:
			i = new Intent(this, GridActivity.class);
			i.putExtra("category", 3);
			i.putExtra("variation", 1);
			startActivity(i);
			break;
		case R.id.CommentButton:
			i = new Intent(this, GridActivity.class);
			i.putExtra("category", 3);
			i.putExtra("variation", 2);
			startActivity(i);
			break;
		}
	}


}
