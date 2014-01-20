package kap0020.heartratevariability;

import android.app.Activity;
//import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
//import android.view.View;
//import android.widget.Button;

public class SplashScreen extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash_screen);

        
        //final Button risk = (Button) findViewById(R.id.continueTo);
//        risk.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//            	Intent calcIntent = new Intent (SplashScreen.this, MainActivity.class);
//            	startActivity(calcIntent);
//            	overridePendingTransition(R.anim.slideup, R.anim.slidedown);
//            }
//        });
    }
    
    @Override
	public boolean onPrepareOptionsMenu (Menu menu) {
	    return false;
	}
}