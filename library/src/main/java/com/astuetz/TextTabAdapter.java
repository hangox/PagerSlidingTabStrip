package com.astuetz;

import android.content.Context;

/**
 * Created With Android Studio
 * User 4
 * Date 2015/1/21
 * Time 11:13
 */
public class TextTabAdapter implements TabAdapter {
    @Override
    public TabProxy getTabProxy(Context context,
                                CharSequence text,
                                int textColor,
                                int position) {
        return new TextTabProxy(context,text,textColor,position);
    }
}
