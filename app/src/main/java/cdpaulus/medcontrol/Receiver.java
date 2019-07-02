package cdpaulus.medcontrol;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
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
        Toast.makeText(context, cod, Toast.LENGTH_LONG).show();

        BancoController bc = new BancoController(context);
        Cursor cursor = bc.carregaDados(cod);
        cursor.moveToFirst();
        String result = cursor.getString(1);
        Toast.makeText(context, result, Toast.LENGTH_LONG).show();

    }
}
