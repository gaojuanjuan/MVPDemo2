package com.gjj.gd.mvpdemo2.getphoneinfo;

import com.gjj.gd.mvpdemo2.data.PhoneInfoBiz;
import com.gjj.gd.mvpdemo2.data.PhoneInfoBizIml;

/**
 * author: GD on 2016/10/25 22:33
 * email :2301722691@qq.com
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

    }

    @Override
    public void start() {
        getTime();
    }
}
