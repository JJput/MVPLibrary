package com.jj.app.mvpbaselibrary;

import github.jjput.mvpbaselibrary.base.IPresenter;
import github.jjput.mvpbaselibrary.base.IView;

/**
 * @作者: JJ
 * @创建时间: 2018/11/9 11:05 AM
 * @Version 1.0
 * @描述: Main的协议者，控制V层、P层的接口。
 */
public interface MainContract {


    interface View extends IView{

        /**
         * 显示Text内容
         * @param text 文本内容
         */
        void showText(String text);

    }

    interface Presenter extends IPresenter {

        /**
         * 开始获取数据
         */
        void startRequsetData();

    }
}
