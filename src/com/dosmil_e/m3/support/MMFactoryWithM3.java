package com.dosmil_e.m3.support;

import com.dosmil_e.modelbase.support.EAIMMFactory;
import com.dosmil_e.modelbase.support.EAIMMFactoryIfc;
import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;

import java.util.Properties;


public abstract class MMFactoryWithM3 extends EAIMMFactory implements MMFactoryWithM3Ifc {


  public MMFactoryWithM3() {
    super();
  }

  public MMFactoryWithM3(  EAIMMFactoryIfc theOverridenFactory) {
    super( theOverridenFactory);
  }






}



