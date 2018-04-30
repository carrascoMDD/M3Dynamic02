package com.dosmil_e.m3.visit;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public class M3ScheduledBranchTraversal implements M3ScheduledBranchTraversalIfc   {


  protected M3TraversalVisitorIfc                               vTraversalVisitor;
  protected int                                                 vPhaseNumber;
  protected M3TraversalCtxtIfc                                  vTraversalCtxt;
  protected com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  vTraversalCfg;
  protected com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     vBranchCfg;
  protected com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       vSourceMMElement;


/****************************************************************************
 *  Constructors of the Visitor
 ****************************************************************************/

  public M3ScheduledBranchTraversal() {
  }


  public M3ScheduledBranchTraversal( 
    EAIMMCtxtIfc                                        theCtxt,
    M3TraversalVisitorIfc                               theTraversalVisitor,
    int                                                 thePhaseNumber,
    M3TraversalCtxtIfc                                  theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) {

    vTraversalVisitor  = theTraversalVisitor;
    vPhaseNumber       = thePhaseNumber;
    vTraversalCtxt     = theTraversalCtxt;
    vTraversalCfg      = theTraversalCfg;
    vBranchCfg         = theBranchCfg;
    vSourceMMElement   = theSourceMMElement;
  }



  public M3TraversalVisitorIfc getTraversalVisitor( EAIMMCtxtIfc theCtxt) {
    return vTraversalVisitor;
  }

  public int getPhaseNumber( EAIMMCtxtIfc theCtxt) {
    return vPhaseNumber;
  }

  public M3TraversalCtxtIfc getTraversalCtxt( EAIMMCtxtIfc theCtxt) {
    return vTraversalCtxt;
  }

  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalCfg( EAIMMCtxtIfc theCtxt) {
    return vTraversalCfg;
  }

  public com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc getSourceMMElement( EAIMMCtxtIfc theCtxt) {
    return vSourceMMElement;
  }



  public void triggerTraversalForPhase( EAIMMCtxtIfc theCtxt, int thePhaseNumber) throws EAIException {
    if( vTraversalVisitor == null) { return;}

    vTraversalVisitor.visitBranchForPhase( theCtxt, this, thePhaseNumber, vTraversalCtxt, vTraversalCfg, vBranchCfg, vSourceMMElement);
  }




}



