package com.astuetz;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

/**
 * Created With Android Studio
 * User 4
 * Date 2015/1/21
 * Time 11:24
 */
public class TextTabProxy implements TabProxy {
    private TextView tView;

    public TextTabProxy(Context context,
                        CharSequence text,
                        int textColor,
                        int position){
        tView = new TextView(context);
        tView.setText(text);
        tView.setTextColor(textColor);
        tView.setGravity(Gravity.CENTER);
        tView.setSingleLine();
    }

    @Override
    public void setColor(int color) {
        if (tView != null) tView.setTextColor(color);
    }

    @Override
    public View getView() {
        return tView;
    }
}
