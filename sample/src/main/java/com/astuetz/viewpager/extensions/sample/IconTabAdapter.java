package com.astuetz.viewpager.extensions.sample;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;

import com.astuetz.TabAdapter;
import com.astuetz.TabProxy;

/**
 * Created With Android Studio
 * User 4
 * Date 2015/1/21
 * Time 13:40
 * 图标的Tab
 */
public class IconTabAdapter implements TabAdapter {
    public static int[] iconIds = {
            R.drawable.ic_launcher,
            R.drawable.ic_launcher_chrome,
            R.drawable.ic_launcher_gmail,
            R.drawable.ic_launcher_gplus,
    };
    @Override
    public TabProxy getTabProxy(Context context, CharSequence text, int textColor, int position) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) context.getResources().getDrawable(iconIds[position]);
        IconTabProxy proxy = new IconTabProxy(context,bitmapDrawable.getBitmap());
        return proxy;
    }
}
