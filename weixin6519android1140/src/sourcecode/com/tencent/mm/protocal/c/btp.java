package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class btp
  extends com.tencent.mm.bm.a
{
  public boolean vcp;
  
  public btp()
  {
    GMTrace.i(3901709352960L, 29070);
    GMTrace.o(3901709352960L, 29070);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3901843570688L, 29071);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).ah(1, this.vcp);
      GMTrace.o(3901843570688L, 29071);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.b.b.a.cK(1);
      GMTrace.o(3901843570688L, 29071);
      return paramInt + 1 + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3901843570688L, 29071);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      btp localbtp = (btp)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3901843570688L, 29071);
        return -1;
      }
      localbtp.vcp = locala.csU();
      GMTrace.o(3901843570688L, 29071);
      return 0;
    }
    GMTrace.o(3901843570688L, 29071);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\btp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */