package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ayz
  extends azh
{
  public int jWs;
  public String jWt;
  public String mJK;
  public String mhU;
  public String ojF;
  public String ojG;
  public String tXo;
  public cd uNm;
  
  public ayz()
  {
    GMTrace.i(20863340511232L, 155444);
    GMTrace.o(20863340511232L, 155444);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20863474728960L, 155445);
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
      paramVarArgs.fk(2, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(3, this.jWt);
      }
      if (this.mJK != null) {
        paramVarArgs.e(4, this.mJK);
      }
      if (this.tXo != null) {
        paramVarArgs.e(5, this.tXo);
      }
      if (this.ojF != null) {
        paramVarArgs.e(6, this.ojF);
      }
      if (this.ojG != null) {
        paramVarArgs.e(7, this.ojG);
      }
      if (this.mhU != null) {
        paramVarArgs.e(8, this.mhU);
      }
      if (this.uNm != null)
      {
        paramVarArgs.fm(9, this.uNm.aYq());
        this.uNm.a(paramVarArgs);
      }
      GMTrace.o(20863474728960L, 155445);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jWt);
      }
      i = paramInt;
      if (this.mJK != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.mJK);
      }
      paramInt = i;
      if (this.tXo != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tXo);
      }
      i = paramInt;
      if (this.ojF != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.ojF);
      }
      paramInt = i;
      if (this.ojG != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.ojG);
      }
      i = paramInt;
      if (this.mhU != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.mhU);
      }
      paramInt = i;
      if (this.uNm != null) {
        paramInt = i + b.a.a.a.fj(9, this.uNm.aYq());
      }
      GMTrace.o(20863474728960L, 155445);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(20863474728960L, 155445);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ayz localayz = (ayz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(20863474728960L, 155445);
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
          localayz.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20863474728960L, 155445);
        return 0;
      case 2: 
        localayz.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20863474728960L, 155445);
        return 0;
      case 3: 
        localayz.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20863474728960L, 155445);
        return 0;
      case 4: 
        localayz.mJK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20863474728960L, 155445);
        return 0;
      case 5: 
        localayz.tXo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20863474728960L, 155445);
        return 0;
      case 6: 
        localayz.ojF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20863474728960L, 155445);
        return 0;
      case 7: 
        localayz.ojG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20863474728960L, 155445);
        return 0;
      case 8: 
        localayz.mhU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20863474728960L, 155445);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new cd();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((cd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localayz.uNm = ((cd)localObject1);
        paramInt += 1;
      }
      GMTrace.o(20863474728960L, 155445);
      return 0;
    }
    GMTrace.o(20863474728960L, 155445);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ayz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */