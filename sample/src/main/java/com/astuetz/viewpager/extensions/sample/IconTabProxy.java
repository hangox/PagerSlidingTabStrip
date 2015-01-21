package com.astuetz.viewpager.extensions.sample;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

import com.astuetz.TabProxy;

/**
 * Created With Android Studio
 * User 4
 * Date 2015/1/21
 * Time 13:42
 */
public class IconTabProxy implements TabProxy {

    private ImageView iViewIcon;


    public IconTabProxy(Context context,
                        Bitmap bitmap) {
        iViewIcon = new ImageView(context);
        iViewIcon.setImageBitmap(bitmap);
        iViewIcon.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        iViewIcon.setPadding(10,10,10,10);
    }

    @Override
    public void setColor(int color) {
        iViewIcon.setBackgroundColor(color);
    }

    @Override
    public View getView() {
        return iViewIcon;
    }
}
