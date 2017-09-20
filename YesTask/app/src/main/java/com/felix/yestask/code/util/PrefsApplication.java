package com.felix.yestask.code.util;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by user on 09/06/2017.
 */

public class PrefsApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
