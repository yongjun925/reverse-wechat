package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ff
  extends ayx
{
  public int jhc;
  public int tTN;
  public LinkedList<azq> tTO;
  
  public ff()
  {
    GMTrace.i(3923184189440L, 29230);
    this.tTO = new LinkedList();
    GMTrace.o(3923184189440L, 29230);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3923318407168L, 29231);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tTN);
      paramVarArgs.fk(3, this.jhc);
      paramVarArgs.d(4, 8, this.tTO);
      GMTrace.o(3923318407168L, 29231);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.tTN);
      int j = b.a.a.a.fh(3, this.jhc);
      int k = b.a.a.a.c(4, 8, this.tTO);
      GMTrace.o(3923318407168L, 29231);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tTO.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3923318407168L, 29231);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ff localff = (ff)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3923318407168L, 29231);
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
          localff.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3923318407168L, 29231);
        return 0;
      case 2: 
        localff.tTN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3923318407168L, 29231);
        return 0;
      case 3: 
        localff.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3923318407168L, 29231);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localff.tTO.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3923318407168L, 29231);
      return 0;
    }
    GMTrace.o(3923318407168L, 29231);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */