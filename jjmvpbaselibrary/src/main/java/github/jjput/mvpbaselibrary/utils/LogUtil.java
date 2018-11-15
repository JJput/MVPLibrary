package github.jjput.mvpbaselibrary.utils;

import android.util.Log;

/**
 * @项目名: SmartButler
 * @作者: JJ
 * @QQ: 281138580
 * @创建时间: 2017/10/19 10:49
 * @Version 1.0
 * @描述: 日志工具
 */
public class LogUtil {
    /**
     * 总开关
     */
    private static final boolean DEBUG = true;
    /**
     * 分支开关
     */
    private static final boolean DEBUG_D = true;
    private static final boolean DEBUG_I = true;
    private static final boolean DEBUG_W = true;
    private static final boolean DEBUG_E = true;
    /**
     * TAG
     */
    public static String TAG = "No TAG";


    public static void d(String text) {
        if (DEBUG && DEBUG_D) {
            Log.d(TAG, text);
        }
    }

    public static void i(String text) {
        if (DEBUG && DEBUG_I) {
            Log.i(TAG, text);
        }
    }

    public static void w(String text) {
        if (DEBUG && DEBUG_W) {
            Log.w(TAG, text);
        }
    }

    public static void e(String text) {
        if (DEBUG && DEBUG_E) {
            Log.e(TAG, text);
        }
    }


    public static void d(String tag, String text) {
        if (DEBUG && DEBUG_D) {
            Log.d(TAG, text);
        }
    }

    public static void i(String tag, String text) {
        if (DEBUG && DEBUG_I) {
            Log.i(TAG, text);
        }
    }

    public static void w(String tag, String text) {
        if (DEBUG && DEBUG_W) {
            Log.w(TAG, text);
        }
    }

    public static void e(String tag, String text) {
        if (DEBUG && DEBUG_E) {
            Log.e(TAG, text);
        }
    }

}
