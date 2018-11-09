package com.jj.app.mvpbaselibrary;

import com.jj.app.jjmvpbaselibrary.base.BasePresenter;

/**
 * @作者: JJ
 * @创建时间: 2018/11/9 11:01 AM
 * @Version 1.0
 * @描述:
 */
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    @Override
    public void startRequsetData() {
        String data = null;
        /**
         * ...
         */
        mView.showText(data);
    }
}
