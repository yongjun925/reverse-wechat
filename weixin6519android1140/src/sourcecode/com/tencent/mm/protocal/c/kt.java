package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class kt
  extends ayx
{
  public int ePH;
  public String jWu;
  public String ubv;
  
  public kt()
  {
    GMTrace.i(19138911141888L, 142596);
    GMTrace.o(19138911141888L, 142596);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19139045359616L, 142597);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jWu == null) {
        throw new b("Not all required fields were included: qrcode_url");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.jWu != null) {
        paramVarArgs.e(2, this.jWu);
      }
      paramVarArgs.fk(3, this.ePH);
      if (this.ubv != null) {
        paramVarArgs.e(4, this.ubv);
      }
      GMTrace.o(19139045359616L, 142597);
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
      if (this.jWu != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jWu);
      }
      i += b.a.a.a.fh(3, this.ePH);
      paramInt = i;
      if (this.ubv != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ubv);
      }
      GMTrace.o(19139045359616L, 142597);
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
      if (this.jWu == null) {
        throw new b("Not all required fields were included: qrcode_url");
      }
      GMTrace.o(19139045359616L, 142597);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      kt localkt = (kt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19139045359616L, 142597);
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
          localkt.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19139045359616L, 142597);
        return 0;
      case 2: 
        localkt.jWu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19139045359616L, 142597);
        return 0;
      case 3: 
        localkt.ePH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19139045359616L, 142597);
        return 0;
      }
      localkt.ubv = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(19139045359616L, 142597);
      return 0;
    }
    GMTrace.o(19139045359616L, 142597);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\kt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */