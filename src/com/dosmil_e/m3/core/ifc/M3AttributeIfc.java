package com.dosmil_e.m3.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3AttributeIfc
    extends     com.dosmil_e.m3.core.ifc.M3StructuralFeatureIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3Attribute
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute AttributeTypeName
 ****************************************************************************/


    /* Public Read accessor for attribute AttributeTypeName
     */
  public java.lang.String getAttributeTypeName( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute AttributeTypeName
     */
  public void setAttributeTypeName( EAIMMCtxtIfc theCtxt, java.lang.String theAttributeTypeName) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of M3Attribute
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFmetaAttribute
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaAttribute
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] getInverseOFmetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFmetaAttribute number access
     */
  public int numInverseOFmetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFmetaAttribute read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc getInverseOFmetaAttributeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFmetaAttribute finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc findInverseOFmetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFmetaAttribute is related predicate
     */
  public boolean hasInverseOFmetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFmetaAttribute is related  predicate
     */
  public boolean hasInverseOFmetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException;

    /* Public InverseOFmetaAttribute index access
     */
  public int indexOfInverseOFmetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaAttributeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeInverseOFmetaAttribute) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFmetaAttribute
     */
  public void removeInverseOFmetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException;

    /* Public reorder accessor for role InverseOFmetaAttribute
     */
  public void moveInverseOFmetaAttributeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeInverseOFmetaAttribute) throws EAIException;


    /* Public reorder accessor for role InverseOFmetaAttribute
     */
  public void moveInverseOFmetaAttributeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaAttribute) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFcopiedMetaAttribute
 ****************************************************************************/


    /* Public Read accessor for role InverseOFcopiedMetaAttribute
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc[] getInverseOFcopiedMetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFcopiedMetaAttribute number access
     */
  public int numInverseOFcopiedMetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFcopiedMetaAttribute read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc getInverseOFcopiedMetaAttributeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFcopiedMetaAttribute finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc findInverseOFcopiedMetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFcopiedMetaAttribute is related predicate
     */
  public boolean hasInverseOFcopiedMetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFcopiedMetaAttribute is related  predicate
     */
  public boolean hasInverseOFcopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException;

    /* Public InverseOFcopiedMetaAttribute index access
     */
  public int indexOfInverseOFcopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFcopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFcopiedMetaAttributeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theRelativeInverseOFcopiedMetaAttribute) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFcopiedMetaAttribute
     */
  public void removeInverseOFcopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException;

    /* Public reorder accessor for role InverseOFcopiedMetaAttribute
     */
  public void moveInverseOFcopiedMetaAttributeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theRelativeInverseOFcopiedMetaAttribute) throws EAIException;


    /* Public reorder accessor for role InverseOFcopiedMetaAttribute
     */
  public void moveInverseOFcopiedMetaAttributeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc theInverseOFcopiedMetaAttribute) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFexcludedInRelationshipNamed
 ****************************************************************************/


    /* Public Read accessor for role InverseOFexcludedInRelationshipNamed
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFexcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFexcludedInRelationshipNamed number access
     */
  public int numInverseOFexcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFexcludedInRelationshipNamed read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFexcludedInRelationshipNamedAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFexcludedInRelationshipNamed finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFexcludedInRelationshipNamedNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFexcludedInRelationshipNamed is related predicate
     */
  public boolean hasInverseOFexcludedInRelationshipNamedNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFexcludedInRelationshipNamed is related  predicate
     */
  public boolean hasInverseOFexcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException;

    /* Public InverseOFexcludedInRelationshipNamed index access
     */
  public int indexOfInverseOFexcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFexcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFexcludedInRelationshipNamedBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFexcludedInRelationshipNamed) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void removeInverseOFexcludedInRelationshipNamed( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException;

    /* Public reorder accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void moveInverseOFexcludedInRelationshipNamedBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFexcludedInRelationshipNamed) throws EAIException;


    /* Public reorder accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void moveInverseOFexcludedInRelationshipNamedToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexcludedInRelationshipNamed) throws EAIException;


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
 *  Public interface for ONE to MANY side ONE relationship ValueType
 ****************************************************************************/


    /* Public Read accessor for role ValueType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getValueType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public ValueType number access
     */
  public int numValueType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ValueType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getValueTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ValueType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findValueTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public ValueType is related predicate
     */
  public boolean hasValueTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional ValueType is related  predicate
     */
  public boolean hasValueType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theValueType) throws EAIException;

    /* Public ValueType index access
     */
  public int indexOfValueType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theValueType) throws EAIException;

    /* Public Write accessor for role ValueType
     * Machinery in ValueType drives the collection operations
     */
  public void setValueType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theValueType) throws EAIException;







}
