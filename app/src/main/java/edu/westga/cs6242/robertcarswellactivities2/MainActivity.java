package edu.westga.cs6242.robertcarswellactivities2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE1 = "com.mycompany.myfirstapp.MESSAGE1";
    public final static String EXTRA_MESSAGE2 = "com.mycompany.myfirstapp.MESSAGE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Called when the user clicks the Send button
     */
    public void sendMessage1(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity1.class);
        EditText editText = (EditText) findViewById(R.id.edit_message1);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, message);
        startActivity(intent);
    }

    /**
     * Called when the user clicks the Send button
     */
    public void sendMessage2(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity2.class);
        EditText editText = (EditText) findViewById(R.id.edit_message2);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message);
        startActivity(intent);
    }
}
