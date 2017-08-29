package com.param.unboundservicedemo;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service{
    String tag="MyService";
    MediaPlayer mMediaPlayer;

    // Use for bound service
    @Override
    public IBinder onBind(Intent intent){
        return null;
    }
    @Override
    public void onCreate(){
        super.onCreate();
        mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        mMediaPlayer.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        mMediaPlayer.release();
        super.onDestroy();
    }

}