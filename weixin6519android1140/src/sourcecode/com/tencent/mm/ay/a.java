package com.tencent.mm.ay;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.pm;
import com.tencent.mm.protocal.c.pn;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public a(String paramString)
  {
    GMTrace.i(303332065280L, 2260);
    b.a locala = new b.a();
    locala.gtF = new pm();
    locala.gtG = new pn();
    locala.uri = "/cgi-bin/micromsg-bin/deletecardimg";
    locala.gtE = 576;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((pm)this.fUa.gtC.gtK).ufM = paramString;
    GMTrace.o(303332065280L, 2260);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(303600500736L, 2262);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(303600500736L, 2262);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(303734718464L, 2263);
    w.d("MicroMsg.NetSceneDeleteCardImg", "onGYNetEnd:%s, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(303734718464L, 2263);
  }
  
  public final int getType()
  {
    GMTrace.i(303466283008L, 2261);
    GMTrace.o(303466283008L, 2261);
    return 576;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ay\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */