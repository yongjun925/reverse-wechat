package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class azj
  extends com.tencent.mm.bm.a
{
  public String lPE;
  public int lQF;
  public String uNE;
  
  public azj()
  {
    GMTrace.i(19142937673728L, 142626);
    GMTrace.o(19142937673728L, 142626);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19143071891456L, 142627);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNE != null) {
        paramVarArgs.e(1, this.uNE);
      }
      paramVarArgs.fk(2, this.lQF);
      if (this.lPE != null) {
        paramVarArgs.e(3, this.lPE);
      }
      GMTrace.o(19143071891456L, 142627);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uNE == null) {
        break label345;
      }
    }
    label345:
    for (paramInt = b.a.a.b.b.a.f(1, this.uNE) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.lQF);
      paramInt = i;
      if (this.lPE != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.lPE);
      }
      GMTrace.o(19143071891456L, 142627);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(19143071891456L, 142627);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        azj localazj = (azj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(19143071891456L, 142627);
          return -1;
        case 1: 
          localazj.uNE = locala.yqV.readString();
          GMTrace.o(19143071891456L, 142627);
          return 0;
        case 2: 
          localazj.lQF = locala.yqV.nj();
          GMTrace.o(19143071891456L, 142627);
          return 0;
        }
        localazj.lPE = locala.yqV.readString();
        GMTrace.o(19143071891456L, 142627);
        return 0;
      }
      GMTrace.o(19143071891456L, 142627);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\azj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */