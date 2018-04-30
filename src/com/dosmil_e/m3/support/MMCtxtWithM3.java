package com.dosmil_e.m3.support;

import com.dosmil_e.modelbase.support.EAIMMCtxt;
import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;
import com.dosmil_e.modelbase.support.EAIMMCtxtIfc;
import com.dosmil_e.modelbase.support.EAIException;

import java.util.Properties;
import java.util.Hashtable;
import java.util.Enumeration;


public class MMCtxtWithM3 extends EAIMMCtxt implements MMCtxtWithM3Ifc {

  protected Hashtable                 vModels;
  protected Hashtable                 vModelsByFactory;


  public MMCtxtWithM3() {
    super();
  }

  public MMCtxtWithM3(  Properties theProperties) {
    super( theProperties);
  }



  protected void initVars() {
    super.initVars();
    initModels();
    initModelsByFactory();
  }


  protected void initModels() {
    vModels = new Hashtable( 13, (float) 0.5);
   }

  protected void initModelsByFactory() {
    vModelsByFactory = new Hashtable( 13, (float) 0.5);
   }

  public void registerModel( com.dosmil_e.m3.core.ifc.M3ModelIfc theModel) {
    if( theModel == null) { return;}
    if( vModels == null) { return;}

    String aName = null;
    try { aName = theModel.getTypePrefix( this);} catch( EAIException anEx) {}
    if( aName == null) { return;}

    vModels.put( aName, theModel);
  }

  public void registerFactoryForModel(
    com.dosmil_e.m3.core.ifc.M3ModelIfc                     theModel,
    com.dosmil_e.modelbase.support.EAIMMFactoryIfc  theFactory) {

    if( theModel == null)         { return;}
    if( vModelsByFactory == null) { return;}

    String aModelName = null;
    try { aModelName = theModel.getTypePrefix( this);} catch( EAIException anEx) {}
    if( aModelName == null) { return;}

    String aFactoryName = theFactory.getName();
    if( aFactoryName == null) { return;}

    vModelsByFactory.put( aModelName, aFactoryName);
  }


  public com.dosmil_e.modelbase.support.EAIMMFactoryIfc getMMFactoryForModel(
    com.dosmil_e.m3.core.ifc.M3ModelIfc theModel) {

    if( theModel == null)         { return null;}
    if( vModelsByFactory == null) { return null;}

    String aModelName = null;
    try { aModelName = theModel.getTypePrefix( this);} catch( EAIException anEx) {}
    if( aModelName == null)       { return null;}

    Object aFactoryNameObject = vModelsByFactory.get( aModelName);
    if( aFactoryNameObject == null) { return null;}

    String aFactoryName = null;
    try { aFactoryName = (String) aFactoryNameObject;} catch( ClassCastException anEx) {}
    if( aFactoryName == null)     { return null;}

    return getMMFactory( aFactoryName);

  }




  public com.dosmil_e.m3.core.ifc.M3ModelIfc getM3Model( String theName) {
    if( theName == null) { return null;}
    if( vModels == null) { return null;}

    Object aModelObject = vModels.get( theName);
    if( aModelObject == null) { return null;}

    com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = null;
    try { aModel = (com.dosmil_e.m3.core.ifc.M3ModelIfc) aModelObject;} catch( ClassCastException anEx) {}
    return aModel;
   }



  public void release() {
    super.release();

/*  M3 instances survive Ctxts

    if( vModels != null) {
      Enumeration aModelsEnum = vModels.elements();
      while( aModelsEnum.hasMoreElements()) {
        Object aModelObject = aModelsEnum.nextElement();
        if( aModelObject != null) {
          com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = null;
          try { aModel = (com.dosmil_e.m3.core.ifc.M3ModelIfc) aModelObject;} catch( ClassCastException anEx) {}
          if( aModel != null) {
            aModel.release();
          }
        }
      }
    }
*/
    vModels = null;
  }



}




