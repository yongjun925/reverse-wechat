package com.tencent.mm.protocal.a.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class f
  extends com.tencent.mm.bm.a
{
  public int ret;
  public int tLg;
  public int tLh;
  public o tLi;
  public o tLj;
  public int tLk;
  public int tLl;
  public int tLu;
  public o tLv;
  
  public f()
  {
    GMTrace.i(13103542566912L, 97629);
    GMTrace.o(13103542566912L, 97629);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13103676784640L, 97630);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.ret);
      paramVarArgs.fk(2, this.tLg);
      paramVarArgs.fk(3, this.tLh);
      paramVarArgs.fk(4, this.tLu);
      if (this.tLi != null)
      {
        paramVarArgs.fm(5, this.tLi.aYq());
        this.tLi.a(paramVarArgs);
      }
      if (this.tLj != null)
      {
        paramVarArgs.fm(6, this.tLj.aYq());
        this.tLj.a(paramVarArgs);
      }
      if (this.tLv != null)
      {
        paramVarArgs.fm(7, this.tLv.aYq());
        this.tLv.a(paramVarArgs);
      }
      paramVarArgs.fk(8, this.tLk);
      paramVarArgs.fk(9, this.tLl);
      GMTrace.o(13103676784640L, 97630);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.ret) + 0 + b.a.a.a.fh(2, this.tLg) + b.a.a.a.fh(3, this.tLh) + b.a.a.a.fh(4, this.tLu);
      paramInt = i;
      if (this.tLi != null) {
        paramInt = i + b.a.a.a.fj(5, this.tLi.aYq());
      }
      i = paramInt;
      if (this.tLj != null) {
        i = paramInt + b.a.a.a.fj(6, this.tLj.aYq());
      }
      paramInt = i;
      if (this.tLv != null) {
        paramInt = i + b.a.a.a.fj(7, this.tLv.aYq());
      }
      i = b.a.a.a.fh(8, this.tLk);
      int j = b.a.a.a.fh(9, this.tLl);
      GMTrace.o(13103676784640L, 97630);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13103676784640L, 97630);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      f localf = (f)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13103676784640L, 97630);
        return -1;
      case 1: 
        localf.ret = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13103676784640L, 97630);
        return 0;
      case 2: 
        localf.tLg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13103676784640L, 97630);
        return 0;
      case 3: 
        localf.tLh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13103676784640L, 97630);
        return 0;
      case 4: 
        localf.tLu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13103676784640L, 97630);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new o();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((o)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localf.tLi = ((o)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13103676784640L, 97630);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new o();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((o)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localf.tLj = ((o)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13103676784640L, 97630);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new o();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((o)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localf.tLv = ((o)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13103676784640L, 97630);
        return 0;
      case 8: 
        localf.tLk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13103676784640L, 97630);
        return 0;
      }
      localf.tLl = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13103676784640L, 97630);
      return 0;
    }
    GMTrace.o(13103676784640L, 97630);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */