package com.gjj.gd.mvpdemo2.base;

/**
 * author: GD on 2016/10/25 22:28
 * email :2301722691@qq.com
 */
//是所有Presenter的基类
public interface BasePresenter {
    //该方法的作用是Presenter开始获取数据并开始调用view中的方法改变界面显示，
    //其调用时机是在Fragment类的onResume方法中
    void start();
}
