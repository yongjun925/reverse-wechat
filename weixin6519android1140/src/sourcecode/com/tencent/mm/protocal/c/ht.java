package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ht
  extends com.tencent.mm.bm.a
{
  public String tWJ;
  public int tWK;
  public String tWL;
  public int tWM;
  public LinkedList<gt> tWN;
  
  public ht()
  {
    GMTrace.i(3772457680896L, 28107);
    this.tWN = new LinkedList();
    GMTrace.o(3772457680896L, 28107);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3772591898624L, 28108);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tWJ != null) {
        paramVarArgs.e(1, this.tWJ);
      }
      paramVarArgs.fk(2, this.tWK);
      if (this.tWL != null) {
        paramVarArgs.e(3, this.tWL);
      }
      paramVarArgs.fk(4, this.tWM);
      paramVarArgs.d(5, 8, this.tWN);
      GMTrace.o(3772591898624L, 28108);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tWJ != null) {
        paramInt = b.a.a.b.b.a.f(1, this.tWJ) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tWK);
      paramInt = i;
      if (this.tWL != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tWL);
      }
      i = b.a.a.a.fh(4, this.tWM);
      int j = b.a.a.a.c(5, 8, this.tWN);
      GMTrace.o(3772591898624L, 28108);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tWN.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3772591898624L, 28108);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ht localht = (ht)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3772591898624L, 28108);
        return -1;
      case 1: 
        localht.tWJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3772591898624L, 28108);
        return 0;
      case 2: 
        localht.tWK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3772591898624L, 28108);
        return 0;
      case 3: 
        localht.tWL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3772591898624L, 28108);
        return 0;
      case 4: 
        localht.tWM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3772591898624L, 28108);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new gt();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((gt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localht.tWN.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3772591898624L, 28108);
      return 0;
    }
    GMTrace.o(3772591898624L, 28108);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */