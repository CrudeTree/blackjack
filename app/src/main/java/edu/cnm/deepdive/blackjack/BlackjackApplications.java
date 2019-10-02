package edu.cnm.deepdive.blackjack;

import android.app.Application;
import com.facebook.stetho.Stetho;
import edu.cnm.deepdive.blackjack.service.BlackjackDatabase;

public class BlackjackApplications extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
    BlackjackDatabase.setApplicationContext(this);
    final BlackjackDatabase database = BlackjackDatabase.getInstance();
    new Thread(new Runnable() {
      @Override
      public void run() {
        database.getShoeDao().delete();
      }
    }).start();
  }
}
