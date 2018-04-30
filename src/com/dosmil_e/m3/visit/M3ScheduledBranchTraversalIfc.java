package com.dosmil_e.m3.visit;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ScheduledBranchTraversalIfc {


  public M3TraversalVisitorIfc getTraversalVisitor( EAIMMCtxtIfc theCtxt);

  public int getPhaseNumber( EAIMMCtxtIfc theCtxt);

  public M3TraversalCtxtIfc getTraversalCtxt( EAIMMCtxtIfc theCtxt);

  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalCfg( EAIMMCtxtIfc theCtxt);

  public com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc getSourceMMElement( EAIMMCtxtIfc theCtxt);


  public void triggerTraversalForPhase( EAIMMCtxtIfc theCtxt, int thePhaseNumber) throws EAIException;


}




