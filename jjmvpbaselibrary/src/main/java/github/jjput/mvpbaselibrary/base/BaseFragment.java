package github.jjput.mvpbaselibrary.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @作者: JJ
 * @创建时间: 2018/9/10 下午7:50
 * @Version 1.0
 * @描述:
 */
public abstract class BaseFragment<T extends IPresenter> extends Fragment implements IView {

    protected final String TAG = this.getClass().getSimpleName();
    protected T mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), null);
        initData();
        findView(view);
        mPresenter = initInjector();
        attachView();
        return view;
    }

    protected void initData() {

    }

    protected void findView(View view) {

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

    @Nullable
    @Override
    public Context getContext() {
        return super.getContext();
    }

    protected abstract int getLayoutId();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.clear();
            mPresenter = null;
        }
    }
}
