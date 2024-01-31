package com.fongmi.android.tv;

import android.app.Activity;

public class Updater {

    private static class Loader {
        static volatile Updater INSTANCE = new Updater();
    }

    public static Updater get() {
        return Loader.INSTANCE;
    }

    public void start() {
        // You can add any necessary code here, or leave it empty.
        // This method will be called when you invoke Updater.get().start().
    }

    // You can add any additional methods or code here as needed.

}
