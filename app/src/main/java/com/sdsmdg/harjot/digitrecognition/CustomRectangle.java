package com.sdsmdg.harjot.digitrecognition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Harjot on 06-Dec-16.
 */

public class CustomRectangle extends View {
    public CustomRectangle(Context context) {
        super(context);
    }

    public CustomRectangle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomRectangle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvas.drawColor(Color.parseColor("#60000000"));
        Paint borderPaint = new Paint();
        borderPaint.setARGB(255, 255, 255, 255);
        borderPaint.setStyle(Paint.Style.STROKE);
        borderPaint.setStrokeWidth(4);

        Paint innerPaint = new Paint();
        innerPaint.setARGB(0, 0, 0, 0);
        innerPaint.setAlpha(0);
        innerPaint.setStyle(Paint.Style.FILL);

        RectF outerRect = new RectF();
        outerRect.set(0, 0, width, height);

        RectF innerRect = new RectF();
        innerRect.set(width / 5, height / 5, (4 * width) / 5, (4 * height) / 5);

        canvas.drawRect(innerRect, borderPaint);
//        canvas.drawRect(innerRect, innerPaint);
    }
}
