package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class br
  extends com.tencent.mm.bm.a
{
  public String lPE;
  public String lPj;
  
  public br()
  {
    GMTrace.i(12635391131648L, 94141);
    GMTrace.o(12635391131648L, 94141);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12635525349376L, 94142);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPj == null) {
        throw new b("Not all required fields were included: Desc");
      }
      if (this.lPj != null) {
        paramVarArgs.e(1, this.lPj);
      }
      if (this.lPE != null) {
        paramVarArgs.e(2, this.lPE);
      }
      GMTrace.o(12635525349376L, 94142);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPj == null) {
        break label334;
      }
    }
    label334:
    for (paramInt = b.a.a.b.b.a.f(1, this.lPj) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lPE != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPE);
      }
      GMTrace.o(12635525349376L, 94142);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.lPj == null) {
          throw new b("Not all required fields were included: Desc");
        }
        GMTrace.o(12635525349376L, 94142);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        br localbr = (br)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12635525349376L, 94142);
          return -1;
        case 1: 
          localbr.lPj = locala.yqV.readString();
          GMTrace.o(12635525349376L, 94142);
          return 0;
        }
        localbr.lPE = locala.yqV.readString();
        GMTrace.o(12635525349376L, 94142);
        return 0;
      }
      GMTrace.o(12635525349376L, 94142);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */