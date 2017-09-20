package com.example.antony.myapplication;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by antony on 9/20/17.
 */

public class IOSItemSwipeLayout extends RelativeLayout {

    private ViewGroup mainPart, leftPart, rightPart;

    public IOSItemSwipeLayout(Context context) {
        super(context);
    }

    public IOSItemSwipeLayout(Context context, ViewGroup mainPart, ViewGroup leftPart, ViewGroup rightPart) {
        super(context);
        this.mainPart = mainPart;
        this.leftPart = leftPart;
        this.rightPart = rightPart;
    }


}
