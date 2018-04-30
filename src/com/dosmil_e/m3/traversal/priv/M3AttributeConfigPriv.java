package com.dosmil_e.m3.traversal.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3AttributeConfigPriv 
   extends com.dosmil_e.m3.withm3.priv.MMElementWithM3Priv,  
  com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3AttributeConfig
 ****************************************************************************/



/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFattributeConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFattributeConfigs
     */
  public void addInverseOFattributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFattributeConfigs) throws EAIException;







    /* Privileged Write accessor for role InverseOFattributeConfigs
     */
  public void removeInverseOFattributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFattributeConfigs) throws EAIException;






    /* Privileged Read accessor for role InverseOFattributeConfigs
     * Guaranteed to return object with same identity of the InverseOFattributeConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] getInverseOFattributeConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role InverseOFattributeConfigs
     * Used by relationship maintenance machinery
     */
  public void setInverseOFattributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] theInverseOFattributeConfigsCollection) throws EAIException;




/****************************************************************************
 *  Implementation of privileged interface for relationship TraversalConfig
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role TraversalConfig
     * Guaranteed to return object with same identity of the TraversalConfig
     */
  public com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv getTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role TraversalConfig
     * Used by relationship maintenance machinery
     */
  public void unsetTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role TraversalConfig
     * Used by relationship maintenance machinery
     */
  public void setTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theTraversalConfig) throws EAIException;
  


    /* Set reference in role TraversalConfig,
     * unlinking back reference from currently related TraversalConfig
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theTraversalConfig) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship MetaAttribute
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role MetaAttribute
     * Guaranteed to return object with same identity of the MetaAttribute
     */
  public com.dosmil_e.m3.core.priv.M3AttributePriv getMetaAttributePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role MetaAttribute
     * Used by relationship maintenance machinery
     */
  public void unsetMetaAttributePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role MetaAttribute
     * Used by relationship maintenance machinery
     */
  public void setMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theMetaAttribute) throws EAIException;
  


    /* Set reference in role MetaAttribute,
     * unlinking back reference from currently related MetaAttribute
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theMetaAttribute) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship MetaFieldMgr
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role MetaFieldMgr
     * Guaranteed to return object with same identity of the MetaFieldMgr
     */
  public com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv getMetaFieldMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role MetaFieldMgr
     * Used by relationship maintenance machinery
     */
  public void unsetMetaFieldMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role MetaFieldMgr
     * Used by relationship maintenance machinery
     */
  public void setMetaFieldMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv theMetaFieldMgr) throws EAIException;
  


    /* Set reference in role MetaFieldMgr,
     * unlinking back reference from currently related MetaFieldMgr
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetMetaFieldMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv theMetaFieldMgr) throws EAIException;







}
