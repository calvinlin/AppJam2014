package com.example.appjam2014;

import java.util.ArrayList;

public class Sentence 
{
	String createdString;
	ArrayList<String> stringArray;
	
	public Sentence()
	{
		
	}
	
	//populates the created sentence with the template plus the blank
	public void sendSentence(ArrayList<String> s)
	{
		stringArray = s;
		if(s.size()==1)
		{
			createdString = s.get(0) + "______"; 
		}
		else
		{
			createdString = s.get(0) + "______ " + s.get(1);
		}
	}
	
	//populates created sentence with the final sentence
	public void setBlank(String blank)
	{
		if(stringArray.size()==1)
		{
			createdString = stringArray.get(0) + " " + blank; 
		}
		else
		{
			createdString = stringArray.get(0) + " " + blank + " " + stringArray.get(1);
		}
	}
	
	//returns current state of the string
	public String getString()
	{
		return createdString;
	}
}
