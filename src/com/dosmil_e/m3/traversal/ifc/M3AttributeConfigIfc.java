package com.dosmil_e.m3.traversal.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3AttributeConfigIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3AttributeConfig
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3AttributeConfig
 ****************************************************************************/


/****************************************************************************
 *  Public interface for MANY to MANY relationship InverseOFattributeConfigs
 ****************************************************************************/


    /* Public Read accessor for role InverseOFattributeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFattributeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFattributeConfigs number access
     */
  public int numInverseOFattributeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFattributeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getInverseOFattributeConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFattributeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findInverseOFattributeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFattributeConfigs is related predicate
     */
  public boolean hasInverseOFattributeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFattributeConfigs is related  predicate
     */
  public boolean hasInverseOFattributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException;

    /* Public InverseOFattributeConfigs index access
     */
  public int indexOfInverseOFattributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFattributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFattributeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFattributeConfigs) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFattributeConfigs
     */
  public void removeInverseOFattributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException;

    /* Public reorder accessor for role InverseOFattributeConfigs
     */
  public void moveInverseOFattributeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFattributeConfigs) throws EAIException;


    /* Public reorder accessor for role InverseOFattributeConfigs
     */
  public void moveInverseOFattributeConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException;


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
 *  Public interface for ONE to MANY side ONE relationship MetaAttribute
 ****************************************************************************/


    /* Public Read accessor for role MetaAttribute
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getMetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public MetaAttribute number access
     */
  public int numMetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public MetaAttribute read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getMetaAttributeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public MetaAttribute finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findMetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public MetaAttribute is related predicate
     */
  public boolean hasMetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional MetaAttribute is related  predicate
     */
  public boolean hasMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theMetaAttribute) throws EAIException;

    /* Public MetaAttribute index access
     */
  public int indexOfMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theMetaAttribute) throws EAIException;

    /* Public Write accessor for role MetaAttribute
     * Machinery in MetaAttribute drives the collection operations
     */
  public void setMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theMetaAttribute) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship MetaFieldMgr
 ****************************************************************************/


    /* Public Read accessor for role MetaFieldMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc getMetaFieldMgr( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public MetaFieldMgr number access
     */
  public int numMetaFieldMgr( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public MetaFieldMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc getMetaFieldMgrAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public MetaFieldMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc findMetaFieldMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public MetaFieldMgr is related predicate
     */
  public boolean hasMetaFieldMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional MetaFieldMgr is related  predicate
     */
  public boolean hasMetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theMetaFieldMgr) throws EAIException;

    /* Public MetaFieldMgr index access
     */
  public int indexOfMetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theMetaFieldMgr) throws EAIException;

    /* Public Write accessor for role MetaFieldMgr
     * Machinery in MetaFieldMgr drives the collection operations
     */
  public void setMetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theMetaFieldMgr) throws EAIException;







}
