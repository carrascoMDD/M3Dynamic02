package com.dosmil_e.m3.traversal.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ConfigOverrideIfc
   extends com.dosmil_e.m3.withm3.ifc.MMElementWithM3Ifc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3ConfigOverride
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3ConfigOverride
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship OverrideWith
 ****************************************************************************/


    /* Public Read accessor for role OverrideWith
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getOverrideWith( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public OverrideWith number access
     */
  public int numOverrideWith( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public OverrideWith read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getOverrideWithAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public OverrideWith finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc findOverrideWithNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public OverrideWith is related predicate
     */
  public boolean hasOverrideWithNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional OverrideWith is related  predicate
     */
  public boolean hasOverrideWith( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theOverrideWith) throws EAIException;

    /* Public OverrideWith index access
     */
  public int indexOfOverrideWith( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theOverrideWith) throws EAIException;

    /* Public Write accessor for role OverrideWith
     * Machinery in OverrideWith drives the collection operations
     */
  public void setOverrideWith( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theOverrideWith) throws EAIException;







}
