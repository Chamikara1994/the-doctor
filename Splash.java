package rapticon.com.thedoctor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

/**
 * Created by user on 1/23/2017.
 */

public class Splash extends Activity {
  /** Duration of wait **/
  private final int SPLASH_DISPLAY_LENGTH = 2000;

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    setContentView(R.layout.splashscreen);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
    new Handler().postDelayed(new Runnable(){
      @Override
      public void run() {
                /* Create an Intent that will start the Menu-Activity. */
        Intent mainIntent = new Intent(Splash.this,LoginActivity.class);
        Splash.this.startActivity(mainIntent);
        Splash.this.finish();
      }
    }, SPLASH_DISPLAY_LENGTH);
  }
}
