package com.dosmil_e.m3.traversal.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3CopyFieldMgrIfc
    extends     com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3CopyFieldMgr
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3CopyFieldMgr
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship CopiedMetaAttribute
 ****************************************************************************/


    /* Public Read accessor for role CopiedMetaAttribute
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getCopiedMetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public CopiedMetaAttribute number access
     */
  public int numCopiedMetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public CopiedMetaAttribute read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getCopiedMetaAttributeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public CopiedMetaAttribute finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findCopiedMetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public CopiedMetaAttribute is related predicate
     */
  public boolean hasCopiedMetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional CopiedMetaAttribute is related  predicate
     */
  public boolean hasCopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theCopiedMetaAttribute) throws EAIException;

    /* Public CopiedMetaAttribute index access
     */
  public int indexOfCopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theCopiedMetaAttribute) throws EAIException;

    /* Public Write accessor for role CopiedMetaAttribute
     * Machinery in CopiedMetaAttribute drives the collection operations
     */
  public void setCopiedMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theCopiedMetaAttribute) throws EAIException;







}
