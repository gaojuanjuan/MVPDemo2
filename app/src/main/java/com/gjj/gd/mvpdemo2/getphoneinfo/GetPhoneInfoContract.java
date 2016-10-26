package com.gjj.gd.mvpdemo2.getphoneinfo;

import com.gjj.gd.mvpdemo2.base.BasePresenter;
import com.gjj.gd.mvpdemo2.base.BaseView;

/**
 * author: GD on 2016/10/25 22:32
 * email :2301722691@qq.com
 */
//该契约类统一管理view与presenter的所有接口，
//这种方式使得view与presenter中有哪些功能，一目了然，
//维护起来也很方便，该实例中presenter的接口实现获取系统时间
    //view的接口实现事件的显示以及提示对话框的显示及隐藏

    public interface GetPhoneInfoContract {
    interface View extends BaseView<Presenter>{
        void setTime(String name);
        void showLoading();
        void hideLoading();
    }

    interface Presenter extends BasePresenter{
        void getTime();
    }
}
