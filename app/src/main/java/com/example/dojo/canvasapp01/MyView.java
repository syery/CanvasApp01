package com.example.dojo.canvasapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {
    private Paint paint;
    private Path path;


    //コンストラクタ(初期設定
    public MyView(Context Con) {
        super(Con);

        paint = new Paint();
        path = new Path();
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

        //四角
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawRect(150,200,690,600,paint);

        //線
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(20);
        canvas.drawLine(0,0,canvas.getWidth(),canvas.getHeight(),paint);
        canvas.drawLine(0,canvas.getHeight(),canvas.getWidth(),0,paint);

        //三角形

        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(400,400);
        path.lineTo(800,700);
        path.lineTo(700,400);
        path.lineTo(400,400);
        canvas.drawPath(path,paint);

        //国旗
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        canvas.drawRect(150,200,690,600,paint);


    }



}
