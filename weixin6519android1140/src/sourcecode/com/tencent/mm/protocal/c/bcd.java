package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bcd
  extends ayx
{
  public int uEq;
  public int uOT;
  public LinkedList<bqg> uOU;
  public int uOV;
  
  public bcd()
  {
    GMTrace.i(3688168947712L, 27479);
    this.uOU = new LinkedList();
    GMTrace.o(3688168947712L, 27479);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3688303165440L, 27480);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uEq);
      paramVarArgs.fk(3, this.uOT);
      paramVarArgs.d(4, 8, this.uOU);
      paramVarArgs.fk(5, this.uOV);
      GMTrace.o(3688303165440L, 27480);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.uEq);
      int j = b.a.a.a.fh(3, this.uOT);
      int k = b.a.a.a.c(4, 8, this.uOU);
      int m = b.a.a.a.fh(5, this.uOV);
      GMTrace.o(3688303165440L, 27480);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uOU.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3688303165440L, 27480);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bcd localbcd = (bcd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3688303165440L, 27480);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbcd.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3688303165440L, 27480);
        return 0;
      case 2: 
        localbcd.uEq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3688303165440L, 27480);
        return 0;
      case 3: 
        localbcd.uOT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3688303165440L, 27480);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqg();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqg)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbcd.uOU.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3688303165440L, 27480);
        return 0;
      }
      localbcd.uOV = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3688303165440L, 27480);
      return 0;
    }
    GMTrace.o(3688303165440L, 27480);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */