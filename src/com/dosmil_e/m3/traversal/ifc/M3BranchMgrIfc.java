package com.dosmil_e.m3.traversal.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3BranchMgrIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3BranchMgr
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3BranchMgr
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship InverseOFmetaBranchMgr
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaBranchMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getInverseOFmetaBranchMgr( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public InverseOFmetaBranchMgr number access
     */
  public int numInverseOFmetaBranchMgr( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public InverseOFmetaBranchMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc getInverseOFmetaBranchMgrAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public InverseOFmetaBranchMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc findInverseOFmetaBranchMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public InverseOFmetaBranchMgr is related predicate
     */
  public boolean hasInverseOFmetaBranchMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional InverseOFmetaBranchMgr is related  predicate
     */
  public boolean hasInverseOFmetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException;

    /* Public InverseOFmetaBranchMgr index access
     */
  public int indexOfInverseOFmetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addInverseOFmetaBranchMgrBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeInverseOFmetaBranchMgr) throws EAIException;

    /* Transactional Public Write Remove accessor for role InverseOFmetaBranchMgr
     */
  public void removeInverseOFmetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException;

    /* Public reorder accessor for role InverseOFmetaBranchMgr
     */
  public void moveInverseOFmetaBranchMgrBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeInverseOFmetaBranchMgr) throws EAIException;


    /* Public reorder accessor for role InverseOFmetaBranchMgr
     */
  public void moveInverseOFmetaBranchMgrToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException;


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
