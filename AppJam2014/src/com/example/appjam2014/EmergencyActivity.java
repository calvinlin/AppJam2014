package com.example.appjam2014;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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

public class EmergencyActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_emergency);

		Button a = (Button)findViewById(R.id.HurtButton);
		Button b = (Button)findViewById(R.id.CallButton);
		TextView sentence = (TextView)findViewById(R.id.CurrentSentence);

		a.setOnClickListener(this);
		b.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i;
		switch(v.getId())
		{
		case R.id.HurtButton:
			i = new Intent(this, GridActivity.class);
			i.putExtra("category", 4);
			i.putExtra("variation", 1);
			startActivity(i);
			break;
		case R.id.CallButton:
			i = new Intent(Intent.ACTION_CALL);
			i.setData(Uri.parse("tel:9493027378"));
			startActivity(i);
			break;
		}
	}

}
