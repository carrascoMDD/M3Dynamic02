package com.dosmil_e.m3.traversal.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3FilterPriv 
   extends com.dosmil_e.m3.withm3.priv.MMElementWithM3Priv,  
  com.dosmil_e.m3.traversal.ifc.M3FilterIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3Filter
 ****************************************************************************/


/****************************************************************************
 *  Implementation of privileged interface for relationship RelatedTypeNodeConfig
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role RelatedTypeNodeConfig
     * Guaranteed to return object with same identity of the RelatedTypeNodeConfig
     */
  public com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv getRelatedTypeNodeConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role RelatedTypeNodeConfig
     * Used by relationship maintenance machinery
     */
  public void unsetRelatedTypeNodeConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role RelatedTypeNodeConfig
     * Used by relationship maintenance machinery
     */
  public void setRelatedTypeNodeConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv theRelatedTypeNodeConfig) throws EAIException;
  




    /* Set reference in role RelatedTypeNodeConfig,
     * unlinking back reference from currently related RelatedTypeNodeConfig
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetRelatedTypeNodeConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3RelatedTypeNodeConfigPriv theRelatedTypeNodeConfig) throws EAIException;
  






}
