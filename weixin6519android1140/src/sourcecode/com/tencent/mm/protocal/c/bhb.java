package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bhb
  extends com.tencent.mm.bm.a
{
  public String jyV;
  public String uSV;
  
  public bhb()
  {
    GMTrace.i(3858893897728L, 28751);
    GMTrace.o(3858893897728L, 28751);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3859028115456L, 28752);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uSV != null) {
        paramVarArgs.e(1, this.uSV);
      }
      if (this.jyV != null) {
        paramVarArgs.e(2, this.jyV);
      }
      GMTrace.o(3859028115456L, 28752);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uSV == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.uSV) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jyV != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jyV);
      }
      GMTrace.o(3859028115456L, 28752);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3859028115456L, 28752);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bhb localbhb = (bhb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3859028115456L, 28752);
          return -1;
        case 1: 
          localbhb.uSV = locala.yqV.readString();
          GMTrace.o(3859028115456L, 28752);
          return 0;
        }
        localbhb.jyV = locala.yqV.readString();
        GMTrace.o(3859028115456L, 28752);
        return 0;
      }
      GMTrace.o(3859028115456L, 28752);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bhb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */