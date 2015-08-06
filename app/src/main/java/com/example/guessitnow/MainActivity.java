package com.example.guessitnow;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	Button b1;
	TextView t1, t2;
	EditText e1;
	int min = 0;
	int max = 10;
	int i1;
	int i=0;
	LinearLayout l1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1 = (Button) findViewById(R.id.button);
		b1.setOnClickListener(this);
		t1 = (TextView) findViewById(R.id.textView1);
		t2 = (TextView) findViewById(R.id.textView2);
		e1 = (EditText) findViewById(R.id.editText);
l1=(LinearLayout)findViewById(R.id.layout1);
		Random r = new Random();
		i1 = r.nextInt(max - min + 1) + min;

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

	@Override
	public void onClick(View v) {
		i++;


		String str = e1.getText().toString();
		int y = Integer.parseInt(str);
		if (y > i1) {
			Toast.makeText(MainActivity.this,
					"The magic number is less than the current number!!",
					Toast.LENGTH_LONG).show();
			e1.setText("");

		} else if (y < i1) {
			Toast.makeText(MainActivity.this,
					"The magic number is more than the current number!!",
					Toast.LENGTH_LONG).show();
			e1.setText("");

		} else {
			e1.setText("");
			t1.setText("Congratulations you won !! The number was- "+i1);
			l1.setBackgroundColor(16711936 );
			t2.setText("You took "+i+" tries to guess it");

		}

	}
}
