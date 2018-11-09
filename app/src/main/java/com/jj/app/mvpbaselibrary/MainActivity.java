package com.jj.app.mvpbaselibrary;

import android.widget.TextView;

import com.jj.app.jjmvpbaselibrary.base.BaseActivity;


/**
 * @作者: JJ
 * @创建时间: 2018/11/9 11:05 AM
 * @Version 1.0
 * @描述: 主界面
 */
public class MainActivity extends BaseActivity<MainContract.Presenter> implements MainContract.View {

    private TextView tvText;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected boolean isToolbar() {
        return false;
    }

    @Override
    protected MainContract.Presenter initInjector() {
        return new MainPresenter();
    }

    @Override
    protected void initView() {
        super.initView();
        tvText = findViewById(R.id.main_tv);
    }

    @Override
    protected void initData() {
        super.initData();
        mPresenter.startRequsetData();
    }

    @Override
    public void showText(String text) {
        tvText.setText(text);
    }
}
