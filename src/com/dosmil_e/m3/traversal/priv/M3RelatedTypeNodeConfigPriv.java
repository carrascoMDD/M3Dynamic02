package com.dosmil_e.m3.traversal.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3RelatedTypeNodeConfigPriv 
   extends com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv,  
  com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3RelatedTypeNodeConfig
 ****************************************************************************/


/****************************************************************************
 *  Implementation of privileged interface for relationship BranchConfig
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role BranchConfig
     * Guaranteed to return object with same identity of the BranchConfig
     */
  public com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv getBranchConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role BranchConfig
     * Used by relationship maintenance machinery
     */
  public void unsetBranchConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role BranchConfig
     * Used by relationship maintenance machinery
     */
  public void setBranchConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theBranchConfig) throws EAIException;
  


    /* Set reference in role BranchConfig,
     * unlinking back reference from currently related BranchConfig
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetBranchConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theBranchConfig) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship Filter
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role Filter
     * Guaranteed to return object with same identity of the Filter
     */
  public com.dosmil_e.m3.traversal.priv.M3FilterPriv getFilterPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role Filter
     * Used by relationship maintenance machinery
     */
  public void unsetFilterPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role Filter
     * Used by relationship maintenance machinery
     */
  public void setFilterPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3FilterPriv theFilter) throws EAIException;
  




    /* Set reference in role Filter,
     * unlinking back reference from currently related Filter
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetFilterPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3FilterPriv theFilter) throws EAIException;
  






}
