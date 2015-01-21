package com.astuetz;

import android.content.Context;

/**
 * Created With Android Studio
 * User 4
 * Date 2015/1/9
 * Time 9:58
 *
 */
public interface TabAdapter {
    public TabProxy getTabProxy(Context context,
                        CharSequence text,
                        int textColor,
                        int position);

}
