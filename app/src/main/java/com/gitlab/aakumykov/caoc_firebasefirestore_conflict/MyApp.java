package com.gitlab.aakumykov.caoc_firebasefirestore_conflict;

import android.app.Application;

public class MyApp extends Application {

    private AuthSingleton mDatabaseSingleton;

    @Override
    public void onCreate() {
        super.onCreate();

        // With manual initialization also not works
        // CaocConfig.Builder.create().apply();

        mDatabaseSingleton = AuthSingleton.getInstance();
    }
}
