package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bro
  extends com.tencent.mm.bm.a
{
  public String tRz;
  public long vbl;
  
  public bro()
  {
    GMTrace.i(3765746794496L, 28057);
    GMTrace.o(3765746794496L, 28057);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3765881012224L, 28058);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRz == null) {
        throw new b("Not all required fields were included: Username");
      }
      paramVarArgs.T(1, this.vbl);
      if (this.tRz != null) {
        paramVarArgs.e(2, this.tRz);
      }
      GMTrace.o(3765881012224L, 28058);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.S(1, this.vbl) + 0;
      paramInt = i;
      if (this.tRz != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tRz);
      }
      GMTrace.o(3765881012224L, 28058);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tRz == null) {
        throw new b("Not all required fields were included: Username");
      }
      GMTrace.o(3765881012224L, 28058);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bro localbro = (bro)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3765881012224L, 28058);
        return -1;
      case 1: 
        localbro.vbl = locala.yqV.nk();
        GMTrace.o(3765881012224L, 28058);
        return 0;
      }
      localbro.tRz = locala.yqV.readString();
      GMTrace.o(3765881012224L, 28058);
      return 0;
    }
    GMTrace.o(3765881012224L, 28058);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */