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

public final class v
  extends c
{
  private final int height;
  private final int width;
  
  public v()
  {
    GMTrace.i(15841852653568L, 118031);
    this.width = 90;
    this.height = 90;
    GMTrace.o(15841852653568L, 118031);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15841986871296L, 118032);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15841986871296L, 118032);
      return 0;
      GMTrace.o(15841986871296L, 118032);
      return 90;
      GMTrace.o(15841986871296L, 118032);
      return 90;
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
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -245.0F, 0.0F, 1.0F, -283.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 245.0F, 0.0F, 1.0F, 283.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(2113929216);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(90.0F, 0.0F);
      ((Path)localObject2).lineTo(90.0F, 90.0F);
      ((Path)localObject2).lineTo(0.0F, 90.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(45.0F, 27.0F);
      ((Path)localObject1).cubicTo(47.761425F, 27.0F, 50.0F, 24.761423F, 50.0F, 22.0F);
      ((Path)localObject1).cubicTo(50.0F, 19.238577F, 47.761425F, 17.0F, 45.0F, 17.0F);
      ((Path)localObject1).cubicTo(42.238575F, 17.0F, 40.0F, 19.238577F, 40.0F, 22.0F);
      ((Path)localObject1).cubicTo(40.0F, 24.761423F, 42.238575F, 27.0F, 45.0F, 27.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(45.0F, 50.0F);
      ((Path)localObject1).cubicTo(47.761425F, 50.0F, 50.0F, 47.761425F, 50.0F, 45.0F);
      ((Path)localObject1).cubicTo(50.0F, 42.238575F, 47.761425F, 40.0F, 45.0F, 40.0F);
      ((Path)localObject1).cubicTo(42.238575F, 40.0F, 40.0F, 42.238575F, 40.0F, 45.0F);
      ((Path)localObject1).cubicTo(40.0F, 47.761425F, 42.238575F, 50.0F, 45.0F, 50.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(45.0F, 73.0F);
      ((Path)localObject1).cubicTo(47.761425F, 73.0F, 50.0F, 70.76142F, 50.0F, 68.0F);
      ((Path)localObject1).cubicTo(50.0F, 65.23858F, 47.761425F, 63.0F, 45.0F, 63.0F);
      ((Path)localObject1).cubicTo(42.238575F, 63.0F, 40.0F, 65.23858F, 40.0F, 68.0F);
      ((Path)localObject1).cubicTo(40.0F, 70.76142F, 42.238575F, 73.0F, 45.0F, 73.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */