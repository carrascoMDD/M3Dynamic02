package com.dosmil_e.m3.traversal.impl;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public class M3BranchMgrImpl
  extends com.dosmil_e.m3.traversal.base.M3BranchMgrBase 
  implements com.dosmil_e.m3.traversal.pub.M3BranchMgrPub {

  public M3BranchMgrImpl() {
    super();
  }


  public M3BranchMgrImpl( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3BranchMgrImpl( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }



/****************************************************************************
 *  Implementation of derived relationships of M3BranchMgr
 ****************************************************************************/

/* Override START */

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

/*
    if( M3NodeMgrImpl.sDumpVisitBoundaries) {
      int aNumLevels = theTraversalCtxt.getLevels();
      M3NodeMgrImpl.indent( aNumLevels + 1);
      try { System.out.print(">> B " + theSourceMMElement.getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" T3 " + theSourceMMElement.getM3Type( theCtxt).getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" R3 " + theBranchCfg.getMetaRelationship( theCtxt).getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" Cfg " + theBranchCfg.getName( theCtxt).getString());} catch( Exception anEx) {}
      System.out.println();
    }
*/

    if( M3NodeMgrImpl.sDumpVisitBoundaries) {
      int aNumLevels = theTraversalCtxt.getLevels();
      M3NodeMgrImpl.indent( aNumLevels + 1);
      try { System.out.print(">B " + theRelationship.getName( theCtxt).getString());} catch( Exception anEx) {}
      System.out.println();
    }

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

/*
    if( M3NodeMgrImpl.sDumpVisitBoundaries) {
      int aNumLevels = theTraversalCtxt.getLevels();
      M3NodeMgrImpl.indent( aNumLevels);
      try { System.out.print("<< B " + theSourceMMElement.getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" T3 " + theSourceMMElement.getM3Type( theCtxt).getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" R3 " + theBranchCfg.getMetaRelationship( theCtxt).getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" Cfg " + theBranchCfg.getName( theCtxt).getString());} catch( Exception anEx) {}
      System.out.println();
    }
*/

    if( M3NodeMgrImpl.sDumpVisitBoundaries) {
      int aNumLevels = theTraversalCtxt.getLevels();
      M3NodeMgrImpl.indent( aNumLevels);
      try { System.out.print("<B " + theRelationship.getName( theCtxt).getString());} catch( Exception anEx) {}
      System.out.println();
    }

    theTraversalCtxt.pop();

  }

/* Override END */


/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -1234123456300000007L;



}
