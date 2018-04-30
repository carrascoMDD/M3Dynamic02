package com.dosmil_e.m3.visit;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;


public interface M3TraversalVisitorIfc   {



/****************************************************************************
 *  Implementation of public interface for Traversal  visitor
 ****************************************************************************/


    /* Transactional Public visit with factory operation
     */
  public com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc visit(
    EAIMMCtxtIfc                                        theCtxt,
    M3TraversalCtxtIfc                                    theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException;



  public void visitBranchForPhase(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3ScheduledBranchTraversal    theScheduledBranchTraversal,
    int                                                 thePhaseNumber,
    M3TraversalCtxtIfc                                  theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException;

}


