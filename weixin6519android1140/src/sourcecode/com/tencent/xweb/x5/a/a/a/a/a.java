package com.tencent.xweb.x5.a.a.a.a;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.xweb.e;
import com.tencent.xweb.j;
import com.tencent.xweb.k;

public abstract interface a
{
  public abstract boolean super_allowJavaScriptOpenWindowAutomatically(String paramString1, String paramString2);
  
  public abstract void super_computeScroll(View paramView);
  
  public abstract void super_didFirstVisuallyNonEmptyPaint();
  
  public abstract boolean super_dispatchTouchEvent(MotionEvent paramMotionEvent, View paramView);
  
  public abstract void super_documentAvailableInMainFrame();
  
  public abstract void super_handlePluginTag(String paramString1, String paramString2, boolean paramBoolean, String paramString3);
  
  public abstract void super_hideAddressBar();
  
  public abstract boolean super_notifyAutoAudioPlay(String paramString, e parame);
  
  public abstract boolean super_notifyJavaScriptOpenWindowsBlocked(String paramString, String[] paramArrayOfString, ValueCallback<Boolean> paramValueCallback, boolean paramBoolean);
  
  public abstract void super_onDoubleTapStart();
  
  public abstract void super_onFlingScrollBegin(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void super_onFlingScrollEnd();
  
  public abstract void super_onHideListBox();
  
  public abstract void super_onHistoryItemChanged();
  
  public abstract boolean super_onInterceptTouchEvent(MotionEvent paramMotionEvent, View paramView);
  
  public abstract void super_onMetricsSavedCountReceived(String paramString1, boolean paramBoolean, long paramLong, String paramString2, int paramInt);
  
  public abstract Object super_onMiscCallBack(String paramString, Bundle paramBundle);
  
  public abstract Object super_onMiscCallBack(String paramString, Bundle paramBundle, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4);
  
  public abstract void super_onMissingPluginClicked(String paramString1, String paramString2, String paramString3, int paramInt);
  
  public abstract void super_onNativeCrashReport(int paramInt, String paramString);
  
  public abstract void super_onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, View paramView);
  
  public abstract void super_onPinchToZoomStart();
  
  public abstract void super_onPreReadFinished();
  
  public abstract void super_onPrefetchResourceHit(boolean paramBoolean);
  
  public abstract void super_onPromptScaleSaved();
  
  public abstract void super_onReceivedSslErrorCancel();
  
  public abstract void super_onReceivedViewSource(String paramString);
  
  public abstract void super_onReportAdFilterInfo(int paramInt1, int paramInt2, String paramString, boolean paramBoolean);
  
  public abstract void super_onReportHtmlInfo(int paramInt, String paramString);
  
  public abstract void super_onResponseReceived(j paramj, k paramk, int paramInt);
  
  public abstract void super_onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract void super_onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView);
  
  public abstract void super_onSetButtonStatus(boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void super_onShowListBox(String[] paramArrayOfString, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt);
  
  public abstract boolean super_onShowLongClickPopupMenu();
  
  public abstract void super_onShowMutilListBox(String[] paramArrayOfString, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3);
  
  public abstract void super_onSlidingTitleOffScreen(int paramInt1, int paramInt2);
  
  public abstract void super_onSoftKeyBoardHide(int paramInt);
  
  public abstract void super_onSoftKeyBoardShow();
  
  public abstract boolean super_onTouchEvent(MotionEvent paramMotionEvent, View paramView);
  
  public abstract void super_onTransitionToCommitted();
  
  public abstract void super_onUploadProgressChange(int paramInt1, int paramInt2, String paramString);
  
  public abstract void super_onUploadProgressStart(int paramInt);
  
  public abstract void super_onUrlChange(String paramString1, String paramString2);
  
  public abstract boolean super_overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean, View paramView);
  
  public abstract void super_showTranslateBubble(int paramInt1, String paramString1, String paramString2, int paramInt2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\x5\a\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */