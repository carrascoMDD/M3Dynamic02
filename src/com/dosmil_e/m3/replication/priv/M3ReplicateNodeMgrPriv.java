package com.dosmil_e.m3.replication.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ReplicateNodeMgrPriv 
   extends com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv,  
  com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3ReplicateNodeMgr
 ****************************************************************************/


/****************************************************************************
 *  Implementation of privileged interface for relationship ReplicatedMetaType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ReplicatedMetaType
     * Guaranteed to return object with same identity of the ReplicatedMetaType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getReplicatedMetaTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role ReplicatedMetaType
     * Used by relationship maintenance machinery
     */
  public void unsetReplicatedMetaTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role ReplicatedMetaType
     * Used by relationship maintenance machinery
     */
  public void setReplicatedMetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theReplicatedMetaType) throws EAIException;
  


    /* Set reference in role ReplicatedMetaType,
     * unlinking back reference from currently related ReplicatedMetaType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetReplicatedMetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theReplicatedMetaType) throws EAIException;







}
