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

public final class ais
  extends c
{
  private final int height;
  private final int width;
  
  public ais()
  {
    GMTrace.i(16234707943424L, 120958);
    this.width = 111;
    this.height = 144;
    GMTrace.o(16234707943424L, 120958);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16234842161152L, 120959);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16234842161152L, 120959);
      return 0;
      GMTrace.o(16234842161152L, 120959);
      return 111;
      GMTrace.o(16234842161152L, 120959);
      return 144;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
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
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint1.setColor(-3223858);
      localPaint2.setColor(-3223858);
      localPaint2.setStrokeWidth(0.6086956F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 36.0F, 0.0F, 1.0F, 55.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      Paint localPaint3 = c.a(localPaint1, paramVarArgs);
      Paint localPaint4 = c.a(localPaint2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(32.162163F, 34.0F);
      localPath.lineTo(34.0F, 32.162163F);
      localPath.lineTo(1.8378378F, 0.0F);
      localPath.lineTo(0.0F, 1.8378378F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint3);
      localCanvas.drawPath(localPath, localPaint4);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, -1.0F, 0.0F, 34.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(32.162163F, 34.0F);
      ((Path)localObject).lineTo(34.0F, 32.162163F);
      ((Path)localObject).lineTo(1.8378378F, 0.0F);
      ((Path)localObject).lineTo(0.0F, 1.8378378F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.drawPath((Path)localObject, localPaint2);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ais.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */