package com.dosmil_e.m3.traversal.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3TraversalConfigIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3TraversalConfig
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3TraversalConfig
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship RootTypeNodeConfigs
 ****************************************************************************/


    /* Public Read accessor for role RootTypeNodeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] getRootTypeNodeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public RootTypeNodeConfigs number access
     */
  public int numRootTypeNodeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public RootTypeNodeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc getRootTypeNodeConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public RootTypeNodeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc findRootTypeNodeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public RootTypeNodeConfigs is related predicate
     */
  public boolean hasRootTypeNodeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional RootTypeNodeConfigs is related  predicate
     */
  public boolean hasRootTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException;

    /* Public RootTypeNodeConfigs index access
     */
  public int indexOfRootTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addRootTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addRootTypeNodeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRelativeRootTypeNodeConfigs) throws EAIException;

    /* Transactional Public Write Remove accessor for role RootTypeNodeConfigs
     */
  public void removeRootTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException;

    /* Public reorder accessor for role RootTypeNodeConfigs
     */
  public void moveRootTypeNodeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRelativeRootTypeNodeConfigs) throws EAIException;


    /* Public reorder accessor for role RootTypeNodeConfigs
     */
  public void moveRootTypeNodeConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship BranchConfigs
 ****************************************************************************/


    /* Public Read accessor for role BranchConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getBranchConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public BranchConfigs number access
     */
  public int numBranchConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public BranchConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc getBranchConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public BranchConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc findBranchConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public BranchConfigs is related predicate
     */
  public boolean hasBranchConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional BranchConfigs is related  predicate
     */
  public boolean hasBranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException;

    /* Public BranchConfigs index access
     */
  public int indexOfBranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addBranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addBranchConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeBranchConfigs) throws EAIException;

    /* Transactional Public Write Remove accessor for role BranchConfigs
     */
  public void removeBranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException;

    /* Public reorder accessor for role BranchConfigs
     */
  public void moveBranchConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeBranchConfigs) throws EAIException;


    /* Public reorder accessor for role BranchConfigs
     */
  public void moveBranchConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship NodeConfigs
 ****************************************************************************/


    /* Public Read accessor for role NodeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getNodeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public NodeConfigs number access
     */
  public int numNodeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public NodeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getNodeConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public NodeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findNodeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public NodeConfigs is related predicate
     */
  public boolean hasNodeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional NodeConfigs is related  predicate
     */
  public boolean hasNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException;

    /* Public NodeConfigs index access
     */
  public int indexOfNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addNodeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeNodeConfigs) throws EAIException;

    /* Transactional Public Write Remove accessor for role NodeConfigs
     */
  public void removeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException;

    /* Public reorder accessor for role NodeConfigs
     */
  public void moveNodeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeNodeConfigs) throws EAIException;


    /* Public reorder accessor for role NodeConfigs
     */
  public void moveNodeConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship AttributeConfigs
 ****************************************************************************/


    /* Public Read accessor for role AttributeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] getAttributeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public AttributeConfigs number access
     */
  public int numAttributeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public AttributeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc getAttributeConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public AttributeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc findAttributeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public AttributeConfigs is related predicate
     */
  public boolean hasAttributeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional AttributeConfigs is related  predicate
     */
  public boolean hasAttributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException;

    /* Public AttributeConfigs index access
     */
  public int indexOfAttributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addAttributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addAttributeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeAttributeConfigs) throws EAIException;

    /* Transactional Public Write Remove accessor for role AttributeConfigs
     */
  public void removeAttributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException;

    /* Public reorder accessor for role AttributeConfigs
     */
  public void moveAttributeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeAttributeConfigs) throws EAIException;


    /* Public reorder accessor for role AttributeConfigs
     */
  public void moveAttributeConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship ConfigOverrides
 ****************************************************************************/


    /* Public Read accessor for role ConfigOverrides
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc[] getConfigOverrides( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public ConfigOverrides number access
     */
  public int numConfigOverrides( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public ConfigOverrides read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc getConfigOverridesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public ConfigOverrides finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc findConfigOverridesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public ConfigOverrides is related predicate
     */
  public boolean hasConfigOverridesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional ConfigOverrides is related  predicate
     */
  public boolean hasConfigOverrides( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException;

    /* Public ConfigOverrides index access
     */
  public int indexOfConfigOverrides( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addConfigOverrides( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addConfigOverridesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theRelativeConfigOverrides) throws EAIException;

    /* Transactional Public Write Remove accessor for role ConfigOverrides
     */
  public void removeConfigOverrides( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException;

    /* Public reorder accessor for role ConfigOverrides
     */
  public void moveConfigOverridesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theRelativeConfigOverrides) throws EAIException;


    /* Public reorder accessor for role ConfigOverrides
     */
  public void moveConfigOverridesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship Model
 ****************************************************************************/


    /* Public Read accessor for role Model
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc getModel( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public Model number access
     */
  public int numModel( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Model read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc getModelAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Model finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc findModelNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public Model is related predicate
     */
  public boolean hasModelNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional Model is related  predicate
     */
  public boolean hasModel( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theModel) throws EAIException;

    /* Public Model index access
     */
  public int indexOfModel( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theModel) throws EAIException;

    /* Public Write accessor for role Model
     * Machinery in Model drives the collection operations
     */
  public void setModel( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theModel) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship FieldMgrs
 ****************************************************************************/


    /* Public Read accessor for role FieldMgrs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc[] getFieldMgrs( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public FieldMgrs number access
     */
  public int numFieldMgrs( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public FieldMgrs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc getFieldMgrsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public FieldMgrs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc findFieldMgrsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public FieldMgrs is related predicate
     */
  public boolean hasFieldMgrsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional FieldMgrs is related  predicate
     */
  public boolean hasFieldMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException;

    /* Public FieldMgrs index access
     */
  public int indexOfFieldMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addFieldMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addFieldMgrsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theRelativeFieldMgrs) throws EAIException;

    /* Transactional Public Write Remove accessor for role FieldMgrs
     */
  public void removeFieldMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException;

    /* Public reorder accessor for role FieldMgrs
     */
  public void moveFieldMgrsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theRelativeFieldMgrs) throws EAIException;


    /* Public reorder accessor for role FieldMgrs
     */
  public void moveFieldMgrsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship BranchMgrs
 ****************************************************************************/


    /* Public Read accessor for role BranchMgrs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc[] getBranchMgrs( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public BranchMgrs number access
     */
  public int numBranchMgrs( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public BranchMgrs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc getBranchMgrsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public BranchMgrs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc findBranchMgrsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public BranchMgrs is related predicate
     */
  public boolean hasBranchMgrsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional BranchMgrs is related  predicate
     */
  public boolean hasBranchMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException;

    /* Public BranchMgrs index access
     */
  public int indexOfBranchMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addBranchMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addBranchMgrsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theRelativeBranchMgrs) throws EAIException;

    /* Transactional Public Write Remove accessor for role BranchMgrs
     */
  public void removeBranchMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException;

    /* Public reorder accessor for role BranchMgrs
     */
  public void moveBranchMgrsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theRelativeBranchMgrs) throws EAIException;


    /* Public reorder accessor for role BranchMgrs
     */
  public void moveBranchMgrsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship NodeMgrs
 ****************************************************************************/


    /* Public Read accessor for role NodeMgrs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] getNodeMgrs( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public NodeMgrs number access
     */
  public int numNodeMgrs( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public NodeMgrs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc getNodeMgrsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public NodeMgrs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc findNodeMgrsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public NodeMgrs is related predicate
     */
  public boolean hasNodeMgrsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional NodeMgrs is related  predicate
     */
  public boolean hasNodeMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException;

    /* Public NodeMgrs index access
     */
  public int indexOfNodeMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addNodeMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addNodeMgrsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theRelativeNodeMgrs) throws EAIException;

    /* Transactional Public Write Remove accessor for role NodeMgrs
     */
  public void removeNodeMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException;

    /* Public reorder accessor for role NodeMgrs
     */
  public void moveNodeMgrsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theRelativeNodeMgrs) throws EAIException;


    /* Public reorder accessor for role NodeMgrs
     */
  public void moveNodeMgrsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException;




}
