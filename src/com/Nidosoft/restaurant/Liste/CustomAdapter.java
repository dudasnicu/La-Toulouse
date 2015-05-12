package com.Nidosoft.restaurant.Liste;

import java.util.ArrayList;

import android.app.ListActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.Nidosoft.restaurant.R;

public class CustomAdapter extends BaseAdapter {

	private ListActivity context;
	private ArrayList<Produs> list = new ArrayList<Produs>();

	public CustomAdapter(ListActivity context) {
		this.context = context;
		list = new ArrayList<Produs>();
	}

	public View getView(int position, View convertView, ViewGroup _list) {
		// functia trebuie sa intoarca view-ul de pe pozitia position din lista
		// convertView este un element din lista ce nu mai este vizibil si poate
		// fi convertit
		View element;
		if (convertView == null) {
			LayoutInflater inflater = context.getLayoutInflater();
			element = (View) inflater.inflate(R.layout.celula_produs, null);

			TagProdus tag = new TagProdus();
			tag.name = (TextView) element.findViewById(R.id.nameView);
			tag.price = (TextView) element.findViewById(R.id.priceView);
			tag.image = (ImageView) element.findViewById(R.id.imgView);

			element.setTag(tag);
		} else
			element = convertView;
		Produs produs = list.get(position);

		TagProdus tag = (TagProdus) element.getTag();
		//
		// TextView name = (TextView) element.findViewById(R.id.nameView);
		// TextView price = (TextView) element.findViewById(R.id.priceView);
		// ImageView image = (ImageView) element.findViewById(R.id.imgView);

		tag.name.setText(produs.getName());
		tag.price.setText(produs.getPrice());
		tag.image.setImageResource(produs.getImgResID());

		return element;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public void addItem(String name, String price, int imageResID) {
		Produs p = new Produs();
		p.setName(name + list.size());
		p.setPrice(price + list.size());
		p.setImgResID(imageResID + list.size());
		list.add(p);
		// acesta functie determina adaptorul sa ceara listei sa reafiseze
		// continutul
		this.notifyDataSetChanged();
	}

}
