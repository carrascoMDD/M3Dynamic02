package com.dosmil_e.m3.traversal.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3BranchConfigIfc
    extends     com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3BranchConfig
 ****************************************************************************/

/****************************************************************************
 *  Implementation of public interface for attribute PhaseNumber
 ****************************************************************************/


    /* Public Read accessor for attribute PhaseNumber
     */
  public int getPhaseNumber( EAIMMCtxtIfc theCtxt) throws EAIException ;



    /* Public Write accessor for attribute PhaseNumber
     */
  public void setPhaseNumber( EAIMMCtxtIfc theCtxt, int thePhaseNumber) throws EAIException;





/****************************************************************************
 *  Declaration of accessors to relationships of M3BranchConfig
 ****************************************************************************/


/****************************************************************************
 *  Public interface for MANY to MANY relationship InverseOFbranchConfigs
 ****************************************************************************/


    /* Public Read accessor for role InverseOFbranchConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFbranchConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFbranchConfigs number access
     */
  public int numInverseOFbranchConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFbranchConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getInverseOFbranchConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFbranchConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findInverseOFbranchConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFbranchConfigs is related predicate
     */
  public boolean hasInverseOFbranchConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFbranchConfigs is related  predicate
     */
  public boolean hasInverseOFbranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException;

    /* Public InverseOFbranchConfigs index access
     */
  public int indexOfInverseOFbranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFbranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFbranchConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFbranchConfigs) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFbranchConfigs
     */
  public void removeInverseOFbranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException;

    /* Public reorder accessor for role InverseOFbranchConfigs
     */
  public void moveInverseOFbranchConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFbranchConfigs) throws EAIException;


    /* Public reorder accessor for role InverseOFbranchConfigs
     */
  public void moveInverseOFbranchConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFbranchConfigs) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship MetaRelationship
 ****************************************************************************/


    /* Public Read accessor for role MetaRelationship
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getMetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public MetaRelationship number access
     */
  public int numMetaRelationship( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public MetaRelationship read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc getMetaRelationshipAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public MetaRelationship finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3RelationshipIfc findMetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public MetaRelationship is related predicate
     */
  public boolean hasMetaRelationshipNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional MetaRelationship is related  predicate
     */
  public boolean hasMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theMetaRelationship) throws EAIException;

    /* Public MetaRelationship index access
     */
  public int indexOfMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theMetaRelationship) throws EAIException;

    /* Public Write accessor for role MetaRelationship
     * Machinery in MetaRelationship drives the collection operations
     */
  public void setMetaRelationship( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3RelationshipIfc theMetaRelationship) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship TypeNodeConfigs
 ****************************************************************************/


    /* Public Read accessor for role TypeNodeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc[] getTypeNodeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public TypeNodeConfigs number access
     */
  public int numTypeNodeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public TypeNodeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc getTypeNodeConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public TypeNodeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc findTypeNodeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public TypeNodeConfigs is related predicate
     */
  public boolean hasTypeNodeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional TypeNodeConfigs is related  predicate
     */
  public boolean hasTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException;

    /* Public TypeNodeConfigs index access
     */
  public int indexOfTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addTypeNodeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelativeTypeNodeConfigs) throws EAIException;

    /* Transactional Public Write Remove accessor for role TypeNodeConfigs
     */
  public void removeTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException;

    /* Public reorder accessor for role TypeNodeConfigs
     */
  public void moveTypeNodeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theRelativeTypeNodeConfigs) throws EAIException;


    /* Public reorder accessor for role TypeNodeConfigs
     */
  public void moveTypeNodeConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RelatedTypeNodeConfigIfc theTypeNodeConfigs) throws EAIException;


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
 *  Public interface for ONE to MANY side ONE relationship MetaBranchMgr
 ****************************************************************************/


    /* Public Read accessor for role MetaBranchMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc getMetaBranchMgr( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public MetaBranchMgr number access
     */
  public int numMetaBranchMgr( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public MetaBranchMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc getMetaBranchMgrAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public MetaBranchMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc findMetaBranchMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public MetaBranchMgr is related predicate
     */
  public boolean hasMetaBranchMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional MetaBranchMgr is related  predicate
     */
  public boolean hasMetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theMetaBranchMgr) throws EAIException;

    /* Public MetaBranchMgr index access
     */
  public int indexOfMetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theMetaBranchMgr) throws EAIException;

    /* Public Write accessor for role MetaBranchMgr
     * Machinery in MetaBranchMgr drives the collection operations
     */
  public void setMetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theMetaBranchMgr) throws EAIException;







}
