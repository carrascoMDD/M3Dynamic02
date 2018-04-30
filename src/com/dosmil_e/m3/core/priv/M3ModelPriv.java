package com.dosmil_e.m3.core.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ModelPriv 
   extends com.dosmil_e.m3.core.priv.M3ModulePriv,  
  com.dosmil_e.m3.core.ifc.M3ModelIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3Model
 ****************************************************************************/


/****************************************************************************
 *  Implementation of privileged interface for relationship TreeRootType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role TreeRootType
     * Guaranteed to return object with same identity of the TreeRootType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getTreeRootTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role TreeRootType
     * Used by relationship maintenance machinery
     */
  public void unsetTreeRootTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role TreeRootType
     * Used by relationship maintenance machinery
     */
  public void setTreeRootTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theTreeRootType) throws EAIException;
  




    /* Set reference in role TreeRootType,
     * unlinking back reference from currently related TreeRootType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTreeRootTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theTreeRootType) throws EAIException;
  





/****************************************************************************
 *  Implementation of privileged interface for relationship TraversalConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role TraversalConfigs
     */
  public void addTraversalConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theTraversalConfigs) throws EAIException;







    /* Privileged Write accessor for role TraversalConfigs
     */
  public void removeTraversalConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theTraversalConfigs) throws EAIException;






    /* Privileged Read accessor for role TraversalConfigs
     * Guaranteed to return object with same identity of the TraversalConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] getTraversalConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role TraversalConfigs
     * Used by relationship maintenance machinery
     */
  public void setTraversalConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv[] theTraversalConfigsCollection) throws EAIException;






}
