package com.wamod.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import com.wamod.Utils;

/**
 * Created by BrianValente on 3/27/16.
 */
public class SeparatorView extends View {
    public SeparatorView(Context context) {
        super(context);
        init();
    }

    public SeparatorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SeparatorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public SeparatorView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        if (Utils.nightModeShouldRun()) {
            setBackgroundColor(Utils.getDarkColor(0));
            invalidate();
            requestLayout();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        init();
    }
}