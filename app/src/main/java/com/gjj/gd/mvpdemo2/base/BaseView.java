package com.gjj.gd.mvpdemo2.base;

/**
 * author: GD on 2016/10/25 22:29
 * email :2301722691@qq.com
 */

public interface BaseView<T> {
    //该方法的作用是将Presenter实例传入view中，其调用时机是在Activity的presenter实现类的构造函数中
    void setPresenter(T presenter);
}
