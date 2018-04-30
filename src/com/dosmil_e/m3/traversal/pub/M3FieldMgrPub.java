package com.dosmil_e.m3.traversal.pub;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3FieldMgrPub
   extends com.dosmil_e.m3.withm3.pub.MMElementWithM3Pub, 
  com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc   { 



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
    Object                                              theValue) throws EAIException;

}
