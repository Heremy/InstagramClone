package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LSCvzvRcmP9m1cvEstXYTgtwJ4dofjlo36LF7OKs")
                .clientKey("E2mLYUS3gq5K4IDgd1rGL9M9CnB8G9zpSWMqJxfl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
