package com.example.appjam2014;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.appjam2014.*;

 
public class ImageAdapter extends BaseAdapter {
	private Context context;
	private final String[] moduleValues;
 
	public ImageAdapter(Context context, String[] moduleValues) {
		this.context = context;
		this.moduleValues = moduleValues;
	}

	
	public View getView(int position, View convertView, ViewGroup parent) {
 
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View gridView;
 
		if (convertView == null) {
 
			gridView = new View(context);
 
			// get layout from mobile.xml
			gridView = inflater.inflate(R.layout.module, null);
 
			// set value into textview
			TextView textView = (TextView) gridView
					.findViewById(R.id.grid_item_label);
			textView.setText(moduleValues[position]);
 
			// set image based on selected text
			ImageView imageView = (ImageView) gridView
					.findViewById(R.id.grid_item_image);
 
			String mobile = moduleValues[position];
 
			if (mobile.equals("me")) {
				imageView.setImageResource(R.drawable.me);
			} else if (mobile.equals("you")) {
				imageView.setImageResource(R.drawable.you);
			} else if (mobile.equals("him")) {
				imageView.setImageResource(R.drawable.him);
			} else if (mobile.equals("her")) {
				imageView.setImageResource(R.drawable.her);
			}else if (mobile.equals("teacher")) {
				imageView.setImageResource(R.drawable.teacher);
			}else if (mobile.equals("student")) {
				imageView.setImageResource(R.drawable.student);
			}else if (mobile.equals("mom")) {
				imageView.setImageResource(R.drawable.mom);
			}else if (mobile.equals("dad")) {
				imageView.setImageResource(R.drawable.dad);
			}else if (mobile.equals("friend")) {
				imageView.setImageResource(R.drawable.neighbor);
			}else if (mobile.equals("school")) {
				imageView.setImageResource(R.drawable.school);
			}else if (mobile.equals("library")) {
				imageView.setImageResource(R.drawable.library);
			}else if (mobile.equals("classroom")) {
				imageView.setImageResource(R.drawable.classroom);
			}else if (mobile.equals("bathroom")) {
				imageView.setImageResource(R.drawable.bathroom);
			}else if (mobile.equals("bedroom")) {
				imageView.setImageResource(R.drawable.bedroom);
			}else if (mobile.equals("kitchen")) {
				imageView.setImageResource(R.drawable.kitchen);
			}else if (mobile.equals("restaurant")) {
				imageView.setImageResource(R.drawable.restaurant);
			}else if (mobile.equals("store")) {
				imageView.setImageResource(R.drawable.store);
			}else if (mobile.equals("home")) {
				imageView.setImageResource(R.drawable.home);
			}else if (mobile.equals("outside")) {
				imageView.setImageResource(R.drawable.outside);
			}else if (mobile.equals("inside")) {
				imageView.setImageResource(R.drawable.inside);
			}else if (mobile.equals("park")) {
				imageView.setImageResource(R.drawable.park);
			}else if (mobile.equals("office")) {
				imageView.setImageResource(R.drawable.office);
			}else if (mobile.equals("playground")) {
				imageView.setImageResource(R.drawable.playground);
			}else if (mobile.equals("happy")) {
				imageView.setImageResource(R.drawable.happy);
			}else if (mobile.equals("sad")) {
				imageView.setImageResource(R.drawable.sad);
			}else if (mobile.equals("confused")) {
				imageView.setImageResource(R.drawable.confused);
			}else if (mobile.equals("excited")) {
				imageView.setImageResource(R.drawable.excited);
			}else if (mobile.equals("angry")) {
				imageView.setImageResource(R.drawable.angry);
			}else if (mobile.equals("sleepy")) {
				imageView.setImageResource(R.drawable.sleepy);
			}else if (mobile.equals("tired")) {
				imageView.setImageResource(R.drawable.tired);
			}else if (mobile.equals("head")) {
				imageView.setImageResource(R.drawable.head);
			}else if (mobile.equals("arm")) {
				imageView.setImageResource(R.drawable.arm);
			}else if (mobile.equals("leg")) {
				imageView.setImageResource(R.drawable.leg);
			}else if (mobile.equals("foot")) {
				imageView.setImageResource(R.drawable.foot);
			}else if (mobile.equals("hand")) {
				imageView.setImageResource(R.drawable.hand);
			}else if (mobile.equals("back")) {
				imageView.setImageResource(R.drawable.back);
			}else if (mobile.equals("eye")) {
				imageView.setImageResource(R.drawable.eye);
			}else if (mobile.equals("knee")) {
				imageView.setImageResource(R.drawable.knee);
			}else if (mobile.equals("elbow")) {
				imageView.setImageResource(R.drawable.elbow);
			}else if (mobile.equals("chest")) {
				imageView.setImageResource(R.drawable.chest);
			}else if (mobile.equals("stomach")) {
				imageView.setImageResource(R.drawable.stomach);
			}else if (mobile.equals("toy")) {
				imageView.setImageResource(R.drawable.toy);
			}else if (mobile.equals("phone")) {
				imageView.setImageResource(R.drawable.phone);
			}else if (mobile.equals("pencil")) {
				imageView.setImageResource(R.drawable.pencil);
			}else if (mobile.equals("laptop")) {
				imageView.setImageResource(R.drawable.laptop);
			}else if (mobile.equals("jacket")) {
				imageView.setImageResource(R.drawable.jacket);
			}else if (mobile.equals("shirt")) {
				imageView.setImageResource(R.drawable.shirt);
			}else if (mobile.equals("shoe")) {
				imageView.setImageResource(R.drawable.shoe);
			}else if (mobile.equals("underwear")) {
				imageView.setImageResource(R.drawable.underwear);
			}else if (mobile.equals("waterBottle")) {
				imageView.setImageResource(R.drawable.waterbottle);
			}else if (mobile.equals("pieceOfPaper")) {
				imageView.setImageResource(R.drawable.pieceofpaper);
			}else if (mobile.equals("book")) {
				imageView.setImageResource(R.drawable.book);
			}else if (mobile.equals("goPlay")) {
				imageView.setImageResource(R.drawable.goplay);
			}else if (mobile.equals("getAToy")) {
				imageView.setImageResource(R.drawable.getatoy);
			}else if (mobile.equals("run")) {
				imageView.setImageResource(R.drawable.run);
			}else if (mobile.equals("doHomework")) {
				imageView.setImageResource(R.drawable.dohomework);
			}else if (mobile.equals("callAFriend")) {
				imageView.setImageResource(R.drawable.callafriend);
			}else if (mobile.equals("goHome")) {
				imageView.setImageResource(R.drawable.gohome);
			}else if (mobile.equals("buyThis")) {
				imageView.setImageResource(R.drawable.buythis);
			}else if (mobile.equals("stayHere")) {
				imageView.setImageResource(R.drawable.stayhere);
			}else if (mobile.equals("classStart")) {
				imageView.setImageResource(R.drawable.classstart);
			}else if (mobile.equals("schoolEnd")) {
				imageView.setImageResource(R.drawable.schoolend);
			}else if (mobile.equals("momComeHome")) {
				imageView.setImageResource(R.drawable.momcomehome);
			}else if (mobile.equals("napTime")) {
				imageView.setImageResource(R.drawable.naptime);
			}else if (mobile.equals("dinner")) {
				imageView.setImageResource(R.drawable.dinner);
			}else if (mobile.equals("lunch")) {
				imageView.setImageResource(R.drawable.lunch);
			}else if (mobile.equals("burger")) {
				imageView.setImageResource(R.drawable.burger);
			}else if (mobile.equals("sandwich")) {
				imageView.setImageResource(R.drawable.sandwich);
			}else if (mobile.equals("cereal")) {
				imageView.setImageResource(R.drawable.cereal);
			}else if (mobile.equals("candy")) {
				imageView.setImageResource(R.drawable.candy);
			}else if (mobile.equals("orange")) {
				imageView.setImageResource(R.drawable.orange);
			}else if (mobile.equals("banana")) {
				imageView.setImageResource(R.drawable.banana);
			}else if (mobile.equals("water")) {
				imageView.setImageResource(R.drawable.water);
			}else if (mobile.equals("noodles")) {
				imageView.setImageResource(R.drawable.noodles);
			}else if (mobile.equals("rice")) {
				imageView.setImageResource(R.drawable.rice);
			}else if (mobile.equals("pizza")) {
				imageView.setImageResource(R.drawable.pizza);
			}
 
		} else {
			gridView = (View) convertView;
		}
 
		return gridView;
	}
 
	@Override
	public int getCount() {
		return moduleValues.length;
	}
 
	@Override
	public Object getItem(int position) {
		return null;
	}
 
	@Override
	public long getItemId(int position) {
		return 0;
	}

 
}
