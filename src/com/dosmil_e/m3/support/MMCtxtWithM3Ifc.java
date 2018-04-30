package com.dosmil_e.m3.support;

import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;
import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;


public interface MMCtxtWithM3Ifc extends EAIMMCtxtIfc {

  public void registerModel( com.dosmil_e.m3.core.ifc.M3ModelIfc theModel);

  public com.dosmil_e.m3.core.ifc.M3ModelIfc getM3Model( String theName);

  public com.dosmil_e.modelbase.support.EAIMMFactoryIfc getMMFactoryForModel(
    com.dosmil_e.m3.core.ifc.M3ModelIfc theModel);

  public void registerFactoryForModel(
    com.dosmil_e.m3.core.ifc.M3ModelIfc                     theModel,
    com.dosmil_e.modelbase.support.EAIMMFactoryIfc  theFactory);

}



