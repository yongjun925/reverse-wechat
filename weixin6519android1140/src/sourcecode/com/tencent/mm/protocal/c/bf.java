package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class bf
  extends com.tencent.mm.bm.a
{
  public int tPx;
  public b tPy;
  public long tPz;
  
  public bf()
  {
    GMTrace.i(3705617252352L, 27609);
    GMTrace.o(3705617252352L, 27609);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3705751470080L, 27610);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tPx);
      if (this.tPy != null) {
        paramVarArgs.b(2, this.tPy);
      }
      paramVarArgs.T(3, this.tPz);
      GMTrace.o(3705751470080L, 27610);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tPx) + 0;
      paramInt = i;
      if (this.tPy != null) {
        paramInt = i + b.a.a.a.a(2, this.tPy);
      }
      i = b.a.a.a.S(3, this.tPz);
      GMTrace.o(3705751470080L, 27610);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3705751470080L, 27610);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bf localbf = (bf)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3705751470080L, 27610);
        return -1;
      case 1: 
        localbf.tPx = locala.yqV.nj();
        GMTrace.o(3705751470080L, 27610);
        return 0;
      case 2: 
        localbf.tPy = locala.csV();
        GMTrace.o(3705751470080L, 27610);
        return 0;
      }
      localbf.tPz = locala.yqV.nk();
      GMTrace.o(3705751470080L, 27610);
      return 0;
    }
    GMTrace.o(3705751470080L, 27610);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */