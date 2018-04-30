package com.dosmil_e.m3.replication.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ReplicateBranchMgrIfc
    extends     com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3ReplicateBranchMgr
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3ReplicateBranchMgr
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship ReplicatedMetaRelationship
 ****************************************************************************/


    /* Public Read accessor for role ReplicatedMetaRelationship
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getReplicatedMetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public ReplicatedMetaRelationship number access
     */
  public int numReplicatedMetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ReplicatedMetaRelationship read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getReplicatedMetaRelationshipAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ReplicatedMetaRelationship finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findReplicatedMetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public ReplicatedMetaRelationship is related predicate
     */
  public boolean hasReplicatedMetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional ReplicatedMetaRelationship is related  predicate
     */
  public boolean hasReplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theReplicatedMetaRelationship) throws EAIException;

    /* Public ReplicatedMetaRelationship index access
     */
  public int indexOfReplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theReplicatedMetaRelationship) throws EAIException;

    /* Public Write accessor for role ReplicatedMetaRelationship
     * Machinery in ReplicatedMetaRelationship drives the collection operations
     */
  public void setReplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theReplicatedMetaRelationship) throws EAIException;







}
