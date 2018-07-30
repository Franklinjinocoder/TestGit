package com.fabrosoft.greendaoexample;

import android.app.Application;

/**
 * Created by franklin on 30/07/2018 AD.
 */

public class DemoDatabaseApp extends Application {

    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        mDaoSession = new DaoMaster(
                new DaoMaster.DevOpenHelper(this, "greendao_demo.db").getWritableDb()).newSession();
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }
}
