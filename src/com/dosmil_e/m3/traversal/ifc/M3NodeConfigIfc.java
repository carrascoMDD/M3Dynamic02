package com.dosmil_e.m3.traversal.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3NodeConfigIfc
    extends     com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3NodeConfig
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute IsTerminal
 ****************************************************************************/


    /* Public Read accessor for attribute IsTerminal
     */
  public boolean getIsTerminal( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute IsTerminal
     */
  public void setIsTerminal( EAIMMCtxtIfc theCtxt, boolean theIsTerminal) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of M3NodeConfig
 ****************************************************************************/


/****************************************************************************
 *  Public interface for MANY to MANY relationship BranchConfigs
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
 *  Public interface for ONE to MANY side ONE relationship TraversalConfig
 ****************************************************************************/


    /* Public Read accessor for role TraversalConfig
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalConfig( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public TraversalConfig number access
     */
  public int numTraversalConfig( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public TraversalConfig read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalConfigAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public TraversalConfig finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc findTraversalConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public TraversalConfig is related predicate
     */
  public boolean hasTraversalConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional TraversalConfig is related  predicate
     */
  public boolean hasTraversalConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException;

    /* Public TraversalConfig index access
     */
  public int indexOfTraversalConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException;

    /* Public Write accessor for role TraversalConfig
     * Machinery in TraversalConfig drives the collection operations
     */
  public void setTraversalConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException;





/****************************************************************************
 *  Public interface for MANY to MANY relationship AttributeConfigs
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
 *  Public interface for ONE to MANY side ONE relationship MetaType
 ****************************************************************************/


    /* Public Read accessor for role MetaType
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getMetaType( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public MetaType number access
     */
  public int numMetaType( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public MetaType read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getMetaTypeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public MetaType finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public MetaType is related predicate
     */
  public boolean hasMetaTypeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional MetaType is related  predicate
     */
  public boolean hasMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theMetaType) throws EAIException;

    /* Public MetaType index access
     */
  public int indexOfMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theMetaType) throws EAIException;

    /* Public Write accessor for role MetaType
     * Machinery in MetaType drives the collection operations
     */
  public void setMetaType( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theMetaType) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship MetaNodeMgr
 ****************************************************************************/


    /* Public Read accessor for role MetaNodeMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc getMetaNodeMgr( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public MetaNodeMgr number access
     */
  public int numMetaNodeMgr( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public MetaNodeMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc getMetaNodeMgrAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public MetaNodeMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc findMetaNodeMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public MetaNodeMgr is related predicate
     */
  public boolean hasMetaNodeMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional MetaNodeMgr is related  predicate
     */
  public boolean hasMetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theMetaNodeMgr) throws EAIException;

    /* Public MetaNodeMgr index access
     */
  public int indexOfMetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theMetaNodeMgr) throws EAIException;

    /* Public Write accessor for role MetaNodeMgr
     * Machinery in MetaNodeMgr drives the collection operations
     */
  public void setMetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theMetaNodeMgr) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFnodeConfig
 ****************************************************************************/


    /* Public Read accessor for role InverseOFnodeConfig
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc[] getInverseOFnodeConfig( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFnodeConfig number access
     */
  public int numInverseOFnodeConfig( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFnodeConfig read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc getInverseOFnodeConfigAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFnodeConfig finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc findInverseOFnodeConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFnodeConfig is related predicate
     */
  public boolean hasInverseOFnodeConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFnodeConfig is related  predicate
     */
  public boolean hasInverseOFnodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException;

    /* Public InverseOFnodeConfig index access
     */
  public int indexOfInverseOFnodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFnodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFnodeConfigBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theRelativeInverseOFnodeConfig) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFnodeConfig
     */
  public void removeInverseOFnodeConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException;

    /* Public reorder accessor for role InverseOFnodeConfig
     */
  public void moveInverseOFnodeConfigBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theRelativeInverseOFnodeConfig) throws EAIException;


    /* Public reorder accessor for role InverseOFnodeConfig
     */
  public void moveInverseOFnodeConfigToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc theInverseOFnodeConfig) throws EAIException;




}
