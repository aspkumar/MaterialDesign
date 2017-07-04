package com.example.prasannakumara.materialdesign;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by PrasannakumarA on 5/2/2017.
 */

public class CircleCustomView extends View {


    Paint p;

    public CircleCustomView(Context context) {
        super(context);
    }

    public CircleCustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray=context.getTheme().obtainStyledAttributes(attrs, R.styleable.CircleCustomView,0,0);
//         circleColor=typedArray.getInteger(R.styleable.CircleCustomView_circleColor,0);

    }

    public CircleCustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CircleCustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p.setColor(Color.RED);
        canvas.drawCircle(150,150,75,p);
    }

    public void setColor(int newColor)
    {
        p=new Paint();
        p.setColor(newColor);
    }


}
