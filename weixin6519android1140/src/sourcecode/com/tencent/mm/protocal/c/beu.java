package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class beu
  extends ayx
{
  public long uQA;
  public String uQB;
  public int uQC;
  public String uQz;
  
  public beu()
  {
    GMTrace.i(3731655491584L, 27803);
    GMTrace.o(3731655491584L, 27803);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3731789709312L, 27804);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uQz != null) {
        paramVarArgs.e(2, this.uQz);
      }
      paramVarArgs.T(3, this.uQA);
      if (this.uQB != null) {
        paramVarArgs.e(4, this.uQB);
      }
      paramVarArgs.fk(5, this.uQC);
      GMTrace.o(3731789709312L, 27804);
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
      if (this.uQz != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uQz);
      }
      i += b.a.a.a.S(3, this.uQA);
      paramInt = i;
      if (this.uQB != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uQB);
      }
      i = b.a.a.a.fh(5, this.uQC);
      GMTrace.o(3731789709312L, 27804);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3731789709312L, 27804);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      beu localbeu = (beu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3731789709312L, 27804);
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
          localbeu.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3731789709312L, 27804);
        return 0;
      case 2: 
        localbeu.uQz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3731789709312L, 27804);
        return 0;
      case 3: 
        localbeu.uQA = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3731789709312L, 27804);
        return 0;
      case 4: 
        localbeu.uQB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3731789709312L, 27804);
        return 0;
      }
      localbeu.uQC = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3731789709312L, 27804);
      return 0;
    }
    GMTrace.o(3731789709312L, 27804);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\beu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */