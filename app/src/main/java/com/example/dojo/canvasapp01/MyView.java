package com.example.dojo.canvasapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    private Paint paint;


    //コンストラクタ(初期設定
    public MyView(Context Con) {
        super(Con);

        paint = new Paint();
    }

    //絵画の処理
    @Override
    protected void onDraw(Canvas canvas){

        //背景
        canvas.drawColor(Color.BLUE);

        //円
        paint.setColor(Color.MAGENTA);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(25);
        canvas.drawCircle(300,500,90,paint);
        paint.setColor(Color.GREEN);
        canvas.drawCircle(400,500,90,paint);
    }



}
