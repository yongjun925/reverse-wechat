package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aan
  extends ayx
{
  public String lQa;
  public String urh;
  public String urj;
  
  public aan()
  {
    GMTrace.i(3752861892608L, 27961);
    GMTrace.o(3752861892608L, 27961);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3752996110336L, 27962);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      if (this.urh != null) {
        paramVarArgs.e(3, this.urh);
      }
      if (this.urj != null) {
        paramVarArgs.e(4, this.urj);
      }
      GMTrace.o(3752996110336L, 27962);
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
      if (this.lQa != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lQa);
      }
      i = paramInt;
      if (this.urh != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.urh);
      }
      paramInt = i;
      if (this.urj != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.urj);
      }
      GMTrace.o(3752996110336L, 27962);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3752996110336L, 27962);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aan localaan = (aan)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3752996110336L, 27962);
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
          localaan.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3752996110336L, 27962);
        return 0;
      case 2: 
        localaan.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3752996110336L, 27962);
        return 0;
      case 3: 
        localaan.urh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3752996110336L, 27962);
        return 0;
      }
      localaan.urj = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3752996110336L, 27962);
      return 0;
    }
    GMTrace.o(3752996110336L, 27962);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\aan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */