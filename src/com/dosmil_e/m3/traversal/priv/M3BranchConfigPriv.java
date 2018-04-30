package com.dosmil_e.m3.traversal.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3BranchConfigPriv 
   extends com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv,  
  com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3BranchConfig
 ****************************************************************************/



/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFbranchConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFbranchConfigs
     */
  public void addInverseOFbranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFbranchConfigs) throws EAIException;







    /* Privileged Write accessor for role InverseOFbranchConfigs
     */
  public void removeInverseOFbranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFbranchConfigs) throws EAIException;






    /* Privileged Read accessor for role InverseOFbranchConfigs
     * Guaranteed to return object with same identity of the InverseOFbranchConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] getInverseOFbranchConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFbranchConfigs
     * Used by relationship maintenance machinery
     */
  public void setInverseOFbranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] theInverseOFbranchConfigsCollection) throws EAIException;




/****************************************************************************
 *  Implementation of privileged interface for relationship MetaRelationship
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role MetaRelationship
     * Guaranteed to return object with same identity of the MetaRelationship
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role MetaRelationship
     * Used by relationship maintenance machinery
     */
  public void unsetMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role MetaRelationship
     * Used by relationship maintenance machinery
     */
  public void setMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theMetaRelationship) throws EAIException;
  


    /* Set reference in role MetaRelationship,
     * unlinking back reference from currently related MetaRelationship
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theMetaRelationship) throws EAIException;






/****************************************************************************
 *  Implementation of privileged interface for relationship TypeNodeConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role TypeNodeConfigs
     */
  public void addTypeNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv theTypeNodeConfigs) throws EAIException;







    /* Privileged Write accessor for role TypeNodeConfigs
     */
  public void removeTypeNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv theTypeNodeConfigs) throws EAIException;






    /* Privileged Read accessor for role TypeNodeConfigs
     * Guaranteed to return object with same identity of the TypeNodeConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] getTypeNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role TypeNodeConfigs
     * Used by relationship maintenance machinery
     */
  public void setTypeNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv[] theTypeNodeConfigsCollection) throws EAIException;




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
 *  Implementation of privileged interface for relationship MetaBranchMgr
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role MetaBranchMgr
     * Guaranteed to return object with same identity of the MetaBranchMgr
     */
  public com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv getMetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role MetaBranchMgr
     * Used by relationship maintenance machinery
     */
  public void unsetMetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role MetaBranchMgr
     * Used by relationship maintenance machinery
     */
  public void setMetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv theMetaBranchMgr) throws EAIException;
  


    /* Set reference in role MetaBranchMgr,
     * unlinking back reference from currently related MetaBranchMgr
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetMetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv theMetaBranchMgr) throws EAIException;







}
