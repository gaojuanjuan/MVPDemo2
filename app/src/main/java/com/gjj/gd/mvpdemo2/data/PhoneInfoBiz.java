package com.gjj.gd.mvpdemo2.data;

/**
 * author: GD on 2016/10/25 22:30
 * email :2301722691@qq.com
 */

/**
 * PhoneInfoBiz为接口类实现该业务所需要的接口及回调接口，
 */
public interface PhoneInfoBiz {
    interface GetPhoneInfoCallback{
        void onGetPhoneInfo(PhoneInfo phoneInfo);
    }
    void getPhoneInfo(GetPhoneInfoCallback getPhoneInfoCallback);
}
