package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class gr
  extends com.tencent.mm.bm.a
{
  public LinkedList<bvb> tVq;
  public LinkedList<bvb> tVr;
  
  public gr()
  {
    GMTrace.i(3658372612096L, 27257);
    this.tVq = new LinkedList();
    this.tVr = new LinkedList();
    GMTrace.o(3658372612096L, 27257);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3658506829824L, 27258);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.tVq);
      paramVarArgs.d(2, 8, this.tVr);
      GMTrace.o(3658506829824L, 27258);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.tVq);
      i = b.a.a.a.c(2, 8, this.tVr);
      GMTrace.o(3658506829824L, 27258);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tVq.clear();
      this.tVr.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3658506829824L, 27258);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      gr localgr = (gr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3658506829824L, 27258);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bvb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bvb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localgr.tVq.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3658506829824L, 27258);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bvb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bvb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localgr.tVr.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3658506829824L, 27258);
      return 0;
    }
    GMTrace.o(3658506829824L, 27258);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\gr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */