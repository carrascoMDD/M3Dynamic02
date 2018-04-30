package com.dosmil_e.m3.traversal.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3CopyFieldMgrPriv 
   extends com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv,  
  com.dosmil_e.m3.traversal.ifc.M3CopyFieldMgrIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3CopyFieldMgr
 ****************************************************************************/


/****************************************************************************
 *  Implementation of privileged interface for relationship CopiedMetaAttribute
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role CopiedMetaAttribute
     * Guaranteed to return object with same identity of the CopiedMetaAttribute
     */
  public com.dosmil_e.m3.core.priv.M3AttributePriv getCopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role CopiedMetaAttribute
     * Used by relationship maintenance machinery
     */
  public void unsetCopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role CopiedMetaAttribute
     * Used by relationship maintenance machinery
     */
  public void setCopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theCopiedMetaAttribute) throws EAIException;
  


    /* Set reference in role CopiedMetaAttribute,
     * unlinking back reference from currently related CopiedMetaAttribute
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetCopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theCopiedMetaAttribute) throws EAIException;







}
