package com.tencent.mm.i.a.a;

import com.tencent.gmtrace.GMTrace;

public final class b
  extends com.tencent.mm.bm.a
{
  public int fMA;
  public String fMB;
  public String fMz;
  public String userName;
  
  public b()
  {
    GMTrace.i(1593164431360L, 11870);
    GMTrace.o(1593164431360L, 11870);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(1593298649088L, 11871);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.userName != null) {
        paramVarArgs.e(1, this.userName);
      }
      if (this.fMz != null) {
        paramVarArgs.e(2, this.fMz);
      }
      paramVarArgs.fk(3, this.fMA);
      if (this.fMB != null) {
        paramVarArgs.e(4, this.fMB);
      }
      GMTrace.o(1593298649088L, 11871);
      return 0;
    }
    if (paramInt == 1) {
      if (this.userName == null) {
        break label418;
      }
    }
    label418:
    for (paramInt = b.a.a.b.b.a.f(1, this.userName) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.fMz != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.fMz);
      }
      i += b.a.a.a.fh(3, this.fMA);
      paramInt = i;
      if (this.fMB != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.fMB);
      }
      GMTrace.o(1593298649088L, 11871);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(1593298649088L, 11871);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        b localb = (b)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(1593298649088L, 11871);
          return -1;
        case 1: 
          localb.userName = locala.yqV.readString();
          GMTrace.o(1593298649088L, 11871);
          return 0;
        case 2: 
          localb.fMz = locala.yqV.readString();
          GMTrace.o(1593298649088L, 11871);
          return 0;
        case 3: 
          localb.fMA = locala.yqV.nj();
          GMTrace.o(1593298649088L, 11871);
          return 0;
        }
        localb.fMB = locala.yqV.readString();
        GMTrace.o(1593298649088L, 11871);
        return 0;
      }
      GMTrace.o(1593298649088L, 11871);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\i\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */