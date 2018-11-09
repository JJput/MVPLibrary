package com.jj.app.jjmvpbaselibrary.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.jj.app.jjmvpbaselibrary.R;
import com.jj.app.jjmvpbaselibrary.utils.LogUtil;
import com.jj.app.jjmvpbaselibrary.utils.StatusBarUtils;


/**
 * @作者: JJ
 * @创建时间: 2018/7/9 上午11:45
 * @Version 1.0
 * @描述: 基本Activity
 */
public abstract class BaseActivity<T extends IPresenter> extends AppCompatActivity implements IView {

    protected final String TAG = this.getClass().getSimpleName();
    protected T mPresenter;
    /**
     * UI
     */
    private ImageButton mTitleLeft;
    private TextView mTitleCenter;
    private TextView mTitleRight;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        //屏幕常亮
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        LogUtil.TAG = TAG;
        LogUtil.d("onCreate...");
        //设置状态栏颜色
        setStatusBarColor(0);
        initTitle();
        mPresenter = initInjector();
        attachView();
        initData();
        initView();
    }

    private void initTitle() {
        if (!isToolbar()) {
            return;
        }
        mToolbar = findViewById(R.id.toolbar);
        mTitleLeft = findViewById(R.id.toolbar_LeftTitle);
        mTitleCenter = findViewById(R.id.toolbar_CenterTitle);
        mTitleRight = findViewById(R.id.toolbar_RightTitle);

        if (mToolbar != null) {
            //将Toolbar显示到界面
            setSupportActionBar(mToolbar);
        }
        if (mTitleCenter != null) {
            //getTitle()的值是activity的android:lable属性值
            mTitleCenter.setText(getTitle());
            //设置默认的标题不显示
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        showBacking();
    }

    /**
     * this activity layout res
     * 设置layout布局,在子类重写该方法.
     *
     * @return res layout xml id
     */
    protected abstract int getLayoutId();

    /**
     * 设置自定义标题栏是否启用
     *
     * @return true启用
     */
    protected abstract boolean isToolbar();

    /**
     * 初始化控件
     */
    protected void initView() {

    }

    /**
     * 初始化数据
     */
    protected void initData() {
    }

    /**
     * P层绑定   若无则返回null;
     *
     * @return
     */
    protected abstract T initInjector();


    private void attachView() {
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    /**
     * Toast
     *
     * @param text
     */
    protected void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    /**
     * 获取标题左边的TextView
     *
     * @return
     */
    protected ImageButton getLeftTitle() {
        return mTitleLeft;
    }

    /**
     * 获取标题中间的TextView
     *
     * @return
     */
    protected TextView getCenterTitle() {
        return mTitleCenter;
    }

    /**
     * 获取标题右边的TextView
     *
     * @return
     */
    protected TextView getRightTitle() {
        return mTitleRight;
    }

    /**
     * 获取标题栏
     *
     * @return
     */
    protected Toolbar getToolbar() {
        return mToolbar;
    }

    /**
     * 是否显示后退按钮,默认显示,可在子类重写该方法.
     *
     * @return
     */
    protected void showBacking() {
        mTitleLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    /**
     * 是否显示后退按钮,默认显示,可在子类重写该方法.
     *
     * @return
     */
    protected void hideBacking() {
        mTitleLeft.setVisibility(View.INVISIBLE);
    }

    /**
     * 设置状态栏颜色
     *
     * @param colorResId 0表示使用默认 color.colorAccent
     */
    protected void setStatusBarColor(int colorResId) {
        StatusBarUtils.setWindowStatusBarColor(this, colorResId == 0 ? R.color.colorAccent : colorResId);
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtil.d("onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.d("onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.d("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.d("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.d("onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.d("onDestroy()");
    }
}
