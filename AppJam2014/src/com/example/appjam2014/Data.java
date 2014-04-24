package com.example.appjam2014;

import java.util.ArrayList;

public class Data {
	static People people;
	Places place;
	Feelings feeling;
	BodyParts bodyPart;

	class Objects {
		Food food;
	};

	Actions action;
	
	//NOT COMPLETE FOR EVERY ENUM
	//Returns a String[] of all of the options given an enum
	public static String[] getAll(String name)
	{
		String[] s = null;
		if(name.equals("people"))
		{
			s = new String[People.values().length];
			for(int i = 0; i< People.values().length;i++)
				s[i] = People.values()[i].toString();

		}
		else if(name.equals("places"))
		{
			s = new String[Places.values().length];
			for(int i = 0; i< Places.values().length;i++)
				s[i] = Places.values()[i].toString();
		}
		else if(name.equals("feelings"))
		{
			s = new String[Feelings.values().length];
			for(int i = 0; i< Feelings.values().length;i++)
				s[i] = Feelings.values()[i].toString();
		}
		else if(name.equals("bodyparts"))
		{
			s = new String[BodyParts.values().length];
			for(int i = 0; i< BodyParts.values().length;i++)
				s[i] = BodyParts.values()[i].toString();
		}
		else if(name.equals("food"))
		{
			s = new String[Food.values().length];
			for(int i = 0; i< Food.values().length;i++)
				s[i] = Food.values()[i].toString();
		}
		else if(name.equals("actions"))
		{
			s = new String[Actions.values().length];
			for(int i = 0; i< Actions.values().length;i++)
				s[i] = Actions.values()[i].toString();
		}
		return s;
	}
	public enum WANT01{
		INEED("I need");
		
		private String template;
		// constructor needed to automatically associate the string to the enum INEED
		WANT01(String template)
		{
			this.template = template;
		}
		
		// helper method to return the value of the enum
		public String getFragString()
		{
			return template;
		}
		// returns the Enum of stuff that is appropriate for this template.
		private static String getAvailableWords()
		{
			return "food";
		}
		// returns an array list of enum values, e.g. I need.
		// if there were two enums, it would also return the value of the second one
		public static ArrayList<String> getFragments()
		{
			ArrayList<String> fragments = new ArrayList<String>();
			for(WANT01 fragEnum: WANT01.values())
			{
				fragments.add(fragEnum.getFragString());
			}
			return fragments;
		}
	};
	public enum WANT02{
		IWANTTOEAT("I am hungry, can I eat"),
		QMARK("?");
		
		private String template;
		WANT02(String template)
		{
			this.template = template;
		}
		
		public String getFragString()
		{
			return template;
		}
		// returns the Enum of stuff that is appropriate for this template.
		private static String[] getAvailableWords()
		{
			return getAll("food");
		}
		public static ArrayList<String> getFragments()
		{
			ArrayList<String> fragments = new ArrayList<String>();
			for(WANT01 fragEnum: WANT01.values())
			{
				fragments.add(fragEnum.getFragString());
			}
			return fragments;
		}
	};
	public enum WANT03{
		MAYI("May I"),
		QMARK("?");
		
		private String template;
		WANT03(String template)
		{
			this.template = template;
		}
		
		public String getFragString()
		{
			return template;
		}
		// returns the Enum of stuff that is appropriate for this template.
		private static String[] getAvailableWords()
		{
			return getAll("food");
		}
		public static ArrayList<String> getFragments()
		{
			ArrayList<String> fragments = new ArrayList<String>();
			for(WANT01 fragEnum: WANT01.values())
			{
				fragments.add(fragEnum.getFragString());
			}
			return fragments;
		}
	};
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

enum Objects {
	toy, phone, pencil, laptop, jacket, shirt, shoe, underwear, waterBottle, pieceOfPaper, book
};

enum Actions {
	goPlay, getAToy, run, doHomework, callAFriend, goHome, buyThis, stayHere
};

enum Event {
	classStart, schoolEnd, momComeHome, napTime, dinner, lunch
};

enum Food {
	burger, sandwich, cereal, candy, orange, banana, water, noodles, rice, pizza
};


