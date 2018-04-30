package com.dosmil_e.m3.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3RelationshipIfc
    extends     com.dosmil_e.m3.core.ifc.M3StructuralFeatureIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3Relationship
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute Kind
 ****************************************************************************/


    /* Public Read accessor for attribute Kind
     */
  public java.lang.String getKind( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute Kind
     */
  public void setKind( EAIMMCtxtIfc theCtxt, java.lang.String theKind) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute IsDerived
 ****************************************************************************/


    /* Public Read accessor for attribute IsDerived
     */
  public boolean getIsDerived( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute IsDerived
     */
  public void setIsDerived( EAIMMCtxtIfc theCtxt, boolean theIsDerived) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute IsDummy
 ****************************************************************************/


    /* Public Read accessor for attribute IsDummy
     */
  public boolean getIsDummy( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute IsDummy
     */
  public void setIsDummy( EAIMMCtxtIfc theCtxt, boolean theIsDummy) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of M3Relationship
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFmetaRelationship
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaRelationship
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getInverseOFmetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFmetaRelationship number access
     */
  public int numInverseOFmetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFmetaRelationship read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc getInverseOFmetaRelationshipAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFmetaRelationship finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc findInverseOFmetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFmetaRelationship is related predicate
     */
  public boolean hasInverseOFmetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFmetaRelationship is related  predicate
     */
  public boolean hasInverseOFmetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException;

    /* Public InverseOFmetaRelationship index access
     */
  public int indexOfInverseOFmetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaRelationshipBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeInverseOFmetaRelationship) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFmetaRelationship
     */
  public void removeInverseOFmetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException;

    /* Public reorder accessor for role InverseOFmetaRelationship
     */
  public void moveInverseOFmetaRelationshipBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeInverseOFmetaRelationship) throws EAIException;


    /* Public reorder accessor for role InverseOFmetaRelationship
     */
  public void moveInverseOFmetaRelationshipToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaRelationship) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFreplicatedMetaRelationship
 ****************************************************************************/


    /* Public Read accessor for role InverseOFreplicatedMetaRelationship
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc[] getInverseOFreplicatedMetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFreplicatedMetaRelationship number access
     */
  public int numInverseOFreplicatedMetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFreplicatedMetaRelationship read accessor by index
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc getInverseOFreplicatedMetaRelationshipAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFreplicatedMetaRelationship finder by name
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc findInverseOFreplicatedMetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFreplicatedMetaRelationship is related predicate
     */
  public boolean hasInverseOFreplicatedMetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFreplicatedMetaRelationship is related  predicate
     */
  public boolean hasInverseOFreplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException;

    /* Public InverseOFreplicatedMetaRelationship index access
     */
  public int indexOfInverseOFreplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFreplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFreplicatedMetaRelationshipBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theRelativeInverseOFreplicatedMetaRelationship) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFreplicatedMetaRelationship
     */
  public void removeInverseOFreplicatedMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException;

    /* Public reorder accessor for role InverseOFreplicatedMetaRelationship
     */
  public void moveInverseOFreplicatedMetaRelationshipBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theRelativeInverseOFreplicatedMetaRelationship) throws EAIException;


    /* Public reorder accessor for role InverseOFreplicatedMetaRelationship
     */
  public void moveInverseOFreplicatedMetaRelationshipToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateBranchMgrIfc theInverseOFreplicatedMetaRelationship) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFtargetToTransfomations
 ****************************************************************************/


    /* Public Read accessor for role InverseOFtargetToTransfomations
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFtargetToTransfomations( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFtargetToTransfomations number access
     */
  public int numInverseOFtargetToTransfomations( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFtargetToTransfomations read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFtargetToTransfomationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFtargetToTransfomations finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFtargetToTransfomationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFtargetToTransfomations is related predicate
     */
  public boolean hasInverseOFtargetToTransfomationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFtargetToTransfomations is related  predicate
     */
  public boolean hasInverseOFtargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException;

    /* Public InverseOFtargetToTransfomations index access
     */
  public int indexOfInverseOFtargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFtargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFtargetToTransfomationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtargetToTransfomations) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFtargetToTransfomations
     */
  public void removeInverseOFtargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException;

    /* Public reorder accessor for role InverseOFtargetToTransfomations
     */
  public void moveInverseOFtargetToTransfomationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtargetToTransfomations) throws EAIException;


    /* Public reorder accessor for role InverseOFtargetToTransfomations
     */
  public void moveInverseOFtargetToTransfomationsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtargetToTransfomations) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFprojectionToOriginals
 ****************************************************************************/


    /* Public Read accessor for role InverseOFprojectionToOriginals
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFprojectionToOriginals( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFprojectionToOriginals number access
     */
  public int numInverseOFprojectionToOriginals( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFprojectionToOriginals read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFprojectionToOriginalsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFprojectionToOriginals finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFprojectionToOriginalsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFprojectionToOriginals is related predicate
     */
  public boolean hasInverseOFprojectionToOriginalsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFprojectionToOriginals is related  predicate
     */
  public boolean hasInverseOFprojectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException;

    /* Public InverseOFprojectionToOriginals index access
     */
  public int indexOfInverseOFprojectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFprojectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFprojectionToOriginalsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectionToOriginals) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFprojectionToOriginals
     */
  public void removeInverseOFprojectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException;

    /* Public reorder accessor for role InverseOFprojectionToOriginals
     */
  public void moveInverseOFprojectionToOriginalsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectionToOriginals) throws EAIException;


    /* Public reorder accessor for role InverseOFprojectionToOriginals
     */
  public void moveInverseOFprojectionToOriginalsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionToOriginals) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFprojectedToProjections
 ****************************************************************************/


    /* Public Read accessor for role InverseOFprojectedToProjections
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFprojectedToProjections( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFprojectedToProjections number access
     */
  public int numInverseOFprojectedToProjections( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFprojectedToProjections read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFprojectedToProjectionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFprojectedToProjections finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFprojectedToProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFprojectedToProjections is related predicate
     */
  public boolean hasInverseOFprojectedToProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFprojectedToProjections is related  predicate
     */
  public boolean hasInverseOFprojectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException;

    /* Public InverseOFprojectedToProjections index access
     */
  public int indexOfInverseOFprojectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFprojectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFprojectedToProjectionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectedToProjections) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFprojectedToProjections
     */
  public void removeInverseOFprojectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException;

    /* Public reorder accessor for role InverseOFprojectedToProjections
     */
  public void moveInverseOFprojectedToProjectionsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectedToProjections) throws EAIException;


    /* Public reorder accessor for role InverseOFprojectedToProjections
     */
  public void moveInverseOFprojectedToProjectionsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectedToProjections) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFtransformationToSources
 ****************************************************************************/


    /* Public Read accessor for role InverseOFtransformationToSources
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFtransformationToSources( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFtransformationToSources number access
     */
  public int numInverseOFtransformationToSources( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFtransformationToSources read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFtransformationToSourcesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFtransformationToSources finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFtransformationToSourcesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFtransformationToSources is related predicate
     */
  public boolean hasInverseOFtransformationToSourcesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFtransformationToSources is related  predicate
     */
  public boolean hasInverseOFtransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException;

    /* Public InverseOFtransformationToSources index access
     */
  public int indexOfInverseOFtransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFtransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFtransformationToSourcesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtransformationToSources) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFtransformationToSources
     */
  public void removeInverseOFtransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException;

    /* Public reorder accessor for role InverseOFtransformationToSources
     */
  public void moveInverseOFtransformationToSourcesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtransformationToSources) throws EAIException;


    /* Public reorder accessor for role InverseOFtransformationToSources
     */
  public void moveInverseOFtransformationToSourcesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSources) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFtransformationToSubTransformations
 ****************************************************************************/


    /* Public Read accessor for role InverseOFtransformationToSubTransformations
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFtransformationToSubTransformations( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFtransformationToSubTransformations number access
     */
  public int numInverseOFtransformationToSubTransformations( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFtransformationToSubTransformations read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFtransformationToSubTransformationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFtransformationToSubTransformations finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFtransformationToSubTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFtransformationToSubTransformations is related predicate
     */
  public boolean hasInverseOFtransformationToSubTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFtransformationToSubTransformations is related  predicate
     */
  public boolean hasInverseOFtransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException;

    /* Public InverseOFtransformationToSubTransformations index access
     */
  public int indexOfInverseOFtransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFtransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFtransformationToSubTransformationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtransformationToSubTransformations) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFtransformationToSubTransformations
     */
  public void removeInverseOFtransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException;

    /* Public reorder accessor for role InverseOFtransformationToSubTransformations
     */
  public void moveInverseOFtransformationToSubTransformationsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFtransformationToSubTransformations) throws EAIException;


    /* Public reorder accessor for role InverseOFtransformationToSubTransformations
     */
  public void moveInverseOFtransformationToSubTransformationsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFtransformationToSubTransformations) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to ONE relationship Inverse
 ****************************************************************************/


    /* Public Read accessor for role Inverse
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getInverse( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public Inverse number access
     */
  public int numInverse( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Inverse read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getInverseAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Inverse finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findInverseNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public Inverse is related predicate
     */
  public boolean hasInverseNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional Inverse is related  predicate
     */
  public boolean hasInverse( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theInverse) throws EAIException;

    /* Public Inverse index access
     */
  public int indexOfInverse( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theInverse) throws EAIException;

    /* Public Write accessor for role Inverse
     * Machinery in Inverse drives the collection operations
     */
  public void setInverse( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theInverse) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship Type
 ****************************************************************************/


    /* Public Read accessor for role Type
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public Type number access
     */
  public int numType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Type read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Type finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public Type is related predicate
     */
  public boolean hasTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional Type is related  predicate
     */
  public boolean hasType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theType) throws EAIException;

    /* Public Type index access
     */
  public int indexOfType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theType) throws EAIException;

    /* Public Write accessor for role Type
     * Machinery in Type drives the collection operations
     */
  public void setType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theType) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship RelatedType
 ****************************************************************************/


    /* Public Read accessor for role RelatedType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getRelatedType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public RelatedType number access
     */
  public int numRelatedType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public RelatedType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getRelatedTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public RelatedType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findRelatedTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public RelatedType is related predicate
     */
  public boolean hasRelatedTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional RelatedType is related  predicate
     */
  public boolean hasRelatedType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelatedType) throws EAIException;

    /* Public RelatedType index access
     */
  public int indexOfRelatedType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelatedType) throws EAIException;

    /* Public Write accessor for role RelatedType
     * Machinery in RelatedType drives the collection operations
     */
  public void setRelatedType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelatedType) throws EAIException;







}
