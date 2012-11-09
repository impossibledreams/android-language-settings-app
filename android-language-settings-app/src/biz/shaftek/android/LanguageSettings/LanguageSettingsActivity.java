/**
 * Copyright (c) 2011-2012 by Shaftek Enterprises LLC (www.shaftek.biz).
 * Licensed under the General Public License v3 or later (GPLv3).
 * Please see LICENSE file for more information. 
 */

package biz.shaftek.android.LanguageSettings;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import appinventor.ai_yakov.LanguageSettings.R;

import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;

public class LanguageSettingsActivity extends Activity {	
    private InputMethodManager mImm;
    private List<InputMethodInfo> mImis;
	
	// Main create method
  public void onCreate(Bundle paramBundle) {
	    super.onCreate(paramBundle);
	    setContentView(R.layout.main);
	    findViewById(R.id.buttonMain).setOnClickListener(this.mainListener);
	  }

  // Main click handler
  private OnClickListener mainListener = new OnClickListener() {
    public void onClick(View paramView) {
    	// Create intent
    	Intent localIntent = new Intent("android.intent.action.VIEW");

    	/*
	    // Kindle Fire keyboards settings
	    try {
	        localIntent.setClassName("com.android.settings", "com.android.settings.inputmethod.InputMethodAndLanguageSettings");
	        LanguageSettingsActivity.this.startActivity(localIntent);
	        return;
	    } catch (Exception e0) {}
		*/
    	
	    // Try 4.1 intent
	    try {
	        localIntent.setClassName("com.android.settings", "com.android.settings.inputmethod.InputMethodAndSubtypeEnabler");
	        LanguageSettingsActivity.this.startActivity(localIntent);
	        return;
	    } catch (Exception e1) {}

	    // Try 4.0.3 intent
	    try {
	        localIntent.setClassName("com.android.settings", "com.android.settings.inputmethod.InputMethodAndSubtypeEnablerActivity");
	        LanguageSettingsActivity.this.startActivity(localIntent);
	        return;
	    } catch (Exception e2) {}

	    // Try 4.0 intent
	    try {
	        localIntent.setClassName("com.android.inputmethod.latin", "com.android.inputmethod.latin.Settings");
	        LanguageSettingsActivity.this.startActivity(localIntent);
	        return;
	    } catch (Exception e3) {}
	    
	    // Try 3.2 intent
	    try {
	        localIntent.setClassName("com.android.inputmethod.latin", "com.android.inputmethod.latin.INPUT_LANGUAGE_SELECTION");
	        LanguageSettingsActivity.this.startActivity(localIntent);
	        return;
	    } catch (Exception e4) {}

	    // Try 2.3 intent
	    try {
	        localIntent.setClassName("com.android.inputmethod.latin", "com.android.inputmethod.latin.InputLanguageSelection");
	        LanguageSettingsActivity.this.startActivity(localIntent);
	        return;
	    } catch (Exception e5) {}
    	
	    // If no valid intent found, show error message
        Toast.makeText(LanguageSettingsActivity.this.getApplicationContext(), "Unable to find language settings on your device", 1).show();
    }
  };
}
