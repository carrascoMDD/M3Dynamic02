package com.dosmil_e.m3.projection.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ProjectionConfigIfc
    extends     com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3ProjectionConfig
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3ProjectionConfig
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship TargetToTransfomations
 ****************************************************************************/


    /* Public Read accessor for role TargetToTransfomations
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTargetToTransfomations( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public TargetToTransfomations number access
     */
  public int numTargetToTransfomations( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public TargetToTransfomations read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTargetToTransfomationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public TargetToTransfomations finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findTargetToTransfomationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public TargetToTransfomations is related predicate
     */
  public boolean hasTargetToTransfomationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional TargetToTransfomations is related  predicate
     */
  public boolean hasTargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTargetToTransfomations) throws EAIException;

    /* Public TargetToTransfomations index access
     */
  public int indexOfTargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTargetToTransfomations) throws EAIException;

    /* Public Write accessor for role TargetToTransfomations
     * Machinery in TargetToTransfomations drives the collection operations
     */
  public void setTargetToTransfomations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTargetToTransfomations) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship ProjectionToOriginals
 ****************************************************************************/


    /* Public Read accessor for role ProjectionToOriginals
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getProjectionToOriginals( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public ProjectionToOriginals number access
     */
  public int numProjectionToOriginals( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ProjectionToOriginals read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getProjectionToOriginalsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ProjectionToOriginals finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findProjectionToOriginalsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public ProjectionToOriginals is related predicate
     */
  public boolean hasProjectionToOriginalsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional ProjectionToOriginals is related  predicate
     */
  public boolean hasProjectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectionToOriginals) throws EAIException;

    /* Public ProjectionToOriginals index access
     */
  public int indexOfProjectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectionToOriginals) throws EAIException;

    /* Public Write accessor for role ProjectionToOriginals
     * Machinery in ProjectionToOriginals drives the collection operations
     */
  public void setProjectionToOriginals( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectionToOriginals) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship ProjectedToProjections
 ****************************************************************************/


    /* Public Read accessor for role ProjectedToProjections
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getProjectedToProjections( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public ProjectedToProjections number access
     */
  public int numProjectedToProjections( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ProjectedToProjections read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getProjectedToProjectionsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ProjectedToProjections finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findProjectedToProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public ProjectedToProjections is related predicate
     */
  public boolean hasProjectedToProjectionsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional ProjectedToProjections is related  predicate
     */
  public boolean hasProjectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectedToProjections) throws EAIException;

    /* Public ProjectedToProjections index access
     */
  public int indexOfProjectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectedToProjections) throws EAIException;

    /* Public Write accessor for role ProjectedToProjections
     * Machinery in ProjectedToProjections drives the collection operations
     */
  public void setProjectedToProjections( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theProjectedToProjections) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship TransformationToSources
 ****************************************************************************/


    /* Public Read accessor for role TransformationToSources
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTransformationToSources( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public TransformationToSources number access
     */
  public int numTransformationToSources( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public TransformationToSources read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTransformationToSourcesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public TransformationToSources finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findTransformationToSourcesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public TransformationToSources is related predicate
     */
  public boolean hasTransformationToSourcesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional TransformationToSources is related  predicate
     */
  public boolean hasTransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSources) throws EAIException;

    /* Public TransformationToSources index access
     */
  public int indexOfTransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSources) throws EAIException;

    /* Public Write accessor for role TransformationToSources
     * Machinery in TransformationToSources drives the collection operations
     */
  public void setTransformationToSources( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSources) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship TransformationToSubTransformations
 ****************************************************************************/


    /* Public Read accessor for role TransformationToSubTransformations
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTransformationToSubTransformations( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public TransformationToSubTransformations number access
     */
  public int numTransformationToSubTransformations( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public TransformationToSubTransformations read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getTransformationToSubTransformationsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public TransformationToSubTransformations finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findTransformationToSubTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public TransformationToSubTransformations is related predicate
     */
  public boolean hasTransformationToSubTransformationsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional TransformationToSubTransformations is related  predicate
     */
  public boolean hasTransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSubTransformations) throws EAIException;

    /* Public TransformationToSubTransformations index access
     */
  public int indexOfTransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSubTransformations) throws EAIException;

    /* Public Write accessor for role TransformationToSubTransformations
     * Machinery in TransformationToSubTransformations drives the collection operations
     */
  public void setTransformationToSubTransformations( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theTransformationToSubTransformations) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship ProjectionType
 ****************************************************************************/


    /* Public Read accessor for role ProjectionType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getProjectionType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public ProjectionType number access
     */
  public int numProjectionType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ProjectionType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getProjectionTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ProjectionType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findProjectionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public ProjectionType is related predicate
     */
  public boolean hasProjectionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional ProjectionType is related  predicate
     */
  public boolean hasProjectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theProjectionType) throws EAIException;

    /* Public ProjectionType index access
     */
  public int indexOfProjectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theProjectionType) throws EAIException;

    /* Public Write accessor for role ProjectionType
     * Machinery in ProjectionType drives the collection operations
     */
  public void setProjectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theProjectionType) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship ExclusionType
 ****************************************************************************/


    /* Public Read accessor for role ExclusionType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getExclusionType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public ExclusionType number access
     */
  public int numExclusionType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ExclusionType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getExclusionTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ExclusionType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findExclusionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public ExclusionType is related predicate
     */
  public boolean hasExclusionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional ExclusionType is related  predicate
     */
  public boolean hasExclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theExclusionType) throws EAIException;

    /* Public ExclusionType index access
     */
  public int indexOfExclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theExclusionType) throws EAIException;

    /* Public Write accessor for role ExclusionType
     * Machinery in ExclusionType drives the collection operations
     */
  public void setExclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theExclusionType) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship ExcludedInRelationshipNamed
 ****************************************************************************/


    /* Public Read accessor for role ExcludedInRelationshipNamed
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getExcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public ExcludedInRelationshipNamed number access
     */
  public int numExcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ExcludedInRelationshipNamed read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getExcludedInRelationshipNamedAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ExcludedInRelationshipNamed finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findExcludedInRelationshipNamedNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public ExcludedInRelationshipNamed is related predicate
     */
  public boolean hasExcludedInRelationshipNamedNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional ExcludedInRelationshipNamed is related  predicate
     */
  public boolean hasExcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theExcludedInRelationshipNamed) throws EAIException;

    /* Public ExcludedInRelationshipNamed index access
     */
  public int indexOfExcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theExcludedInRelationshipNamed) throws EAIException;

    /* Public Write accessor for role ExcludedInRelationshipNamed
     * Machinery in ExcludedInRelationshipNamed drives the collection operations
     */
  public void setExcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theExcludedInRelationshipNamed) throws EAIException;







}
