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
public abstract class BaseFragment<T extends IPresenter> extends Fragment implements IView{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), null);
        initData();
        findView(view);
        return view;
    }

    protected void initData(){

    }

    protected void findView(View view) {

    }

    @Nullable
    @Override
    public Context getContext() {
        return getContext();
    }

    protected abstract int getLayoutId();

}
