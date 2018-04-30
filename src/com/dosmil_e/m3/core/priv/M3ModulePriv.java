package com.dosmil_e.m3.core.priv;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ModulePriv 
   extends com.dosmil_e.m3.core.priv.M3ElementPriv,  
  com.dosmil_e.m3.core.ifc.M3ModuleIfc  {


/****************************************************************************
 *  Declaration of accessors to relationships of M3Module
 ****************************************************************************/


/****************************************************************************
 *  Implementation of privileged interface for relationship SuperModule
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role SuperModule
     * Guaranteed to return object with same identity of the SuperModule
     */
  public com.dosmil_e.m3.core.priv.M3ModulePriv getSuperModulePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Remove current reference in role SuperModule
     * Used by relationship maintenance machinery
     */
  public void unsetSuperModulePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;





    /* Set reference in role SuperModule
     * Used by relationship maintenance machinery
     */
  public void setSuperModulePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModulePriv theSuperModule) throws EAIException;
  


    /* Set reference in role SuperModule,
     * unlinking back reference from currently related SuperModule
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetSuperModulePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModulePriv theSuperModule) throws EAIException;






/****************************************************************************
 *  Implementation of privileged interface for relationship SubModules
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role SubModules
     */
  public void addSubModulesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModulePriv theSubModules) throws EAIException;







    /* Privileged Write accessor for role SubModules
     */
  public void removeSubModulesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModulePriv theSubModules) throws EAIException;






    /* Privileged Read accessor for role SubModules
     * Guaranteed to return object with same identity of the SubModules
     */
  public com.dosmil_e.m3.core.priv.M3ModulePriv[] getSubModulesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role SubModules
     * Used by relationship maintenance machinery
     */
  public void setSubModulesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModulePriv[] theSubModulesCollection) throws EAIException;





/****************************************************************************
 *  Implementation of privileged interface for relationship Types
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role Types
     */
  public void addTypesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theTypes) throws EAIException;







    /* Privileged Write accessor for role Types
     */
  public void removeTypesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theTypes) throws EAIException;






    /* Privileged Read accessor for role Types
     * Guaranteed to return object with same identity of the Types
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv[] getTypesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException;




    /* Set reference in role Types
     * Used by relationship maintenance machinery
     */
  public void setTypesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv[] theTypesCollection) throws EAIException;






}
