package com.dosmil_e.m3.traversal.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3NodeMgrIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3NodeMgr
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3NodeMgr
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFmetaNodeMgr
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaNodeMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFmetaNodeMgr( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFmetaNodeMgr number access
     */
  public int numInverseOFmetaNodeMgr( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFmetaNodeMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getInverseOFmetaNodeMgrAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFmetaNodeMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findInverseOFmetaNodeMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFmetaNodeMgr is related predicate
     */
  public boolean hasInverseOFmetaNodeMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFmetaNodeMgr is related  predicate
     */
  public boolean hasInverseOFmetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException;

    /* Public InverseOFmetaNodeMgr index access
     */
  public int indexOfInverseOFmetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaNodeMgrBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFmetaNodeMgr) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFmetaNodeMgr
     */
  public void removeInverseOFmetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException;

    /* Public reorder accessor for role InverseOFmetaNodeMgr
     */
  public void moveInverseOFmetaNodeMgrBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFmetaNodeMgr) throws EAIException;


    /* Public reorder accessor for role InverseOFmetaNodeMgr
     */
  public void moveInverseOFmetaNodeMgrToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException;


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
