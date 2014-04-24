package com.example.appjam2014;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

 
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
				imageView.setImageResource(R.images.me);
			} else if (mobile.equals("you")) {
				imageView.setImageResource(R.images.you);
			} else if (mobile.equals("him")) {
				imageView.setImageResource(R.images.him);
			}else if (mobile.equals("teacher")) {
				imageView.setImageResource(R.images.teacher);
			}else if (mobile.equals("student")) {
				imageView.setImageResource(R.images.student);
			}else if (mobile.equals("mom")) {
				imageView.setImageResource(R.images.mom);
			}else if (mobile.equals("dad")) {
				imageView.setImageResource(R.images.dad);
			}else if (mobile.equals("friend")) {
				imageView.setImageResource(R.images.neighbor);
			}else if (mobile.equals("school")) {
				imageView.setImageResource(R.images.school);
			}else if (mobile.equals("library")) {
				imageView.setImageResource(R.images.library);
			}else if (mobile.equals("classroom")) {
				imageView.setImageResource(R.images.classroom);
			}else if (mobile.equals("bathroom")) {
				imageView.setImageResource(R.images.bathroom);
			}else if (mobile.equals("bedroom")) {
				imageView.setImageResource(R.images.bedroom);
			}else if (mobile.equals("kitchen")) {
				imageView.setImageResource(R.images.kitchen);
			}else if (mobile.equals("rstaurant")) {
				imageView.setImageResource(R.images.restaurant);
			}else if (mobile.equals("store")) {
				imageView.setImageResource(R.images.store);
			}else if (mobile.equals("home")) {
				imageView.setImageResource(R.images.home);
			}else if (mobile.equals("outside")) {
				imageView.setImageResource(R.images.outside);
			}else if (mobile.equals("inside")) {
				imageView.setImageResource(R.images.inside);
			}else if (mobile.equals("park")) {
				imageView.setImageResource(R.images.park);
			}else if (mobile.equals("office")) {
				imageView.setImageResource(R.images.office);
			}else if (mobile.equals("playground")) {
				imageView.setImageResource(R.images.playground);
			}else if (mobile.equals("happy")) {
				imageView.setImageResource(R.images.happy);
			}else if (mobile.equals("sad")) {
				imageView.setImageResource(R.images.sad);
			}else if (mobile.equals("confused")) {
				imageView.setImageResource(R.images.confused);
			}else if (mobile.equals("excited")) {
				imageView.setImageResource(R.images.excited);
			}else if (mobile.equals("angry")) {
				imageView.setImageResource(R.images.angry);
			}else if (mobile.equals("sleepy")) {
				imageView.setImageResource(R.images.sleepy);
			}else if (mobile.equals("tired")) {
				imageView.setImageResource(R.images.tired);
			}else if (mobile.equals("head")) {
				imageView.setImageResource(R.images.head);
			}else if (mobile.equals("arm")) {
				imageView.setImageResource(R.images.arm);
			}else if (mobile.equals("leg")) {
				imageView.setImageResource(R.images.leg);
			}else if (mobile.equals("foot")) {
				imageView.setImageResource(R.images.foot);
			}else if (mobile.equals("hand")) {
				imageView.setImageResource(R.images.hand);
			}else if (mobile.equals("back")) {
				imageView.setImageResource(R.images.back);
			}else if (mobile.equals("eye")) {
				imageView.setImageResource(R.images.eye);
			}else if (mobile.equals("knee")) {
				imageView.setImageResource(R.images.knee);
			}else if (mobile.equals("elbow")) {
				imageView.setImageResource(R.images.elbow);
			}else if (mobile.equals("chest")) {
				imageView.setImageResource(R.images.chest);
			}else if (mobile.equals("stomach")) {
				imageView.setImageResource(R.images.stomach);
			}else if (mobile.equals("toy")) {
				imageView.setImageResource(R.images.toy);
			}else if (mobile.equals("phone")) {
				imageView.setImageResource(R.images.phone);
			}else if (mobile.equals("pencil")) {
				imageView.setImageResource(R.images.pencil);
			}else if (mobile.equals("laptop")) {
				imageView.setImageResource(R.images.laptop);
			}else if (mobile.equals("jacket")) {
				imageView.setImageResource(R.images.jacket);
			}else if (mobile.equals("shirt")) {
				imageView.setImageResource(R.images.shirt);
			}else if (mobile.equals("shoe")) {
				imageView.setImageResource(R.images.shoe);
			}else if (mobile.equals("underwear")) {
				imageView.setImageResource(R.images.underwear);
			}else if (mobile.equals("waterBottle")) {
				imageView.setImageResource(R.images.waterBottle);
			}else if (mobile.equals("pieceOfPaper")) {
				imageView.setImageResource(R.images.pieceOfPaper);
			}else if (mobile.equals("book")) {
				imageView.setImageResource(R.images.book);
			}else if (mobile.equals("goPlay")) {
				imageView.setImageResource(R.images.goPlay);
			}else if (mobile.equals("getAToy")) {
				imageView.setImageResource(R.images.getAToy);
			}else if (mobile.equals("run")) {
				imageView.setImageResource(R.images.run);
			}else if (mobile.equals("doHomework")) {
				imageView.setImageResource(R.images.doHomework);
			}else if (mobile.equals("callAFriend")) {
				imageView.setImageResource(R.images.callAFriend);
			}else if (mobile.equals("goHome")) {
				imageView.setImageResource(R.images.goHome);
			}else if (mobile.equals("buyThis")) {
				imageView.setImageResource(R.images.buyThis);
			}else if (mobile.equals("stayHere")) {
				imageView.setImageResource(R.images.stayHere);
			}else if (mobile.equals("classStart")) {
				imageView.setImageResource(R.images.classStart);
			}else if (mobile.equals("schoolEnd")) {
				imageView.setImageResource(R.images.schoolEnd);
			}else if (mobile.equals("momComeHome")) {
				imageView.setImageResource(R.images.momComeHome);
			}else if (mobile.equals("napTime")) {
				imageView.setImageResource(R.images.napTime);
			}else if (mobile.equals("dinner")) {
				imageView.setImageResource(R.images.dinner);
			}else if (mobile.equals("lunch")) {
				imageView.setImageResource(R.images.lunch);
			}else if (mobile.equals("burger")) {
				imageView.setImageResource(R.images.burger);
			}else if (mobile.equals("sandwich")) {
				imageView.setImageResource(R.images.sandwich);
			}else if (mobile.equals("cereal")) {
				imageView.setImageResource(R.images.cereal);
			}else if (mobile.equals("candy")) {
				imageView.setImageResource(R.images.candy);
			}else if (mobile.equals("orange")) {
				imageView.setImageResource(R.images.orange);
			}else if (mobile.equals("banana")) {
				imageView.setImageResource(R.images.banana);
			}else if (mobile.equals("water")) {
				imageView.setImageResource(R.images.water);
			}else if (mobile.equals("noodles")) {
				imageView.setImageResource(R.images.noodles);
			}else if (mobile.equals("rice")) {
				imageView.setImageResource(R.images.rice);
			}else if (mobile.equals("pizza")) {
				imageView.setImageResource(R.images.pizza);
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
