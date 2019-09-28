package com.wushaohong.network;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.util.Log;

import androidx.annotation.NonNull;

public class NetWorkListener extends ConnectivityManager.NetworkCallback {

    private static final String TAG = NetWorkListener.class.getName();

    @Override
    public void onAvailable(@NonNull Network network) {
        super.onAvailable(network);
        Log.e(TAG, "网络可用");
    }

    @Override
    public void onLost(@NonNull Network network) {
        super.onLost(network);
        Log.e(TAG, "网络丢失");
    }

    @Override
    public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        Log.e(TAG, "网络变更");
    }
}
