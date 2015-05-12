package com.Nidosoft.restaurant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.Nidosoft.restaurant.NavigationDrawer.NavDrawer;

public class MainActivity extends Activity {

	private static Button foodMenuButton;
	private static Button settingsButton;
	private static Button contactButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		foodMenuButton = (Button) findViewById(R.id.food_menu_button);
		settingsButton = (Button) findViewById(R.id.settings_button);
		contactButton = (Button) findViewById(R.id.contact_button);

	}

	public void NavDrawOpener(View v) {
		Intent trigger = new Intent(this, NavDrawer.class);
		startActivity(trigger);
	}

	public void contactOpener(View v)

	{
		Intent trigger = new Intent(this, ContactActivity.class);
		startActivity(trigger);
	}

	public void settingsOpener(View v)

	{
		Intent trigger = new Intent(this, PreferencesActivity.class);
		startActivity(trigger);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
