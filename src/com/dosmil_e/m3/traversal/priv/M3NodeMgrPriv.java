package com.dosmil_e.m3.traversal.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3NodeMgrPriv 
   extends com.dosmil_e.m3.withm3.priv.MMElementWithM3Priv,  
  com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3NodeMgr
 ****************************************************************************/



/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFmetaNodeMgr
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFmetaNodeMgr
     */
  public void addInverseOFmetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFmetaNodeMgr) throws EAIException;







    /* Privileged Write accessor for role InverseOFmetaNodeMgr
     */
  public void removeInverseOFmetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFmetaNodeMgr) throws EAIException;






    /* Privileged Read accessor for role InverseOFmetaNodeMgr
     * Guaranteed to return object with same identity of the InverseOFmetaNodeMgr
     */
  public com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] getInverseOFmetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFmetaNodeMgr
     * Used by relationship maintenance machinery
     */
  public void setInverseOFmetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] theInverseOFmetaNodeMgrCollection) throws EAIException;




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
