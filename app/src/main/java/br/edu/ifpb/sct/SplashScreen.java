package br.edu.ifpb.sct;

import android.app.Activity;
import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
	new Timer().schedule(new TimerTask(){
		public void run(){
			finish();
			Intent intent = new Intent();
			intent.setClass(SplashScreen.this,MainActivity.class);
			startActivity(intent);
		}
	}, 3000);
	}
}
