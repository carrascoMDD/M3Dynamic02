package com.dosmil_e.m3.replication.impl;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public class M3ReplicateNodeMgrImpl
  extends com.dosmil_e.m3.replication.base.M3ReplicateNodeMgrBase 
  implements com.dosmil_e.m3.replication.pub.M3ReplicateNodeMgrPub {

  public M3ReplicateNodeMgrImpl() {
    super();
  }


  public M3ReplicateNodeMgrImpl( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3ReplicateNodeMgrImpl( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/* Override START */

/****************************************************************************
 *  Implementation of visiting operations of M3NodeMgr
 ****************************************************************************/


  public boolean beginVisit(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc            theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc         theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc       theNodeCfg,
    com.dosmil_e.m3.core.ifc.M3TypeIfc                  theType,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    if( theNodeCfg == null)         { return false;}
    if( theTraversalCtxt == null)   { return false;}

    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc aNewElement = replicateSource( theCtxt,
      theTraversalCtxt, theVisitor, theTraversalCfg, theNodeCfg, theType, theSourceMMElement);
    if( aNewElement == null)        { return false;}

    boolean aIsTerminal = theNodeCfg.getIsTerminal( theCtxt);
    if( aIsTerminal) { return false;}

    theTraversalCtxt.push();

    return true;
  }


  protected com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc replicateSource(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc            theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc         theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc       theNodeCfg,
    com.dosmil_e.m3.core.ifc.M3TypeIfc                  theType,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    if( theTraversalCtxt == null)   { return null;}
    if( theSourceMMElement == null) { return null;}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aReplicatedType = getReplicatedMetaType( theCtxt);
    if( aReplicatedType == null)    { return null;}

    com.dosmil_e.m3.core.pub.M3TypePub aReplicatedTypePub = null;
    try { aReplicatedTypePub = (com.dosmil_e.m3.core.pub.M3TypePub) aReplicatedType;} catch( ClassCastException anEx) {}
    if( aReplicatedTypePub == null) { return null;}

    String aNewNameString = new String("");
    EAIMMNameIfc aName = theSourceMMElement.getName();
    if( aName != null) {
      String aNameString = aName.getString();
      if( aNameString != null) {
        aNewNameString = aNameString + "Replicate";
      }
    }
    EAIMMNameIfc aNewName = new EAIMMName( aNewNameString);

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc aNewElement = null;
    try { aNewElement = aReplicatedTypePub.createElement( theCtxt, aNewName);} catch( EAIException anEx) {}
    if( aNewElement == null)        { return null;}

    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc aNewElementWM3 = null;
    try { aNewElementWM3 = (com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc) aNewElement;} catch( ClassCastException anEx) {}
    if( aNewElementWM3 == null)     { return null;}

    java.util.Hashtable aReplicatedBySourceDict = theTraversalCtxt.getCommon( "ReplicatedBySource");
    if( aReplicatedBySourceDict != null) {
      aReplicatedBySourceDict.put( theSourceMMElement, aNewElement);
    }
    java.util.Hashtable aSourceByReplicatedDict = theTraversalCtxt.getCommon( "SourceByReplicated");
    if( aSourceByReplicatedDict != null) {
      aSourceByReplicatedDict.put( aNewElement, theSourceMMElement);
    }

    return aNewElementWM3;
  }



  public void endVisit(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3TraversalCtxtIfc            theTraversalCtxt,
    com.dosmil_e.m3.visit.M3TraversalVisitorIfc         theVisitor,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc       theNodeCfg,
    com.dosmil_e.m3.core.ifc.M3TypeIfc                  theType,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    if( theNodeCfg == null)           { return;}
    if( theTraversalCtxt == null)     { return;}

    boolean aIsTerminal = theNodeCfg.getIsTerminal( theCtxt);
    if( aIsTerminal)                  { return;}

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

    if( theTraversalCtxt == null)   { return false;}

    int aPhaseCounter = theTraversalCtxt.getPhaseCounter();
    if( aPhaseCounter < 1) {
      return beginVisitPhaseZero( theCtxt, theTraversalCtxt, theVisitor,
        theTraversalCfg, theBranchCfg, theBranchMgr, theRelationship, theNodeCfg, theType,
        theSourceMMElement, theRelatedElement);
    }
    else {
      return beginVisitPhaseN( theCtxt, aPhaseCounter, theTraversalCtxt, theVisitor,
        theTraversalCfg, theBranchCfg, theBranchMgr, theRelationship, theNodeCfg, theType,
        theSourceMMElement, theRelatedElement);
    }
  }



  protected boolean beginVisitPhaseZero(
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

    if( theTraversalCtxt == null)   { return false;}
    if( theBranchMgr == null)       { return false;}
    if( theNodeCfg == null)         { return false;}

    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc aReplicatedRelatedElement = replicateSource( theCtxt,
      theTraversalCtxt, theVisitor, theTraversalCfg, theNodeCfg, theType, theRelatedElement);
    if( aReplicatedRelatedElement == null) { return false;}


    java.util.Hashtable aReplicatedBySourceDict = theTraversalCtxt.getCommon( "ReplicatedBySource");
    if( aReplicatedBySourceDict == null) { return false;}

    Object aReplicatedSourceElementObject = aReplicatedBySourceDict.get( theSourceMMElement);
    if( aReplicatedSourceElementObject == null)        { return false;}

    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc aReplicatedSourceElement = null;
    try { aReplicatedSourceElement = (com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc) aReplicatedSourceElementObject;} catch( ClassCastException anEx) {}
    if( aReplicatedSourceElement == null)     { return false;}

    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc aReplicateBranchMgr = null;
    try { aReplicateBranchMgr = (com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc) theBranchMgr;} catch( ClassCastException anEx) {}
    if( aReplicateBranchMgr == null)     { return false;}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aReplicateRelationship =
      aReplicateBranchMgr.getReplicatedMetaRelationship( theCtxt);
    if( aReplicateRelationship == null)    { return false;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub aReplicateRelationshipPub = null;
    try { aReplicateRelationshipPub = (com.dosmil_e.m3.core.pub.M3RelationshipPub) aReplicateRelationship;} catch( ClassCastException anEx) {}
    if( aReplicateRelationshipPub == null) { return false;}

    if( aReplicateRelationshipPub.isM3Many( theCtxt)) {
      aReplicateRelationshipPub.addRelatedElement( theCtxt, aReplicatedSourceElement, aReplicatedRelatedElement);
    }
    else {
      aReplicateRelationshipPub.setRelatedElement( theCtxt, aReplicatedSourceElement, aReplicatedRelatedElement);
    }


    boolean aIsTerminal = theNodeCfg.getIsTerminal( theCtxt);
    if( aIsTerminal) { return false;}

    theTraversalCtxt.push();

    return true;
  }


  public boolean beginVisitPhaseN(
    EAIMMCtxtIfc                                        theCtxt,
    int                                                 thePhaseCounter,
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

    if( theTraversalCtxt == null)    { return false;}
    if( theBranchMgr == null)        { return false;}
    if( theNodeCfg == null)          { return false;}
    if( theSourceMMElement == null)  { return false;}
    if( theRelatedElement == null)   { return false;}

    java.util.Hashtable aReplicatedBySourceDict = theTraversalCtxt.getCommon( "ReplicatedBySource");
    if( aReplicatedBySourceDict == null) { return false;}

    Object aReplicatedSourceElementObject = aReplicatedBySourceDict.get( theSourceMMElement);
    if( aReplicatedSourceElementObject == null)        { return false;}

    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc aReplicatedSourceElement = null;
    try { aReplicatedSourceElement = (com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc) aReplicatedSourceElementObject;} catch( ClassCastException anEx) {}
    if( aReplicatedSourceElement == null)     { return false;}

    Object aReplicatedRelatedElementObject = aReplicatedBySourceDict.get( theRelatedElement);
    if( aReplicatedRelatedElementObject == null)        { return false;}

    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc aReplicatedRelatedElement = null;
    try { aReplicatedRelatedElement = (com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc) aReplicatedRelatedElementObject;} catch( ClassCastException anEx) {}
    if( aReplicatedRelatedElement == null)     { return false;}

    com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc aReplicateBranchMgr = null;
    try { aReplicateBranchMgr = (com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc) theBranchMgr;} catch( ClassCastException anEx) {}
    if( aReplicateBranchMgr == null)     { return false;}

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aReplicateRelationship =
      aReplicateBranchMgr.getReplicatedMetaRelationship( theCtxt);
    if( aReplicateRelationship == null)    { return false;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub aReplicateRelationshipPub = null;
    try { aReplicateRelationshipPub = (com.dosmil_e.m3.core.pub.M3RelationshipPub) aReplicateRelationship;} catch( ClassCastException anEx) {}
    if( aReplicateRelationshipPub == null) { return false;}

    if( aReplicateRelationshipPub.isM3Many( theCtxt)) {
      aReplicateRelationshipPub.addRelatedElement( theCtxt, aReplicatedSourceElement, aReplicatedRelatedElement);
    }
    else {
      aReplicateRelationshipPub.setRelatedElement( theCtxt, aReplicatedSourceElement, aReplicatedRelatedElement);
    }

    boolean aIsTerminal = theNodeCfg.getIsTerminal( theCtxt);
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

    if( theNodeCfg == null)         { return;}
    if( theTraversalCtxt == null)   { return;}

    boolean aIsTerminal = theNodeCfg.getIsTerminal( theCtxt);
    if( aIsTerminal) { return;}

    theTraversalCtxt.pop();
  }

/* Override END */


/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -1234123456300000007L;



}
