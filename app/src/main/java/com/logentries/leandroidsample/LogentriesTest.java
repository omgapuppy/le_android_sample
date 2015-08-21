package com.logentries.leandroidsample;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;

import com.logentries.android.AndroidLogger;


public class LogentriesTest extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logentries_test);

        final AndroidLogger logger = AndroidLogger.getLogger(getApplicationContext(), "YOUR-TOKEN-HERE", false);

        Button warnbutton = (Button) findViewById(R.id.warnbutton);
        warnbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                logger.warn("This is a warning message");
            }
        });

        Button errorbutton = (Button) findViewById(R.id.errorbutton);
        errorbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                logger.error("This is an error message");
            }
        });

        Button infobutton = (Button) findViewById(R.id.infobutton);
        infobutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                logger.info("This is an info message");
            }
        });

        Button verbosebutton = (Button) findViewById(R.id.verbosebutton);
        verbosebutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                logger.verbose("This is a verbose message");
            }
        });

        Button configbutton = (Button) findViewById(R.id.configbutton);
        configbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                logger.config("This is a config message");
            }
        });

        Button severebutton = (Button) findViewById(R.id.severebutton);
        severebutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                logger.severe("This is a severe message");
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_logentries_test, menu);
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

}