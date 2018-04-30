package com.dosmil_e.m3.traversal.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3RelatedTypeNodeConfigIfc
    extends     com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3RelatedTypeNodeConfig
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3RelatedTypeNodeConfig
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship BranchConfig
 ****************************************************************************/


    /* Public Read accessor for role BranchConfig
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc getBranchConfig( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public BranchConfig number access
     */
  public int numBranchConfig( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public BranchConfig read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc getBranchConfigAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public BranchConfig finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc findBranchConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public BranchConfig is related predicate
     */
  public boolean hasBranchConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional BranchConfig is related  predicate
     */
  public boolean hasBranchConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfig) throws EAIException;

    /* Public BranchConfig index access
     */
  public int indexOfBranchConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfig) throws EAIException;

    /* Public Write accessor for role BranchConfig
     * Machinery in BranchConfig drives the collection operations
     */
  public void setBranchConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfig) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to ONE relationship Filter
 ****************************************************************************/


    /* Public Read accessor for role Filter
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3FilterIfc getFilter( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public Filter number access
     */
  public int numFilter( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Filter read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3FilterIfc getFilterAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Filter finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3FilterIfc findFilterNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public Filter is related predicate
     */
  public boolean hasFilterNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional Filter is related  predicate
     */
  public boolean hasFilter( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FilterIfc theFilter) throws EAIException;

    /* Public Filter index access
     */
  public int indexOfFilter( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FilterIfc theFilter) throws EAIException;

    /* Public Write accessor for role Filter
     * Machinery in Filter drives the collection operations
     */
  public void setFilter( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FilterIfc theFilter) throws EAIException;







}
