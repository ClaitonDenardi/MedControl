package cdpaulus.medcontrol;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

import static android.provider.Settings.System.DEFAULT_ALARM_ALERT_URI;

public class Receiver extends BroadcastReceiver {
    MediaPlayer mp;
    @Override
    public void onReceive(Context context, Intent intent) {
        mp=MediaPlayer.create(context, DEFAULT_ALARM_ALERT_URI);
        mp.start();
        Toast.makeText(context, "DALE RECEIVER", Toast.LENGTH_LONG).show();

    }
}
