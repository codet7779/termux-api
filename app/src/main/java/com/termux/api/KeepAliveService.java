package com.termux.api;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.termux.shared.logger.Logger;

public class KeepAliveService extends Service {

    private static final String LOG_TAG = "KeepAliveService";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Logger.logDebug(LOG_TAG, "onStartCommand");

        return Service.START_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }import sys
}https://github.com/codet7779/codet7779
