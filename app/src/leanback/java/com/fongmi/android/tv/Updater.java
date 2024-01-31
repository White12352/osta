package com.fongmi.android.tv;

import android.app.Activity;

public class Updater {

    private static class Loader {
        static volatile Updater INSTANCE = new Updater();
    }

    public static Updater get() {
        return Loader.INSTANCE;
    }

    // 在Activity中启动更新检查（已去掉更新相关的代码）
    public void start(Activity activity) {
        // 执行一些其他的操作
    }
}
