package com.dosmil_e.m3.visit;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3TraversalCtxtIfc {


  public int getLevels();
  public int push( );
  public int pop( );

  public int getPhaseCounter();
  public int incrementPhaseCounter( EAIMMCtxtIfc theCtxt) throws EAIException;
  public void scheduleBranchTraversalForPhase(
    EAIMMCtxtIfc                                        theCtxt,
    M3TraversalVisitorIfc                               theTraversalVisitor,
    int                                                 thePhaseNumber,
    M3TraversalCtxtIfc                                  theTraversalCtxt,
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  theTraversalCfg,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException;


  public java.util.Hashtable getCommon( String theCommonName);

}



