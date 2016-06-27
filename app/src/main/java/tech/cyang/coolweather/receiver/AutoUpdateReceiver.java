package tech.cyang.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by cy101 on 2016/6/27.
 */

public class AutoUpdateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent){
        Intent i = new Intent(context,AutoUpdateReceiver.class);
        context.startService(i);
    }
}
