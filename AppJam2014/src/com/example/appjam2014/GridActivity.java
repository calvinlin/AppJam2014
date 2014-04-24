package com.example.appjam2014;

import java.io.Serializable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import android.app.Activity;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;

public class GridActivity extends Activity implements OnClickListener, Serializable{

	GridView gv;
	Sentence sentence = new Sentence();
	Data d;
	boolean selected = false;
	String info = "info";
	int category = 0;
	int variation = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid);

		Intent i = getIntent();
		category = (Integer) i.getSerializableExtra("category");
		variation = (Integer) i.getSerializableExtra("variation");
		Toast t = 
		
		
		TextView sent = (TextView)findViewById(R.id.CurrentSentence);
		TextView instruction = (TextView)findViewById(R.id.GridInstructions);

		sentence.sendSentence(Data.WANT01.getFragments());
		sent.setText(sentence.getString());
		instruction.setText("Pick a word:");
		
		Button next = (Button)findViewById(R.id.NextButton);
		next.setOnClickListener(this);
		
//		String[] s = d.getAll("something");
//
//		gv = (GridView) findViewById(R.id.gridView1);
//
//		gv.setAdapter(new ImageAdapter(this, s));
//
//		gv.setOnItemClickListener(new OnItemClickListener() 
//		{
//			public void onItemClick(AdapterView<?> parent, View v,
//					int position, long id) {
//				TextView text = (TextView) v.findViewById(R.id.grid_item_label);
//				sentence.setBlank(text.getText().toString());
//				//Data.setItem((TextView) v.findViewById(R.id.grid_item_label)).getText();
//				Toast.makeText(
//						getApplicationContext(),
//						((TextView) v.findViewById(R.id.grid_item_label))
//						.getText(), Toast.LENGTH_SHORT).show();
//				selected = true;
//			}
//		});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Sentence s;
		
		if((v.getId() == R.id.NextButton) && (selected == true))
		{
			Intent i = new Intent(this, EndActivity.class);
			startActivity(i);
		}
	}
	
	public String getInfo(int category, int variation)
	{
		String stuff = "";
		
		switch(category)
		{
		case 1:	//question
			switch(variation)
			{
			case 1: 
			case 2:
			case 3:
			case 4:
			}
			break;
		case 2:	//want
			switch(variation)
			{
			case 1:
			case 2:
			case 3:
			}
			break;
		case 3:	//statement
			switch(variation)
			{
			case 1:
			case 2:
			}
			break;
		case 4:	//emergency
			switch(variation)
			{
			case 1:
			}
			break;
		}
		
		return stuff;
	}
}
