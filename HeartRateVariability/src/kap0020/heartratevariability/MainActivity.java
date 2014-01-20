package kap0020.heartratevariability;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	// Launch Relax Activity
		final Button relax = (Button) findViewById(R.id.relax);
	    relax.setOnClickListener(new View.OnClickListener() {
	    	public void onClick(View v) {
		      	Intent selectuser = new Intent (MainActivity.this, selectUser.class);
		        startActivity(selectuser);
		    }
	    });
	    
	 // Launch Relax Activity
	 	final Button stress = (Button) findViewById(R.id.stress);
	 	stress.setOnClickListener(new View.OnClickListener() {
	 	   	public void onClick(View v) {
	 	      	Intent selectuser = new Intent (MainActivity.this, selectUser.class);
	 	        startActivity(selectuser);
	 	       }
	 	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

}
