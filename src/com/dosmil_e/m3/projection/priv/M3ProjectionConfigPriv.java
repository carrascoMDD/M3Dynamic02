package com.dosmil_e.m3.projection.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ProjectionConfigPriv 
   extends com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv,  
  com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3ProjectionConfig
 ****************************************************************************/


/****************************************************************************
 *  Implementation of privileged interface for relationship TargetToTransfomations
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role TargetToTransfomations
     * Guaranteed to return object with same identity of the TargetToTransfomations
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getTargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role TargetToTransfomations
     * Used by relationship maintenance machinery
     */
  public void unsetTargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role TargetToTransfomations
     * Used by relationship maintenance machinery
     */
  public void setTargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theTargetToTransfomations) throws EAIException;
  


    /* Set reference in role TargetToTransfomations,
     * unlinking back reference from currently related TargetToTransfomations
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTargetToTransfomationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theTargetToTransfomations) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship ProjectionToOriginals
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ProjectionToOriginals
     * Guaranteed to return object with same identity of the ProjectionToOriginals
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getProjectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role ProjectionToOriginals
     * Used by relationship maintenance machinery
     */
  public void unsetProjectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role ProjectionToOriginals
     * Used by relationship maintenance machinery
     */
  public void setProjectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theProjectionToOriginals) throws EAIException;
  


    /* Set reference in role ProjectionToOriginals,
     * unlinking back reference from currently related ProjectionToOriginals
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetProjectionToOriginalsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theProjectionToOriginals) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship ProjectedToProjections
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ProjectedToProjections
     * Guaranteed to return object with same identity of the ProjectedToProjections
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getProjectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role ProjectedToProjections
     * Used by relationship maintenance machinery
     */
  public void unsetProjectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role ProjectedToProjections
     * Used by relationship maintenance machinery
     */
  public void setProjectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theProjectedToProjections) throws EAIException;
  


    /* Set reference in role ProjectedToProjections,
     * unlinking back reference from currently related ProjectedToProjections
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetProjectedToProjectionsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theProjectedToProjections) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship TransformationToSources
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role TransformationToSources
     * Guaranteed to return object with same identity of the TransformationToSources
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getTransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role TransformationToSources
     * Used by relationship maintenance machinery
     */
  public void unsetTransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role TransformationToSources
     * Used by relationship maintenance machinery
     */
  public void setTransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theTransformationToSources) throws EAIException;
  


    /* Set reference in role TransformationToSources,
     * unlinking back reference from currently related TransformationToSources
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTransformationToSourcesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theTransformationToSources) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship TransformationToSubTransformations
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role TransformationToSubTransformations
     * Guaranteed to return object with same identity of the TransformationToSubTransformations
     */
  public com.dosmil_e.m3.core.priv.M3RelationshipPriv getTransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role TransformationToSubTransformations
     * Used by relationship maintenance machinery
     */
  public void unsetTransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role TransformationToSubTransformations
     * Used by relationship maintenance machinery
     */
  public void setTransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theTransformationToSubTransformations) throws EAIException;
  


    /* Set reference in role TransformationToSubTransformations,
     * unlinking back reference from currently related TransformationToSubTransformations
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTransformationToSubTransformationsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3RelationshipPriv theTransformationToSubTransformations) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship ProjectionType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ProjectionType
     * Guaranteed to return object with same identity of the ProjectionType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getProjectionTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role ProjectionType
     * Used by relationship maintenance machinery
     */
  public void unsetProjectionTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role ProjectionType
     * Used by relationship maintenance machinery
     */
  public void setProjectionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theProjectionType) throws EAIException;
  


    /* Set reference in role ProjectionType,
     * unlinking back reference from currently related ProjectionType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetProjectionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theProjectionType) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship ExclusionType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ExclusionType
     * Guaranteed to return object with same identity of the ExclusionType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getExclusionTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role ExclusionType
     * Used by relationship maintenance machinery
     */
  public void unsetExclusionTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role ExclusionType
     * Used by relationship maintenance machinery
     */
  public void setExclusionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theExclusionType) throws EAIException;
  


    /* Set reference in role ExclusionType,
     * unlinking back reference from currently related ExclusionType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetExclusionTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theExclusionType) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship ExcludedInRelationshipNamed
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ExcludedInRelationshipNamed
     * Guaranteed to return object with same identity of the ExcludedInRelationshipNamed
     */
  public com.dosmil_e.m3.core.priv.M3AttributePriv getExcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role ExcludedInRelationshipNamed
     * Used by relationship maintenance machinery
     */
  public void unsetExcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role ExcludedInRelationshipNamed
     * Used by relationship maintenance machinery
     */
  public void setExcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theExcludedInRelationshipNamed) throws EAIException;
  


    /* Set reference in role ExcludedInRelationshipNamed,
     * unlinking back reference from currently related ExcludedInRelationshipNamed
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetExcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theExcludedInRelationshipNamed) throws EAIException;







}
