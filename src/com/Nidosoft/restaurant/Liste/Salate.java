package com.Nidosoft.restaurant.Liste;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.Nidosoft.restaurant.R;

public class Salate extends CustomListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_salate);

//		adapter.addItem("Sala cu rucola", "17 RON", R.drawable.salata);
//		adapter.addItem("Supa taraneasca", "17 RON", R.drawable.supa);

	}

	// public void onListItemClick(Intent trigger, String name_value, String
	// name,
	// String price_value, int image, int price, Integer image_value) {
	// image = CustomAdapter.image;
	// image_value = Integer.valueOf(image);
	// name = CustomAdapter.name;
	// name_value = String.valueOf(name);
	// price = CustomAdapter.price;
	// price_value = String.valueOf(price);
	// trigger = new Intent(Salate.this, DetailActivity.class);
	// trigger.putExtra("name", name_value);
	// trigger.putExtra("price", price_value);
	// trigger.putExtra("image", image_value);
	// startActivity(trigger);
	// }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.salate, menu);
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
