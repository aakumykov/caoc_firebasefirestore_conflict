package com.gitlab.aakumykov.caoc_firebasefirestore_conflict;

import com.google.firebase.firestore.FirebaseFirestore;

public class AuthSingleton {

    // This line prevents CAOC from working.
    // Comment it to bring CAOC to work.
    private FirebaseFirestore mFirebaseFirestore = FirebaseFirestore.getInstance();

    // Singleton implementation start
    private static volatile AuthSingleton ourInstance;
    public synchronized static AuthSingleton getInstance() {
        synchronized (AuthSingleton.class) {
            if (null == ourInstance) ourInstance = new AuthSingleton();
            return ourInstance;
        }
    }
    private AuthSingleton() {}
    // Singleton implementation end
}
