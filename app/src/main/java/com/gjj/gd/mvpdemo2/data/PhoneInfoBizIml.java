package com.gjj.gd.mvpdemo2.data;

import android.os.Build;

/**
 * author: GD on 2016/10/25 22:30
 * email :2301722691@qq.com
 */

public class PhoneInfoBizIml implements PhoneInfoBiz{
    @Override
    public void getPhoneInfo(final GetPhoneInfoCallback getPhoneInfoCallback) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    PhoneInfo phoneInfo = new PhoneInfo();
                    phoneInfo.setTime(System.currentTimeMillis()+"");
                    phoneInfo.setTime(Build.MODEL);
                    phoneInfo.setMobileVer(Build.VERSION.RELEASE);
                    Thread.sleep(1000);
                    getPhoneInfoCallback.onGetPhoneInfo(phoneInfo);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
