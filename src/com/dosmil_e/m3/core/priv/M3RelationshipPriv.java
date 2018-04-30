package com.dosmil_e.m3.core.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3RelationshipPriv 
   extends com.dosmil_e.m3.core.priv.M3StructuralFeaturePriv,  
  com.dosmil_e.m3.core.ifc.M3RelationshipIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3Relationship
 ****************************************************************************/



/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFmetaRelationship
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFmetaRelationship
     */
  public void addInverseOFmetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theInverseOFmetaRelationship) throws EAIException;







    /* Privileged Write accessor for role InverseOFmetaRelationship
     */
  public void removeInverseOFmetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theInverseOFmetaRelationship) throws EAIException;






    /* Privileged Read accessor for role InverseOFmetaRelationship
     * Guaranteed to return object with same identity of the InverseOFmetaRelationship
     */
  public com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] getInverseOFmetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFmetaRelationship
     * Used by relationship maintenance machinery
     */
  public void setInverseOFmetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] theInverseOFmetaRelationshipCollection) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFreplicatedMetaRelationship
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFreplicatedMetaRelationship
     */
  public void addInverseOFreplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv theInverseOFreplicatedMetaRelationship) throws EAIException;







    /* Privileged Write accessor for role InverseOFreplicatedMetaRelationship
     */
  public void removeInverseOFreplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv theInverseOFreplicatedMetaRelationship) throws EAIException;






    /* Privileged Read accessor for role InverseOFreplicatedMetaRelationship
     * Guaranteed to return object with same identity of the InverseOFreplicatedMetaRelationship
     */
  public com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] getInverseOFreplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFreplicatedMetaRelationship
     * Used by relationship maintenance machinery
     */
  public void setInverseOFreplicatedMetaRelationshipPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.priv.M3ReplicateBranchMgrPriv[] theInverseOFreplicatedMetaRelationshipCollection) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFtargetToTransfomations
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFtargetToTransfomations
     */
  public void addInverseOFtargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFtargetToTransfomations) throws EAIException;







    /* Privileged Write accessor for role InverseOFtargetToTransfomations
     */
  public void removeInverseOFtargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFtargetToTransfomations) throws EAIException;






    /* Privileged Read accessor for role InverseOFtargetToTransfomations
     * Guaranteed to return object with same identity of the InverseOFtargetToTransfomations
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFtargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFtargetToTransfomations
     * Used by relationship maintenance machinery
     */
  public void setInverseOFtargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFtargetToTransfomationsCollection) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFprojectionToOriginals
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFprojectionToOriginals
     */
  public void addInverseOFprojectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFprojectionToOriginals) throws EAIException;







    /* Privileged Write accessor for role InverseOFprojectionToOriginals
     */
  public void removeInverseOFprojectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFprojectionToOriginals) throws EAIException;






    /* Privileged Read accessor for role InverseOFprojectionToOriginals
     * Guaranteed to return object with same identity of the InverseOFprojectionToOriginals
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFprojectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFprojectionToOriginals
     * Used by relationship maintenance machinery
     */
  public void setInverseOFprojectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFprojectionToOriginalsCollection) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFprojectedToProjections
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFprojectedToProjections
     */
  public void addInverseOFprojectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFprojectedToProjections) throws EAIException;







    /* Privileged Write accessor for role InverseOFprojectedToProjections
     */
  public void removeInverseOFprojectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFprojectedToProjections) throws EAIException;






    /* Privileged Read accessor for role InverseOFprojectedToProjections
     * Guaranteed to return object with same identity of the InverseOFprojectedToProjections
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFprojectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFprojectedToProjections
     * Used by relationship maintenance machinery
     */
  public void setInverseOFprojectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFprojectedToProjectionsCollection) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFtransformationToSources
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFtransformationToSources
     */
  public void addInverseOFtransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFtransformationToSources) throws EAIException;







    /* Privileged Write accessor for role InverseOFtransformationToSources
     */
  public void removeInverseOFtransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFtransformationToSources) throws EAIException;






    /* Privileged Read accessor for role InverseOFtransformationToSources
     * Guaranteed to return object with same identity of the InverseOFtransformationToSources
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFtransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFtransformationToSources
     * Used by relationship maintenance machinery
     */
  public void setInverseOFtransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFtransformationToSourcesCollection) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFtransformationToSubTransformations
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFtransformationToSubTransformations
     */
  public void addInverseOFtransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFtransformationToSubTransformations) throws EAIException;







    /* Privileged Write accessor for role InverseOFtransformationToSubTransformations
     */
  public void removeInverseOFtransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFtransformationToSubTransformations) throws EAIException;






    /* Privileged Read accessor for role InverseOFtransformationToSubTransformations
     * Guaranteed to return object with same identity of the InverseOFtransformationToSubTransformations
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFtransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFtransformationToSubTransformations
     * Used by relationship maintenance machinery
     */
  public void setInverseOFtransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFtransformationToSubTransformationsCollection) throws EAIException;




/****************************************************************************
 *  Implementation of privileged interface for relationship Inverse
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role Inverse
     * Guaranteed to return object with same identity of the Inverse
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getInversePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role Inverse
     * Used by relationship maintenance machinery
     */
  public void unsetInversePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role Inverse
     * Used by relationship maintenance machinery
     */
  public void setInversePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theInverse) throws EAIException;
  




    /* Set reference in role Inverse,
     * unlinking back reference from currently related Inverse
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetInversePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theInverse) throws EAIException;
  




/****************************************************************************
 *  Implementation of privileged interface for relationship Type
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role Type
     * Guaranteed to return object with same identity of the Type
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role Type
     * Used by relationship maintenance machinery
     */
  public void unsetTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role Type
     * Used by relationship maintenance machinery
     */
  public void setTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theType) throws EAIException;
  


    /* Set reference in role Type,
     * unlinking back reference from currently related Type
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theType) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship RelatedType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role RelatedType
     * Guaranteed to return object with same identity of the RelatedType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getRelatedTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role RelatedType
     * Used by relationship maintenance machinery
     */
  public void unsetRelatedTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role RelatedType
     * Used by relationship maintenance machinery
     */
  public void setRelatedTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theRelatedType) throws EAIException;
  


    /* Set reference in role RelatedType,
     * unlinking back reference from currently related RelatedType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetRelatedTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theRelatedType) throws EAIException;







}
