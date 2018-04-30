package com.dosmil_e.m3.traversal.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3NodeConfigPriv 
   extends com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv,  
  com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3NodeConfig
 ****************************************************************************/



/****************************************************************************
 *  Implementation of privileged interface for relationship BranchConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role BranchConfigs
     */
  public void addBranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theBranchConfigs) throws EAIException;







    /* Privileged Write accessor for role BranchConfigs
     */
  public void removeBranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theBranchConfigs) throws EAIException;






    /* Privileged Read accessor for role BranchConfigs
     * Guaranteed to return object with same identity of the BranchConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] getBranchConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role BranchConfigs
     * Used by relationship maintenance machinery
     */
  public void setBranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] theBranchConfigsCollection) throws EAIException;




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






/****************************************************************************
 *  Implementation of privileged interface for relationship AttributeConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role AttributeConfigs
     */
  public void addAttributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv theAttributeConfigs) throws EAIException;







    /* Privileged Write accessor for role AttributeConfigs
     */
  public void removeAttributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv theAttributeConfigs) throws EAIException;






    /* Privileged Read accessor for role AttributeConfigs
     * Guaranteed to return object with same identity of the AttributeConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] getAttributeConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role AttributeConfigs
     * Used by relationship maintenance machinery
     */
  public void setAttributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] theAttributeConfigsCollection) throws EAIException;




/****************************************************************************
 *  Implementation of privileged interface for relationship MetaType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role MetaType
     * Guaranteed to return object with same identity of the MetaType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getMetaTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role MetaType
     * Used by relationship maintenance machinery
     */
  public void unsetMetaTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role MetaType
     * Used by relationship maintenance machinery
     */
  public void setMetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theMetaType) throws EAIException;
  


    /* Set reference in role MetaType,
     * unlinking back reference from currently related MetaType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetMetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theMetaType) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship MetaNodeMgr
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role MetaNodeMgr
     * Guaranteed to return object with same identity of the MetaNodeMgr
     */
  public com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv getMetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role MetaNodeMgr
     * Used by relationship maintenance machinery
     */
  public void unsetMetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role MetaNodeMgr
     * Used by relationship maintenance machinery
     */
  public void setMetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv theMetaNodeMgr) throws EAIException;
  


    /* Set reference in role MetaNodeMgr,
     * unlinking back reference from currently related MetaNodeMgr
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetMetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv theMetaNodeMgr) throws EAIException;






/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFnodeConfig
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFnodeConfig
     */
  public void addInverseOFnodeConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv theInverseOFnodeConfig) throws EAIException;







    /* Privileged Write accessor for role InverseOFnodeConfig
     */
  public void removeInverseOFnodeConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv theInverseOFnodeConfig) throws EAIException;






    /* Privileged Read accessor for role InverseOFnodeConfig
     * Guaranteed to return object with same identity of the InverseOFnodeConfig
     */
  public com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] getInverseOFnodeConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFnodeConfig
     * Used by relationship maintenance machinery
     */
  public void setInverseOFnodeConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TypeNodeConfigPriv[] theInverseOFnodeConfigCollection) throws EAIException;






}
