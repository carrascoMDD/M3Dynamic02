package com.dosmil_e.m3.traversal.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3FieldMgrIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3FieldMgr
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3FieldMgr
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFmetaFieldMgr
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaFieldMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] getInverseOFmetaFieldMgr( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFmetaFieldMgr number access
     */
  public int numInverseOFmetaFieldMgr( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFmetaFieldMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc getInverseOFmetaFieldMgrAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFmetaFieldMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc findInverseOFmetaFieldMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFmetaFieldMgr is related predicate
     */
  public boolean hasInverseOFmetaFieldMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFmetaFieldMgr is related  predicate
     */
  public boolean hasInverseOFmetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException;

    /* Public InverseOFmetaFieldMgr index access
     */
  public int indexOfInverseOFmetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaFieldMgrBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeInverseOFmetaFieldMgr) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFmetaFieldMgr
     */
  public void removeInverseOFmetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException;

    /* Public reorder accessor for role InverseOFmetaFieldMgr
     */
  public void moveInverseOFmetaFieldMgrBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeInverseOFmetaFieldMgr) throws EAIException;


    /* Public reorder accessor for role InverseOFmetaFieldMgr
     */
  public void moveInverseOFmetaFieldMgrToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException;


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







}
