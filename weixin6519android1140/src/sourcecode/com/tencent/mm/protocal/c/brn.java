package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class brn
  extends com.tencent.mm.bm.a
{
  public String path;
  public String username;
  
  public brn()
  {
    GMTrace.i(3960228282368L, 29506);
    GMTrace.o(3960228282368L, 29506);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3960362500096L, 29507);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      if (this.path != null) {
        paramVarArgs.e(2, this.path);
      }
      GMTrace.o(3960362500096L, 29507);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.username) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.path != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.path);
      }
      GMTrace.o(3960362500096L, 29507);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3960362500096L, 29507);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        brn localbrn = (brn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3960362500096L, 29507);
          return -1;
        case 1: 
          localbrn.username = locala.yqV.readString();
          GMTrace.o(3960362500096L, 29507);
          return 0;
        }
        localbrn.path = locala.yqV.readString();
        GMTrace.o(3960362500096L, 29507);
        return 0;
      }
      GMTrace.o(3960362500096L, 29507);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\brn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */