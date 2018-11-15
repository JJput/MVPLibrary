package github.jjput.mvpbaselibrary.base;

import android.support.annotation.NonNull;

/**
 * @version 1.0
 * @author: JJ
 * @date: 2018/8/31
 * @explain:
 */
public class BasePresenter<T extends IView> implements IPresenter {
    protected final String TAG = this.getClass().getSimpleName();
    protected T mView;

    @Override
    public void attachView(@NonNull IView iView) {
        mView = (T) iView;
    }

}
