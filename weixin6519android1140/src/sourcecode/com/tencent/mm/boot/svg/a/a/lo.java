package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class lo
  extends c
{
  private final int height;
  private final int width;
  
  public lo()
  {
    GMTrace.i(15918088323072L, 118599);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15918088323072L, 118599);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15918222540800L, 118600);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15918222540800L, 118600);
      return 0;
      GMTrace.o(15918222540800L, 118600);
      return 96;
      GMTrace.o(15918222540800L, 118600);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-9473160);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 8.0F, 0.0F, 1.0F, 17.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(77.0F, 49.0F);
      ((Path)localObject2).lineTo(46.0F, 49.0F);
      ((Path)localObject2).lineTo(35.0F, 49.0F);
      ((Path)localObject2).lineTo(3.0F, 49.0F);
      ((Path)localObject2).lineTo(3.0F, 3.0F);
      ((Path)localObject2).lineTo(77.0F, 3.0F);
      ((Path)localObject2).lineTo(77.0F, 49.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(48.513F, 60.0F);
      ((Path)localObject2).lineTo(32.487F, 60.0F);
      ((Path)localObject2).lineTo(38.0F, 58.162F);
      ((Path)localObject2).lineTo(38.0F, 52.0F);
      ((Path)localObject2).lineTo(43.0F, 52.0F);
      ((Path)localObject2).lineTo(43.0F, 58.162F);
      ((Path)localObject2).lineTo(48.513F, 60.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(77.129F, 0.0F);
      ((Path)localObject2).lineTo(2.871F, 0.0F);
      ((Path)localObject2).cubicTo(1.289F, 0.0F, 0.0F, 1.285F, 0.0F, 2.87F);
      ((Path)localObject2).lineTo(0.0F, 49.13F);
      ((Path)localObject2).cubicTo(0.0F, 50.715F, 1.285F, 52.0F, 2.871F, 52.0F);
      ((Path)localObject2).lineTo(35.0F, 52.0F);
      ((Path)localObject2).lineTo(35.0F, 56.0F);
      ((Path)localObject2).lineTo(23.0F, 60.0F);
      ((Path)localObject2).lineTo(23.0F, 63.0F);
      ((Path)localObject2).lineTo(58.0F, 63.0F);
      ((Path)localObject2).lineTo(58.0F, 60.0F);
      ((Path)localObject2).lineTo(46.0F, 56.0F);
      ((Path)localObject2).lineTo(46.0F, 52.0F);
      ((Path)localObject2).lineTo(77.129F, 52.0F);
      ((Path)localObject2).cubicTo(78.711F, 52.0F, 80.0F, 50.715F, 80.0F, 49.13F);
      ((Path)localObject2).lineTo(80.0F, 2.87F);
      ((Path)localObject2).cubicTo(80.0F, 1.285F, 78.715F, 0.0F, 77.129F, 0.0F);
      ((Path)localObject2).lineTo(77.129F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\lo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */