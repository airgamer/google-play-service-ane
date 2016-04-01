package com.airgamer.ane.googleplayservices;


import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import java.util.HashMap;
import java.util.Map;

public class ExtensionContext
  extends FREContext
{
  public void dispose() {}
  
  public Map<String, FREFunction> getFunctions()
  {
    return new HashMap();
  }
}
