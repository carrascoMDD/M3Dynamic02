package com.dosmil_e.m3.traversal.impl;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public class M3NodeMgrImpl
  extends com.dosmil_e.m3.traversal.base.M3NodeMgrBase 
  implements com.dosmil_e.m3.traversal.pub.M3NodeMgrPub {

  public M3NodeMgrImpl() {
    super();
  }


  public M3NodeMgrImpl( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3NodeMgrImpl( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }



/****************************************************************************
 *  Implementation of derived relationships of M3NodeMgr
 ****************************************************************************/


/* Override START */

/****************************************************************************
 *  Implementation of visiting operations of M3NodeMgr
 ****************************************************************************/

 public static final boolean sDumpVisitBoundaries = true;


  public boolean beginVisit(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc            theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc         theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc       theNodeCfg,
    com.dosmil_e.m3.core.ifc.M3TypeIfc                  theType,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    if( theCtxt == null)          { return false;}
    if( theTraversalCtxt == null) { return false;}
    if( theNodeCfg == null)       { return false;}
    if( theType == null)          { return false;}

    boolean aIsTerminal = theNodeCfg.getIsTerminal( theCtxt);
    String aTerminalString = aIsTerminal ? "Term" : "";

/*
    if( sDumpVisitBoundaries) {
      int aNumLevels = theTraversalCtxt.getLevels();
      indent( aNumLevels + 1);
      try { System.out.print(">N " + aTerminalString + " " + theSourceMMElement.getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" T3 " + theSourceMMElement.getM3Type( theCtxt).getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" NCfg " + theNodeCfg.getName( theCtxt).getString());} catch( Exception anEx) {}
      System.out.println();
    }
*/
    if( sDumpVisitBoundaries) {
      int aNumLevels = theTraversalCtxt.getLevels();
      indent( aNumLevels + 1);
      try { System.out.print(">N" + aTerminalString + " " + theSourceMMElement.getName( theCtxt).getString() +
        " a " + theType.getName( theCtxt).getString());} catch( Exception anEx) {}
      System.out.println();
    }

    if( aIsTerminal) { return false;}

    theTraversalCtxt.push();

    return true;
  }


  public static final String gIndentString = "  ";


  static public void indent( int theIndentLevels) {
    if( sDumpVisitBoundaries) {
      for( int anIndex = 0; anIndex < theIndentLevels; anIndex++) {
        System.out.print( gIndentString);
      }
    }
  }


  public void endVisit(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc            theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc         theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc       theNodeCfg,
    com.dosmil_e.m3.core.ifc.M3TypeIfc                  theType,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    if( theCtxt == null)          { return;}
    if( theTraversalCtxt == null) { return;}
    if( theNodeCfg == null)       { return;}
    if( theType == null)          { return;}

    boolean aIsTerminal = theNodeCfg.getIsTerminal( theCtxt);
    String aTerminalString = aIsTerminal ? "Term" : "";

/*
    if( sDumpVisitBoundaries) {
      int aNumLevels = theTraversalCtxt.getLevels();
      indent( aNumLevels + 1);
      try { System.out.print("<N " + aTerminalString + " " + theSourceMMElement.getName( ).getString());} catch( Exception anEx) {}
      try { System.out.print(" T3 " + theSourceMMElement.getM3Type( theCtxt).getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" NCfg " + theNodeCfg.getName( theCtxt).getString());} catch( Exception anEx) {}
      System.out.println();
    }
*/

    if( sDumpVisitBoundaries) {
      int aNumLevels = theTraversalCtxt.getLevels();
      indent( aNumLevels);
      try { System.out.print("<N" + aTerminalString + " " + theSourceMMElement.getName( theCtxt).getString() +
        " a " + theType.getName( theCtxt).getString());} catch( Exception anEx) {}
      System.out.println();
    }

    if( aIsTerminal) { return;}

    theTraversalCtxt.pop();
  }



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
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theRelatedElement) throws EAIException {

    if( theCtxt == null)          { return false;}
    if( theTraversalCtxt == null) { return false;}
    if( theNodeCfg == null)       { return false;}
    if( theType == null)          { return false;}

    boolean aIsTerminal = theNodeCfg.getIsTerminal( theCtxt);
    String aTerminalString = aIsTerminal ? "Term" : "";

/*
    if( sDumpVisitBoundaries) {
      int aNumLevels = theTraversalCtxt.getLevels();
      indent( aNumLevels + 1);
      try { System.out.print(">rN " + theSourceMMElement.getName().getString());} catch( Exception anEx) {}
      try { System.out.print(" T3 " + theSourceMMElement.getM3Type( theCtxt).getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" R3 " + theBranchCfg.getMetaRelationship( theCtxt).getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" : " + theRelatedElement.getName().getString());} catch( Exception anEx) {}
      try { System.out.print(" T3 " + theRelatedElement.getM3Type( theCtxt).getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" RCfg " + theBranchCfg.getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" NCfg " + theNodeCfg.getName( theCtxt).getString());} catch( Exception anEx) {}
      System.out.println();
    }
*/

    if( sDumpVisitBoundaries) {
      int aNumLevels = theTraversalCtxt.getLevels();
      indent( aNumLevels + 1);
      try { System.out.print(">rN" + aTerminalString + " " + theRelatedElement.getName( theCtxt).getString() +
        " a " + theType.getName( theCtxt).getString());} catch( Exception anEx) {}
      System.out.println();
    }

    if( aIsTerminal) { return false;}

    theTraversalCtxt.push();

    return true;
  }



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
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theRelatedElement) throws EAIException {

    if( theCtxt == null)          { return;}
    if( theTraversalCtxt == null) { return;}
    if( theNodeCfg == null)       { return;}
    if( theType == null)          { return;}

    boolean aIsTerminal = theNodeCfg.getIsTerminal( theCtxt);
    String aTerminalString = aIsTerminal ? "Term" : "";

/*
    if( sDumpVisitBoundaries) {
      try { System.out.print("<< rN " + theSourceMMElement.getName().getString());} catch( Exception anEx) {}
      try { System.out.print(" T3 " + theSourceMMElement.getM3Type( theCtxt).getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" R3 " + theBranchCfg.getMetaRelationship( theCtxt).getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" : " + theRelatedElement.getName().getString());} catch( Exception anEx) {}
      try { System.out.print(" T3 " + theRelatedElement.getM3Type( theCtxt).getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" RCfg " + theBranchCfg.getName( theCtxt).getString());} catch( Exception anEx) {}
      try { System.out.print(" NCfg " + theNodeCfg.getName( theCtxt).getString());} catch( Exception anEx) {}
      System.out.println();
    }
*/
    if( sDumpVisitBoundaries) {
      int aNumLevels = theTraversalCtxt.getLevels();
      indent( aNumLevels);
      try { System.out.print("<rN" + aTerminalString + " " + theRelatedElement.getName( theCtxt).getString() +
        " a " + theType.getName( theCtxt).getString());} catch( Exception anEx) {}
      System.out.println();
    }

    if( aIsTerminal) { return;}

    theTraversalCtxt.pop();
  }

/* Override END */


/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -1234123456300000007L;



}
