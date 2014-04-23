package com.example.appjam2014;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.os.Build;

// imports for Text to Speech (TTS)
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.content.Intent;
import java.util.Locale;
import android.widget.Toast;

public class EndActivity extends Activity implements OnClickListener, OnInitListener{
	/* TEXT TO SPEECH DEPENDENCIES */
	//TTS object
	private TextToSpeech myTTS;
	    //status check code
	private int MY_DATA_CHECK_CODE = 0;
	/* ------------------------------ */
	
	private Data data;
	
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_end);

		Button say = (Button)findViewById(R.id.SayButton);
		Button again = (Button)findViewById(R.id.AgainButton);
		
		say.setOnClickListener(this);
		again.setOnClickListener(this);
		
		// retrieve data
		data = new Data();
		
        //listen for clicks
	    say.setOnClickListener(this);
	
	    //check for TTS data
	    Intent checkTTSIntent = new Intent();
	    checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
	    startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);
	    
	}

	@Override
	public void onClick(View v) 
	{
		Intent i;
		
		switch(v.getId())
		{
		case R.id.SayButton:
            //get the text entered
//            String words = data.people.name();
			String words = "I can talk.";
            speakWords(words);
            break;
		case R.id.AgainButton:
//			i = new Intent(this, WantActivity.class);
//			startActivity(i);
//			break;
			break;
			
		}
	}
	//speak the user text
	private void speakWords(String speech) 
	{
	        //speak straight away
	        myTTS.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
	}
    //act on result of TTS data check
    protected void onActivityResult(int requestCode, int resultCode, Intent data) 
    {     
        if (requestCode == MY_DATA_CHECK_CODE) {
            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
                //the user has the necessary data - create the TTS
            myTTS = new TextToSpeech(this, this);
            }
            else {
                    //no data - install it now
                Intent installTTSIntent = new Intent();
                installTTSIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                startActivity(installTTSIntent);
            }
        }
    }
	    //setup TTS
	public void onInit(int initStatus) 
	{ 
	        //check for successful instantiation
	    if (initStatus == TextToSpeech.SUCCESS) {
	        if(myTTS.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE)
	            myTTS.setLanguage(Locale.US);
	    }
	    else if (initStatus == TextToSpeech.ERROR) {
	        Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
	    }
	}
	
	
	
}
