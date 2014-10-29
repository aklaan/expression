package com.rdupuis.expression;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivMenuPrincipal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//a mettre en premier sinon les id ne sont pas connus
		setContentView(R.layout.activity_menu_princ);
		Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/disco___-webfont.ttf");
		
		TextView tv = (TextView) findViewById(R.id.menu_princ_titre);
		tv.setTypeface(tf);
		
	}


	 public void onClik_bt_representation2014(View v){
	    	
	       // ça ça marche en utilisant les class
	       // je jn'ai pas réussi via une URL.
	    	Intent intent = new Intent(this,ActivAffiche2014.class);
	    	
	       // on passe la variable result=0 en paramètre
	       // ici ça ne sert à rien sinon pour l'exemple.
	       // intent.putExtra("result", "0"); 
	        
	    	startActivityForResult(intent, 0);
	    	
	    }
	   
	 public void onClik_bt_contact(View v){
	    	
	       // ça ça marche en utilisant les class
	       // je jn'ai pas réussi via une URL.
	    	Intent intent = new Intent(this,ActivAffiche2014.class);
	    	
	       // on passe la variable result=0 en paramètre
	       // ici ça ne sert à rien sinon pour l'exemple.
	       // intent.putExtra("result", "0"); 
	        
	    	startActivityForResult(intent, 0);
	    	
	    }
	 


}
