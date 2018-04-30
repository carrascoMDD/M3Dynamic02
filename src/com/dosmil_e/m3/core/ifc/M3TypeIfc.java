package com.dosmil_e.m3.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3TypeIfc
    extends     com.dosmil_e.m3.core.ifc.M3ElementIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3Type
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute IsEnumeration
 ****************************************************************************/


    /* Public Read accessor for attribute IsEnumeration
     */
  public boolean getIsEnumeration( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute IsEnumeration
     */
  public void setIsEnumeration( EAIMMCtxtIfc theCtxt, boolean theIsEnumeration) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute IsPrimitive
 ****************************************************************************/


    /* Public Read accessor for attribute IsPrimitive
     */
  public boolean getIsPrimitive( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute IsPrimitive
     */
  public void setIsPrimitive( EAIMMCtxtIfc theCtxt, boolean theIsPrimitive) throws EAIException;
/****************************************************************************
 *  Implementation of public interface for attribute IsAbstract
 ****************************************************************************/


    /* Public Read accessor for attribute IsAbstract
     */
  public boolean getIsAbstract( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute IsAbstract
     */
  public void setIsAbstract( EAIMMCtxtIfc theCtxt, boolean theIsAbstract) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of M3Type
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFmetaType
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFmetaType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFmetaType number access
     */
  public int numInverseOFmetaType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFmetaType read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getInverseOFmetaTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFmetaType finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findInverseOFmetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFmetaType is related predicate
     */
  public boolean hasInverseOFmetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFmetaType is related  predicate
     */
  public boolean hasInverseOFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException;

    /* Public InverseOFmetaType index access
     */
  public int indexOfInverseOFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFmetaType) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFmetaType
     */
  public void removeInverseOFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException;

    /* Public reorder accessor for role InverseOFmetaType
     */
  public void moveInverseOFmetaTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFmetaType) throws EAIException;


    /* Public reorder accessor for role InverseOFmetaType
     */
  public void moveInverseOFmetaTypeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaType) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship Inverse1OFmetaType
 ****************************************************************************/


    /* Public Read accessor for role Inverse1OFmetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] getInverse1OFmetaType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public Inverse1OFmetaType number access
     */
  public int numInverse1OFmetaType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Inverse1OFmetaType read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc getInverse1OFmetaTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Inverse1OFmetaType finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc findInverse1OFmetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public Inverse1OFmetaType is related predicate
     */
  public boolean hasInverse1OFmetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional Inverse1OFmetaType is related  predicate
     */
  public boolean hasInverse1OFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException;

    /* Public Inverse1OFmetaType index access
     */
  public int indexOfInverse1OFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverse1OFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverse1OFmetaTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theRelativeInverse1OFmetaType) throws EAIException;

    /* Transactional Public Write Remove accessor for role Inverse1OFmetaType
     */
  public void removeInverse1OFmetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException;

    /* Public reorder accessor for role Inverse1OFmetaType
     */
  public void moveInverse1OFmetaTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theRelativeInverse1OFmetaType) throws EAIException;


    /* Public reorder accessor for role Inverse1OFmetaType
     */
  public void moveInverse1OFmetaTypeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverse1OFmetaType) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFreplicatedMetaType
 ****************************************************************************/


    /* Public Read accessor for role InverseOFreplicatedMetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc[] getInverseOFreplicatedMetaType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFreplicatedMetaType number access
     */
  public int numInverseOFreplicatedMetaType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFreplicatedMetaType read accessor by index
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc getInverseOFreplicatedMetaTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFreplicatedMetaType finder by name
     */
  public com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc findInverseOFreplicatedMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFreplicatedMetaType is related predicate
     */
  public boolean hasInverseOFreplicatedMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFreplicatedMetaType is related  predicate
     */
  public boolean hasInverseOFreplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException;

    /* Public InverseOFreplicatedMetaType index access
     */
  public int indexOfInverseOFreplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFreplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFreplicatedMetaTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theRelativeInverseOFreplicatedMetaType) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFreplicatedMetaType
     */
  public void removeInverseOFreplicatedMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException;

    /* Public reorder accessor for role InverseOFreplicatedMetaType
     */
  public void moveInverseOFreplicatedMetaTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theRelativeInverseOFreplicatedMetaType) throws EAIException;


    /* Public reorder accessor for role InverseOFreplicatedMetaType
     */
  public void moveInverseOFreplicatedMetaTypeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.replication.ifc.M3ReplicateNodeMgrIfc theInverseOFreplicatedMetaType) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFprojectionType
 ****************************************************************************/


    /* Public Read accessor for role InverseOFprojectionType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFprojectionType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFprojectionType number access
     */
  public int numInverseOFprojectionType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFprojectionType read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFprojectionTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFprojectionType finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFprojectionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFprojectionType is related predicate
     */
  public boolean hasInverseOFprojectionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFprojectionType is related  predicate
     */
  public boolean hasInverseOFprojectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException;

    /* Public InverseOFprojectionType index access
     */
  public int indexOfInverseOFprojectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFprojectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFprojectionTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectionType) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFprojectionType
     */
  public void removeInverseOFprojectionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException;

    /* Public reorder accessor for role InverseOFprojectionType
     */
  public void moveInverseOFprojectionTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFprojectionType) throws EAIException;


    /* Public reorder accessor for role InverseOFprojectionType
     */
  public void moveInverseOFprojectionTypeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFprojectionType) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFexclusionType
 ****************************************************************************/


    /* Public Read accessor for role InverseOFexclusionType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc[] getInverseOFexclusionType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFexclusionType number access
     */
  public int numInverseOFexclusionType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFexclusionType read accessor by index
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc getInverseOFexclusionTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFexclusionType finder by name
     */
  public com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc findInverseOFexclusionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFexclusionType is related predicate
     */
  public boolean hasInverseOFexclusionTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFexclusionType is related  predicate
     */
  public boolean hasInverseOFexclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException;

    /* Public InverseOFexclusionType index access
     */
  public int indexOfInverseOFexclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFexclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFexclusionTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFexclusionType) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFexclusionType
     */
  public void removeInverseOFexclusionType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException;

    /* Public reorder accessor for role InverseOFexclusionType
     */
  public void moveInverseOFexclusionTypeBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theRelativeInverseOFexclusionType) throws EAIException;


    /* Public reorder accessor for role InverseOFexclusionType
     */
  public void moveInverseOFexclusionTypeToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.ifc.M3ProjectionConfigIfc theInverseOFexclusionType) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship Module
 ****************************************************************************/


    /* Public Read accessor for role Module
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getModule( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public Module number access
     */
  public int numModule( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Module read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getModuleAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Module finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc findModuleNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public Module is related predicate
     */
  public boolean hasModuleNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional Module is related  predicate
     */
  public boolean hasModule( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theModule) throws EAIException;

    /* Public Module index access
     */
  public int indexOfModule( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theModule) throws EAIException;

    /* Public Write accessor for role Module
     * Machinery in Module drives the collection operations
     */
  public void setModule( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theModule) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship Attributes
 ****************************************************************************/


    /* Public Read accessor for role Attributes
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc[] getAttributes( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public Attributes number access
     */
  public int numAttributes( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Attributes read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getAttributesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Attributes finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findAttributesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public Attributes is related predicate
     */
  public boolean hasAttributesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional Attributes is related  predicate
     */
  public boolean hasAttributes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException;

    /* Public Attributes index access
     */
  public int indexOfAttributes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addAttributes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addAttributesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes, com.dosmil_e.m3.core.ifc.M3AttributeIfc theRelativeAttributes) throws EAIException;

    /* Transactional Public Write Remove accessor for role Attributes
     */
  public void removeAttributes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException;

    /* Public reorder accessor for role Attributes
     */
  public void moveAttributesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes, com.dosmil_e.m3.core.ifc.M3AttributeIfc theRelativeAttributes) throws EAIException;


    /* Public reorder accessor for role Attributes
     */
  public void moveAttributesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theAttributes) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship TypeOfValues
 ****************************************************************************/


    /* Public Read accessor for role TypeOfValues
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc[] getTypeOfValues( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public TypeOfValues number access
     */
  public int numTypeOfValues( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public TypeOfValues read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getTypeOfValuesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public TypeOfValues finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findTypeOfValuesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public TypeOfValues is related predicate
     */
  public boolean hasTypeOfValuesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional TypeOfValues is related  predicate
     */
  public boolean hasTypeOfValues( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException;

    /* Public TypeOfValues index access
     */
  public int indexOfTypeOfValues( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addTypeOfValues( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addTypeOfValuesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues, com.dosmil_e.m3.core.ifc.M3AttributeIfc theRelativeTypeOfValues) throws EAIException;

    /* Transactional Public Write Remove accessor for role TypeOfValues
     */
  public void removeTypeOfValues( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException;

    /* Public reorder accessor for role TypeOfValues
     */
  public void moveTypeOfValuesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues, com.dosmil_e.m3.core.ifc.M3AttributeIfc theRelativeTypeOfValues) throws EAIException;


    /* Public reorder accessor for role TypeOfValues
     */
  public void moveTypeOfValuesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theTypeOfValues) throws EAIException;


/****************************************************************************
 *  Public interface for MANY to MANY relationship SuperTypes
 ****************************************************************************/


    /* Public Read accessor for role SuperTypes
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getSuperTypes( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public SuperTypes number access
     */
  public int numSuperTypes( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SuperTypes read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getSuperTypesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public SuperTypes finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findSuperTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public SuperTypes is related predicate
     */
  public boolean hasSuperTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional SuperTypes is related  predicate
     */
  public boolean hasSuperTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException;

    /* Public SuperTypes index access
     */
  public int indexOfSuperTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addSuperTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addSuperTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeSuperTypes) throws EAIException;

    /* Transactional Public Write Remove accessor for role SuperTypes
     */
  public void removeSuperTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException;

    /* Public reorder accessor for role SuperTypes
     */
  public void moveSuperTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeSuperTypes) throws EAIException;


    /* Public reorder accessor for role SuperTypes
     */
  public void moveSuperTypesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSuperTypes) throws EAIException;


/****************************************************************************
 *  Public interface for MANY to MANY relationship SubTypes
 ****************************************************************************/


    /* Public Read accessor for role SubTypes
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getSubTypes( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public SubTypes number access
     */
  public int numSubTypes( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SubTypes read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getSubTypesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public SubTypes finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findSubTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public SubTypes is related predicate
     */
  public boolean hasSubTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional SubTypes is related  predicate
     */
  public boolean hasSubTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException;

    /* Public SubTypes index access
     */
  public int indexOfSubTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addSubTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addSubTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeSubTypes) throws EAIException;

    /* Transactional Public Write Remove accessor for role SubTypes
     */
  public void removeSubTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException;

    /* Public reorder accessor for role SubTypes
     */
  public void moveSubTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeSubTypes) throws EAIException;


    /* Public reorder accessor for role SubTypes
     */
  public void moveSubTypesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theSubTypes) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship Relationships
 ****************************************************************************/


    /* Public Read accessor for role Relationships
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] getRelationships( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public Relationships number access
     */
  public int numRelationships( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Relationships read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getRelationshipsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Relationships finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findRelationshipsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public Relationships is related predicate
     */
  public boolean hasRelationshipsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional Relationships is related  predicate
     */
  public boolean hasRelationships( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException;

    /* Public Relationships index access
     */
  public int indexOfRelationships( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addRelationships( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addRelationshipsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelativeRelationships) throws EAIException;

    /* Transactional Public Write Remove accessor for role Relationships
     */
  public void removeRelationships( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException;

    /* Public reorder accessor for role Relationships
     */
  public void moveRelationshipsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelativeRelationships) throws EAIException;


    /* Public reorder accessor for role Relationships
     */
  public void moveRelationshipsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelationships) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship RelatedWith
 ****************************************************************************/


    /* Public Read accessor for role RelatedWith
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc[] getRelatedWith( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public RelatedWith number access
     */
  public int numRelatedWith( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public RelatedWith read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getRelatedWithAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public RelatedWith finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findRelatedWithNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public RelatedWith is related predicate
     */
  public boolean hasRelatedWithNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional RelatedWith is related  predicate
     */
  public boolean hasRelatedWith( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException;

    /* Public RelatedWith index access
     */
  public int indexOfRelatedWith( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addRelatedWith( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addRelatedWithBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelativeRelatedWith) throws EAIException;

    /* Transactional Public Write Remove accessor for role RelatedWith
     */
  public void removeRelatedWith( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException;

    /* Public reorder accessor for role RelatedWith
     */
  public void moveRelatedWithBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelativeRelatedWith) throws EAIException;


    /* Public reorder accessor for role RelatedWith
     */
  public void moveRelatedWithToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theRelatedWith) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to ONE relationship RootTypeOfModel
 ****************************************************************************/


    /* Public Read accessor for role RootTypeOfModel
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc getRootTypeOfModel( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public RootTypeOfModel number access
     */
  public int numRootTypeOfModel( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public RootTypeOfModel read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc getRootTypeOfModelAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public RootTypeOfModel finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc findRootTypeOfModelNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public RootTypeOfModel is related predicate
     */
  public boolean hasRootTypeOfModelNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional RootTypeOfModel is related  predicate
     */
  public boolean hasRootTypeOfModel( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theRootTypeOfModel) throws EAIException;

    /* Public RootTypeOfModel index access
     */
  public int indexOfRootTypeOfModel( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theRootTypeOfModel) throws EAIException;

    /* Public Write accessor for role RootTypeOfModel
     * Machinery in RootTypeOfModel drives the collection operations
     */
  public void setRootTypeOfModel( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theRootTypeOfModel) throws EAIException;







}
