package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class all
  extends com.tencent.mm.bm.a
{
  public float tYy;
  public float tYz;
  public String uAH;
  public int ujb;
  public String ujc;
  public String ujd;
  public int uje;
  
  public all()
  {
    GMTrace.i(3888019144704L, 28968);
    GMTrace.o(3888019144704L, 28968);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3888153362432L, 28969);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.n(1, this.tYy);
      paramVarArgs.n(2, this.tYz);
      paramVarArgs.fk(3, this.ujb);
      if (this.ujc != null) {
        paramVarArgs.e(4, this.ujc);
      }
      if (this.ujd != null) {
        paramVarArgs.e(5, this.ujd);
      }
      paramVarArgs.fk(6, this.uje);
      if (this.uAH != null) {
        paramVarArgs.e(7, this.uAH);
      }
      GMTrace.o(3888153362432L, 28969);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.b.b.a.cK(1) + 4 + 0 + (b.a.a.b.b.a.cK(2) + 4) + b.a.a.a.fh(3, this.ujb);
      paramInt = i;
      if (this.ujc != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ujc);
      }
      i = paramInt;
      if (this.ujd != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ujd);
      }
      i += b.a.a.a.fh(6, this.uje);
      paramInt = i;
      if (this.uAH != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uAH);
      }
      GMTrace.o(3888153362432L, 28969);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3888153362432L, 28969);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      all localall = (all)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3888153362432L, 28969);
        return -1;
      case 1: 
        localall.tYy = locala.yqV.readFloat();
        GMTrace.o(3888153362432L, 28969);
        return 0;
      case 2: 
        localall.tYz = locala.yqV.readFloat();
        GMTrace.o(3888153362432L, 28969);
        return 0;
      case 3: 
        localall.ujb = locala.yqV.nj();
        GMTrace.o(3888153362432L, 28969);
        return 0;
      case 4: 
        localall.ujc = locala.yqV.readString();
        GMTrace.o(3888153362432L, 28969);
        return 0;
      case 5: 
        localall.ujd = locala.yqV.readString();
        GMTrace.o(3888153362432L, 28969);
        return 0;
      case 6: 
        localall.uje = locala.yqV.nj();
        GMTrace.o(3888153362432L, 28969);
        return 0;
      }
      localall.uAH = locala.yqV.readString();
      GMTrace.o(3888153362432L, 28969);
      return 0;
    }
    GMTrace.o(3888153362432L, 28969);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\all.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */