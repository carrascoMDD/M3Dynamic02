package com.dosmil_e.m3.traversal.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ConfigOverridePriv 
   extends com.dosmil_e.m3.withm3.priv.MMElementWithM3Priv,  
  com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3ConfigOverride
 ****************************************************************************/


/****************************************************************************
 *  Implementation of privileged interface for relationship OverrideWith
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role OverrideWith
     * Guaranteed to return object with same identity of the OverrideWith
     */
  public com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv getOverrideWithPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role OverrideWith
     * Used by relationship maintenance machinery
     */
  public void unsetOverrideWithPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role OverrideWith
     * Used by relationship maintenance machinery
     */
  public void setOverrideWithPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theOverrideWith) throws EAIException;
  


    /* Set reference in role OverrideWith,
     * unlinking back reference from currently related OverrideWith
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetOverrideWithPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theOverrideWith) throws EAIException;







}
