package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class rs
  extends ayx
{
  public int tOG;
  public String tRS;
  public String uib;
  public int uic;
  
  public rs()
  {
    GMTrace.i(3753130328064L, 27963);
    GMTrace.o(3753130328064L, 27963);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3753264545792L, 27964);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tRS != null) {
        paramVarArgs.e(2, this.tRS);
      }
      if (this.uib != null) {
        paramVarArgs.e(3, this.uib);
      }
      paramVarArgs.fk(4, this.uic);
      paramVarArgs.fk(5, this.tOG);
      GMTrace.o(3753264545792L, 27964);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.tRS != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tRS);
      }
      i = paramInt;
      if (this.uib != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uib);
      }
      paramInt = b.a.a.a.fh(4, this.uic);
      int j = b.a.a.a.fh(5, this.tOG);
      GMTrace.o(3753264545792L, 27964);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3753264545792L, 27964);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      rs localrs = (rs)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3753264545792L, 27964);
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
          localrs.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3753264545792L, 27964);
        return 0;
      case 2: 
        localrs.tRS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3753264545792L, 27964);
        return 0;
      case 3: 
        localrs.uib = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3753264545792L, 27964);
        return 0;
      case 4: 
        localrs.uic = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3753264545792L, 27964);
        return 0;
      }
      localrs.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3753264545792L, 27964);
      return 0;
    }
    GMTrace.o(3753264545792L, 27964);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\rs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */