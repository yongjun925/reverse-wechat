package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aee
  extends azh
{
  public int jhb;
  public LinkedList<bjx> utS;
  public String utT;
  
  public aee()
  {
    GMTrace.i(3816883748864L, 28438);
    this.utS = new LinkedList();
    GMTrace.o(3816883748864L, 28438);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3817017966592L, 28439);
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
      paramVarArgs.fk(2, this.jhb);
      paramVarArgs.d(3, 8, this.utS);
      if (this.utT != null) {
        paramVarArgs.e(4, this.utT);
      }
      GMTrace.o(3817017966592L, 28439);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jhb) + b.a.a.a.c(3, 8, this.utS);
      paramInt = i;
      if (this.utT != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.utT);
      }
      GMTrace.o(3817017966592L, 28439);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.utS.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3817017966592L, 28439);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aee localaee = (aee)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3817017966592L, 28439);
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
          localaee.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3817017966592L, 28439);
        return 0;
      case 2: 
        localaee.jhb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3817017966592L, 28439);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bjx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bjx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaee.utS.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3817017966592L, 28439);
        return 0;
      }
      localaee.utT = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3817017966592L, 28439);
      return 0;
    }
    GMTrace.o(3817017966592L, 28439);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */