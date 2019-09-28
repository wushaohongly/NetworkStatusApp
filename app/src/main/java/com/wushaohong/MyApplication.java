package com.wushaohong;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;

import com.wushaohong.network.NetWorkListener;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initNet();
    }

    private void initNet() {

        ConnectivityManager.NetworkCallback networkCallback = new NetWorkListener();
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        NetworkRequest request = builder.build();
        ConnectivityManager manager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        if (manager !=null) manager.registerNetworkCallback(request, networkCallback);
    }
}
