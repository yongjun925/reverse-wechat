package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bpr
  extends com.tencent.mm.bm.a
{
  public int jib;
  public azp tTe;
  
  public bpr()
  {
    GMTrace.i(3762794004480L, 28035);
    GMTrace.o(3762794004480L, 28035);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3762928222208L, 28036);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      paramVarArgs.fk(1, this.jib);
      if (this.tTe != null)
      {
        paramVarArgs.fm(2, this.tTe.aYq());
        this.tTe.a(paramVarArgs);
      }
      GMTrace.o(3762928222208L, 28036);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.jib) + 0;
      paramInt = i;
      if (this.tTe != null) {
        paramInt = i + b.a.a.a.fj(2, this.tTe.aYq());
      }
      GMTrace.o(3762928222208L, 28036);
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
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      GMTrace.o(3762928222208L, 28036);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bpr localbpr = (bpr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3762928222208L, 28036);
        return -1;
      case 1: 
        localbpr.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3762928222208L, 28036);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbpr.tTe = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3762928222208L, 28036);
      return 0;
    }
    GMTrace.o(3762928222208L, 28036);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */