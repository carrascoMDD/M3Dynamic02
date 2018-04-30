package com.dosmil_e.m3.replication.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ReplicateBranchMgrPriv 
   extends com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv,  
  com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3ReplicateBranchMgr
 ****************************************************************************/


/****************************************************************************
 *  Implementation of privileged interface for relationship ReplicatedMetaRelationship
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ReplicatedMetaRelationship
     * Guaranteed to return object with same identity of the ReplicatedMetaRelationship
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getReplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role ReplicatedMetaRelationship
     * Used by relationship maintenance machinery
     */
  public void unsetReplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role ReplicatedMetaRelationship
     * Used by relationship maintenance machinery
     */
  public void setReplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theReplicatedMetaRelationship) throws EAIException;
  


    /* Set reference in role ReplicatedMetaRelationship,
     * unlinking back reference from currently related ReplicatedMetaRelationship
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetReplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theReplicatedMetaRelationship) throws EAIException;







}
