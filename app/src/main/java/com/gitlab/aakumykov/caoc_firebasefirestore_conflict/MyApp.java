package com.gitlab.aakumykov.caoc_firebasefirestore_conflict;

import android.app.Application;

import com.google.firebase.firestore.FirebaseFirestore;

public class MyApp extends Application {

    private FirebaseFirestore mFirebaseFirestore;

    @Override
    public void onCreate() {
        super.onCreate();

        // With manual initialization also not works
        // CaocConfig.Builder.create().apply();

        // Comment following line to brings CAOC works again.
        mFirebaseFirestore = FirebaseFirestore.getInstance();
    }
}
