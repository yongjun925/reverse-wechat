package c.t.m.g;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

final class dq
{
  public static final dq a = new dq();
  public String b;
  public String c;
  public String d;
  public String e;
  public String f;
  public String g;
  public String h;
  public String i;
  public String j;
  public String k;
  public String l;
  public final Bundle m = new Bundle();
  
  dq() {}
  
  private dq(dq paramdq)
  {
    if (paramdq.m.size() > 0)
    {
      this.m.putAll(paramdq.m);
      return;
    }
    this.b = paramdq.b;
    this.c = paramdq.c;
    this.d = paramdq.d;
    this.e = paramdq.e;
    this.f = paramdq.f;
    this.g = paramdq.g;
    this.h = paramdq.h;
    this.i = paramdq.i;
    this.j = paramdq.j;
    this.k = paramdq.k;
    this.l = paramdq.l;
  }
  
  public dq(JSONObject paramJSONObject)
  {
    try
    {
      if (paramJSONObject.has("admin_level_1"))
      {
        str1 = paramJSONObject.getString("nation");
        String str2 = paramJSONObject.getString("admin_level_1");
        String str3 = paramJSONObject.getString("admin_level_2");
        String str4 = paramJSONObject.getString("admin_level_3");
        String str5 = paramJSONObject.getString("locality");
        String str6 = paramJSONObject.getString("sublocality");
        paramJSONObject = paramJSONObject.getString("route");
        this.m.putString("nation", str1);
        this.m.putString("admin_level_1", str2);
        this.m.putString("admin_level_2", str3);
        this.m.putString("admin_level_3", str4);
        this.m.putString("locality", str5);
        this.m.putString("sublocality", str6);
        this.m.putString("route", paramJSONObject);
        return;
      }
      this.c = paramJSONObject.getString("name");
      this.d = paramJSONObject.getString("code");
      this.b = paramJSONObject.getString("nation");
      this.e = paramJSONObject.getString("province");
      this.f = paramJSONObject.getString("city");
      this.g = paramJSONObject.getString("district");
      this.h = paramJSONObject.getString("town");
      this.i = paramJSONObject.getString("village");
      this.j = paramJSONObject.getString("street");
      this.k = paramJSONObject.getString("street_no");
      String str1 = paramJSONObject.optString("mergedname");
      paramJSONObject = paramJSONObject.optString("mergedaddr");
      if (!TextUtils.isEmpty(str1)) {
        this.c = str1;
      }
      if (!TextUtils.isEmpty(paramJSONObject))
      {
        this.l = paramJSONObject;
        return;
      }
    }
    catch (JSONException paramJSONObject)
    {
      throw paramJSONObject;
    }
  }
  
  public static dq a(dq paramdq)
  {
    if (paramdq == null) {
      return null;
    }
    return new dq(paramdq);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("SubnationData{");
    localStringBuilder.append("name=").append(this.c).append(",");
    localStringBuilder.append("address=").append(this.l).append(",");
    localStringBuilder.append("code=").append(this.d).append(",");
    localStringBuilder.append("nation=").append(this.b).append(",");
    localStringBuilder.append("province=").append(this.e).append(",");
    localStringBuilder.append("city=").append(this.f).append(",");
    localStringBuilder.append("district=").append(this.g).append(",");
    localStringBuilder.append("town=").append(this.h).append(",");
    localStringBuilder.append("village=").append(this.i).append(",");
    localStringBuilder.append("street=").append(this.j).append(",");
    localStringBuilder.append("street_no=").append(this.k).append(",");
    localStringBuilder.append("bundle").append(this.m).append(",");
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */