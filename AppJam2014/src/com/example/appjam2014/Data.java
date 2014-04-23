package com.example.appjam2014;

import java.util.ArrayList;

public class Data {
	People people;
	Places place;
	Feelings feeling;
	BodyParts bodyPart;

	class Objects {
		Food food;
		Toy toy;
		Phone phone;
	};

	Actions action;
	
	//NOT COMPLETE FOR EVERY ENUM
	//Returns a String[] of all of the options given an enum
	public String[] getAll(String name)
	{
		String[] s = null;
		if(name.equals("people"))
		{
			s = new String[people.values().length];
			for(int i = 0; i< people.values().length;i++)
			{
				s[i] =people.values()[i].toString();
				System.out.println(people.values()[i]);
				
			}
		}
		else if(name.equals("place"))
		{
			s = new String[place.values().length];
			for(int i = 0; i< place.values().length;i++)
			{
				s[i] =place.values()[i].toString();
				System.out.println(place.values()[i]);
				
			}
		}
		return s;
	}
};

enum WANT01{
	INEED("I need");
	
	private String template;
	WANT01(String template)
	{
		this.template = template;
	}
	
	public String getFragString()
	{
		return template;
	}
	// returns the Enum of stuff that is appropriate for this template.
	private String getAvailableWords()
	{
		return "food";
	}
	public ArrayList<String> getFragments()
	{
		ArrayList<String> fragments = new ArrayList<String>();
		for(WANT01 fragEnum: WANT01.values())
		{
			fragments.add(fragEnum.getFragString());
		}
		return fragments;
	}
	
};

enum People {
	me, you, him, her, teacher, student, mom, dad, friend, neighbor
};

enum Places {
	school, library, classroom, bathroom, bedroom, kitchen, restaurant, store, home, outside, inside, park, office, playground
};

enum Feelings {
	happy, sad, confused, excited, angry, sleepy, tired
};

enum BodyParts {
	head, arm, leg, foot, hand, back, eye, knee, elbow, chest, stomach
};

enum Food {
	burger, sandwich
};

enum Toy {
	/**/
};

enum Phone {
	/**/
};

enum Actions {
	goToTheBathroom, askYouAQuestion
};