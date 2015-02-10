package com.example.geoffroy.myapp.Utils;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by Geoffroy on 08-02-15.
 */
public class Utilities {
    public static  void enter(Class<?> activity, Activity current){
        Intent toLaunch = new Intent(current, activity);
        current.startActivity(toLaunch);
    }
}
