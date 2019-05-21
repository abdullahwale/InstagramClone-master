package com.morteza.kordi.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("SV3jbM0FVnPiKVrfuIqTEMMm0IOOKpIRLH3ss8Mk")
                // if defined
                .clientKey("bR6WeDj77JJ4uia0BW2DOEw0SxsLJHqs5iTkiOm7")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
