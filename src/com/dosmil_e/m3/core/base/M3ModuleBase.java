package com.dosmil_e.m3.core.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3ModuleBase
   extends com.dosmil_e.m3.core.impl.M3ElementImpl
    implements com.dosmil_e.m3.core.priv.M3ModulePriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3Module metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the M3Module metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.core.priv.M3ModulePriv vrSuperModule; 

	protected com.dosmil_e.m3.core.priv.M3ModulePriv[] vrSubModules = new com.dosmil_e.m3.core.priv.M3ModulePriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3TypePriv[] vrTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[0]; 






/****************************************************************************
 *  Constructors of the M3Module metamodel element
 ****************************************************************************/

  public M3ModuleBase() {
    super();
  }


  public M3ModuleBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3ModuleBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3ModuleIfc and M3ModulePriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3Module
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of M3Module
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship SuperModule
 ****************************************************************************/


    /* Public Read accessor for role SuperModule
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getSuperModule( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getSuperModulePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getSuperModulePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }

    /* Public SuperModule number access
     */
  public int numSuperModule( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numSuperModulePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numSuperModulePR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Public SuperModule read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getSuperModuleAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getSuperModuleAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getSuperModuleAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public SuperModule finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc findSuperModuleNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findSuperModuleNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findSuperModuleNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public SuperModule is related predicate
     */
  public boolean hasSuperModuleNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasSuperModuleNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasSuperModuleNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Transactional SuperModule is related  predicate
     */
  public boolean hasSuperModule( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSuperModule) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasSuperModulePR( theCtxt, theSuperModule);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasSuperModulePR( theCtxt, theSuperModule);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public SuperModule index access
     */
  public int indexOfSuperModule( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSuperModule) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfSuperModulePR( theCtxt, theSuperModule);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfSuperModulePR( theCtxt, theSuperModule);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public Write accessor for role SuperModule
     */
  public void setSuperModule( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSuperModule) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setSuperModulePR( theCtxt, theSuperModule);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setSuperModulePR( theCtxt, theSuperModule);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }




/****************************************************************************
 *  Implementation of internal operations for relationship SuperModule
 ****************************************************************************/


    /* Public Read accessor for role SuperModule
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getSuperModulePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getSuperModulePrivileged( theCtxt);
  }


    /* Public SuperModule number access
     */
  public int numSuperModulePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getSuperModulePrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public SuperModule read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getSuperModuleAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getSuperModulePrivileged( theCtxt);
  }


    /* Public SuperModule finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc findSuperModuleNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aSuperModule = getSuperModulePrivileged( theCtxt);
    if( aSuperModule == null) { return null;}

    if( !aSuperModule.sameNameAs( theCtxt, theMMName)) { return null;}

    return aSuperModule;
  }


    /* Public SuperModule finder predicate by name
     */
  public boolean hasSuperModuleNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aSuperModule = getSuperModulePrivileged( theCtxt);
    if( aSuperModule == null) { return false;}

    return aSuperModule.sameNameAs( theCtxt, theMMName);
  }



    /* Public SuperModule is related predicate
     */
  public boolean hasSuperModulePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSuperModule) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aSuperModule = getSuperModulePrivileged( theCtxt);
    if( aSuperModule == null) { return false;}

    return aSuperModule.sameAs( theCtxt, theSuperModule);
  }




    /* Public SuperModule index access
     */
  public int indexOfSuperModulePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSuperModule) throws EAIException {
    if( !hasSuperModulePR( theCtxt, theSuperModule)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role SuperModule
     */
  public void setSuperModulePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSuperModule) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3ModulePriv aSuperModule = getSuperModulePrivileged( theCtxt);
      // Check for new SuperModule same as current one
    if( aSuperModule != null && aSuperModule.sameAs( theCtxt, theSuperModule)) { return;}

    if( aSuperModule != null) {
      aSuperModule.removeSubModulesPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetSuperModulePrivileged();
      */
    }

    if( theSuperModule != null) {
      com.dosmil_e.m3.core.priv.M3ModulePriv aNewSuperModule = (com.dosmil_e.m3.core.priv.M3ModulePriv) theSuperModule;
      aNewSuperModule.addSubModulesPrivileged( theCtxt, this);
      setSuperModulePrivileged( theCtxt, aNewSuperModule);
    }
    else {
      setSuperModulePrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship SuperModule
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role SuperModule
     * Guaranteed to return object with same identity of the SuperModule
     */
  public com.dosmil_e.m3.core.priv.M3ModulePriv getSuperModulePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrSuperModule;
  }




    /* Remove current reference in role SuperModule
     * Used by relationship maintenance machinery
     */
  public void unsetSuperModulePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aSuperModule = vrSuperModule;
    vrSuperModule = null;
      // If there was change, propagate
    if( aSuperModule != null) {
      change( theCtxt, "SuperModule", aSuperModule, vrSuperModule, "vrSuperModule");
    }
  }





    /* Set reference in role SuperModule
     * Used by relationship maintenance machinery
     */
  public void setSuperModulePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModulePriv theSuperModule) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aSuperModule = vrSuperModule;
    vrSuperModule = theSuperModule;
      // If there was change, propagate
    if( (aSuperModule != null && !aSuperModule.sameAs( theCtxt, theSuperModule)) || (aSuperModule == null && theSuperModule != null)) {
      change( theCtxt, "SuperModule", aSuperModule, vrSuperModule, "vrSuperModule");
    }
  }





    /* Unset currently related SuperModule and
     * Set reference in role SuperModule
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetSuperModulePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModulePriv theSuperModule) throws EAIException {
    com.dosmil_e.m3.core.priv.M3ModulePriv aSuperModule = vrSuperModule;
    if( aSuperModule != null) {
      aSuperModule.removeSubModulesPrivileged( theCtxt, this);
    }
    vrSuperModule = theSuperModule;
      // If there was change, propagate
    if( (aSuperModule != null && !aSuperModule.sameAs( theCtxt, theSuperModule)) || (aSuperModule == null && theSuperModule != null)) {
      change( theCtxt, "SuperModule", aSuperModule, vrSuperModule, "vrSuperModule");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship SubModules
 ****************************************************************************/


    /* Public Read accessor for role SubModules
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc[] getSubModules( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModuleIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getSubModulesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getSubModulesPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }

    /* Public SubModules number access
     */
  public int numSubModules( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numSubModulesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numSubModulesPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Public SubModules read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getSubModulesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getSubModulesAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getSubModulesAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public SubModules finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc findSubModulesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModuleIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findSubModulesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findSubModulesNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public SubModules is related predicate
     */
  public boolean hasSubModulesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasSubModulesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasSubModulesNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Transactional SubModules is related  predicate
     */
  public boolean hasSubModules( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasSubModulesPR( theCtxt, theSubModules);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasSubModulesPR( theCtxt, theSubModules);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public SubModules index access
     */
  public int indexOfSubModules( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfSubModulesPR( theCtxt, theSubModules);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfSubModulesPR( theCtxt, theSubModules);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }






    /* Transactional Write Add accessor for role Package
     */
  public void addSubModules( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addSubModulesPR( theCtxt, theSubModules);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addSubModulesPR( theCtxt, theSubModules);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }



    /* Transactional Write Add accessor for role Package
     */
  public void addSubModulesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules, com.dosmil_e.m3.core.ifc.M3ModuleIfc theRelativeSubModules) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addSubModulesBeforePR( theCtxt, theSubModules, theRelativeSubModules);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addSubModulesBeforePR( theCtxt, theSubModules, theRelativeSubModules);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }





    /* Transactional Public Write Remove accessor for role SubModules
     */
  public void removeSubModules( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeSubModulesPR( theCtxt, theSubModules);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeSubModulesPR( theCtxt, theSubModules);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }



    /* Public reorder accessor for role SubModules
     */
  public void moveSubModulesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules, com.dosmil_e.m3.core.ifc.M3ModuleIfc theRelativeSubModules) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveSubModulesBeforePR( theCtxt, theSubModules, theRelativeSubModules);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveSubModulesBeforePR( theCtxt, theSubModules, theRelativeSubModules);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }



    /* Public reorder accessor for role SubModules
     */
  public void moveSubModulesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveSubModulesToLastPR( theCtxt, theSubModules);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveSubModulesToLastPR( theCtxt, theSubModules);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }



/****************************************************************************
 *  Implementation of internal operations for relationship SubModules
 ****************************************************************************/


    /* Public Read accessor for role SubModules
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc[] getSubModulesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.priv.M3ModulePriv[] someSubModules = getSubModulesPrivileged( theCtxt);
    if( someSubModules == null) { return null;}

    int aSubModulesLength = someSubModules.length;
    com.dosmil_e.m3.core.ifc.M3ModuleIfc[] otherSubModules = new com.dosmil_e.m3.core.ifc.M3ModuleIfc[ aSubModulesLength];
    try { System.arraycopy( someSubModules, 0, otherSubModules, 0, aSubModulesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getSubModules", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getSubModules", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getSubModules", null); return null;}


    return otherSubModules;
  }



    /* Public SubModules finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc findSubModulesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3ModulePriv[] someSubModules = getSubModulesPrivileged( theCtxt);
    if( someSubModules == null) { return null;}

      // Check for new SubModules already in collection
    int aSubModulesLength = someSubModules.length;
    for( int anIndex = 0 ; anIndex < aSubModulesLength ; anIndex++) {
      com.dosmil_e.m3.core.priv.M3ModulePriv aSubModules = someSubModules[ anIndex];
      if( aSubModules.sameNameAs( theCtxt, theMMName)) { return aSubModules;}
    }
    return null;
  }



    /* Public SubModules finder predicate by name
     */
  public boolean hasSubModulesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findSubModulesNamedPR( theCtxt, theMMName) != null;
  }


    /* Public SubModules read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModuleIfc getSubModulesAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3ModulePriv[] someSubModules = getSubModulesPrivileged( theCtxt);
    if( someSubModules == null) { return null;}

      // Get number of SubModules
    int aSubModulesLength = someSubModules.length;

      // Verify index within array length
    if( theIndex >= aSubModulesLength) { return null;}

      // Get indexed SubModules
    com.dosmil_e.m3.core.ifc.M3ModuleIfc aSubModules = someSubModules[ theIndex];

    return aSubModules;
  }



    /* Public SubModules is related predicate
     */
  public boolean hasSubModulesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException {
    return indexOfSubModulesPR( theCtxt, theSubModules) >= 0;
  }


    /* Public SubModules index access
     */
  public int indexOfSubModulesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException {
      // Do not add null values to the collection
    if( theSubModules == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3ModulePriv[] someSubModules = getSubModulesPrivileged( theCtxt);
    if( someSubModules == null) { return -1;}

      // Check for new SubModules already in collection
    int aSubModulesLength = someSubModules.length;
    for( int anIndex = 0 ; anIndex < aSubModulesLength ; anIndex++) {
      if( someSubModules[ anIndex].sameAs( theCtxt, theSubModules)) { return anIndex;}
    }
    return -1;
  }


    /* Public SubModules number access
     */
  public int numSubModulesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.core.priv.M3ModulePriv[] someSubModules = getSubModulesPrivileged( theCtxt);
    if( someSubModules == null) { return 0;}

      // Check for new SubModules already in collection
    int aSubModulesLength = someSubModules.length;
    return aSubModulesLength;
  }




    /* Public Write accessor for role SubModules
     */
  public void addSubModulesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException {

      // Do not add null values to the collection
    if( theSubModules == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3ModuleIfc[] someSubModules = getSubModulesPrivileged( theCtxt);
    if( someSubModules == null) { return;}

      // Check for new SubModules already in collection
    int aSubModulesLength = someSubModules.length;
    for( int anIndex = 0 ; anIndex < aSubModulesLength ; anIndex++) {
      if( theSubModules.sameAs( theCtxt, someSubModules[ anIndex])) { return;}
    }

    com.dosmil_e.m3.core.priv.M3ModulePriv aNewSubModules = (com.dosmil_e.m3.core.priv.M3ModulePriv) theSubModules;

      // Link reverse ref to this object
    aNewSubModules.unsetAndSetSuperModulePrivileged( theCtxt, this);

      // Grow collection and add new SubModules element
    com.dosmil_e.m3.core.priv.M3ModulePriv[] otherSubModules = new com.dosmil_e.m3.core.priv.M3ModulePriv[ aSubModulesLength + 1];
    try { System.arraycopy( someSubModules, 0, otherSubModules, 0, aSubModulesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubModules", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubModules", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubModules", null); return;}
    otherSubModules[ aSubModulesLength] = aNewSubModules;

      // Set the new collection
    setSubModulesPrivileged( theCtxt, otherSubModules);
  }




    /* Public ordered Write accessor for role SubModules
     */
  public void addSubModulesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules, com.dosmil_e.m3.core.ifc.M3ModuleIfc theRelativeSubModules) throws EAIException {

      // Do not add null values to the collection
    if( theSubModules == null) { return;}

      // If relative SubModules is null, perform normal add operation
    if( theRelativeSubModules == null) {
      addSubModulesPR( theCtxt, theSubModules);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3ModuleIfc[] someSubModules = getSubModulesPrivileged( theCtxt);
    if( someSubModules == null) { return;}


      // Get index of relative SubModules
    int aRelativeIndex = indexOfSubModulesPR( theCtxt, theRelativeSubModules);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addSubModulesPR( theCtxt, theSubModules);
    }

      // Get length of SubModules array
    int aSubModulesLength = someSubModules.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aSubModulesLength) {
      addSubModulesPR( theCtxt, theSubModules);
    }

      // Check for new SubModules already in collection
    if( hasSubModulesPR( theCtxt, theSubModules)) { return;}


    com.dosmil_e.m3.core.priv.M3ModulePriv aNewSubModules = (com.dosmil_e.m3.core.priv.M3ModulePriv) theSubModules;

      // Link reverse ref to this object
    aNewSubModules.unsetAndSetSuperModulePrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship SubModules
      // Grow collection and add new SubModules element
    com.dosmil_e.m3.core.priv.M3ModulePriv[] otherSubModules = new com.dosmil_e.m3.core.priv.M3ModulePriv[ aSubModulesLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someSubModules, 0, otherSubModules, 0, aRelativeIndex );
      }
      System.arraycopy( someSubModules, aRelativeIndex, otherSubModules, aRelativeIndex + 1, aSubModulesLength - aRelativeIndex);
      otherSubModules[ aRelativeIndex] = aNewSubModules;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubModulesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubModulesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubModulesBefore", null); return;}

      // Set the new collection
    setSubModulesPrivileged( theCtxt, otherSubModules);
  }





    /* Public Write accessor for role SubModules
     */
  public void removeSubModulesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException {

      // Do not add null values to the collection
    if( theSubModules == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3ModuleIfc[] someSubModules = getSubModulesPrivileged( theCtxt);
    if( someSubModules == null) { return;}

      // Check for new SubModules not in collection
    int aSubModulesLength = someSubModules.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aSubModulesLength ; anIndex++) {
      if( theSubModules.sameAs( theCtxt, someSubModules[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.core.priv.M3ModulePriv aNewSubModules = (com.dosmil_e.m3.core.priv.M3ModulePriv) theSubModules;

      // Unlink reverse ref from the new related object
    aNewSubModules.unsetSuperModulePrivileged( theCtxt);

      // Shrink collection removing SubModules element
    com.dosmil_e.m3.core.priv.M3ModulePriv[] otherSubModules = new com.dosmil_e.m3.core.priv.M3ModulePriv[ aSubModulesLength - 1];
    try {
      System.arraycopy( someSubModules, 0, otherSubModules, 0, aFoundIndex);
      System.arraycopy( someSubModules, aFoundIndex + 1, otherSubModules, aFoundIndex, aSubModulesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSubModules", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSubModules", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSubModules", null); return;}

      // Set the new collection
    setSubModulesPrivileged( theCtxt, otherSubModules);
  }




    /* Public reorder accessor for role SubModules
     */
  public void moveSubModulesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules, com.dosmil_e.m3.core.ifc.M3ModuleIfc theRelativeSubModules) throws EAIException {

      // Null value is nothing to move
    if( theSubModules == null) { return;}

      // If relative SubModules is null, perform move to last position
    if( theRelativeSubModules == null) {
      moveSubModulesToLastPR( theCtxt, theSubModules);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3ModuleIfc[] someSubModules = getSubModulesPrivileged( theCtxt);
    if( someSubModules == null) { return;}

      // Get length of SubModules array
    int aSubModulesLength = someSubModules.length;

      // Get index of SubModules to move
    int aToMoveIndex = indexOfSubModulesPR( theCtxt, theSubModules);
      // If toMove SubModules not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aSubModulesLength) {
      moveSubModulesToLastPR( theCtxt, theSubModules);
    }

      // Get index of relative SubModules
    int aRelativeIndex = indexOfSubModulesPR( theCtxt, theRelativeSubModules);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveSubModulesToLastPR( theCtxt, theSubModules);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aSubModulesLength) {
      moveSubModulesToLastPR( theCtxt, theSubModules);
    }

      // ToMove and relative SubModules are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.core.priv.M3ModulePriv aToMoveSubModules = (com.dosmil_e.m3.core.priv.M3ModulePriv) theSubModules;

      // Allocate new array for new version of state of relationship SubModules
    com.dosmil_e.m3.core.priv.M3ModulePriv[] otherSubModules = new com.dosmil_e.m3.core.priv.M3ModulePriv[ aSubModulesLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someSubModules, 0, otherSubModules, 0, aToMoveIndex );
        System.arraycopy( someSubModules, aToMoveIndex + 1, otherSubModules, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherSubModules[ aRelativeIndex - 1] = aToMoveSubModules;
        System.arraycopy( someSubModules, aRelativeIndex, otherSubModules, aRelativeIndex, aSubModulesLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someSubModules, 0, otherSubModules, 0, aRelativeIndex );
        otherSubModules[ aRelativeIndex ] = aToMoveSubModules;
        System.arraycopy( someSubModules, aRelativeIndex, otherSubModules, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aSubModulesLength - 1) {
          System.arraycopy( someSubModules, aToMoveIndex + 1, otherSubModules, aToMoveIndex + 1, aSubModulesLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSubModulesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSubModulesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSubModulesBefore", null); return;}

      // Set the new collection
    setSubModulesPrivileged( theCtxt, otherSubModules);
  }





    /* Public move to last accessor for role SubModules
     */
  public void moveSubModulesToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModuleIfc theSubModules) throws EAIException {

      // Null value is nothing to move
    if( theSubModules == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3ModuleIfc[] someSubModules = getSubModulesPrivileged( theCtxt);
    if( someSubModules == null) { return;}

      // Get length of SubModules array
    int aSubModulesLength = someSubModules.length;

      // Get index of SubModules to move
    int aToMoveIndex = indexOfSubModulesPR( theCtxt, theSubModules);

      // If toMove SubModules not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aSubModulesLength - 1) { return;}

    com.dosmil_e.m3.core.priv.M3ModulePriv aToMoveSubModules = (com.dosmil_e.m3.core.priv.M3ModulePriv) theSubModules;

      // Allocate new array for new version of state of relationship SubModules
    com.dosmil_e.m3.core.priv.M3ModulePriv[] otherSubModules = new com.dosmil_e.m3.core.priv.M3ModulePriv[ aSubModulesLength];
    try {
      System.arraycopy( someSubModules, 0, otherSubModules, 0, aToMoveIndex );
      System.arraycopy( someSubModules, aToMoveIndex + 1, otherSubModules, aToMoveIndex, aSubModulesLength - aToMoveIndex - 1);
      otherSubModules[ aSubModulesLength - 1] = aToMoveSubModules;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSubModulesToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSubModulesToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveSubModulesToLast", null); return;}

      // Set the new collection
    setSubModulesPrivileged( theCtxt, otherSubModules);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship SubModules
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role SubModules
     */
  public void addSubModulesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModulePriv theSubModules) throws EAIException {

      // Do not add null values to the collection
    if( theSubModules == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3ModuleIfc[] someSubModules = getSubModulesPrivileged( theCtxt);
    if( someSubModules == null) { return;}

      // Check for new SubModules already in collection
    int aSubModulesLength = someSubModules.length;
    for( int anIndex = 0 ; anIndex < aSubModulesLength ; anIndex++) {
      if( theSubModules.sameAs( theCtxt, someSubModules[ anIndex])) { return;}
    }

      // Grow collection and add new SubModules element
    com.dosmil_e.m3.core.priv.M3ModulePriv[] otherSubModules = new com.dosmil_e.m3.core.priv.M3ModulePriv[ aSubModulesLength + 1];
    try {
      System.arraycopy( someSubModules, 0, otherSubModules, 0, aSubModulesLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubModulesPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubModulesPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addSubModulesPrivileged", null); return;}

    otherSubModules[ aSubModulesLength] = theSubModules;

      // Set the new collection
    setSubModulesPrivileged( theCtxt, otherSubModules);
  }









    /* Privileged Write accessor for role SubModules
     */
  public void removeSubModulesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModulePriv theSubModules) throws EAIException {

      // Do not add null values to the collection
    if( theSubModules == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3ModulePriv[] someSubModules = getSubModulesPrivileged( theCtxt);
    if( someSubModules == null) { return;}

      // Check for new SubModules not in collection
    int aSubModulesLength = someSubModules.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aSubModulesLength ; anIndex++) {
      if( theSubModules.sameAs( theCtxt, someSubModules[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing SubModules element
    com.dosmil_e.m3.core.priv.M3ModulePriv[] otherSubModules = new com.dosmil_e.m3.core.priv.M3ModulePriv[ aSubModulesLength - 1];
    try {
      System.arraycopy( someSubModules, 0, otherSubModules, 0, aFoundIndex);
      System.arraycopy( someSubModules, aFoundIndex + 1, otherSubModules, aFoundIndex, aSubModulesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSubModulesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3ModulePriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSubModulesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3ModulePriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeSubModulesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3ModulePriv.class}); return;}

      // Set the new collection
    setSubModulesPrivileged( theCtxt, otherSubModules);
  }






    /* Privileged Read accessor for role SubModules
     * Guaranteed to return object with same identity of the SubModules
     */
  public com.dosmil_e.m3.core.priv.M3ModulePriv[] getSubModulesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrSubModules;
  }




    /* Set reference in role SubModules
     * Used by relationship maintenance machinery
     */
  public void setSubModulesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModulePriv[] theSubModulesCollection) throws EAIException {
    com.dosmil_e.m3.core.priv.M3ModulePriv[] aSubModules = vrSubModules;
    vrSubModules = theSubModulesCollection;
      // Propagate change
    change( theCtxt, "SubModules", aSubModules, vrSubModules, "vrSubModules");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship Types
 ****************************************************************************/


    /* Public Read accessor for role Types
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getTypes( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTypesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTypesPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }

    /* Public Types number access
     */
  public int numTypes( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numTypesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numTypesPR( theCtxt);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Public Types read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getTypesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTypesAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTypesAtPR( theCtxt, theIndex);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public Types finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3TypeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findTypesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findTypesNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }




    /* Public Types is related predicate
     */
  public boolean hasTypesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTypesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTypesNamedPR( theCtxt, theMMName);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }



    /* Transactional Types is related  predicate
     */
  public boolean hasTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTypesPR( theCtxt, theTypes);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTypesPR( theCtxt, theTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }


    /* Public Types index access
     */
  public int indexOfTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfTypesPR( theCtxt, theTypes);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfTypesPR( theCtxt, theTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }

    return aResult;
  }






    /* Transactional Write Add accessor for role Package
     */
  public void addTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addTypesPR( theCtxt, theTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addTypesPR( theCtxt, theTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }



    /* Transactional Write Add accessor for role Package
     */
  public void addTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addTypesBeforePR( theCtxt, theTypes, theRelativeTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addTypesBeforePR( theCtxt, theTypes, theRelativeTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }





    /* Transactional Public Write Remove accessor for role Types
     */
  public void removeTypes( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeTypesPR( theCtxt, theTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeTypesPR( theCtxt, theTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }



    /* Public reorder accessor for role Types
     */
  public void moveTypesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveTypesBeforePR( theCtxt, theTypes, theRelativeTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveTypesBeforePR( theCtxt, theTypes, theRelativeTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }



    /* Public reorder accessor for role Types
     */
  public void moveTypesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveTypesToLastPR( theCtxt, theTypes);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveTypesToLastPR( theCtxt, theTypes);
        anIsDone = true;
      }
      finally {
        if( !anIsDone) {
          theCtxt.getFlatTrxMgr().blockInterrupted( aBlockId);
        }
        else {
          theCtxt.getFlatTrxMgr().blockCompleted( aBlockId);
        }
      }
    }
    catch( EAIFlatTransactionCancelException anException) {
      theCtxt.getFlatTrxMgr().trappedCancelTransactionException( anException, aBlockId);
    }
  }



/****************************************************************************
 *  Implementation of internal operations for relationship Types
 ****************************************************************************/


    /* Public Read accessor for role Types
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc[] getTypesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv[] someTypes = getTypesPrivileged( theCtxt);
    if( someTypes == null) { return null;}

    int aTypesLength = someTypes.length;
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] otherTypes = new com.dosmil_e.m3.core.ifc.M3TypeIfc[ aTypesLength];
    try { System.arraycopy( someTypes, 0, otherTypes, 0, aTypesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getTypes", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getTypes", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getTypes", null); return null;}


    return otherTypes;
  }



    /* Public Types finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc findTypesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someTypes = getTypesPrivileged( theCtxt);
    if( someTypes == null) { return null;}

      // Check for new Types already in collection
    int aTypesLength = someTypes.length;
    for( int anIndex = 0 ; anIndex < aTypesLength ; anIndex++) {
      com.dosmil_e.m3.core.priv.M3TypePriv aTypes = someTypes[ anIndex];
      if( aTypes.sameNameAs( theCtxt, theMMName)) { return aTypes;}
    }
    return null;
  }



    /* Public Types finder predicate by name
     */
  public boolean hasTypesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findTypesNamedPR( theCtxt, theMMName) != null;
  }


    /* Public Types read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getTypesAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someTypes = getTypesPrivileged( theCtxt);
    if( someTypes == null) { return null;}

      // Get number of Types
    int aTypesLength = someTypes.length;

      // Verify index within array length
    if( theIndex >= aTypesLength) { return null;}

      // Get indexed Types
    com.dosmil_e.m3.core.ifc.M3TypeIfc aTypes = someTypes[ theIndex];

    return aTypes;
  }



    /* Public Types is related predicate
     */
  public boolean hasTypesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException {
    return indexOfTypesPR( theCtxt, theTypes) >= 0;
  }


    /* Public Types index access
     */
  public int indexOfTypesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException {
      // Do not add null values to the collection
    if( theTypes == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someTypes = getTypesPrivileged( theCtxt);
    if( someTypes == null) { return -1;}

      // Check for new Types already in collection
    int aTypesLength = someTypes.length;
    for( int anIndex = 0 ; anIndex < aTypesLength ; anIndex++) {
      if( someTypes[ anIndex].sameAs( theCtxt, theTypes)) { return anIndex;}
    }
    return -1;
  }


    /* Public Types number access
     */
  public int numTypesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someTypes = getTypesPrivileged( theCtxt);
    if( someTypes == null) { return 0;}

      // Check for new Types already in collection
    int aTypesLength = someTypes.length;
    return aTypesLength;
  }




    /* Public Write accessor for role Types
     */
  public void addTypesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException {

      // Do not add null values to the collection
    if( theTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someTypes = getTypesPrivileged( theCtxt);
    if( someTypes == null) { return;}

      // Check for new Types already in collection
    int aTypesLength = someTypes.length;
    for( int anIndex = 0 ; anIndex < aTypesLength ; anIndex++) {
      if( theTypes.sameAs( theCtxt, someTypes[ anIndex])) { return;}
    }

    com.dosmil_e.m3.core.priv.M3TypePriv aNewTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theTypes;

      // Link reverse ref to this object
    aNewTypes.unsetAndSetModulePrivileged( theCtxt, this);

      // Grow collection and add new Types element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aTypesLength + 1];
    try { System.arraycopy( someTypes, 0, otherTypes, 0, aTypesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypes", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypes", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypes", null); return;}
    otherTypes[ aTypesLength] = aNewTypes;

      // Set the new collection
    setTypesPrivileged( theCtxt, otherTypes);
  }




    /* Public ordered Write accessor for role Types
     */
  public void addTypesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeTypes) throws EAIException {

      // Do not add null values to the collection
    if( theTypes == null) { return;}

      // If relative Types is null, perform normal add operation
    if( theRelativeTypes == null) {
      addTypesPR( theCtxt, theTypes);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someTypes = getTypesPrivileged( theCtxt);
    if( someTypes == null) { return;}


      // Get index of relative Types
    int aRelativeIndex = indexOfTypesPR( theCtxt, theRelativeTypes);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addTypesPR( theCtxt, theTypes);
    }

      // Get length of Types array
    int aTypesLength = someTypes.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aTypesLength) {
      addTypesPR( theCtxt, theTypes);
    }

      // Check for new Types already in collection
    if( hasTypesPR( theCtxt, theTypes)) { return;}


    com.dosmil_e.m3.core.priv.M3TypePriv aNewTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theTypes;

      // Link reverse ref to this object
    aNewTypes.unsetAndSetModulePrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship Types
      // Grow collection and add new Types element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aTypesLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someTypes, 0, otherTypes, 0, aRelativeIndex );
      }
      System.arraycopy( someTypes, aRelativeIndex, otherTypes, aRelativeIndex + 1, aTypesLength - aRelativeIndex);
      otherTypes[ aRelativeIndex] = aNewTypes;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypesBefore", null); return;}

      // Set the new collection
    setTypesPrivileged( theCtxt, otherTypes);
  }





    /* Public Write accessor for role Types
     */
  public void removeTypesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException {

      // Do not add null values to the collection
    if( theTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someTypes = getTypesPrivileged( theCtxt);
    if( someTypes == null) { return;}

      // Check for new Types not in collection
    int aTypesLength = someTypes.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aTypesLength ; anIndex++) {
      if( theTypes.sameAs( theCtxt, someTypes[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.core.priv.M3TypePriv aNewTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theTypes;

      // Unlink reverse ref from the new related object
    aNewTypes.unsetModulePrivileged( theCtxt);

      // Shrink collection removing Types element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aTypesLength - 1];
    try {
      System.arraycopy( someTypes, 0, otherTypes, 0, aFoundIndex);
      System.arraycopy( someTypes, aFoundIndex + 1, otherTypes, aFoundIndex, aTypesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypes", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypes", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypes", null); return;}

      // Set the new collection
    setTypesPrivileged( theCtxt, otherTypes);
  }




    /* Public reorder accessor for role Types
     */
  public void moveTypesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes, com.dosmil_e.m3.core.ifc.M3TypeIfc theRelativeTypes) throws EAIException {

      // Null value is nothing to move
    if( theTypes == null) { return;}

      // If relative Types is null, perform move to last position
    if( theRelativeTypes == null) {
      moveTypesToLastPR( theCtxt, theTypes);
    }

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someTypes = getTypesPrivileged( theCtxt);
    if( someTypes == null) { return;}

      // Get length of Types array
    int aTypesLength = someTypes.length;

      // Get index of Types to move
    int aToMoveIndex = indexOfTypesPR( theCtxt, theTypes);
      // If toMove Types not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aTypesLength) {
      moveTypesToLastPR( theCtxt, theTypes);
    }

      // Get index of relative Types
    int aRelativeIndex = indexOfTypesPR( theCtxt, theRelativeTypes);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveTypesToLastPR( theCtxt, theTypes);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aTypesLength) {
      moveTypesToLastPR( theCtxt, theTypes);
    }

      // ToMove and relative Types are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.core.priv.M3TypePriv aToMoveTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theTypes;

      // Allocate new array for new version of state of relationship Types
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aTypesLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someTypes, 0, otherTypes, 0, aToMoveIndex );
        System.arraycopy( someTypes, aToMoveIndex + 1, otherTypes, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherTypes[ aRelativeIndex - 1] = aToMoveTypes;
        System.arraycopy( someTypes, aRelativeIndex, otherTypes, aRelativeIndex, aTypesLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someTypes, 0, otherTypes, 0, aRelativeIndex );
        otherTypes[ aRelativeIndex ] = aToMoveTypes;
        System.arraycopy( someTypes, aRelativeIndex, otherTypes, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aTypesLength - 1) {
          System.arraycopy( someTypes, aToMoveIndex + 1, otherTypes, aToMoveIndex + 1, aTypesLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypesBefore", null); return;}

      // Set the new collection
    setTypesPrivileged( theCtxt, otherTypes);
  }





    /* Public move to last accessor for role Types
     */
  public void moveTypesToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3TypeIfc theTypes) throws EAIException {

      // Null value is nothing to move
    if( theTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someTypes = getTypesPrivileged( theCtxt);
    if( someTypes == null) { return;}

      // Get length of Types array
    int aTypesLength = someTypes.length;

      // Get index of Types to move
    int aToMoveIndex = indexOfTypesPR( theCtxt, theTypes);

      // If toMove Types not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aTypesLength - 1) { return;}

    com.dosmil_e.m3.core.priv.M3TypePriv aToMoveTypes = (com.dosmil_e.m3.core.priv.M3TypePriv) theTypes;

      // Allocate new array for new version of state of relationship Types
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aTypesLength];
    try {
      System.arraycopy( someTypes, 0, otherTypes, 0, aToMoveIndex );
      System.arraycopy( someTypes, aToMoveIndex + 1, otherTypes, aToMoveIndex, aTypesLength - aToMoveIndex - 1);
      otherTypes[ aTypesLength - 1] = aToMoveTypes;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypesToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypesToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveTypesToLast", null); return;}

      // Set the new collection
    setTypesPrivileged( theCtxt, otherTypes);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship Types
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role Types
     */
  public void addTypesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theTypes) throws EAIException {

      // Do not add null values to the collection
    if( theTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someTypes = getTypesPrivileged( theCtxt);
    if( someTypes == null) { return;}

      // Check for new Types already in collection
    int aTypesLength = someTypes.length;
    for( int anIndex = 0 ; anIndex < aTypesLength ; anIndex++) {
      if( theTypes.sameAs( theCtxt, someTypes[ anIndex])) { return;}
    }

      // Grow collection and add new Types element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aTypesLength + 1];
    try {
      System.arraycopy( someTypes, 0, otherTypes, 0, aTypesLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypesPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypesPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addTypesPrivileged", null); return;}

    otherTypes[ aTypesLength] = theTypes;

      // Set the new collection
    setTypesPrivileged( theCtxt, otherTypes);
  }









    /* Privileged Write accessor for role Types
     */
  public void removeTypesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv theTypes) throws EAIException {

      // Do not add null values to the collection
    if( theTypes == null) { return;}

      // Get current value
    com.dosmil_e.m3.core.priv.M3TypePriv[] someTypes = getTypesPrivileged( theCtxt);
    if( someTypes == null) { return;}

      // Check for new Types not in collection
    int aTypesLength = someTypes.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aTypesLength ; anIndex++) {
      if( theTypes.sameAs( theCtxt, someTypes[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing Types element
    com.dosmil_e.m3.core.priv.M3TypePriv[] otherTypes = new com.dosmil_e.m3.core.priv.M3TypePriv[ aTypesLength - 1];
    try {
      System.arraycopy( someTypes, 0, otherTypes, 0, aFoundIndex);
      System.arraycopy( someTypes, aFoundIndex + 1, otherTypes, aFoundIndex, aTypesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3TypePriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3TypePriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeTypesPrivileged", new Class[] { com.dosmil_e.m3.core.priv.M3TypePriv.class}); return;}

      // Set the new collection
    setTypesPrivileged( theCtxt, otherTypes);
  }






    /* Privileged Read accessor for role Types
     * Guaranteed to return object with same identity of the Types
     */
  public com.dosmil_e.m3.core.priv.M3TypePriv[] getTypesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrTypes;
  }




    /* Set reference in role Types
     * Used by relationship maintenance machinery
     */
  public void setTypesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3TypePriv[] theTypesCollection) throws EAIException {
    com.dosmil_e.m3.core.priv.M3TypePriv[] aTypes = vrTypes;
    vrTypes = theTypesCollection;
      // Propagate change
    change( theCtxt, "Types", aTypes, vrTypes, "vrTypes");
  }








/****************************************************************************
 *  Implementation of  internal destructor of M3Module
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 

 
    // When deleting unlink related SuperModule
  setSuperModule( theCtxt, null);


      // When deleting : delete related SubModules
    com.dosmil_e.m3.core.ifc.M3ModuleIfc[] someSubModules = getSubModules( theCtxt);
    if( someSubModules != null) {
      int aSubModulesLength = someSubModules.length;
      for( int anIndex = 0 ; anIndex < aSubModulesLength ; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3ModuleIfc aSubModules = someSubModules[ anIndex];
        if( aSubModules != null) {
          com.dosmil_e.m3.core.impl.M3ModuleImpl aSubModulesImpl = null;
          try { aSubModulesImpl = (com.dosmil_e.m3.core.impl.M3ModuleImpl) aSubModules;} catch( ClassCastException anEx) {}
          if( aSubModulesImpl != null) {
            aSubModulesImpl.delete( theCtxt);
          }
        }
      }
    }
    

      // When deleting : delete related Types
    com.dosmil_e.m3.core.ifc.M3TypeIfc[] someTypes = getTypes( theCtxt);
    if( someTypes != null) {
      int aTypesLength = someTypes.length;
      for( int anIndex = 0 ; anIndex < aTypesLength ; anIndex++) {
        com.dosmil_e.m3.core.ifc.M3TypeIfc aTypes = someTypes[ anIndex];
        if( aTypes != null) {
          com.dosmil_e.m3.core.impl.M3TypeImpl aTypesImpl = null;
          try { aTypesImpl = (com.dosmil_e.m3.core.impl.M3TypeImpl) aTypes;} catch( ClassCastException anEx) {}
          if( aTypesImpl != null) {
            aTypesImpl.delete( theCtxt);
          }
        }
      }
    }
    


  }





/****************************************************************************
 *  Support
 ****************************************************************************/




/****************************************************************************
 *  Access and initialization of metainformation the metamodel element
 *    for initialization, delegates on the model's metamodel root, that will
 *    invoke metainfo initializers (phase1, phase2) on all the metamodel elements
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc getStaticM3Type( EAIMMCtxtIfc theCtxt) {
    if( vm3Type == null) {
      vm3Type = com.dosmil_e.m3.core.meta.M3ModuleMeta.getStaticM3Type( theCtxt);
    }
    return vm3Type;
  }


/****************************************************************************
 *  Access to metainformation for Type of the metamodel element
 ****************************************************************************/
  public com.dosmil_e.m3.core.ifc.M3TypeIfc getM3Type( EAIMMCtxtIfc theCtxt) {
    return getStaticM3Type( theCtxt);
  }



/****************************************************************************
 *  Implementation of restoreValue method (such that it has access to protected fields)
 ****************************************************************************/
    // Restore a value on this metamodel element
  protected boolean restoreValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToRestore,
    String          theFieldName) {

    if( theCtxt == null)        { return true;}
    if( theFieldName == null)   { return true;}

    if( EAIFlatTransactionMgrIfc.sLogTransactionBoundaries) {

      String aSourceName = new String("null");
      String aSourceClassName = new String();
      EAIMMNameIfc aName = null;
      try { aName = getName();} catch( EAIException anEx) {}
      if( aName != null) {
        aSourceName = aName.getString();
      }
      aSourceClassName = getClass().getName();

      System.out.println("--- Restoring field : " + theFieldName + " in element named " + aSourceName + " class " + aSourceClassName);
    }

    if( theFieldName.equals( sExistencePropertyName)) { return true;}

    Field aField = getField( theFieldName);
    if( aField == null) { return false;}

    Class aFieldType = aField.getType();
    if( aFieldType == null) { return false;}

    if( !aFieldType.isPrimitive()) {
      try { aField.set( this, theValueToRestore);}
      catch( IllegalArgumentException anException) { return false;}
      catch( IllegalAccessException anException) { return false;}
    }
    else {
      String aFieldTypeName = aFieldType.getName();

      if( aFieldTypeName.equals( int.class.getName())) {
        Integer aValueObject = null;
        try { aValueObject = (Integer) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        int aValue = aValueObject.intValue();
        try { aField.setInt( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
      if( aFieldTypeName.equals( boolean.class.getName())) {
        Boolean aValueObject = null;
        try { aValueObject = (Boolean) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        boolean aValue = aValueObject.booleanValue();

        try { aField.setBoolean( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
      if( aFieldTypeName.equals( float.class.getName())) {
        Float aValueObject = null;
        try { aValueObject = (Float) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        float aValue = aValueObject.floatValue();

        try { aField.setFloat( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
      if( aFieldTypeName.equals( double.class.getName())) {
        Double aValueObject = null;
        try { aValueObject = (Double) theValueToRestore;} catch( ClassCastException anException) {}
        if( aValueObject == null) { return false;}
        double aValue = aValueObject.doubleValue();
        try { aField.setDouble( this, aValue);}
        catch( IllegalArgumentException anException) { return false;}
        catch( IllegalAccessException anException) { return false;}
      }
      else {
        return false;
      }}}}
    }

    return true;
  }

/****************************************************************************
 *  Implementations of getFieldValue method (such that it has access to protected fields)
 ****************************************************************************/

    // Get a value from a field of this  metamodel element
  public Object getFieldValue(
    EAIMMCtxtIfc    theCtxt,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return null;}
    if( theField == null)       { return null;}

    Object aValue = null;
    try { aValue = theField.get( this);}
    catch( IllegalArgumentException anException) { return null;}
    catch( IllegalAccessException anException) { return null;}
    catch( NullPointerException anException) { return null;}
    catch( ExceptionInInitializerError anException) { return null;}

    return aValue;
  }





/****************************************************************************
 *  Implementations of setFieldToXXX method (such that it has access to protected fields)
 ****************************************************************************/
    // Aux for log
  protected void logSetField(
    EAIMMCtxtIfc    theCtxt,
    String          theFieldKind,
    Field           theField) {

    if( !EAIFlatTransactionMgrIfc.sLogTransactionBoundaries) { return;}


    String aSourceName = new String("null");
    String aSourceClassName = new String();
    EAIMMNameIfc aName = null;
    try { aName = getName();} catch( EAIException anEx) {}
    if( aName != null) {
      aSourceName = aName.getString();
    }
    aSourceClassName = getClass().getName();

    System.out.println("--- SettingField " + theFieldKind + " field : " + theField.getName() + " in element named " + aSourceName + " class " + aSourceClassName);
  }


    // Restore a value on this metamodel element
  public boolean setFieldToNonPrimitiveValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)       { return true;}

    logSetField( theCtxt, "Non Primitive", theField);

    try { theField.set( this, theValueToSet);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}
    return true;
  }


  public boolean setFieldToPrimitiveIntValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)       { return true;}

    logSetField( theCtxt, "Primitive int", theField);

    Integer aValueObject = null;
    try { aValueObject = (Integer) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    int aValue = aValueObject.intValue();

    try { theField.setInt( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }






  public boolean setFieldToPrimitiveBoolValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField) throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)       { return true;}

    logSetField( theCtxt, "Primitive boolean", theField);

    Boolean aValueObject = null;
    try { aValueObject = (Boolean) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    boolean aValue = aValueObject.booleanValue();

    try { theField.setBoolean( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }









  public boolean setFieldToPrimitiveFloatValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField)  throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)   { return true;}


    logSetField( theCtxt, "Primitive float", theField);

    Float aValueObject = null;
    try { aValueObject = (Float) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    float aValue = aValueObject.floatValue();

    try { theField.setFloat( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }






  public boolean setFieldToPrimitiveDoubleValue(
    EAIMMCtxtIfc    theCtxt,
    Object          theValueToSet,
    Field           theField)  throws EAIException {

    if( theCtxt == null)        { return true;}
    if( theField == null)   { return true;}


    logSetField( theCtxt, "Primitive double", theField);

    Double aValueObject = null;
    try { aValueObject = (Double) theValueToSet;} catch( ClassCastException anException) {}
    if( aValueObject == null) { return false;}
    double aValue = aValueObject.doubleValue();

    try { theField.setDouble( this, aValue);}
    catch( IllegalArgumentException anException) { return false;}
    catch( IllegalAccessException anException) { return false;}

    return true;
  }



/****************************************************************************
 *  Serialization support
 ****************************************************************************/

  private static final long serialVersionUID = -1234123456300000003L;


}


