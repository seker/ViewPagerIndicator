package com.viewpagerindicator.sample;

import android.content.Context;

import androidx.multidex.MultiDexApplication;

/**
 * @author xinwen
 * @since 2020.12.28
 */
public class MyApplication extends MultiDexApplication {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        xcrash.XCrash.init(this);
    }
}
