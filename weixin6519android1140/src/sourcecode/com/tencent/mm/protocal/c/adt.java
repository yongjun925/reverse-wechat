package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class adt
  extends ayx
{
  public String username;
  public String utA;
  
  public adt()
  {
    GMTrace.i(17877801369600L, 133200);
    GMTrace.o(17877801369600L, 133200);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17877935587328L, 133201);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.username != null) {
        paramVarArgs.e(2, this.username);
      }
      if (this.utA != null) {
        paramVarArgs.e(3, this.utA);
      }
      GMTrace.o(17877935587328L, 133201);
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
      if (this.username != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.username);
      }
      i = paramInt;
      if (this.utA != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.utA);
      }
      GMTrace.o(17877935587328L, 133201);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17877935587328L, 133201);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      adt localadt = (adt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17877935587328L, 133201);
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
          localadt.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17877935587328L, 133201);
        return 0;
      case 2: 
        localadt.username = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17877935587328L, 133201);
        return 0;
      }
      localadt.utA = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(17877935587328L, 133201);
      return 0;
    }
    GMTrace.o(17877935587328L, 133201);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\adt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */