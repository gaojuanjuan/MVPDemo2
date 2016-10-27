package com.gjj.gd.mvpdemo2.getphoneinfo;

import com.gjj.gd.mvpdemo2.data.PhoneInfo;
import com.gjj.gd.mvpdemo2.data.PhoneInfoBiz;
import com.gjj.gd.mvpdemo2.data.PhoneInfoBizIml;

/**
 * author: GD on 2016/10/25 22:33
 * email :2301722691@qq.com
 */

/**
 * presenter构造函数中调用了view的setPresenter方法将自身实例传入，start方法中处理了数据的加载与展示
 * 吐过需要界面做对应的变化，直接调用view层的方法即可，这样view层和presenter就能够很好的被划分
 */
public class GetPhoneInfoPresenter implements GetPhoneInfoContract.Presenter {

    private final GetPhoneInfoContract.View mGetPhoneInfoView;
    private PhoneInfoBiz mPhoneInfoBiz;

    public GetPhoneInfoPresenter(GetPhoneInfoContract.View getPhoneInfoView) {
        mGetPhoneInfoView = getPhoneInfoView;
        mGetPhoneInfoView.setPresenter(this);
        mPhoneInfoBiz = new PhoneInfoBizIml();
    }

    @Override
    public void getTime() {
        mGetPhoneInfoView.showLoading();
        mPhoneInfoBiz.getPhoneInfo(new PhoneInfoBiz.GetPhoneInfoCallback() {
            @Override
            public void onGetPhoneInfo(PhoneInfo phoneInfo) {
                mGetPhoneInfoView.setTime(phoneInfo.getTime());
                mGetPhoneInfoView.hideLoading();
            }
        });
    }

    @Override
    public void start() {
        getTime();
    }
}
