package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class vp
  extends com.tencent.mm.bm.a
{
  public int eQl;
  public int uok;
  public LinkedList<ry> uol;
  public int uom;
  
  public vp()
  {
    GMTrace.i(4011096801280L, 29885);
    this.uol = new LinkedList();
    GMTrace.o(4011096801280L, 29885);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4011231019008L, 29886);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uok);
      paramVarArgs.d(2, 8, this.uol);
      paramVarArgs.fk(3, this.uom);
      paramVarArgs.fk(4, this.eQl);
      GMTrace.o(4011231019008L, 29886);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uok);
      i = b.a.a.a.c(2, 8, this.uol);
      int j = b.a.a.a.fh(3, this.uom);
      int k = b.a.a.a.fh(4, this.eQl);
      GMTrace.o(4011231019008L, 29886);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uol.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4011231019008L, 29886);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      vp localvp = (vp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4011231019008L, 29886);
        return -1;
      case 1: 
        localvp.uok = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4011231019008L, 29886);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ry();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((ry)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localvp.uol.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4011231019008L, 29886);
        return 0;
      case 3: 
        localvp.uom = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4011231019008L, 29886);
        return 0;
      }
      localvp.eQl = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4011231019008L, 29886);
      return 0;
    }
    GMTrace.o(4011231019008L, 29886);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\vp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */