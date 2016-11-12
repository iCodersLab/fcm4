package com.icoderslab.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Habaiba Abbasi on 09/11/2016.
 */
//for background notifications

public class FirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String REG_Token="REG_Token";

    @Override
    public void onTokenRefresh() {

        String  recent_token= FirebaseInstanceId.getInstance().getToken(); // get token from the server

        Log.d(REG_Token,recent_token); // show device token in Logcat View


        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(recent_token);
    }

    private void sendRegistrationToServer(String token) {
        // TODO: Implement this method to send token to your app server.
    }
}


