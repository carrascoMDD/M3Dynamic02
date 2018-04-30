package com.dosmil_e.m3.traversal.pub;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3BranchMgrPub
   extends com.dosmil_e.m3.withm3.pub.MMElementWithM3Pub, 
  com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc   { 

/* Override START */

/****************************************************************************
 *  Visiting operations of M3BranchMgr
 ****************************************************************************/

  public boolean beginVisit(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc            theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc         theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc          theRelationship,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] theRelatedMMElements) throws EAIException;

  public void endVisit(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc            theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc         theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc          theRelationship,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] theRelatedMMElements) throws EAIException;

/* Override END */

  }
