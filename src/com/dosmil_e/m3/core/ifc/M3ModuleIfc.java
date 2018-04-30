package com.dosmil_e.m3.core.ifc;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

public interface M3ModuleIfc
    extends     com.dosmil_e.m3.core.ifc.M3ElementIfc  {


/****************************************************************************
 *  Declaration of accessors to attributes of M3Module
 ****************************************************************************/






/****************************************************************************
 *  Declaration of accessors to relationships of M3Module
 ****************************************************************************/


/****************************************************************************
 *  Public interface for ONE to MANY side ONE relationship SuperModule
 ****************************************************************************/


    /* Public Read accessor for role SuperModule
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getSuperModule( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public SuperModule number access
     */
  public int numSuperModule( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SuperModule read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getSuperModuleAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public SuperModule finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc findSuperModuleNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public SuperModule is related predicate
     */
  public boolean hasSuperModuleNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional SuperModule is related  predicate
     */
  public boolean hasSuperModule( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSuperModule) throws EAIException;

    /* Public SuperModule index access
     */
  public int indexOfSuperModule( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSuperModule) throws EAIException;

    /* Public Write accessor for role SuperModule
     * Machinery in SuperModule drives the collection operations
     */
  public void setSuperModule( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSuperModule) throws EAIException;





/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship SubModules
 ****************************************************************************/


    /* Public Read accessor for role SubModules
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc[] getSubModules( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public SubModules number access
     */
  public int numSubModules( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public SubModules read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getSubModulesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public SubModules finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc findSubModulesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public SubModules is related predicate
     */
  public boolean hasSubModulesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional SubModules is related  predicate
     */
  public boolean hasSubModules( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException;

    /* Public SubModules index access
     */
  public int indexOfSubModules( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addSubModules( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addSubModulesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules, com.dosmil_e.m3.core.ifc.M3ModuleIfc theRelativeSubModules) throws EAIException;

    /* Transactional Public Write Remove accessor for role SubModules
     */
  public void removeSubModules( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException;

    /* Public reorder accessor for role SubModules
     */
  public void moveSubModulesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules, com.dosmil_e.m3.core.ifc.M3ModuleIfc theRelativeSubModules) throws EAIException;


    /* Public reorder accessor for role SubModules
     */
  public void moveSubModulesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException;


/****************************************************************************
 *  Public interface for ONE to MANY side MANY relationship Types
 ****************************************************************************/


    /* Public Read accessor for role Types
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getTypes( EAIMMCtxtIfc theCtxt) throws EAIException;

    /* Public Types number access
     */
  public int numTypes( EAIMMCtxtIfc theCtxt) throws EAIException;


    /* Public Types read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getTypesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException;


    /* Public Types finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;


    /* Public Types is related predicate
     */
  public boolean hasTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException;

    /* Transactional Types is related  predicate
     */
  public boolean hasTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException;

    /* Public Types index access
     */
  public int indexOfTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException;


    /* Transactional Write Add accessor for role Package
     */
  public void addTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException;

    /* Transactional Write Add accessor for role Package
     */
  public void addTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeTypes) throws EAIException;

    /* Transactional Public Write Remove accessor for role Types
     */
  public void removeTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException;

    /* Public reorder accessor for role Types
     */
  public void moveTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeTypes) throws EAIException;


    /* Public reorder accessor for role Types
     */
  public void moveTypesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException;




}
