package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class zd
  extends ayx
{
  public String URL;
  
  public zd()
  {
    GMTrace.i(3941974671360L, 29370);
    GMTrace.o(3941974671360L, 29370);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3942108889088L, 29371);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.URL != null) {
        paramVarArgs.e(2, this.URL);
      }
      GMTrace.o(3942108889088L, 29371);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.URL != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.URL);
      }
      GMTrace.o(3942108889088L, 29371);
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
      GMTrace.o(3942108889088L, 29371);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      zd localzd = (zd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3942108889088L, 29371);
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
          localzd.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3942108889088L, 29371);
        return 0;
      }
      localzd.URL = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3942108889088L, 29371);
      return 0;
    }
    GMTrace.o(3942108889088L, 29371);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */