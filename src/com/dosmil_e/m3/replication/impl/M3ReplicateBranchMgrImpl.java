package com.dosmil_e.m3.replication.impl;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public class M3ReplicateBranchMgrImpl
  extends com.dosmil_e.m3.replication.base.M3ReplicateBranchMgrBase 
  implements com.dosmil_e.m3.replication.pub.M3ReplicateBranchMgrPub {

  public M3ReplicateBranchMgrImpl() {
    super();
  }


  public M3ReplicateBranchMgrImpl( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3ReplicateBranchMgrImpl( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of visiting operations of M3BranchMgr
 ****************************************************************************/


  public boolean beginVisit(
    EAIMMCtxtIfc                                          theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc              theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc           theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc    theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc       theBranchCfg,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc            theRelationship,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc         theSourceMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]  theRelatedMMElements) throws EAIException {

    if( theTraversalCtxt == null) { return false;}
    if( theRelationship == null)  { return false;}

    theTraversalCtxt.push();

    return true;
  }

  public void endVisit(
    EAIMMCtxtIfc                                         theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc             theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc          theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc   theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc      theBranchCfg,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc           theRelationship,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc        theSourceMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] theRelatedMMElements) throws EAIException {

    if( theTraversalCtxt == null) { return;}
    if( theRelationship == null) { return;}

    theTraversalCtxt.pop();

  }

/* Override END */



/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -1234123456300000007L;



}
