package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bij
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public int uKN;
  public String ubU;
  public int ueS;
  
  public bij()
  {
    GMTrace.i(3975260667904L, 29618);
    GMTrace.o(3975260667904L, 29618);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3975394885632L, 29619);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      if (this.ubU != null) {
        paramVarArgs.e(2, this.ubU);
      }
      paramVarArgs.fk(3, this.uKN);
      paramVarArgs.fk(4, this.ueS);
      GMTrace.o(3975394885632L, 29619);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label406;
      }
    }
    label406:
    for (paramInt = b.a.a.b.b.a.f(1, this.jhi) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.ubU != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.ubU);
      }
      paramInt = b.a.a.a.fh(3, this.uKN);
      int j = b.a.a.a.fh(4, this.ueS);
      GMTrace.o(3975394885632L, 29619);
      return i + paramInt + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3975394885632L, 29619);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bij localbij = (bij)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3975394885632L, 29619);
          return -1;
        case 1: 
          localbij.jhi = locala.yqV.readString();
          GMTrace.o(3975394885632L, 29619);
          return 0;
        case 2: 
          localbij.ubU = locala.yqV.readString();
          GMTrace.o(3975394885632L, 29619);
          return 0;
        case 3: 
          localbij.uKN = locala.yqV.nj();
          GMTrace.o(3975394885632L, 29619);
          return 0;
        }
        localbij.ueS = locala.yqV.nj();
        GMTrace.o(3975394885632L, 29619);
        return 0;
      }
      GMTrace.o(3975394885632L, 29619);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */