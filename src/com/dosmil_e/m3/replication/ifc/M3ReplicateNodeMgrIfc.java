package com.dosmil_e.m3.replication.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ReplicateNodeMgrIfc
    extends     com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3ReplicateNodeMgr
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3ReplicateNodeMgr
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship ReplicatedMetaType
 ****************************************************************************/


    /* Public Read accessor for role ReplicatedMetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getReplicatedMetaType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public ReplicatedMetaType number access
     */
  public int numReplicatedMetaType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ReplicatedMetaType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getReplicatedMetaTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ReplicatedMetaType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findReplicatedMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public ReplicatedMetaType is related predicate
     */
  public boolean hasReplicatedMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional ReplicatedMetaType is related  predicate
     */
  public boolean hasReplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theReplicatedMetaType) throws EAIException;

    /* Public ReplicatedMetaType index access
     */
  public int indexOfReplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theReplicatedMetaType) throws EAIException;

    /* Public Write accessor for role ReplicatedMetaType
     * Machinery in ReplicatedMetaType drives the collection operations
     */
  public void setReplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theReplicatedMetaType) throws EAIException;







}
