package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class sx
  extends azh
{
  public LinkedList<akx> ubh;
  public auq uiR;
  public String uiS;
  public String uiT;
  
  public sx()
  {
    GMTrace.i(3899561869312L, 29054);
    this.ubh = new LinkedList();
    GMTrace.o(3899561869312L, 29054);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3899696087040L, 29055);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.ubh);
      if (this.uiR != null)
      {
        paramVarArgs.fm(3, this.uiR.aYq());
        this.uiR.a(paramVarArgs);
      }
      if (this.uiS != null) {
        paramVarArgs.e(4, this.uiS);
      }
      if (this.uiT != null) {
        paramVarArgs.e(5, this.uiT);
      }
      GMTrace.o(3899696087040L, 29055);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.ubh);
      paramInt = i;
      if (this.uiR != null) {
        paramInt = i + b.a.a.a.fj(3, this.uiR.aYq());
      }
      i = paramInt;
      if (this.uiS != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uiS);
      }
      paramInt = i;
      if (this.uiT != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uiT);
      }
      GMTrace.o(3899696087040L, 29055);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ubh.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3899696087040L, 29055);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      sx localsx = (sx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3899696087040L, 29055);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localsx.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3899696087040L, 29055);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new akx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((akx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localsx.ubh.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3899696087040L, 29055);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new auq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((auq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localsx.uiR = ((auq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3899696087040L, 29055);
        return 0;
      case 4: 
        localsx.uiS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3899696087040L, 29055);
        return 0;
      }
      localsx.uiT = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3899696087040L, 29055);
      return 0;
    }
    GMTrace.o(3899696087040L, 29055);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\sx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */