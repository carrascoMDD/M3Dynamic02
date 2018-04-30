package com.dosmil_e.m3.visit;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3TraversalConfigCacheIfc   {



  public com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc getRootTypeNodeConfigFor(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theSourceMMElement) throws EAIException;


  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc getRelatedTypeNodeConfigFor(
    EAIMMCtxtIfc                                        theCtxt,
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc     theBranchCfg,
    com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc       theRelatedMMElement) throws EAIException;



}



