package com.example.geoffroy.myapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

import com.example.geoffroy.myapp.PageAndroid.inscriptionPage;
import com.example.geoffroy.myapp.Utils.Utilities;


public class MainActivity extends Activity {

    private EditText fEmail, fMdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        fEmail = (EditText) findViewById(R.id.email);
        fEmail.setText("geoffroy@listminut.com");
        fMdp = (EditText) findViewById(R.id.pwd);
        fMdp.setText("test");
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

    public void inscription (View View) {
        Utilities.enter(inscriptionPage.class, this);}
}
