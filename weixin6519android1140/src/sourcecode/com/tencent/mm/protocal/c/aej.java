package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aej
  extends ayx
{
  public int tMZ;
  public int tRC;
  public int tRD;
  public int utV;
  
  public aej()
  {
    GMTrace.i(3865336348672L, 28799);
    GMTrace.o(3865336348672L, 28799);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3865470566400L, 28800);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.utV);
      paramVarArgs.fk(3, this.tRC);
      paramVarArgs.fk(4, this.tRD);
      paramVarArgs.fk(5, this.tMZ);
      GMTrace.o(3865470566400L, 28800);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.utV);
      int j = b.a.a.a.fh(3, this.tRC);
      int k = b.a.a.a.fh(4, this.tRD);
      int m = b.a.a.a.fh(5, this.tMZ);
      GMTrace.o(3865470566400L, 28800);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3865470566400L, 28800);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aej localaej = (aej)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3865470566400L, 28800);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaej.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3865470566400L, 28800);
        return 0;
      case 2: 
        localaej.utV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3865470566400L, 28800);
        return 0;
      case 3: 
        localaej.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3865470566400L, 28800);
        return 0;
      case 4: 
        localaej.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3865470566400L, 28800);
        return 0;
      }
      localaej.tMZ = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3865470566400L, 28800);
      return 0;
    }
    GMTrace.o(3865470566400L, 28800);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */