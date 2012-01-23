/**
 * Copyright (c) 2011-2012 by Shaftek Enterprises LLC (www.shaftek.biz).
 * Licensed under the General Public License v3 or later (GPLv3).
 * Please see LICENSE file for more information. 
 */

package biz.shaftek.android.LanguageSettings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import appinventor.ai_yakov.LanguageSettings.R;

public class LanguageSettingsActivity extends Activity {	
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
    	Intent localIntent = new Intent("android.intent.action.MAIN");
    	
    	// Try 2.3 intent
	    try {
	        localIntent.setClassName("com.android.inputmethod.latin", "com.android.inputmethod.latin.InputLanguageSelection");
	        LanguageSettingsActivity.this.startActivity(localIntent);
	        return;
	    } catch (Exception e1) {}
	    
	    // Try 3.2 intent
	    try {
	        localIntent.setClassName("com.android.inputmethod.latin", "com.android.inputmethod.latin.INPUT_LANGUAGE_SELECTION");
	        LanguageSettingsActivity.this.startActivity(localIntent);
	        return;
	    } catch (Exception e2) {}

	    // Try 4.0 intent
	    try {
	        localIntent.setClassName("com.android.inputmethod.latin", "com.android.inputmethod.latin.Settings");
	        LanguageSettingsActivity.this.startActivity(localIntent);
	        return;
	    } catch (Exception e3) {}
	    
	    // If no valid intent found, show error message
        Toast.makeText(LanguageSettingsActivity.this.getApplicationContext(), "Unable to find language settings on your device", 1).show();
    }
  };
}