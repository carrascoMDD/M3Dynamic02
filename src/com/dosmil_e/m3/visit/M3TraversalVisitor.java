package com.dosmil_e.m3.visit;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public class M3TraversalVisitor implements M3TraversalVisitorIfc   {


  protected M3TraversalConfigCacheIfc vTraversalConfigCache;


/****************************************************************************
 *  Constructors of the Visitor
 ****************************************************************************/

  public M3TraversalVisitor() {
  }


  public M3TraversalVisitor( EAIMMCtxtIfc theCtxt) {
  }


/****************************************************************************
 *  Implementation of public Transactional interface for visitor
 ****************************************************************************/


    /* Transactional Public visit with factory operation
     */
  public com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc visit(
    EAIMMCtxtIfc                                          theCtxt,
    M3TraversalCtxtIfc                                    theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc    theTraversalCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc         theSourceMMElement) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return null;}
    if( aTrxMgr.inTransaction()) {
      return visitPR( theCtxt, theTraversalCtxt, theTraversalCfg, theSourceMMElement);
    }


    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc aResult =
          visitPR( theCtxt, theTraversalCtxt, theTraversalCfg, theSourceMMElement);
        anIsDone = true;
        return aResult;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
    return null;
  }



  /* Visit inside transaction
   */
  protected com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc visitPR(
    EAIMMCtxtIfc                                        theCtxt,
    M3TraversalCtxtIfc                                  theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    return visitRoot( theCtxt, theTraversalCtxt, theTraversalCfg, theSourceMMElement);
  }



  /* Visit root
   */
  protected com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc visitRoot(
    EAIMMCtxtIfc                                        theCtxt,
    M3TraversalCtxtIfc                                  theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    if( theCtxt == null)            { return null;}
    if( theTraversalCtxt == null)    { return null;}
    if( theTraversalCfg == null)    { return null;}
    if( theSourceMMElement == null) { return null;}

    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc aRootTypeNodeCfg =
      getRootTypeNodeConfigFor( theCtxt, theTraversalCtxt, theTraversalCfg, theSourceMMElement);
    if( aRootTypeNodeCfg == null)      { return null;}


    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aNodeCfg = aRootTypeNodeCfg.getNodeConfig( theCtxt);
    if( aNodeCfg == null)      { return null;}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aType = aNodeCfg.getMetaType( theCtxt);
    if( aType == null)      { return null;}

    boolean aMustEndVisit = false;
    com.dosmil_e.m3.traversal.pub.M3NodeMgrPub aNodeMgrPub = null;
    try {
      com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aNodeMgr = aNodeCfg.getMetaNodeMgr( theCtxt);
      if( aNodeMgr != null)      {
        try { aNodeMgrPub = (com.dosmil_e.m3.traversal.pub.M3NodeMgrPub) aNodeMgr;} catch( ClassCastException anEx) {}
        if( aNodeMgrPub != null)      {
          aMustEndVisit = aNodeMgrPub.beginVisit( theCtxt, theTraversalCtxt, this, theTraversalCfg, aNodeCfg, aType, theSourceMMElement);
        }
      }


      com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchCfgs = aNodeCfg.getBranchConfigs( theCtxt);
      if( someBranchCfgs != null)      {
        visitBranches( theCtxt, theTraversalCtxt, theTraversalCfg, someBranchCfgs, theSourceMMElement);
      }

      com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeCfgs = aNodeCfg.getAttributeConfigs( theCtxt);
      if( someAttributeCfgs != null)      {
        visitAttributes( theCtxt, theTraversalCtxt, theTraversalCfg, someAttributeCfgs, theSourceMMElement);
      }
    }
    finally {
      if( aNodeMgrPub != null && aMustEndVisit) {
        aNodeMgrPub.endVisit( theCtxt, theTraversalCtxt, this, theTraversalCfg, aNodeCfg, aType, theSourceMMElement);
      }
    }

    theTraversalCtxt.incrementPhaseCounter( theCtxt);

    return theSourceMMElement;
 }


   /* Visit through branches
   */
  protected void visitBranches(
    EAIMMCtxtIfc                                        theCtxt,
    M3TraversalCtxtIfc                                  theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[]   theBranchCfgs,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    if( theCtxt == null)            { return;}
    if( theTraversalCtxt == null)    { return;}
    if( theTraversalCfg == null)    { return;}
    if( theBranchCfgs == null)      { return;}
    if( theSourceMMElement == null) { return;}

    int aNumBranchCfgs = theBranchCfgs.length;
    if( aNumBranchCfgs < 1)         { return;}

    for( int anIndex = 0; anIndex < aNumBranchCfgs; anIndex++) {
      com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aBranchCfg = theBranchCfgs[ anIndex];
      if( aBranchCfg != null) {
        visitBranch( theCtxt, theTraversalCtxt, theTraversalCfg, aBranchCfg, theSourceMMElement);
      }
    }
  }



   /* Visit through one branch
   */
  public void visitBranchForPhase(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.visit.M3ScheduledBranchTraversal    theScheduledBranchTraversal,
    int                                                 thePhaseNumber,
    M3TraversalCtxtIfc                                  theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

/*
    if( theBranchCfg.getName().getString().equals("NodeConfig_metaNodeMgrBC")) {
      System.out.println("visitBranch NodeConfig_metaNodeMgrBC");
    }
*/
    visitBranchUnconditionally( theCtxt, theTraversalCtxt, theTraversalCfg, theBranchCfg, theSourceMMElement);
  }



   /* Visit through one branch
   */
  protected void visitBranch(
    EAIMMCtxtIfc                                        theCtxt,
    M3TraversalCtxtIfc                                  theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    if( theCtxt == null)            { return;}
    if( theTraversalCtxt == null)    { return;}
    if( theBranchCfg == null)       { return;}

/*
    if( theBranchCfg.getName().getString().equals("NodeConfig_metaNodeMgrBC")) {
      System.out.println("visitBranch NodeConfig_metaNodeMgrBC");
    }
*/
    int aCurrentPhaseNumber = theTraversalCtxt.getPhaseCounter();

    int aPhaseNumber = theBranchCfg.getPhaseNumber( theCtxt);

    if( aPhaseNumber > aCurrentPhaseNumber) {
      theTraversalCtxt.scheduleBranchTraversalForPhase( theCtxt, this, aPhaseNumber, theTraversalCtxt, theTraversalCfg, theBranchCfg, theSourceMMElement);
      return;
    }

    visitBranchUnconditionally( theCtxt, theTraversalCtxt, theTraversalCfg, theBranchCfg, theSourceMMElement);
  }


   /* Visit through one branch
   */
  protected void visitBranchUnconditionally(
    EAIMMCtxtIfc                                        theCtxt,
    M3TraversalCtxtIfc                                  theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    if( theCtxt == null)            { return;}
    if( theTraversalCtxt == null)   { return;}
    if( theTraversalCfg == null)    { return;}
    if( theBranchCfg == null)       { return;}
    if( theSourceMMElement == null) { return;}

    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[] someRelatedElements =  null;

    com.dosmil_e.m3.core.ifc.M3RelationshipIfc aRelationship = theBranchCfg.getMetaRelationship( theCtxt);
    if( aRelationship == null)      { return;}

    com.dosmil_e.m3.core.pub.M3RelationshipPub aRelationshipPub = null;
    try { aRelationshipPub = (com.dosmil_e.m3.core.pub.M3RelationshipPub) aRelationship;} catch( ClassCastException anEx) {}
    if( aRelationshipPub != null) {
      someRelatedElements = aRelationshipPub.getRelatedElements( theCtxt, theSourceMMElement);
    }

    boolean aMustEndVisit = false;
    com.dosmil_e.m3.traversal.pub.M3BranchMgrPub aBranchMgrPub = null;
    try {
      com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aBranchMgr = theBranchCfg.getMetaBranchMgr( theCtxt);
      if( aBranchMgr != null)      {
        try { aBranchMgrPub = (com.dosmil_e.m3.traversal.pub.M3BranchMgrPub) aBranchMgr;} catch( ClassCastException anEx) {}
        if( aBranchMgrPub!= null)      {
          aMustEndVisit = aBranchMgrPub.beginVisit( theCtxt, theTraversalCtxt, this, theTraversalCfg,
            theBranchCfg, aRelationship, theSourceMMElement, someRelatedElements);
        }
      }

      if( someRelatedElements  == null) { return;}
      int aNumRelated = someRelatedElements.length;
      if( aNumRelated < 1)              { return;}

      visitBranchElements( theCtxt, theTraversalCtxt, theTraversalCfg, theBranchCfg, aBranchMgr, aRelationship,
        theSourceMMElement, someRelatedElements);
    }
    finally {
      if( aBranchMgrPub != null && aMustEndVisit) {
        aBranchMgrPub.endVisit( theCtxt, theTraversalCtxt, this, theTraversalCfg, theBranchCfg, aRelationship,
          theSourceMMElement, someRelatedElements);
      }
    }
  }




   /* Visit branch elements
   */
  protected void visitBranchElements(
    EAIMMCtxtIfc                                          theCtxt,
    M3TraversalCtxtIfc                                    theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc    theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc       theBranchCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc          theBranchMgr,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc            theRelationship,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc         theSourceMMElement,
    com.dosmil_e.modelbase.ifc.EAIMMElementIfc[]  theRelatedMMElements) throws EAIException {

    if( theCtxt == null)              { return;}
    if( theTraversalCtxt == null)     { return;}
    if( theTraversalCfg == null)      { return;}
    if( theBranchCfg == null)         { return;}
    if( theRelationship == null)      { return;}
    if( theSourceMMElement == null)   { return;}
    if( theRelatedMMElements == null) { return;}

    int aNumRelated = theRelatedMMElements.length;
    if( aNumRelated < 1)         { return;}

    for( int anIndex = 0; anIndex < aNumRelated; anIndex++) {
      com.dosmil_e.modelbase.ifc.EAIMMElementIfc aRelated = theRelatedMMElements[ anIndex];
      if( aRelated != null) {
        com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc aRelatedWithM3 = null;
        try { aRelatedWithM3 = (com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc) aRelated;} catch( ClassCastException anEx) {}
        if( aRelatedWithM3 != null) {
          visitBranchElement( theCtxt, theTraversalCtxt, theTraversalCfg, theBranchCfg, theBranchMgr, theRelationship,
            theSourceMMElement, aRelatedWithM3);
        }
      }
    }
  }



   /* Visit branch element
   */
  protected void visitBranchElement(
    EAIMMCtxtIfc                                          theCtxt,
    M3TraversalCtxtIfc                                    theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc    theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc       theBranchCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc          theBranchMgr,
    com.dosmil_e.m3.core.ifc.M3RelationshipIfc            theRelationship,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc         theSourceMMElement,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc         theRelatedMMElement) throws EAIException {

    if( theCtxt == null)              { return;}
    if( theTraversalCtxt == null)     { return;}
    if( theTraversalCfg == null)      { return;}
    if( theBranchCfg == null)         { return;}
    if( theRelationship == null)      { return;}
    if( theSourceMMElement == null)   { return;}
    if( theRelatedMMElement == null)  { return;}

    com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc aRelatedTypeNodeCfg =
      getRelatedTypeNodeConfigFor( theCtxt, theTraversalCtxt, theTraversalCfg, theBranchCfg, theRelatedMMElement);
    if( aRelatedTypeNodeCfg == null)      { return;}


    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aNodeCfg = aRelatedTypeNodeCfg.getNodeConfig( theCtxt);
    if( aNodeCfg == null)      { return;}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aType = aNodeCfg.getMetaType( theCtxt);
    if( aType == null)      { return;}

    boolean aIsTerminal = aNodeCfg.getIsTerminal( theCtxt);

    boolean aMustEndVisit = false;
    com.dosmil_e.m3.traversal.pub.M3NodeMgrPub aNodeMgrPub = null;
    try {
      com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aNodeMgr = aNodeCfg.getMetaNodeMgr( theCtxt);
      if( aNodeMgr != null)      {
        try { aNodeMgrPub = (com.dosmil_e.m3.traversal.pub.M3NodeMgrPub) aNodeMgr;} catch( ClassCastException anEx) {}
        if( aNodeMgrPub != null)  {
          aMustEndVisit = aNodeMgrPub.beginVisit( theCtxt, theTraversalCtxt, this, theTraversalCfg, theBranchCfg, theBranchMgr,
          theRelationship, aNodeCfg, aType, theSourceMMElement, theRelatedMMElement);
        }
      }

      if( !aIsTerminal && aMustEndVisit) {
        com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchCfgs = aNodeCfg.getBranchConfigs( theCtxt);
        if( someBranchCfgs != null)      {
          visitBranches( theCtxt, theTraversalCtxt, theTraversalCfg, someBranchCfgs, theRelatedMMElement);
        }

        com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeCfgs = aNodeCfg.getAttributeConfigs( theCtxt);
        if( someAttributeCfgs != null)      {
          visitAttributes( theCtxt, theTraversalCtxt, theTraversalCfg, someAttributeCfgs, theRelatedMMElement);
        }
      }

    }
    finally {
      if( !aIsTerminal && aNodeMgrPub != null && aMustEndVisit) {
        aNodeMgrPub.endVisit( theCtxt, theTraversalCtxt, this, theTraversalCfg, theBranchCfg, theBranchMgr,
          theRelationship, aNodeCfg, aType, theSourceMMElement, theRelatedMMElement);
      }
    }

  }


   /* Visit through attributes
   */
  protected void visitAttributes(
    EAIMMCtxtIfc                                            theCtxt,
    M3TraversalCtxtIfc                                      theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc      theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[]    theAttributeCfgs,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc           theSourceMMElement) throws EAIException {

    if( theCtxt == null)            { return;}
    if( theTraversalCtxt == null)    { return;}
    if( theTraversalCfg == null)    { return;}
    if( theAttributeCfgs == null)      { return;}
    if( theSourceMMElement == null) { return;}

    int aNumAttributeCfgs = theAttributeCfgs.length;
    if( aNumAttributeCfgs < 0)         { return;}

    for( int anIndex = 0; anIndex < aNumAttributeCfgs; anIndex++) {
      com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aAttributeCfg = theAttributeCfgs[ anIndex];
      if( aAttributeCfg != null) {
        visitAttribute( theCtxt, theTraversalCtxt, theTraversalCfg, aAttributeCfg, theSourceMMElement);
      }
    }
  }



   /* Visit through one branch
   */
  protected void visitAttribute(
    EAIMMCtxtIfc                                        theCtxt,
    M3TraversalCtxtIfc                                  theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc  theAttributeCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    if( theCtxt == null)            { return;}
    if( theTraversalCtxt == null)    { return;}
    if( theTraversalCfg == null)    { return;}
    if( theAttributeCfg == null)       { return;}
    if( theSourceMMElement == null) { return;}

    Object aValue = null;
    com.dosmil_e.m3.core.ifc.M3AttributeIfc anAttribute = theAttributeCfg.getMetaAttribute( theCtxt);
    if( anAttribute != null) {
      com.dosmil_e.m3.core.pub.M3AttributePub anAttributePub = null;
      try { anAttributePub = (com.dosmil_e.m3.core.pub.M3AttributePub) anAttribute;} catch( ClassCastException anEx) {}
      if( anAttributePub != null) {
        aValue = anAttributePub.getAttributeValue( theCtxt, theSourceMMElement);
      }
    }

    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aFieldMgr = theAttributeCfg.getMetaFieldMgr( theCtxt);
    if( aFieldMgr != null)      {
      com.dosmil_e.m3.traversal.pub.M3FieldMgrPub aFieldMgrPub = null;
      try { aFieldMgrPub = (com.dosmil_e.m3.traversal.pub.M3FieldMgrPub) aFieldMgr;} catch( ClassCastException anEx) {}
      if( aFieldMgrPub!= null)      {
        aFieldMgrPub.tendVisit( theCtxt, theTraversalCtxt, this, theTraversalCfg, theAttributeCfg, theSourceMMElement, aValue);
      }
    }

  }






  protected com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc getRootTypeNodeConfigFor(
    EAIMMCtxtIfc                                        theCtxt,
    M3TraversalCtxtIfc                                  theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException {

    if( theCtxt == null)              { return null;}
    if( theTraversalCtxt == null)     { return null;}
    if( theTraversalCfg == null)      { return null;}
    if( theSourceMMElement == null)   { return null;}

    if( vTraversalConfigCache == null)   {
      vTraversalConfigCache = new M3TraversalConfigCache( theTraversalCfg);
    }

    return vTraversalConfigCache.getRootTypeNodeConfigFor(  theCtxt, theSourceMMElement);
  }



  protected com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc getRelatedTypeNodeConfigFor(
    EAIMMCtxtIfc                                        theCtxt,
    M3TraversalCtxtIfc                                  theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theRelatedMMElement) throws EAIException {

    if( theCtxt == null)              { return null;}
    if( theTraversalCtxt == null)     { return null;}
    if( theTraversalCfg == null)      { return null;}
    if( theBranchCfg == null)         { return null;}
    if( theRelatedMMElement == null)  { return null;}

    if( vTraversalConfigCache == null)   {
      vTraversalConfigCache = new M3TraversalConfigCache( theTraversalCfg);
    }

    return vTraversalConfigCache.getRelatedTypeNodeConfigFor(  theCtxt, theBranchCfg, theRelatedMMElement);
  }







}



