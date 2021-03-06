package com.tencent.mm.plugin.facedetect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public final class FaceHeaderPreference
  extends Preference
{
  private MMActivity ezR;
  private TextView hqi;
  private ImageView iDp;
  private int kXa;
  private Button kXb;
  private View kXc;
  private View.OnClickListener kXd;
  private String kXe;
  private String kXf;
  private String mTitle;
  
  public FaceHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(5903029895168L, 43981);
    this.ezR = ((MMActivity)paramContext);
    GMTrace.o(5903029895168L, 43981);
  }
  
  public FaceHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5903164112896L, 43982);
    this.mTitle = "";
    this.kXa = 255;
    this.kXd = null;
    this.kXe = "";
    this.kXf = "";
    this.ezR = ((MMActivity)paramContext);
    setLayoutResource(a.g.kQs);
    GMTrace.o(5903164112896L, 43982);
  }
  
  public final void a(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(5903432548352L, 43984);
    this.kXd = paramOnClickListener;
    if ((this.kXb == null) || (this.kXc == null))
    {
      GMTrace.o(5903432548352L, 43984);
      return;
    }
    if ((this.kXb != null) && (this.kXd != null))
    {
      this.kXb.setOnClickListener(paramOnClickListener);
      this.kXb.setVisibility(0);
      this.kXc.setVisibility(0);
      GMTrace.o(5903432548352L, 43984);
      return;
    }
    this.kXb.setVisibility(8);
    this.kXc.setVisibility(8);
    GMTrace.o(5903432548352L, 43984);
  }
  
  public final void cf(String paramString1, String paramString2)
  {
    GMTrace.i(5903298330624L, 43983);
    this.kXe = paramString1;
    this.kXf = paramString2;
    if (this.hqi != null)
    {
      if (!bg.nm(this.kXe))
      {
        this.hqi.setText(this.kXe);
        this.hqi.setVisibility(0);
        GMTrace.o(5903298330624L, 43983);
        return;
      }
      this.hqi.setVisibility(8);
    }
    GMTrace.o(5903298330624L, 43983);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(5903566766080L, 43985);
    super.onBindView(paramView);
    this.iDp = ((ImageView)paramView.findViewById(a.e.kPL));
    this.hqi = ((TextView)paramView.findViewById(a.e.kPM));
    this.kXb = ((Button)paramView.findViewById(a.e.bYP));
    this.kXc = paramView.findViewById(a.e.biH);
    if (!bg.nm(this.kXe))
    {
      this.hqi.setText(this.kXe);
      this.hqi.setVisibility(0);
    }
    while ((this.kXb != null) && (this.kXd != null))
    {
      this.kXb.setOnClickListener(this.kXd);
      this.kXb.setVisibility(0);
      this.kXc.setVisibility(0);
      GMTrace.o(5903566766080L, 43985);
      return;
      this.hqi.setVisibility(8);
    }
    if (this.kXb != null) {
      this.kXb.setVisibility(8);
    }
    this.kXc.setVisibility(8);
    GMTrace.o(5903566766080L, 43985);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\ui\FaceHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */