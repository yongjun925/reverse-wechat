package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bjl
  extends com.tencent.mm.bm.a
{
  public String lPi;
  public double tWm;
  public double tWn;
  public String uHS;
  
  public bjl()
  {
    GMTrace.i(3661325402112L, 27279);
    GMTrace.o(3661325402112L, 27279);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3661459619840L, 27280);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.a(1, this.tWn);
      paramVarArgs.a(2, this.tWm);
      if (this.lPi != null) {
        paramVarArgs.e(3, this.lPi);
      }
      if (this.uHS != null) {
        paramVarArgs.e(4, this.uHS);
      }
      GMTrace.o(3661459619840L, 27280);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.b.b.a.cK(1) + 8 + 0 + (b.a.a.b.b.a.cK(2) + 8);
      paramInt = i;
      if (this.lPi != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.lPi);
      }
      i = paramInt;
      if (this.uHS != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uHS);
      }
      GMTrace.o(3661459619840L, 27280);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3661459619840L, 27280);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bjl localbjl = (bjl)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3661459619840L, 27280);
        return -1;
      case 1: 
        localbjl.tWn = locala.yqV.readDouble();
        GMTrace.o(3661459619840L, 27280);
        return 0;
      case 2: 
        localbjl.tWm = locala.yqV.readDouble();
        GMTrace.o(3661459619840L, 27280);
        return 0;
      case 3: 
        localbjl.lPi = locala.yqV.readString();
        GMTrace.o(3661459619840L, 27280);
        return 0;
      }
      localbjl.uHS = locala.yqV.readString();
      GMTrace.o(3661459619840L, 27280);
      return 0;
    }
    GMTrace.o(3661459619840L, 27280);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bjl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */