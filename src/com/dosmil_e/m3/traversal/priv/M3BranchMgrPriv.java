package com.dosmil_e.m3.traversal.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3BranchMgrPriv 
   extends com.dosmil_e.m3.withm3.priv.MMElementWithM3Priv,  
  com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3BranchMgr
 ****************************************************************************/



/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFmetaBranchMgr
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFmetaBranchMgr
     */
  public void addInverseOFmetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theInverseOFmetaBranchMgr) throws EAIException;







    /* Privileged Write accessor for role InverseOFmetaBranchMgr
     */
  public void removeInverseOFmetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theInverseOFmetaBranchMgr) throws EAIException;






    /* Privileged Read accessor for role InverseOFmetaBranchMgr
     * Guaranteed to return object with same identity of the InverseOFmetaBranchMgr
     */
  public com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] getInverseOFmetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFmetaBranchMgr
     * Used by relationship maintenance machinery
     */
  public void setInverseOFmetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] theInverseOFmetaBranchMgrCollection) throws EAIException;




/****************************************************************************
 *  Implementation of privileged interface for relationship TraversalConfig
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role TraversalConfig
     * Guaranteed to return object with same identity of the TraversalConfig
     */
  public com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv getTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role TraversalConfig
     * Used by relationship maintenance machinery
     */
  public void unsetTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role TraversalConfig
     * Used by relationship maintenance machinery
     */
  public void setTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theTraversalConfig) throws EAIException;
  


    /* Set reference in role TraversalConfig,
     * unlinking back reference from currently related TraversalConfig
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theTraversalConfig) throws EAIException;







}
