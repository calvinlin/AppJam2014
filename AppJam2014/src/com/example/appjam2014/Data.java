package com.example.appjam2014;

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