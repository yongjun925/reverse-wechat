package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class brg
  extends azh
{
  public String tWC;
  
  public brg()
  {
    GMTrace.i(4003312173056L, 29827);
    GMTrace.o(4003312173056L, 29827);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4003446390784L, 29828);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.tWC != null) {
        paramVarArgs.e(2, this.tWC);
      }
      GMTrace.o(4003446390784L, 29828);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.tWC != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tWC);
      }
      GMTrace.o(4003446390784L, 29828);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4003446390784L, 29828);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      brg localbrg = (brg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4003446390784L, 29828);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbrg.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4003446390784L, 29828);
        return 0;
      }
      localbrg.tWC = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4003446390784L, 29828);
      return 0;
    }
    GMTrace.o(4003446390784L, 29828);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\brg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */