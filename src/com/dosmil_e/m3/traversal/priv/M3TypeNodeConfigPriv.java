package com.dosmil_e.m3.traversal.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3TypeNodeConfigPriv 
   extends com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv,  
  com.dosmil_e.m3.traversal.ifc.M3TypeNodeConfigIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3TypeNodeConfig
 ****************************************************************************/


/****************************************************************************
 *  Implementation of privileged interface for relationship MetaType
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role MetaType
     * Guaranteed to return object with same identity of the MetaType
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv getMetaTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role MetaType
     * Used by relationship maintenance machinery
     */
  public void unsetMetaTypePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role MetaType
     * Used by relationship maintenance machinery
     */
  public void setMetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theMetaType) throws EAIException;
  


    /* Set reference in role MetaType,
     * unlinking back reference from currently related MetaType
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetMetaTypePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theMetaType) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship NodeConfig
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role NodeConfig
     * Guaranteed to return object with same identity of the NodeConfig
     */
  public com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv getNodeConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role NodeConfig
     * Used by relationship maintenance machinery
     */
  public void unsetNodeConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role NodeConfig
     * Used by relationship maintenance machinery
     */
  public void setNodeConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theNodeConfig) throws EAIException;
  


    /* Set reference in role NodeConfig,
     * unlinking back reference from currently related NodeConfig
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetNodeConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theNodeConfig) throws EAIException;







}
