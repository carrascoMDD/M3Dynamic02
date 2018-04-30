package com.dosmil_e.m3.core.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3AttributePriv 
   extends com.dosmil_e.m3.core.priv.M3StructuralFeaturePriv,  
  com.dosmil_e.m3.core.ifc.M3AttributeIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3Attribute
 ****************************************************************************/



/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFmetaAttribute
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFmetaAttribute
     */
  public void addInverseOFmetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv theInverseOFmetaAttribute) throws EAIException;







    /* Privileged Write accessor for role InverseOFmetaAttribute
     */
  public void removeInverseOFmetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv theInverseOFmetaAttribute) throws EAIException;






    /* Privileged Read accessor for role InverseOFmetaAttribute
     * Guaranteed to return object with same identity of the InverseOFmetaAttribute
     */
  public com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] getInverseOFmetaAttributePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFmetaAttribute
     * Used by relationship maintenance machinery
     */
  public void setInverseOFmetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] theInverseOFmetaAttributeCollection) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFcopiedMetaAttribute
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFcopiedMetaAttribute
     */
  public void addInverseOFcopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv theInverseOFcopiedMetaAttribute) throws EAIException;







    /* Privileged Write accessor for role InverseOFcopiedMetaAttribute
     */
  public void removeInverseOFcopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv theInverseOFcopiedMetaAttribute) throws EAIException;






    /* Privileged Read accessor for role InverseOFcopiedMetaAttribute
     * Guaranteed to return object with same identity of the InverseOFcopiedMetaAttribute
     */
  public com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] getInverseOFcopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFcopiedMetaAttribute
     * Used by relationship maintenance machinery
     */
  public void setInverseOFcopiedMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3CopyFieldMgrPriv[] theInverseOFcopiedMetaAttributeCollection) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFexcludedInRelationshipNamed
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void addInverseOFexcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFexcludedInRelationshipNamed) throws EAIException;







    /* Privileged Write accessor for role InverseOFexcludedInRelationshipNamed
     */
  public void removeInverseOFexcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv theInverseOFexcludedInRelationshipNamed) throws EAIException;






    /* Privileged Read accessor for role InverseOFexcludedInRelationshipNamed
     * Guaranteed to return object with same identity of the InverseOFexcludedInRelationshipNamed
     */
  public com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] getInverseOFexcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFexcludedInRelationshipNamed
     * Used by relationship maintenance machinery
     */
  public void setInverseOFexcludedInRelationshipNamedPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.projection.priv.M3ProjectionConfigPriv[] theInverseOFexcludedInRelationshipNamedCollection) throws EAIException;




/****************************************************************************
 *  Implementation of privileged interface for relationship Type
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role Type
     * Guaranteed to return object with same identity of the Type
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role Type
     * Used by relationship maintenance machinery
     */
  public void unsetTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role Type
     * Used by relationship maintenance machinery
     */
  public void setTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theType) throws EAIException;
  


    /* Set reference in role Type,
     * unlinking back reference from currently related Type
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theType) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship ValueType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role ValueType
     * Guaranteed to return object with same identity of the ValueType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getValueTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role ValueType
     * Used by relationship maintenance machinery
     */
  public void unsetValueTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role ValueType
     * Used by relationship maintenance machinery
     */
  public void setValueTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theValueType) throws EAIException;
  


    /* Set reference in role ValueType,
     * unlinking back reference from currently related ValueType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetValueTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theValueType) throws EAIException;







}
