package com.tencent.mm.protocal.b.a;

import com.tencent.gmtrace.GMTrace;

public final class d
  extends com.tencent.mm.bm.a
{
  public String desc;
  public String eIy;
  public int eRy;
  public String lbo;
  public String title;
  
  public d()
  {
    GMTrace.i(4079547842560L, 30395);
    GMTrace.o(4079547842560L, 30395);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4079682060288L, 30396);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.e(2, this.desc);
      }
      if (this.eIy != null) {
        paramVarArgs.e(3, this.eIy);
      }
      paramVarArgs.fk(4, this.eRy);
      if (this.lbo != null) {
        paramVarArgs.e(5, this.lbo);
      }
      GMTrace.o(4079682060288L, 30396);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label482;
      }
    }
    label482:
    for (int i = b.a.a.b.b.a.f(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.desc);
      }
      i = paramInt;
      if (this.eIy != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eIy);
      }
      i += b.a.a.a.fh(4, this.eRy);
      paramInt = i;
      if (this.lbo != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.lbo);
      }
      GMTrace.o(4079682060288L, 30396);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4079682060288L, 30396);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        d locald = (d)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4079682060288L, 30396);
          return -1;
        case 1: 
          locald.title = locala.yqV.readString();
          GMTrace.o(4079682060288L, 30396);
          return 0;
        case 2: 
          locald.desc = locala.yqV.readString();
          GMTrace.o(4079682060288L, 30396);
          return 0;
        case 3: 
          locald.eIy = locala.yqV.readString();
          GMTrace.o(4079682060288L, 30396);
          return 0;
        case 4: 
          locald.eRy = locala.yqV.nj();
          GMTrace.o(4079682060288L, 30396);
          return 0;
        }
        locald.lbo = locala.yqV.readString();
        GMTrace.o(4079682060288L, 30396);
        return 0;
      }
      GMTrace.o(4079682060288L, 30396);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\b\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */