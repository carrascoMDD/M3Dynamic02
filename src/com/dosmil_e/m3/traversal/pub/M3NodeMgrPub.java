package com.dosmil_e.m3.traversal.pub;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3NodeMgrPub
   extends com.dosmil_e.m3.withm3.pub.MMElementWithM3Pub, 
  com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc   { 


/* Override START */

/****************************************************************************
 *  Visiting operations of M3NodeMgr
 ****************************************************************************/
  public boolean beginVisit(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc            theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc         theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc       theNodeCfg,
    com.dosmil_e.m3.core.ifc.M3TypeIfc                  theType,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException;

  public void endVisit(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc            theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc         theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc       theNodeCfg,
    com.dosmil_e.m3.core.ifc.M3TypeIfc                  theType,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException;



  public boolean beginVisit(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc            theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc         theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc        theBranchMgr,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc          theRelationship,
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc       theNodeCfg,
    com.dosmil_e.m3.core.ifc.M3TypeIfc                  theType,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theRelatedElement) throws EAIException;

  public void endVisit(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc            theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc         theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc        theBranchMgr,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc          theRelationship,
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc       theNodeCfg,
    com.dosmil_e.m3.core.ifc.M3TypeIfc                  theType,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theRelatedElement) throws EAIException;

/* Override END */
    
}
