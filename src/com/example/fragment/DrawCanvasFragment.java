package com.example.fragment;


import com.example.stepviewapp.R;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * 鏃ユ湡锛�16/6/24 20:00
 * <p>
 * 鎻忚堪锛�
 */
public class DrawCanvasFragment extends Fragment
{
    View mView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return new RectView(container.getContext());
    }
    public class RectView extends View
    {

        public RectView(Context context)
        {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas)
        {

            super.onDraw(canvas);
            setBackgroundResource(R.drawable.default_bg);//璁剧疆鑳屾櫙鑹�

            //--------------------------缁樺埗鐭╁舰-----------------------------------------------------
            Paint paint = new Paint();// 瀹氫箟鐢荤瑪
            paint.setStyle(Paint.Style.FILL);//璁剧疆瀹炲績
            paint.setAntiAlias(true);// 娑堥櫎閿娇
            paint.setColor(Color.WHITE);//璁剧疆鐢荤瑪棰滆壊
            paint.setStrokeWidth(40);// 璁剧疆paint鐨勫妗嗗搴�
            canvas.drawRect(200, 200, 800, 220, paint);//缁樺埗鐭╁舰
            //--------------------------缁樺埗鐭╁舰-----------------------------------------------------


            //--------------------------缁樺埗鍦�-----------------------------------------------------
            canvas.drawCircle(350, 350, 100, paint);
            //--------------------------缁樺埗鍦�-----------------------------------------------------

            //--------------------------缁樺埗铏氱嚎-----------------------------------------------------

            Paint pathPaint = new Paint();
            pathPaint.setAntiAlias(true);
            pathPaint.setColor(Color.WHITE);
            pathPaint.setStyle(Paint.Style.STROKE);
            pathPaint.setStrokeWidth(2);
            DashPathEffect mEffects = new DashPathEffect(new float[]{8, 8, 8, 8}, 1);
            Path path = new Path();
            path.moveTo(200, 600);
            path.lineTo(800, 600);
            pathPaint.setPathEffect(mEffects);
            canvas.drawPath(path, pathPaint);
            //--------------------------缁樺埗铏氱嚎-----------------------------------------------------


        }
    }
}
