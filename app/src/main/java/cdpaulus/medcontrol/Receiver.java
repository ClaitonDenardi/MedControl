package cdpaulus.medcontrol;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.util.Log;
import android.widget.Toast;

import cdpaulus.medcontrol.database.BancoController;

import static android.provider.Settings.System.DEFAULT_ALARM_ALERT_URI;

public class Receiver extends BroadcastReceiver {
    MediaPlayer mp;
    @Override
    public void onReceive(Context context, Intent intent) {
        mp=MediaPlayer.create(context, DEFAULT_ALARM_ALERT_URI);
        mp.start();
        String cod = intent.getExtras().getString("cod");
        BancoController bc = new BancoController(context);
        Cursor cursor = bc.carregaDados(cod);
        String result = cursor.getString(cursor.getColumnIndex("nome"));
        Toast.makeText(context, result, Toast.LENGTH_LONG).show();

    }
}
