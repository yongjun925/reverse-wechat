package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class hd
  extends c
{
  private final int height;
  private final int width;
  
  public hd()
  {
    GMTrace.i(15870038376448L, 118241);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15870038376448L, 118241);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15870172594176L, 118242);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15870172594176L, 118242);
      return 0;
      GMTrace.o(15870172594176L, 118242);
      return 96;
      GMTrace.o(15870172594176L, 118242);
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.h(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-8683387);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(69.0F, 12.0F);
      ((Path)localObject).lineTo(60.0F, 21.0F);
      ((Path)localObject).lineTo(69.0F, 29.0F);
      ((Path)localObject).lineTo(77.0F, 21.0F);
      ((Path)localObject).lineTo(69.0F, 12.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(20.0F, 60.0F);
      ((Path)localObject).lineTo(20.0F, 60.0F);
      ((Path)localObject).lineTo(20.0F, 60.0F);
      ((Path)localObject).lineTo(20.0F, 69.0F);
      ((Path)localObject).lineTo(29.0F, 69.0F);
      ((Path)localObject).lineTo(63.0F, 34.0F);
      ((Path)localObject).lineTo(55.0F, 26.0F);
      ((Path)localObject).lineTo(20.0F, 60.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(12.0F, 85.0F);
      ((Path)localObject).lineTo(85.0F, 85.0F);
      ((Path)localObject).lineTo(85.0F, 77.0F);
      ((Path)localObject).lineTo(12.0F, 77.0F);
      ((Path)localObject).lineTo(12.0F, 85.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\hd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */