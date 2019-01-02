package github.jjput.mvpbaselibrary.base;

import android.support.annotation.NonNull;

/**
 * @version 1.0
 * @author: JJ
 * @date: 2018/8/31
 * @explain:
 */
public interface IPresenter {

    /**
     * 注入View，使之能够与View相互响应
     */
    void attachView(@NonNull IView iView);

    void clear();
}
