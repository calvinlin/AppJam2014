package com.example.appjam2014;

import java.io.Serializable;

import com.example.appjam2014.Data.Q01;

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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GridView gv;
	Sentence sentence = new Sentence();
	Data d;
	boolean selected = false;
	String info = "info";
	int category = 0;
	int variation = 0;
	String variationName = "";
	String[] s;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid);

		Intent i = getIntent();
		category = (Integer) i.getSerializableExtra("category");
		variation = (Integer) i.getSerializableExtra("variation");
		Toast.makeText(getApplicationContext(), Integer.toString(category)+Integer.toString(variation), 
				Toast.LENGTH_LONG).show();


		TextView sent = (TextView)findViewById(R.id.CurrentSentence);
		TextView instruction = (TextView)findViewById(R.id.GridInstructions);

		getInfo(category, variation);
		sent.setText(sentence.getString());
		instruction.setText("Pick a word:");

		Button next = (Button)findViewById(R.id.NextButton);
		next.setOnClickListener(this);

		//String[] s = Data.getAll("something");

		gv = (GridView) findViewById(R.id.gridView1);

		gv.setAdapter(new ImageAdapter(this, s));

		gv.setOnItemClickListener(new OnItemClickListener() 
		{
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				TextView text = (TextView) v.findViewById(R.id.grid_item_label);

				sentence.setBlank(text.getText().toString());

				Toast.makeText(
						getApplicationContext(),
						((TextView) v.findViewById(R.id.grid_item_label))
						.getText(), Toast.LENGTH_SHORT).show();
				selected = true;
			}
		});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		Sentence s;

		if((v.getId() == R.id.NextButton) && (selected == true))
		{
			Intent i = new Intent(this, EndActivity.class);
			i.putExtra("finalSentence", sentence.getString());
			startActivity(i);
		}
	}

	public String getInfo(int category, int variation)
	{
		String stuff = "";

		// for each variation, the sentence object was updated with the starter 
		// fragment info using sendSentence().
		switch(category)
		{
		case 1:	//question
			switch(variation)
			{
			case 1: 
				sentence.sendSentence(Data.Q01.getFragments());
				s = Data.Q01.getAvailableWords();
				break;
			case 2:
				sentence.sendSentence(Data.Q02.getFragments());
				s = Data.Q02.getAvailableWords();
				break;
			case 3: 
				sentence.sendSentence(Data.Q03.getFragments()); 
				s = Data.Q03.getAvailableWords();
				break;
			case 4: 
				sentence.sendSentence(Data.Q04.getFragments()); 
				s = Data.Q04.getAvailableWords();
				break;
			}
			break;
		case 2:	//want
			switch(variation)
			{
			case 1:
				sentence.sendSentence(Data.WANT01.getFragments()); 
				s = Data.WANT01.getAvailableWords();
				break;
			case 2:
				sentence.sendSentence(Data.WANT02.getFragments()); 
				s = Data.WANT02.getAvailableWords();
				break;
			case 3: 
				sentence.sendSentence(Data.WANT03.getFragments()); 
				s = Data.WANT03.getAvailableWords();
				break;
			}
			break;
		case 3:	//statement
			switch(variation)
			{
			case 1: 
				sentence.sendSentence(Data.STATE01.getFragments()); 
				s = Data.STATE01.getAvailableWords();
				break;
			case 2: 
				sentence.sendSentence(Data.STATE02.getFragments());
				s = Data.STATE02.getAvailableWords();
				break;
			}
			break;
		case 4:	//emergency
			switch(variation)
			{
			case 1: 
				sentence.sendSentence(Data.HELP01.getFragments());
				s = Data.HELP01.getAvailableWords();
				break;
			}
			break;
		}

		return stuff;
	}
}
