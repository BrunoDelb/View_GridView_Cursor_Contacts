package com.mma.androidlabtest;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts.People;
import android.view.Menu;
import android.widget.GridView;
import android.widget.SimpleCursorAdapter;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		GridView gridView = (GridView)findViewById (R.id.gridView);
		Cursor cursor = managedQuery (People.CONTENT_URI, null, null, null, People.NAME);
		SimpleCursorAdapter adapter = new SimpleCursorAdapter (this, android.R.layout.simple_list_item_1, cursor, new String[] {People.NAME}, new int[] {android.R.id.text1});
		gridView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
