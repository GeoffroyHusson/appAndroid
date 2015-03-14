package com.example.geoffroy.myapp.PageAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.example.geoffroy.myapp.R;

/**
 * Created by Geoffroy on 08-03-15.
 */
public class mainPage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_page);
    }
}
