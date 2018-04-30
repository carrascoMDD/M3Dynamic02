package com.dosmil_e.m3.core.pub;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3AttributePub
   extends com.dosmil_e.m3.core.pub.M3ElementPub, 
  com.dosmil_e.m3.core.ifc.M3AttributeIfc  { 



/* Override START */

  public Object getValue(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement);

  public java.lang.reflect.Method getGetMethod(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement);


  public String getUpperName( EAIMMCtxtIfc theCtxt);


  public Object getAttributeValue(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException;

  public Object[] getAttributeValues(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException;

  public void setAttributeValue(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement,
    Object theSetValue)  throws EAIException;


/* Override END */

}
