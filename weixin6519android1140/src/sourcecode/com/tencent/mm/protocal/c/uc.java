package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class uc
  extends com.tencent.mm.bm.a
{
  public LinkedList<ub> ulN;
  
  public uc()
  {
    GMTrace.i(3793798299648L, 28266);
    this.ulN = new LinkedList();
    GMTrace.o(3793798299648L, 28266);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3793932517376L, 28267);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).d(1, 8, this.ulN);
      GMTrace.o(3793932517376L, 28267);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.ulN);
      GMTrace.o(3793932517376L, 28267);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ulN.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3793932517376L, 28267);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      uc localuc = (uc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3793932517376L, 28267);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ub();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((ub)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localuc.ulN.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3793932517376L, 28267);
      return 0;
    }
    GMTrace.o(3793932517376L, 28267);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\uc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */