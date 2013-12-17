package pl.airbagalarm;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class AirbagAlarmActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
        	super.loadUrl("file:///android_asset/www/index.html");
        	        
        }       
        catch(Exception e) {}       
    }                 
}                                                                                                                                                                                                                                                           