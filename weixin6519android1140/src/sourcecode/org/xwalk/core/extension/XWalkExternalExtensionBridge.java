package org.xwalk.core.extension;

import android.content.Intent;

abstract interface XWalkExternalExtensionBridge
{
  public abstract void broadcastMessage(String paramString);
  
  public abstract void onBinaryMessage(int paramInt, byte[] paramArrayOfByte);
  
  public abstract void onDestroy();
  
  public abstract void onInstanceCreated(int paramInt);
  
  public abstract void onInstanceDestroyed(int paramInt);
  
  public abstract void onMessage(int paramInt, String paramString);
  
  public abstract void onNewIntent(Intent paramIntent);
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract void onStart();
  
  public abstract void onStop();
  
  public abstract String onSyncMessage(int paramInt, String paramString);
  
  public abstract void postBinaryMessage(int paramInt, byte[] paramArrayOfByte);
  
  public abstract void postMessage(int paramInt, String paramString);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\org\xwalk\core\extension\XWalkExternalExtensionBridge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */