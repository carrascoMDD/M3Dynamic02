package com.dosmil_e.m3.traversal.impl;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public class M3FieldMgrImpl
  extends com.dosmil_e.m3.traversal.base.M3FieldMgrBase 
  implements com.dosmil_e.m3.traversal.pub.M3FieldMgrPub {

  public M3FieldMgrImpl() {
    super();
  }


  public M3FieldMgrImpl( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3FieldMgrImpl( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }



/****************************************************************************
 *  Implementation of derived relationships of M3FieldMgr
 ****************************************************************************/


/****************************************************************************
 *  Implementation of visiting operations of M3NodeMgr
 ****************************************************************************/


  public void tendVisit(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc             theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc         theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc  theAttributeCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement,
    Object                                              theValue) throws EAIException {

  }


/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -1234123456300000007L;



}
