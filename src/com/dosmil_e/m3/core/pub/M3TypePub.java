package com.dosmil_e.m3.core.pub;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3TypePub
   extends com.dosmil_e.m3.core.pub.M3ElementPub,
   com.dosmil_e.m3.core.ifc.M3TypeIfc  { 


/* Override START */

  public com.dosmil_e.m3.core.ifc.M3ModelIfc getModel( EAIMMCtxtIfc theCtxt);

  public com.dosmil_e.m3.core.ifc.M3AttributeIfc[] getAllAttributes( EAIMMCtxtIfc theCtxt) throws EAIException;

  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] getAllRelationships( EAIMMCtxtIfc theCtxt) throws EAIException;

  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] getAllAggregatedRelationships( EAIMMCtxtIfc theCtxt) throws EAIException;


  public Class getIfcClass( EAIMMCtxtIfc theCtxt) ;
  public String getFullyQualifiedIfcName( EAIMMCtxtIfc theCtxt) ;
  public Class getPrivClass( EAIMMCtxtIfc theCtxt) ;
  public String getFullyQualifiedPrivName( EAIMMCtxtIfc theCtxt) ;

  public String getFullyQualifiedModuleName( EAIMMCtxtIfc theCtxt) ;
  public String getFullyQualifiedName( EAIMMCtxtIfc theCtxt, String theFolder);

  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc getTreeRootForElement(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement)  throws EAIException;

  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc getTreeRootAsM3Type(
    EAIMMCtxtIfc theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theMMElement)  throws EAIException;


  public com.dosmil_e.modelbase.ifc.EAIMMElementIfc createElement(
    EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) throws EAIException;

    /* Public delete operation
     */
  public void deleteElement(
    EAIMMCtxtIfc                                       theCtxt,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc theTargetMMElement)  throws EAIException;



  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getAllSubTypes( EAIMMCtxtIfc theCtxt) throws EAIException;
  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getWithAllSubTypes( EAIMMCtxtIfc theCtxt) throws EAIException;
  public void getWithAllSubTypesInto( EAIMMCtxtIfc theCtxt, java.util.Vector theTypesVector) throws EAIException;
  public void getAllSubTypesInto( EAIMMCtxtIfc theCtxt, java.util.Vector theTypesVector) throws EAIException;


/* Override END */



}
