package com.example.appjam2014;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import android.app.Activity;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;

public class GridActivity extends Activity {

	GridView gv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid);

//		int category = 0;
//		final String[] s = Data.getArray(category);
//
//		gv = (GridView) findViewById(R.id.gridView1);
//
//		gv.setAdapter(new ImageAdapter(this, s));
//
//		gv.setOnItemClickListener(new OnItemClickListener() 
//		{
//			public void onItemClick(AdapterView<?> parent, View v,
//					int position, long id) {
//				//Data.setItem((TextView) v.findViewById(R.id.grid_item_label)).getText();
//				Toast.makeText(
//						getApplicationContext(),
//						((TextView) v.findViewById(R.id.grid_item_label))
//						.getText(), Toast.LENGTH_SHORT).show();
//			}
//		});
	}

}
