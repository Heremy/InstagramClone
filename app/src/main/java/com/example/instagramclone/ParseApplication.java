package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LSCvzvRcmP9m1cvEstXYTgtwJ4dofjlo36LF7OKs")
                .clientKey("E2mLYUS3gq5K4IDgd1rGL9M9CnB8G9zpSWMqJxfl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
