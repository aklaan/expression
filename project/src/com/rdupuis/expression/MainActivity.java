package com.rdupuis.expression;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//a mettre en premier sinon les id ne sont pas connus
		setContentView(R.layout.activity_main);
		Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/disco___-webfont.ttf");
		
		Button bt = (Button) findViewById(R.id.bouton_entrer);
		bt.setTypeface(tf);
		
	}


	 public void onClik_entrer(View v){
	    	
	       // �a �a marche en utilisant les class
	       // je jn'ai pas r�ussi via une URL.
	    	Intent intent = new Intent(this,ActivMenuPrincipal.class);
	    	
	       // on passe la variable result=0 en param�tre
	       // ici �a ne sert � rien sinon pour l'exemple.
	       // intent.putExtra("result", "0"); 
	        
	    	startActivityForResult(intent, 0);
	    	
	    }
	   



}
