package com.dosmil_e.m3.traversal.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3TraversalConfigBase
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3TraversalConfig metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the M3TraversalConfig metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] vrRootTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] vrBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] vrNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] vrAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] vrConfigOverrides = new com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[0]; 

	protected com.dosmil_e.m3.core.priv.M3ModelPriv vrModel; 

	protected com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] vrFieldMgrs = new com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] vrBranchMgrs = new com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] vrNodeMgrs = new com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[0]; 






/****************************************************************************
 *  Constructors of the M3TraversalConfig metamodel element
 ****************************************************************************/

  public M3TraversalConfigBase() {
    super();
  }


  public M3TraversalConfigBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3TraversalConfigBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3TraversalConfigIfc and M3TraversalConfigPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3TraversalConfig
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of M3TraversalConfig
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship RootTypeNodeConfigs
 ****************************************************************************/


    /* Public Read accessor for role RootTypeNodeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] getRootTypeNodeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getRootTypeNodeConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getRootTypeNodeConfigsPR( theCtxt);
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

    /* Public RootTypeNodeConfigs number access
     */
  public int numRootTypeNodeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numRootTypeNodeConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numRootTypeNodeConfigsPR( theCtxt);
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



    /* Public RootTypeNodeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc getRootTypeNodeConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getRootTypeNodeConfigsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getRootTypeNodeConfigsAtPR( theCtxt, theIndex);
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


    /* Public RootTypeNodeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc findRootTypeNodeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findRootTypeNodeConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findRootTypeNodeConfigsNamedPR( theCtxt, theMMName);
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




    /* Public RootTypeNodeConfigs is related predicate
     */
  public boolean hasRootTypeNodeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasRootTypeNodeConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasRootTypeNodeConfigsNamedPR( theCtxt, theMMName);
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



    /* Transactional RootTypeNodeConfigs is related  predicate
     */
  public boolean hasRootTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs);
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


    /* Public RootTypeNodeConfigs index access
     */
  public int indexOfRootTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs);
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
  public void addRootTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs);
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
  public void addRootTypeNodeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRelativeRootTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addRootTypeNodeConfigsBeforePR( theCtxt, theRootTypeNodeConfigs, theRelativeRootTypeNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addRootTypeNodeConfigsBeforePR( theCtxt, theRootTypeNodeConfigs, theRelativeRootTypeNodeConfigs);
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





    /* Transactional Public Write Remove accessor for role RootTypeNodeConfigs
     */
  public void removeRootTypeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs);
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



    /* Public reorder accessor for role RootTypeNodeConfigs
     */
  public void moveRootTypeNodeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRelativeRootTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveRootTypeNodeConfigsBeforePR( theCtxt, theRootTypeNodeConfigs, theRelativeRootTypeNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveRootTypeNodeConfigsBeforePR( theCtxt, theRootTypeNodeConfigs, theRelativeRootTypeNodeConfigs);
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



    /* Public reorder accessor for role RootTypeNodeConfigs
     */
  public void moveRootTypeNodeConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveRootTypeNodeConfigsToLastPR( theCtxt, theRootTypeNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveRootTypeNodeConfigsToLastPR( theCtxt, theRootTypeNodeConfigs);
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
 *  Implementation of internal operations for relationship RootTypeNodeConfigs
 ****************************************************************************/


    /* Public Read accessor for role RootTypeNodeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] getRootTypeNodeConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] someRootTypeNodeConfigs = getRootTypeNodeConfigsPrivileged( theCtxt);
    if( someRootTypeNodeConfigs == null) { return null;}

    int aRootTypeNodeConfigsLength = someRootTypeNodeConfigs.length;
    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] otherRootTypeNodeConfigs = new com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[ aRootTypeNodeConfigsLength];
    try { System.arraycopy( someRootTypeNodeConfigs, 0, otherRootTypeNodeConfigs, 0, aRootTypeNodeConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getRootTypeNodeConfigs", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getRootTypeNodeConfigs", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getRootTypeNodeConfigs", null); return null;}


    return otherRootTypeNodeConfigs;
  }



    /* Public RootTypeNodeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc findRootTypeNodeConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] someRootTypeNodeConfigs = getRootTypeNodeConfigsPrivileged( theCtxt);
    if( someRootTypeNodeConfigs == null) { return null;}

      // Check for new RootTypeNodeConfigs already in collection
    int aRootTypeNodeConfigsLength = someRootTypeNodeConfigs.length;
    for( int anIndex = 0 ; anIndex < aRootTypeNodeConfigsLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv aRootTypeNodeConfigs = someRootTypeNodeConfigs[ anIndex];
      if( aRootTypeNodeConfigs.sameNameAs( theCtxt, theMMName)) { return aRootTypeNodeConfigs;}
    }
    return null;
  }



    /* Public RootTypeNodeConfigs finder predicate by name
     */
  public boolean hasRootTypeNodeConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findRootTypeNodeConfigsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public RootTypeNodeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc getRootTypeNodeConfigsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] someRootTypeNodeConfigs = getRootTypeNodeConfigsPrivileged( theCtxt);
    if( someRootTypeNodeConfigs == null) { return null;}

      // Get number of RootTypeNodeConfigs
    int aRootTypeNodeConfigsLength = someRootTypeNodeConfigs.length;

      // Verify index within array length
    if( theIndex >= aRootTypeNodeConfigsLength) { return null;}

      // Get indexed RootTypeNodeConfigs
    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc aRootTypeNodeConfigs = someRootTypeNodeConfigs[ theIndex];

    return aRootTypeNodeConfigs;
  }



    /* Public RootTypeNodeConfigs is related predicate
     */
  public boolean hasRootTypeNodeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException {
    return indexOfRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs) >= 0;
  }


    /* Public RootTypeNodeConfigs index access
     */
  public int indexOfRootTypeNodeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException {
      // Do not add null values to the collection
    if( theRootTypeNodeConfigs == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] someRootTypeNodeConfigs = getRootTypeNodeConfigsPrivileged( theCtxt);
    if( someRootTypeNodeConfigs == null) { return -1;}

      // Check for new RootTypeNodeConfigs already in collection
    int aRootTypeNodeConfigsLength = someRootTypeNodeConfigs.length;
    for( int anIndex = 0 ; anIndex < aRootTypeNodeConfigsLength ; anIndex++) {
      if( someRootTypeNodeConfigs[ anIndex].sameAs( theCtxt, theRootTypeNodeConfigs)) { return anIndex;}
    }
    return -1;
  }


    /* Public RootTypeNodeConfigs number access
     */
  public int numRootTypeNodeConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] someRootTypeNodeConfigs = getRootTypeNodeConfigsPrivileged( theCtxt);
    if( someRootTypeNodeConfigs == null) { return 0;}

      // Check for new RootTypeNodeConfigs already in collection
    int aRootTypeNodeConfigsLength = someRootTypeNodeConfigs.length;
    return aRootTypeNodeConfigsLength;
  }




    /* Public Write accessor for role RootTypeNodeConfigs
     */
  public void addRootTypeNodeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theRootTypeNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] someRootTypeNodeConfigs = getRootTypeNodeConfigsPrivileged( theCtxt);
    if( someRootTypeNodeConfigs == null) { return;}

      // Check for new RootTypeNodeConfigs already in collection
    int aRootTypeNodeConfigsLength = someRootTypeNodeConfigs.length;
    for( int anIndex = 0 ; anIndex < aRootTypeNodeConfigsLength ; anIndex++) {
      if( theRootTypeNodeConfigs.sameAs( theCtxt, someRootTypeNodeConfigs[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv aNewRootTypeNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv) theRootTypeNodeConfigs;

      // Link reverse ref to this object
    aNewRootTypeNodeConfigs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Grow collection and add new RootTypeNodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] otherRootTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[ aRootTypeNodeConfigsLength + 1];
    try { System.arraycopy( someRootTypeNodeConfigs, 0, otherRootTypeNodeConfigs, 0, aRootTypeNodeConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRootTypeNodeConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRootTypeNodeConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRootTypeNodeConfigs", null); return;}
    otherRootTypeNodeConfigs[ aRootTypeNodeConfigsLength] = aNewRootTypeNodeConfigs;

      // Set the new collection
    setRootTypeNodeConfigsPrivileged( theCtxt, otherRootTypeNodeConfigs);
  }




    /* Public ordered Write accessor for role RootTypeNodeConfigs
     */
  public void addRootTypeNodeConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRelativeRootTypeNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theRootTypeNodeConfigs == null) { return;}

      // If relative RootTypeNodeConfigs is null, perform normal add operation
    if( theRelativeRootTypeNodeConfigs == null) {
      addRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] someRootTypeNodeConfigs = getRootTypeNodeConfigsPrivileged( theCtxt);
    if( someRootTypeNodeConfigs == null) { return;}


      // Get index of relative RootTypeNodeConfigs
    int aRelativeIndex = indexOfRootTypeNodeConfigsPR( theCtxt, theRelativeRootTypeNodeConfigs);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs);
    }

      // Get length of RootTypeNodeConfigs array
    int aRootTypeNodeConfigsLength = someRootTypeNodeConfigs.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aRootTypeNodeConfigsLength) {
      addRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs);
    }

      // Check for new RootTypeNodeConfigs already in collection
    if( hasRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs)) { return;}


    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv aNewRootTypeNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv) theRootTypeNodeConfigs;

      // Link reverse ref to this object
    aNewRootTypeNodeConfigs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship RootTypeNodeConfigs
      // Grow collection and add new RootTypeNodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] otherRootTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[ aRootTypeNodeConfigsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someRootTypeNodeConfigs, 0, otherRootTypeNodeConfigs, 0, aRelativeIndex );
      }
      System.arraycopy( someRootTypeNodeConfigs, aRelativeIndex, otherRootTypeNodeConfigs, aRelativeIndex + 1, aRootTypeNodeConfigsLength - aRelativeIndex);
      otherRootTypeNodeConfigs[ aRelativeIndex] = aNewRootTypeNodeConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRootTypeNodeConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRootTypeNodeConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRootTypeNodeConfigsBefore", null); return;}

      // Set the new collection
    setRootTypeNodeConfigsPrivileged( theCtxt, otherRootTypeNodeConfigs);
  }





    /* Public Write accessor for role RootTypeNodeConfigs
     */
  public void removeRootTypeNodeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theRootTypeNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] someRootTypeNodeConfigs = getRootTypeNodeConfigsPrivileged( theCtxt);
    if( someRootTypeNodeConfigs == null) { return;}

      // Check for new RootTypeNodeConfigs not in collection
    int aRootTypeNodeConfigsLength = someRootTypeNodeConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aRootTypeNodeConfigsLength ; anIndex++) {
      if( theRootTypeNodeConfigs.sameAs( theCtxt, someRootTypeNodeConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv aNewRootTypeNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv) theRootTypeNodeConfigs;

      // Unlink reverse ref from the new related object
    aNewRootTypeNodeConfigs.unsetTraversalConfigPrivileged( theCtxt);

      // Shrink collection removing RootTypeNodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] otherRootTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[ aRootTypeNodeConfigsLength - 1];
    try {
      System.arraycopy( someRootTypeNodeConfigs, 0, otherRootTypeNodeConfigs, 0, aFoundIndex);
      System.arraycopy( someRootTypeNodeConfigs, aFoundIndex + 1, otherRootTypeNodeConfigs, aFoundIndex, aRootTypeNodeConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRootTypeNodeConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRootTypeNodeConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRootTypeNodeConfigs", null); return;}

      // Set the new collection
    setRootTypeNodeConfigsPrivileged( theCtxt, otherRootTypeNodeConfigs);
  }




    /* Public reorder accessor for role RootTypeNodeConfigs
     */
  public void moveRootTypeNodeConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRelativeRootTypeNodeConfigs) throws EAIException {

      // Null value is nothing to move
    if( theRootTypeNodeConfigs == null) { return;}

      // If relative RootTypeNodeConfigs is null, perform move to last position
    if( theRelativeRootTypeNodeConfigs == null) {
      moveRootTypeNodeConfigsToLastPR( theCtxt, theRootTypeNodeConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] someRootTypeNodeConfigs = getRootTypeNodeConfigsPrivileged( theCtxt);
    if( someRootTypeNodeConfigs == null) { return;}

      // Get length of RootTypeNodeConfigs array
    int aRootTypeNodeConfigsLength = someRootTypeNodeConfigs.length;

      // Get index of RootTypeNodeConfigs to move
    int aToMoveIndex = indexOfRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs);
      // If toMove RootTypeNodeConfigs not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aRootTypeNodeConfigsLength) {
      moveRootTypeNodeConfigsToLastPR( theCtxt, theRootTypeNodeConfigs);
    }

      // Get index of relative RootTypeNodeConfigs
    int aRelativeIndex = indexOfRootTypeNodeConfigsPR( theCtxt, theRelativeRootTypeNodeConfigs);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveRootTypeNodeConfigsToLastPR( theCtxt, theRootTypeNodeConfigs);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aRootTypeNodeConfigsLength) {
      moveRootTypeNodeConfigsToLastPR( theCtxt, theRootTypeNodeConfigs);
    }

      // ToMove and relative RootTypeNodeConfigs are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv aToMoveRootTypeNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv) theRootTypeNodeConfigs;

      // Allocate new array for new version of state of relationship RootTypeNodeConfigs
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] otherRootTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[ aRootTypeNodeConfigsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someRootTypeNodeConfigs, 0, otherRootTypeNodeConfigs, 0, aToMoveIndex );
        System.arraycopy( someRootTypeNodeConfigs, aToMoveIndex + 1, otherRootTypeNodeConfigs, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherRootTypeNodeConfigs[ aRelativeIndex - 1] = aToMoveRootTypeNodeConfigs;
        System.arraycopy( someRootTypeNodeConfigs, aRelativeIndex, otherRootTypeNodeConfigs, aRelativeIndex, aRootTypeNodeConfigsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someRootTypeNodeConfigs, 0, otherRootTypeNodeConfigs, 0, aRelativeIndex );
        otherRootTypeNodeConfigs[ aRelativeIndex ] = aToMoveRootTypeNodeConfigs;
        System.arraycopy( someRootTypeNodeConfigs, aRelativeIndex, otherRootTypeNodeConfigs, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aRootTypeNodeConfigsLength - 1) {
          System.arraycopy( someRootTypeNodeConfigs, aToMoveIndex + 1, otherRootTypeNodeConfigs, aToMoveIndex + 1, aRootTypeNodeConfigsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRootTypeNodeConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRootTypeNodeConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRootTypeNodeConfigsBefore", null); return;}

      // Set the new collection
    setRootTypeNodeConfigsPrivileged( theCtxt, otherRootTypeNodeConfigs);
  }





    /* Public move to last accessor for role RootTypeNodeConfigs
     */
  public void moveRootTypeNodeConfigsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc theRootTypeNodeConfigs) throws EAIException {

      // Null value is nothing to move
    if( theRootTypeNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] someRootTypeNodeConfigs = getRootTypeNodeConfigsPrivileged( theCtxt);
    if( someRootTypeNodeConfigs == null) { return;}

      // Get length of RootTypeNodeConfigs array
    int aRootTypeNodeConfigsLength = someRootTypeNodeConfigs.length;

      // Get index of RootTypeNodeConfigs to move
    int aToMoveIndex = indexOfRootTypeNodeConfigsPR( theCtxt, theRootTypeNodeConfigs);

      // If toMove RootTypeNodeConfigs not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aRootTypeNodeConfigsLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv aToMoveRootTypeNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv) theRootTypeNodeConfigs;

      // Allocate new array for new version of state of relationship RootTypeNodeConfigs
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] otherRootTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[ aRootTypeNodeConfigsLength];
    try {
      System.arraycopy( someRootTypeNodeConfigs, 0, otherRootTypeNodeConfigs, 0, aToMoveIndex );
      System.arraycopy( someRootTypeNodeConfigs, aToMoveIndex + 1, otherRootTypeNodeConfigs, aToMoveIndex, aRootTypeNodeConfigsLength - aToMoveIndex - 1);
      otherRootTypeNodeConfigs[ aRootTypeNodeConfigsLength - 1] = aToMoveRootTypeNodeConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRootTypeNodeConfigsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRootTypeNodeConfigsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveRootTypeNodeConfigsToLast", null); return;}

      // Set the new collection
    setRootTypeNodeConfigsPrivileged( theCtxt, otherRootTypeNodeConfigs);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship RootTypeNodeConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role RootTypeNodeConfigs
     */
  public void addRootTypeNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv theRootTypeNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theRootTypeNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] someRootTypeNodeConfigs = getRootTypeNodeConfigsPrivileged( theCtxt);
    if( someRootTypeNodeConfigs == null) { return;}

      // Check for new RootTypeNodeConfigs already in collection
    int aRootTypeNodeConfigsLength = someRootTypeNodeConfigs.length;
    for( int anIndex = 0 ; anIndex < aRootTypeNodeConfigsLength ; anIndex++) {
      if( theRootTypeNodeConfigs.sameAs( theCtxt, someRootTypeNodeConfigs[ anIndex])) { return;}
    }

      // Grow collection and add new RootTypeNodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] otherRootTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[ aRootTypeNodeConfigsLength + 1];
    try {
      System.arraycopy( someRootTypeNodeConfigs, 0, otherRootTypeNodeConfigs, 0, aRootTypeNodeConfigsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRootTypeNodeConfigsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRootTypeNodeConfigsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addRootTypeNodeConfigsPrivileged", null); return;}

    otherRootTypeNodeConfigs[ aRootTypeNodeConfigsLength] = theRootTypeNodeConfigs;

      // Set the new collection
    setRootTypeNodeConfigsPrivileged( theCtxt, otherRootTypeNodeConfigs);
  }









    /* Privileged Write accessor for role RootTypeNodeConfigs
     */
  public void removeRootTypeNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv theRootTypeNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theRootTypeNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] someRootTypeNodeConfigs = getRootTypeNodeConfigsPrivileged( theCtxt);
    if( someRootTypeNodeConfigs == null) { return;}

      // Check for new RootTypeNodeConfigs not in collection
    int aRootTypeNodeConfigsLength = someRootTypeNodeConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aRootTypeNodeConfigsLength ; anIndex++) {
      if( theRootTypeNodeConfigs.sameAs( theCtxt, someRootTypeNodeConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing RootTypeNodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] otherRootTypeNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[ aRootTypeNodeConfigsLength - 1];
    try {
      System.arraycopy( someRootTypeNodeConfigs, 0, otherRootTypeNodeConfigs, 0, aFoundIndex);
      System.arraycopy( someRootTypeNodeConfigs, aFoundIndex + 1, otherRootTypeNodeConfigs, aFoundIndex, aRootTypeNodeConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRootTypeNodeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRootTypeNodeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeRootTypeNodeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv.class}); return;}

      // Set the new collection
    setRootTypeNodeConfigsPrivileged( theCtxt, otherRootTypeNodeConfigs);
  }






    /* Privileged Read accessor for role RootTypeNodeConfigs
     * Guaranteed to return object with same identity of the RootTypeNodeConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] getRootTypeNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrRootTypeNodeConfigs;
  }




    /* Set reference in role RootTypeNodeConfigs
     * Used by relationship maintenance machinery
     */
  public void setRootTypeNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] theRootTypeNodeConfigsCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3RootTypeNodeConfigPriv[] aRootTypeNodeConfigs = vrRootTypeNodeConfigs;
    vrRootTypeNodeConfigs = theRootTypeNodeConfigsCollection;
      // Propagate change
    change( theCtxt, "RootTypeNodeConfigs", aRootTypeNodeConfigs, vrRootTypeNodeConfigs, "vrRootTypeNodeConfigs");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship BranchConfigs
 ****************************************************************************/


    /* Public Read accessor for role BranchConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getBranchConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getBranchConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getBranchConfigsPR( theCtxt);
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

    /* Public BranchConfigs number access
     */
  public int numBranchConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numBranchConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numBranchConfigsPR( theCtxt);
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



    /* Public BranchConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc getBranchConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getBranchConfigsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getBranchConfigsAtPR( theCtxt, theIndex);
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


    /* Public BranchConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc findBranchConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findBranchConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findBranchConfigsNamedPR( theCtxt, theMMName);
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




    /* Public BranchConfigs is related predicate
     */
  public boolean hasBranchConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasBranchConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasBranchConfigsNamedPR( theCtxt, theMMName);
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



    /* Transactional BranchConfigs is related  predicate
     */
  public boolean hasBranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasBranchConfigsPR( theCtxt, theBranchConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasBranchConfigsPR( theCtxt, theBranchConfigs);
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


    /* Public BranchConfigs index access
     */
  public int indexOfBranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfBranchConfigsPR( theCtxt, theBranchConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfBranchConfigsPR( theCtxt, theBranchConfigs);
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
  public void addBranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addBranchConfigsPR( theCtxt, theBranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addBranchConfigsPR( theCtxt, theBranchConfigs);
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
  public void addBranchConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addBranchConfigsBeforePR( theCtxt, theBranchConfigs, theRelativeBranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addBranchConfigsBeforePR( theCtxt, theBranchConfigs, theRelativeBranchConfigs);
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





    /* Transactional Public Write Remove accessor for role BranchConfigs
     */
  public void removeBranchConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeBranchConfigsPR( theCtxt, theBranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeBranchConfigsPR( theCtxt, theBranchConfigs);
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



    /* Public reorder accessor for role BranchConfigs
     */
  public void moveBranchConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveBranchConfigsBeforePR( theCtxt, theBranchConfigs, theRelativeBranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveBranchConfigsBeforePR( theCtxt, theBranchConfigs, theRelativeBranchConfigs);
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



    /* Public reorder accessor for role BranchConfigs
     */
  public void moveBranchConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveBranchConfigsToLastPR( theCtxt, theBranchConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveBranchConfigsToLastPR( theCtxt, theBranchConfigs);
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
 *  Implementation of internal operations for relationship BranchConfigs
 ****************************************************************************/


    /* Public Read accessor for role BranchConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getBranchConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return null;}

    int aBranchConfigsLength = someBranchConfigs.length;
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] otherBranchConfigs = new com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[ aBranchConfigsLength];
    try { System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aBranchConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getBranchConfigs", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getBranchConfigs", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getBranchConfigs", null); return null;}


    return otherBranchConfigs;
  }



    /* Public BranchConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc findBranchConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return null;}

      // Check for new BranchConfigs already in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aBranchConfigs = someBranchConfigs[ anIndex];
      if( aBranchConfigs.sameNameAs( theCtxt, theMMName)) { return aBranchConfigs;}
    }
    return null;
  }



    /* Public BranchConfigs finder predicate by name
     */
  public boolean hasBranchConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findBranchConfigsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public BranchConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc getBranchConfigsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return null;}

      // Get number of BranchConfigs
    int aBranchConfigsLength = someBranchConfigs.length;

      // Verify index within array length
    if( theIndex >= aBranchConfigsLength) { return null;}

      // Get indexed BranchConfigs
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aBranchConfigs = someBranchConfigs[ theIndex];

    return aBranchConfigs;
  }



    /* Public BranchConfigs is related predicate
     */
  public boolean hasBranchConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
    return indexOfBranchConfigsPR( theCtxt, theBranchConfigs) >= 0;
  }


    /* Public BranchConfigs index access
     */
  public int indexOfBranchConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {
      // Do not add null values to the collection
    if( theBranchConfigs == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return -1;}

      // Check for new BranchConfigs already in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
      if( someBranchConfigs[ anIndex].sameAs( theCtxt, theBranchConfigs)) { return anIndex;}
    }
    return -1;
  }


    /* Public BranchConfigs number access
     */
  public int numBranchConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return 0;}

      // Check for new BranchConfigs already in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    return aBranchConfigsLength;
  }




    /* Public Write accessor for role BranchConfigs
     */
  public void addBranchConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}

      // Check for new BranchConfigs already in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
      if( theBranchConfigs.sameAs( theCtxt, someBranchConfigs[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aNewBranchConfigs = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theBranchConfigs;

      // Link reverse ref to this object
    aNewBranchConfigs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Grow collection and add new BranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength + 1];
    try { System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aBranchConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigs", null); return;}
    otherBranchConfigs[ aBranchConfigsLength] = aNewBranchConfigs;

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }




    /* Public ordered Write accessor for role BranchConfigs
     */
  public void addBranchConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeBranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchConfigs == null) { return;}

      // If relative BranchConfigs is null, perform normal add operation
    if( theRelativeBranchConfigs == null) {
      addBranchConfigsPR( theCtxt, theBranchConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}


      // Get index of relative BranchConfigs
    int aRelativeIndex = indexOfBranchConfigsPR( theCtxt, theRelativeBranchConfigs);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addBranchConfigsPR( theCtxt, theBranchConfigs);
    }

      // Get length of BranchConfigs array
    int aBranchConfigsLength = someBranchConfigs.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aBranchConfigsLength) {
      addBranchConfigsPR( theCtxt, theBranchConfigs);
    }

      // Check for new BranchConfigs already in collection
    if( hasBranchConfigsPR( theCtxt, theBranchConfigs)) { return;}


    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aNewBranchConfigs = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theBranchConfigs;

      // Link reverse ref to this object
    aNewBranchConfigs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship BranchConfigs
      // Grow collection and add new BranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aRelativeIndex );
      }
      System.arraycopy( someBranchConfigs, aRelativeIndex, otherBranchConfigs, aRelativeIndex + 1, aBranchConfigsLength - aRelativeIndex);
      otherBranchConfigs[ aRelativeIndex] = aNewBranchConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigsBefore", null); return;}

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }





    /* Public Write accessor for role BranchConfigs
     */
  public void removeBranchConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}

      // Check for new BranchConfigs not in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
      if( theBranchConfigs.sameAs( theCtxt, someBranchConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aNewBranchConfigs = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theBranchConfigs;

      // Unlink reverse ref from the new related object
    aNewBranchConfigs.unsetTraversalConfigPrivileged( theCtxt);

      // Shrink collection removing BranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength - 1];
    try {
      System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aFoundIndex);
      System.arraycopy( someBranchConfigs, aFoundIndex + 1, otherBranchConfigs, aFoundIndex, aBranchConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchConfigs", null); return;}

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }




    /* Public reorder accessor for role BranchConfigs
     */
  public void moveBranchConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeBranchConfigs) throws EAIException {

      // Null value is nothing to move
    if( theBranchConfigs == null) { return;}

      // If relative BranchConfigs is null, perform move to last position
    if( theRelativeBranchConfigs == null) {
      moveBranchConfigsToLastPR( theCtxt, theBranchConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}

      // Get length of BranchConfigs array
    int aBranchConfigsLength = someBranchConfigs.length;

      // Get index of BranchConfigs to move
    int aToMoveIndex = indexOfBranchConfigsPR( theCtxt, theBranchConfigs);
      // If toMove BranchConfigs not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aBranchConfigsLength) {
      moveBranchConfigsToLastPR( theCtxt, theBranchConfigs);
    }

      // Get index of relative BranchConfigs
    int aRelativeIndex = indexOfBranchConfigsPR( theCtxt, theRelativeBranchConfigs);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveBranchConfigsToLastPR( theCtxt, theBranchConfigs);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aBranchConfigsLength) {
      moveBranchConfigsToLastPR( theCtxt, theBranchConfigs);
    }

      // ToMove and relative BranchConfigs are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aToMoveBranchConfigs = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theBranchConfigs;

      // Allocate new array for new version of state of relationship BranchConfigs
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aToMoveIndex );
        System.arraycopy( someBranchConfigs, aToMoveIndex + 1, otherBranchConfigs, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherBranchConfigs[ aRelativeIndex - 1] = aToMoveBranchConfigs;
        System.arraycopy( someBranchConfigs, aRelativeIndex, otherBranchConfigs, aRelativeIndex, aBranchConfigsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aRelativeIndex );
        otherBranchConfigs[ aRelativeIndex ] = aToMoveBranchConfigs;
        System.arraycopy( someBranchConfigs, aRelativeIndex, otherBranchConfigs, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aBranchConfigsLength - 1) {
          System.arraycopy( someBranchConfigs, aToMoveIndex + 1, otherBranchConfigs, aToMoveIndex + 1, aBranchConfigsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchConfigsBefore", null); return;}

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }





    /* Public move to last accessor for role BranchConfigs
     */
  public void moveBranchConfigsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theBranchConfigs) throws EAIException {

      // Null value is nothing to move
    if( theBranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}

      // Get length of BranchConfigs array
    int aBranchConfigsLength = someBranchConfigs.length;

      // Get index of BranchConfigs to move
    int aToMoveIndex = indexOfBranchConfigsPR( theCtxt, theBranchConfigs);

      // If toMove BranchConfigs not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aBranchConfigsLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aToMoveBranchConfigs = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theBranchConfigs;

      // Allocate new array for new version of state of relationship BranchConfigs
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength];
    try {
      System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aToMoveIndex );
      System.arraycopy( someBranchConfigs, aToMoveIndex + 1, otherBranchConfigs, aToMoveIndex, aBranchConfigsLength - aToMoveIndex - 1);
      otherBranchConfigs[ aBranchConfigsLength - 1] = aToMoveBranchConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchConfigsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchConfigsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchConfigsToLast", null); return;}

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship BranchConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role BranchConfigs
     */
  public void addBranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theBranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}

      // Check for new BranchConfigs already in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
      if( theBranchConfigs.sameAs( theCtxt, someBranchConfigs[ anIndex])) { return;}
    }

      // Grow collection and add new BranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength + 1];
    try {
      System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aBranchConfigsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchConfigsPrivileged", null); return;}

    otherBranchConfigs[ aBranchConfigsLength] = theBranchConfigs;

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }









    /* Privileged Write accessor for role BranchConfigs
     */
  public void removeBranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theBranchConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someBranchConfigs = getBranchConfigsPrivileged( theCtxt);
    if( someBranchConfigs == null) { return;}

      // Check for new BranchConfigs not in collection
    int aBranchConfigsLength = someBranchConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
      if( theBranchConfigs.sameAs( theCtxt, someBranchConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing BranchConfigs element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherBranchConfigs = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aBranchConfigsLength - 1];
    try {
      System.arraycopy( someBranchConfigs, 0, otherBranchConfigs, 0, aFoundIndex);
      System.arraycopy( someBranchConfigs, aFoundIndex + 1, otherBranchConfigs, aFoundIndex, aBranchConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv.class}); return;}

      // Set the new collection
    setBranchConfigsPrivileged( theCtxt, otherBranchConfigs);
  }






    /* Privileged Read accessor for role BranchConfigs
     * Guaranteed to return object with same identity of the BranchConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] getBranchConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrBranchConfigs;
  }




    /* Set reference in role BranchConfigs
     * Used by relationship maintenance machinery
     */
  public void setBranchConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] theBranchConfigsCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] aBranchConfigs = vrBranchConfigs;
    vrBranchConfigs = theBranchConfigsCollection;
      // Propagate change
    change( theCtxt, "BranchConfigs", aBranchConfigs, vrBranchConfigs, "vrBranchConfigs");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship NodeConfigs
 ****************************************************************************/


    /* Public Read accessor for role NodeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getNodeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getNodeConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getNodeConfigsPR( theCtxt);
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

    /* Public NodeConfigs number access
     */
  public int numNodeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numNodeConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numNodeConfigsPR( theCtxt);
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



    /* Public NodeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getNodeConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getNodeConfigsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getNodeConfigsAtPR( theCtxt, theIndex);
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


    /* Public NodeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findNodeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findNodeConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findNodeConfigsNamedPR( theCtxt, theMMName);
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




    /* Public NodeConfigs is related predicate
     */
  public boolean hasNodeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasNodeConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasNodeConfigsNamedPR( theCtxt, theMMName);
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



    /* Transactional NodeConfigs is related  predicate
     */
  public boolean hasNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasNodeConfigsPR( theCtxt, theNodeConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasNodeConfigsPR( theCtxt, theNodeConfigs);
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


    /* Public NodeConfigs index access
     */
  public int indexOfNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfNodeConfigsPR( theCtxt, theNodeConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfNodeConfigsPR( theCtxt, theNodeConfigs);
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
  public void addNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addNodeConfigsPR( theCtxt, theNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addNodeConfigsPR( theCtxt, theNodeConfigs);
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
  public void addNodeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addNodeConfigsBeforePR( theCtxt, theNodeConfigs, theRelativeNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addNodeConfigsBeforePR( theCtxt, theNodeConfigs, theRelativeNodeConfigs);
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





    /* Transactional Public Write Remove accessor for role NodeConfigs
     */
  public void removeNodeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeNodeConfigsPR( theCtxt, theNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeNodeConfigsPR( theCtxt, theNodeConfigs);
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



    /* Public reorder accessor for role NodeConfigs
     */
  public void moveNodeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveNodeConfigsBeforePR( theCtxt, theNodeConfigs, theRelativeNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveNodeConfigsBeforePR( theCtxt, theNodeConfigs, theRelativeNodeConfigs);
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



    /* Public reorder accessor for role NodeConfigs
     */
  public void moveNodeConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveNodeConfigsToLastPR( theCtxt, theNodeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveNodeConfigsToLastPR( theCtxt, theNodeConfigs);
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
 *  Implementation of internal operations for relationship NodeConfigs
 ****************************************************************************/


    /* Public Read accessor for role NodeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getNodeConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someNodeConfigs = getNodeConfigsPrivileged( theCtxt);
    if( someNodeConfigs == null) { return null;}

    int aNodeConfigsLength = someNodeConfigs.length;
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] otherNodeConfigs = new com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[ aNodeConfigsLength];
    try { System.arraycopy( someNodeConfigs, 0, otherNodeConfigs, 0, aNodeConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getNodeConfigs", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getNodeConfigs", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getNodeConfigs", null); return null;}


    return otherNodeConfigs;
  }



    /* Public NodeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findNodeConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someNodeConfigs = getNodeConfigsPrivileged( theCtxt);
    if( someNodeConfigs == null) { return null;}

      // Check for new NodeConfigs already in collection
    int aNodeConfigsLength = someNodeConfigs.length;
    for( int anIndex = 0 ; anIndex < aNodeConfigsLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNodeConfigs = someNodeConfigs[ anIndex];
      if( aNodeConfigs.sameNameAs( theCtxt, theMMName)) { return aNodeConfigs;}
    }
    return null;
  }



    /* Public NodeConfigs finder predicate by name
     */
  public boolean hasNodeConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findNodeConfigsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public NodeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getNodeConfigsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someNodeConfigs = getNodeConfigsPrivileged( theCtxt);
    if( someNodeConfigs == null) { return null;}

      // Get number of NodeConfigs
    int aNodeConfigsLength = someNodeConfigs.length;

      // Verify index within array length
    if( theIndex >= aNodeConfigsLength) { return null;}

      // Get indexed NodeConfigs
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aNodeConfigs = someNodeConfigs[ theIndex];

    return aNodeConfigs;
  }



    /* Public NodeConfigs is related predicate
     */
  public boolean hasNodeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException {
    return indexOfNodeConfigsPR( theCtxt, theNodeConfigs) >= 0;
  }


    /* Public NodeConfigs index access
     */
  public int indexOfNodeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException {
      // Do not add null values to the collection
    if( theNodeConfigs == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someNodeConfigs = getNodeConfigsPrivileged( theCtxt);
    if( someNodeConfigs == null) { return -1;}

      // Check for new NodeConfigs already in collection
    int aNodeConfigsLength = someNodeConfigs.length;
    for( int anIndex = 0 ; anIndex < aNodeConfigsLength ; anIndex++) {
      if( someNodeConfigs[ anIndex].sameAs( theCtxt, theNodeConfigs)) { return anIndex;}
    }
    return -1;
  }


    /* Public NodeConfigs number access
     */
  public int numNodeConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someNodeConfigs = getNodeConfigsPrivileged( theCtxt);
    if( someNodeConfigs == null) { return 0;}

      // Check for new NodeConfigs already in collection
    int aNodeConfigsLength = someNodeConfigs.length;
    return aNodeConfigsLength;
  }




    /* Public Write accessor for role NodeConfigs
     */
  public void addNodeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someNodeConfigs = getNodeConfigsPrivileged( theCtxt);
    if( someNodeConfigs == null) { return;}

      // Check for new NodeConfigs already in collection
    int aNodeConfigsLength = someNodeConfigs.length;
    for( int anIndex = 0 ; anIndex < aNodeConfigsLength ; anIndex++) {
      if( theNodeConfigs.sameAs( theCtxt, someNodeConfigs[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theNodeConfigs;

      // Link reverse ref to this object
    aNewNodeConfigs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Grow collection and add new NodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aNodeConfigsLength + 1];
    try { System.arraycopy( someNodeConfigs, 0, otherNodeConfigs, 0, aNodeConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeConfigs", null); return;}
    otherNodeConfigs[ aNodeConfigsLength] = aNewNodeConfigs;

      // Set the new collection
    setNodeConfigsPrivileged( theCtxt, otherNodeConfigs);
  }




    /* Public ordered Write accessor for role NodeConfigs
     */
  public void addNodeConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theNodeConfigs == null) { return;}

      // If relative NodeConfigs is null, perform normal add operation
    if( theRelativeNodeConfigs == null) {
      addNodeConfigsPR( theCtxt, theNodeConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someNodeConfigs = getNodeConfigsPrivileged( theCtxt);
    if( someNodeConfigs == null) { return;}


      // Get index of relative NodeConfigs
    int aRelativeIndex = indexOfNodeConfigsPR( theCtxt, theRelativeNodeConfigs);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addNodeConfigsPR( theCtxt, theNodeConfigs);
    }

      // Get length of NodeConfigs array
    int aNodeConfigsLength = someNodeConfigs.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aNodeConfigsLength) {
      addNodeConfigsPR( theCtxt, theNodeConfigs);
    }

      // Check for new NodeConfigs already in collection
    if( hasNodeConfigsPR( theCtxt, theNodeConfigs)) { return;}


    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theNodeConfigs;

      // Link reverse ref to this object
    aNewNodeConfigs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship NodeConfigs
      // Grow collection and add new NodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aNodeConfigsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someNodeConfigs, 0, otherNodeConfigs, 0, aRelativeIndex );
      }
      System.arraycopy( someNodeConfigs, aRelativeIndex, otherNodeConfigs, aRelativeIndex + 1, aNodeConfigsLength - aRelativeIndex);
      otherNodeConfigs[ aRelativeIndex] = aNewNodeConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeConfigsBefore", null); return;}

      // Set the new collection
    setNodeConfigsPrivileged( theCtxt, otherNodeConfigs);
  }





    /* Public Write accessor for role NodeConfigs
     */
  public void removeNodeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someNodeConfigs = getNodeConfigsPrivileged( theCtxt);
    if( someNodeConfigs == null) { return;}

      // Check for new NodeConfigs not in collection
    int aNodeConfigsLength = someNodeConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aNodeConfigsLength ; anIndex++) {
      if( theNodeConfigs.sameAs( theCtxt, someNodeConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theNodeConfigs;

      // Unlink reverse ref from the new related object
    aNewNodeConfigs.unsetTraversalConfigPrivileged( theCtxt);

      // Shrink collection removing NodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aNodeConfigsLength - 1];
    try {
      System.arraycopy( someNodeConfigs, 0, otherNodeConfigs, 0, aFoundIndex);
      System.arraycopy( someNodeConfigs, aFoundIndex + 1, otherNodeConfigs, aFoundIndex, aNodeConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeNodeConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeNodeConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeNodeConfigs", null); return;}

      // Set the new collection
    setNodeConfigsPrivileged( theCtxt, otherNodeConfigs);
  }




    /* Public reorder accessor for role NodeConfigs
     */
  public void moveNodeConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeNodeConfigs) throws EAIException {

      // Null value is nothing to move
    if( theNodeConfigs == null) { return;}

      // If relative NodeConfigs is null, perform move to last position
    if( theRelativeNodeConfigs == null) {
      moveNodeConfigsToLastPR( theCtxt, theNodeConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someNodeConfigs = getNodeConfigsPrivileged( theCtxt);
    if( someNodeConfigs == null) { return;}

      // Get length of NodeConfigs array
    int aNodeConfigsLength = someNodeConfigs.length;

      // Get index of NodeConfigs to move
    int aToMoveIndex = indexOfNodeConfigsPR( theCtxt, theNodeConfigs);
      // If toMove NodeConfigs not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aNodeConfigsLength) {
      moveNodeConfigsToLastPR( theCtxt, theNodeConfigs);
    }

      // Get index of relative NodeConfigs
    int aRelativeIndex = indexOfNodeConfigsPR( theCtxt, theRelativeNodeConfigs);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveNodeConfigsToLastPR( theCtxt, theNodeConfigs);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aNodeConfigsLength) {
      moveNodeConfigsToLastPR( theCtxt, theNodeConfigs);
    }

      // ToMove and relative NodeConfigs are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aToMoveNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theNodeConfigs;

      // Allocate new array for new version of state of relationship NodeConfigs
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aNodeConfigsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someNodeConfigs, 0, otherNodeConfigs, 0, aToMoveIndex );
        System.arraycopy( someNodeConfigs, aToMoveIndex + 1, otherNodeConfigs, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherNodeConfigs[ aRelativeIndex - 1] = aToMoveNodeConfigs;
        System.arraycopy( someNodeConfigs, aRelativeIndex, otherNodeConfigs, aRelativeIndex, aNodeConfigsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someNodeConfigs, 0, otherNodeConfigs, 0, aRelativeIndex );
        otherNodeConfigs[ aRelativeIndex ] = aToMoveNodeConfigs;
        System.arraycopy( someNodeConfigs, aRelativeIndex, otherNodeConfigs, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aNodeConfigsLength - 1) {
          System.arraycopy( someNodeConfigs, aToMoveIndex + 1, otherNodeConfigs, aToMoveIndex + 1, aNodeConfigsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveNodeConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveNodeConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveNodeConfigsBefore", null); return;}

      // Set the new collection
    setNodeConfigsPrivileged( theCtxt, otherNodeConfigs);
  }





    /* Public move to last accessor for role NodeConfigs
     */
  public void moveNodeConfigsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theNodeConfigs) throws EAIException {

      // Null value is nothing to move
    if( theNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someNodeConfigs = getNodeConfigsPrivileged( theCtxt);
    if( someNodeConfigs == null) { return;}

      // Get length of NodeConfigs array
    int aNodeConfigsLength = someNodeConfigs.length;

      // Get index of NodeConfigs to move
    int aToMoveIndex = indexOfNodeConfigsPR( theCtxt, theNodeConfigs);

      // If toMove NodeConfigs not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aNodeConfigsLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aToMoveNodeConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theNodeConfigs;

      // Allocate new array for new version of state of relationship NodeConfigs
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aNodeConfigsLength];
    try {
      System.arraycopy( someNodeConfigs, 0, otherNodeConfigs, 0, aToMoveIndex );
      System.arraycopy( someNodeConfigs, aToMoveIndex + 1, otherNodeConfigs, aToMoveIndex, aNodeConfigsLength - aToMoveIndex - 1);
      otherNodeConfigs[ aNodeConfigsLength - 1] = aToMoveNodeConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveNodeConfigsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveNodeConfigsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveNodeConfigsToLast", null); return;}

      // Set the new collection
    setNodeConfigsPrivileged( theCtxt, otherNodeConfigs);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship NodeConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role NodeConfigs
     */
  public void addNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someNodeConfigs = getNodeConfigsPrivileged( theCtxt);
    if( someNodeConfigs == null) { return;}

      // Check for new NodeConfigs already in collection
    int aNodeConfigsLength = someNodeConfigs.length;
    for( int anIndex = 0 ; anIndex < aNodeConfigsLength ; anIndex++) {
      if( theNodeConfigs.sameAs( theCtxt, someNodeConfigs[ anIndex])) { return;}
    }

      // Grow collection and add new NodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aNodeConfigsLength + 1];
    try {
      System.arraycopy( someNodeConfigs, 0, otherNodeConfigs, 0, aNodeConfigsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeConfigsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeConfigsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeConfigsPrivileged", null); return;}

    otherNodeConfigs[ aNodeConfigsLength] = theNodeConfigs;

      // Set the new collection
    setNodeConfigsPrivileged( theCtxt, otherNodeConfigs);
  }









    /* Privileged Write accessor for role NodeConfigs
     */
  public void removeNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theNodeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theNodeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someNodeConfigs = getNodeConfigsPrivileged( theCtxt);
    if( someNodeConfigs == null) { return;}

      // Check for new NodeConfigs not in collection
    int aNodeConfigsLength = someNodeConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aNodeConfigsLength ; anIndex++) {
      if( theNodeConfigs.sameAs( theCtxt, someNodeConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing NodeConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherNodeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aNodeConfigsLength - 1];
    try {
      System.arraycopy( someNodeConfigs, 0, otherNodeConfigs, 0, aFoundIndex);
      System.arraycopy( someNodeConfigs, aFoundIndex + 1, otherNodeConfigs, aFoundIndex, aNodeConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeNodeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeNodeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeNodeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}

      // Set the new collection
    setNodeConfigsPrivileged( theCtxt, otherNodeConfigs);
  }






    /* Privileged Read accessor for role NodeConfigs
     * Guaranteed to return object with same identity of the NodeConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] getNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrNodeConfigs;
  }




    /* Set reference in role NodeConfigs
     * Used by relationship maintenance machinery
     */
  public void setNodeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] theNodeConfigsCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] aNodeConfigs = vrNodeConfigs;
    vrNodeConfigs = theNodeConfigsCollection;
      // Propagate change
    change( theCtxt, "NodeConfigs", aNodeConfigs, vrNodeConfigs, "vrNodeConfigs");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship AttributeConfigs
 ****************************************************************************/


    /* Public Read accessor for role AttributeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] getAttributeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getAttributeConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getAttributeConfigsPR( theCtxt);
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

    /* Public AttributeConfigs number access
     */
  public int numAttributeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numAttributeConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numAttributeConfigsPR( theCtxt);
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



    /* Public AttributeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc getAttributeConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getAttributeConfigsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getAttributeConfigsAtPR( theCtxt, theIndex);
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


    /* Public AttributeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc findAttributeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findAttributeConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findAttributeConfigsNamedPR( theCtxt, theMMName);
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




    /* Public AttributeConfigs is related predicate
     */
  public boolean hasAttributeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasAttributeConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasAttributeConfigsNamedPR( theCtxt, theMMName);
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



    /* Transactional AttributeConfigs is related  predicate
     */
  public boolean hasAttributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasAttributeConfigsPR( theCtxt, theAttributeConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasAttributeConfigsPR( theCtxt, theAttributeConfigs);
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


    /* Public AttributeConfigs index access
     */
  public int indexOfAttributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfAttributeConfigsPR( theCtxt, theAttributeConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfAttributeConfigsPR( theCtxt, theAttributeConfigs);
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
  public void addAttributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addAttributeConfigsPR( theCtxt, theAttributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addAttributeConfigsPR( theCtxt, theAttributeConfigs);
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
  public void addAttributeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addAttributeConfigsBeforePR( theCtxt, theAttributeConfigs, theRelativeAttributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addAttributeConfigsBeforePR( theCtxt, theAttributeConfigs, theRelativeAttributeConfigs);
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





    /* Transactional Public Write Remove accessor for role AttributeConfigs
     */
  public void removeAttributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeAttributeConfigsPR( theCtxt, theAttributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeAttributeConfigsPR( theCtxt, theAttributeConfigs);
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



    /* Public reorder accessor for role AttributeConfigs
     */
  public void moveAttributeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveAttributeConfigsBeforePR( theCtxt, theAttributeConfigs, theRelativeAttributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveAttributeConfigsBeforePR( theCtxt, theAttributeConfigs, theRelativeAttributeConfigs);
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



    /* Public reorder accessor for role AttributeConfigs
     */
  public void moveAttributeConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveAttributeConfigsToLastPR( theCtxt, theAttributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveAttributeConfigsToLastPR( theCtxt, theAttributeConfigs);
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
 *  Implementation of internal operations for relationship AttributeConfigs
 ****************************************************************************/


    /* Public Read accessor for role AttributeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] getAttributeConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return null;}

    int aAttributeConfigsLength = someAttributeConfigs.length;
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[ aAttributeConfigsLength];
    try { System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aAttributeConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getAttributeConfigs", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getAttributeConfigs", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getAttributeConfigs", null); return null;}


    return otherAttributeConfigs;
  }



    /* Public AttributeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc findAttributeConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return null;}

      // Check for new AttributeConfigs already in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aAttributeConfigs = someAttributeConfigs[ anIndex];
      if( aAttributeConfigs.sameNameAs( theCtxt, theMMName)) { return aAttributeConfigs;}
    }
    return null;
  }



    /* Public AttributeConfigs finder predicate by name
     */
  public boolean hasAttributeConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findAttributeConfigsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public AttributeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc getAttributeConfigsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return null;}

      // Get number of AttributeConfigs
    int aAttributeConfigsLength = someAttributeConfigs.length;

      // Verify index within array length
    if( theIndex >= aAttributeConfigsLength) { return null;}

      // Get indexed AttributeConfigs
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aAttributeConfigs = someAttributeConfigs[ theIndex];

    return aAttributeConfigs;
  }



    /* Public AttributeConfigs is related predicate
     */
  public boolean hasAttributeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
    return indexOfAttributeConfigsPR( theCtxt, theAttributeConfigs) >= 0;
  }


    /* Public AttributeConfigs index access
     */
  public int indexOfAttributeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {
      // Do not add null values to the collection
    if( theAttributeConfigs == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return -1;}

      // Check for new AttributeConfigs already in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
      if( someAttributeConfigs[ anIndex].sameAs( theCtxt, theAttributeConfigs)) { return anIndex;}
    }
    return -1;
  }


    /* Public AttributeConfigs number access
     */
  public int numAttributeConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return 0;}

      // Check for new AttributeConfigs already in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    return aAttributeConfigsLength;
  }




    /* Public Write accessor for role AttributeConfigs
     */
  public void addAttributeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theAttributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}

      // Check for new AttributeConfigs already in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
      if( theAttributeConfigs.sameAs( theCtxt, someAttributeConfigs[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aNewAttributeConfigs = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theAttributeConfigs;

      // Link reverse ref to this object
    aNewAttributeConfigs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Grow collection and add new AttributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength + 1];
    try { System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aAttributeConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigs", null); return;}
    otherAttributeConfigs[ aAttributeConfigsLength] = aNewAttributeConfigs;

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }




    /* Public ordered Write accessor for role AttributeConfigs
     */
  public void addAttributeConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeAttributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theAttributeConfigs == null) { return;}

      // If relative AttributeConfigs is null, perform normal add operation
    if( theRelativeAttributeConfigs == null) {
      addAttributeConfigsPR( theCtxt, theAttributeConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}


      // Get index of relative AttributeConfigs
    int aRelativeIndex = indexOfAttributeConfigsPR( theCtxt, theRelativeAttributeConfigs);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addAttributeConfigsPR( theCtxt, theAttributeConfigs);
    }

      // Get length of AttributeConfigs array
    int aAttributeConfigsLength = someAttributeConfigs.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aAttributeConfigsLength) {
      addAttributeConfigsPR( theCtxt, theAttributeConfigs);
    }

      // Check for new AttributeConfigs already in collection
    if( hasAttributeConfigsPR( theCtxt, theAttributeConfigs)) { return;}


    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aNewAttributeConfigs = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theAttributeConfigs;

      // Link reverse ref to this object
    aNewAttributeConfigs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship AttributeConfigs
      // Grow collection and add new AttributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aRelativeIndex );
      }
      System.arraycopy( someAttributeConfigs, aRelativeIndex, otherAttributeConfigs, aRelativeIndex + 1, aAttributeConfigsLength - aRelativeIndex);
      otherAttributeConfigs[ aRelativeIndex] = aNewAttributeConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigsBefore", null); return;}

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }





    /* Public Write accessor for role AttributeConfigs
     */
  public void removeAttributeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theAttributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}

      // Check for new AttributeConfigs not in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
      if( theAttributeConfigs.sameAs( theCtxt, someAttributeConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aNewAttributeConfigs = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theAttributeConfigs;

      // Unlink reverse ref from the new related object
    aNewAttributeConfigs.unsetTraversalConfigPrivileged( theCtxt);

      // Shrink collection removing AttributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength - 1];
    try {
      System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aFoundIndex);
      System.arraycopy( someAttributeConfigs, aFoundIndex + 1, otherAttributeConfigs, aFoundIndex, aAttributeConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributeConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributeConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributeConfigs", null); return;}

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }




    /* Public reorder accessor for role AttributeConfigs
     */
  public void moveAttributeConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeAttributeConfigs) throws EAIException {

      // Null value is nothing to move
    if( theAttributeConfigs == null) { return;}

      // If relative AttributeConfigs is null, perform move to last position
    if( theRelativeAttributeConfigs == null) {
      moveAttributeConfigsToLastPR( theCtxt, theAttributeConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}

      // Get length of AttributeConfigs array
    int aAttributeConfigsLength = someAttributeConfigs.length;

      // Get index of AttributeConfigs to move
    int aToMoveIndex = indexOfAttributeConfigsPR( theCtxt, theAttributeConfigs);
      // If toMove AttributeConfigs not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aAttributeConfigsLength) {
      moveAttributeConfigsToLastPR( theCtxt, theAttributeConfigs);
    }

      // Get index of relative AttributeConfigs
    int aRelativeIndex = indexOfAttributeConfigsPR( theCtxt, theRelativeAttributeConfigs);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveAttributeConfigsToLastPR( theCtxt, theAttributeConfigs);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aAttributeConfigsLength) {
      moveAttributeConfigsToLastPR( theCtxt, theAttributeConfigs);
    }

      // ToMove and relative AttributeConfigs are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aToMoveAttributeConfigs = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theAttributeConfigs;

      // Allocate new array for new version of state of relationship AttributeConfigs
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aToMoveIndex );
        System.arraycopy( someAttributeConfigs, aToMoveIndex + 1, otherAttributeConfigs, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherAttributeConfigs[ aRelativeIndex - 1] = aToMoveAttributeConfigs;
        System.arraycopy( someAttributeConfigs, aRelativeIndex, otherAttributeConfigs, aRelativeIndex, aAttributeConfigsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aRelativeIndex );
        otherAttributeConfigs[ aRelativeIndex ] = aToMoveAttributeConfigs;
        System.arraycopy( someAttributeConfigs, aRelativeIndex, otherAttributeConfigs, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aAttributeConfigsLength - 1) {
          System.arraycopy( someAttributeConfigs, aToMoveIndex + 1, otherAttributeConfigs, aToMoveIndex + 1, aAttributeConfigsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributeConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributeConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributeConfigsBefore", null); return;}

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }





    /* Public move to last accessor for role AttributeConfigs
     */
  public void moveAttributeConfigsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theAttributeConfigs) throws EAIException {

      // Null value is nothing to move
    if( theAttributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}

      // Get length of AttributeConfigs array
    int aAttributeConfigsLength = someAttributeConfigs.length;

      // Get index of AttributeConfigs to move
    int aToMoveIndex = indexOfAttributeConfigsPR( theCtxt, theAttributeConfigs);

      // If toMove AttributeConfigs not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aAttributeConfigsLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aToMoveAttributeConfigs = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theAttributeConfigs;

      // Allocate new array for new version of state of relationship AttributeConfigs
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength];
    try {
      System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aToMoveIndex );
      System.arraycopy( someAttributeConfigs, aToMoveIndex + 1, otherAttributeConfigs, aToMoveIndex, aAttributeConfigsLength - aToMoveIndex - 1);
      otherAttributeConfigs[ aAttributeConfigsLength - 1] = aToMoveAttributeConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributeConfigsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributeConfigsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveAttributeConfigsToLast", null); return;}

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship AttributeConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role AttributeConfigs
     */
  public void addAttributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv theAttributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theAttributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}

      // Check for new AttributeConfigs already in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
      if( theAttributeConfigs.sameAs( theCtxt, someAttributeConfigs[ anIndex])) { return;}
    }

      // Grow collection and add new AttributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength + 1];
    try {
      System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aAttributeConfigsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addAttributeConfigsPrivileged", null); return;}

    otherAttributeConfigs[ aAttributeConfigsLength] = theAttributeConfigs;

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }









    /* Privileged Write accessor for role AttributeConfigs
     */
  public void removeAttributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv theAttributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theAttributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someAttributeConfigs = getAttributeConfigsPrivileged( theCtxt);
    if( someAttributeConfigs == null) { return;}

      // Check for new AttributeConfigs not in collection
    int aAttributeConfigsLength = someAttributeConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
      if( theAttributeConfigs.sameAs( theCtxt, someAttributeConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing AttributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherAttributeConfigs = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aAttributeConfigsLength - 1];
    try {
      System.arraycopy( someAttributeConfigs, 0, otherAttributeConfigs, 0, aFoundIndex);
      System.arraycopy( someAttributeConfigs, aFoundIndex + 1, otherAttributeConfigs, aFoundIndex, aAttributeConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeAttributeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv.class}); return;}

      // Set the new collection
    setAttributeConfigsPrivileged( theCtxt, otherAttributeConfigs);
  }






    /* Privileged Read accessor for role AttributeConfigs
     * Guaranteed to return object with same identity of the AttributeConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] getAttributeConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrAttributeConfigs;
  }




    /* Set reference in role AttributeConfigs
     * Used by relationship maintenance machinery
     */
  public void setAttributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] theAttributeConfigsCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] aAttributeConfigs = vrAttributeConfigs;
    vrAttributeConfigs = theAttributeConfigsCollection;
      // Propagate change
    change( theCtxt, "AttributeConfigs", aAttributeConfigs, vrAttributeConfigs, "vrAttributeConfigs");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship ConfigOverrides
 ****************************************************************************/


    /* Public Read accessor for role ConfigOverrides
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc[] getConfigOverrides( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getConfigOverridesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getConfigOverridesPR( theCtxt);
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

    /* Public ConfigOverrides number access
     */
  public int numConfigOverrides( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numConfigOverridesPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numConfigOverridesPR( theCtxt);
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



    /* Public ConfigOverrides read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc getConfigOverridesAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getConfigOverridesAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getConfigOverridesAtPR( theCtxt, theIndex);
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


    /* Public ConfigOverrides finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc findConfigOverridesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findConfigOverridesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findConfigOverridesNamedPR( theCtxt, theMMName);
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




    /* Public ConfigOverrides is related predicate
     */
  public boolean hasConfigOverridesNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasConfigOverridesNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasConfigOverridesNamedPR( theCtxt, theMMName);
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



    /* Transactional ConfigOverrides is related  predicate
     */
  public boolean hasConfigOverrides( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasConfigOverridesPR( theCtxt, theConfigOverrides);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasConfigOverridesPR( theCtxt, theConfigOverrides);
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


    /* Public ConfigOverrides index access
     */
  public int indexOfConfigOverrides( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfConfigOverridesPR( theCtxt, theConfigOverrides);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfConfigOverridesPR( theCtxt, theConfigOverrides);
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
  public void addConfigOverrides( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addConfigOverridesPR( theCtxt, theConfigOverrides);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addConfigOverridesPR( theCtxt, theConfigOverrides);
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
  public void addConfigOverridesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theRelativeConfigOverrides) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addConfigOverridesBeforePR( theCtxt, theConfigOverrides, theRelativeConfigOverrides);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addConfigOverridesBeforePR( theCtxt, theConfigOverrides, theRelativeConfigOverrides);
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





    /* Transactional Public Write Remove accessor for role ConfigOverrides
     */
  public void removeConfigOverrides( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeConfigOverridesPR( theCtxt, theConfigOverrides);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeConfigOverridesPR( theCtxt, theConfigOverrides);
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



    /* Public reorder accessor for role ConfigOverrides
     */
  public void moveConfigOverridesBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theRelativeConfigOverrides) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveConfigOverridesBeforePR( theCtxt, theConfigOverrides, theRelativeConfigOverrides);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveConfigOverridesBeforePR( theCtxt, theConfigOverrides, theRelativeConfigOverrides);
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



    /* Public reorder accessor for role ConfigOverrides
     */
  public void moveConfigOverridesToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveConfigOverridesToLastPR( theCtxt, theConfigOverrides);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveConfigOverridesToLastPR( theCtxt, theConfigOverrides);
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
 *  Implementation of internal operations for relationship ConfigOverrides
 ****************************************************************************/


    /* Public Read accessor for role ConfigOverrides
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc[] getConfigOverridesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] someConfigOverrides = getConfigOverridesPrivileged( theCtxt);
    if( someConfigOverrides == null) { return null;}

    int aConfigOverridesLength = someConfigOverrides.length;
    com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc[] otherConfigOverrides = new com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc[ aConfigOverridesLength];
    try { System.arraycopy( someConfigOverrides, 0, otherConfigOverrides, 0, aConfigOverridesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getConfigOverrides", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getConfigOverrides", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getConfigOverrides", null); return null;}


    return otherConfigOverrides;
  }



    /* Public ConfigOverrides finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc findConfigOverridesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] someConfigOverrides = getConfigOverridesPrivileged( theCtxt);
    if( someConfigOverrides == null) { return null;}

      // Check for new ConfigOverrides already in collection
    int aConfigOverridesLength = someConfigOverrides.length;
    for( int anIndex = 0 ; anIndex < aConfigOverridesLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv aConfigOverrides = someConfigOverrides[ anIndex];
      if( aConfigOverrides.sameNameAs( theCtxt, theMMName)) { return aConfigOverrides;}
    }
    return null;
  }



    /* Public ConfigOverrides finder predicate by name
     */
  public boolean hasConfigOverridesNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findConfigOverridesNamedPR( theCtxt, theMMName) != null;
  }


    /* Public ConfigOverrides read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc getConfigOverridesAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] someConfigOverrides = getConfigOverridesPrivileged( theCtxt);
    if( someConfigOverrides == null) { return null;}

      // Get number of ConfigOverrides
    int aConfigOverridesLength = someConfigOverrides.length;

      // Verify index within array length
    if( theIndex >= aConfigOverridesLength) { return null;}

      // Get indexed ConfigOverrides
    com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc aConfigOverrides = someConfigOverrides[ theIndex];

    return aConfigOverrides;
  }



    /* Public ConfigOverrides is related predicate
     */
  public boolean hasConfigOverridesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException {
    return indexOfConfigOverridesPR( theCtxt, theConfigOverrides) >= 0;
  }


    /* Public ConfigOverrides index access
     */
  public int indexOfConfigOverridesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException {
      // Do not add null values to the collection
    if( theConfigOverrides == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] someConfigOverrides = getConfigOverridesPrivileged( theCtxt);
    if( someConfigOverrides == null) { return -1;}

      // Check for new ConfigOverrides already in collection
    int aConfigOverridesLength = someConfigOverrides.length;
    for( int anIndex = 0 ; anIndex < aConfigOverridesLength ; anIndex++) {
      if( someConfigOverrides[ anIndex].sameAs( theCtxt, theConfigOverrides)) { return anIndex;}
    }
    return -1;
  }


    /* Public ConfigOverrides number access
     */
  public int numConfigOverridesPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] someConfigOverrides = getConfigOverridesPrivileged( theCtxt);
    if( someConfigOverrides == null) { return 0;}

      // Check for new ConfigOverrides already in collection
    int aConfigOverridesLength = someConfigOverrides.length;
    return aConfigOverridesLength;
  }




    /* Public Write accessor for role ConfigOverrides
     */
  public void addConfigOverridesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException {

      // Do not add null values to the collection
    if( theConfigOverrides == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc[] someConfigOverrides = getConfigOverridesPrivileged( theCtxt);
    if( someConfigOverrides == null) { return;}

      // Check for new ConfigOverrides already in collection
    int aConfigOverridesLength = someConfigOverrides.length;
    for( int anIndex = 0 ; anIndex < aConfigOverridesLength ; anIndex++) {
      if( theConfigOverrides.sameAs( theCtxt, someConfigOverrides[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv aNewConfigOverrides = (com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv) theConfigOverrides;

      // Link reverse ref to this object
    aNewConfigOverrides.unsetAndSetOverrideWithPrivileged( theCtxt, this);

      // Grow collection and add new ConfigOverrides element
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] otherConfigOverrides = new com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[ aConfigOverridesLength + 1];
    try { System.arraycopy( someConfigOverrides, 0, otherConfigOverrides, 0, aConfigOverridesLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addConfigOverrides", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addConfigOverrides", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addConfigOverrides", null); return;}
    otherConfigOverrides[ aConfigOverridesLength] = aNewConfigOverrides;

      // Set the new collection
    setConfigOverridesPrivileged( theCtxt, otherConfigOverrides);
  }




    /* Public ordered Write accessor for role ConfigOverrides
     */
  public void addConfigOverridesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theRelativeConfigOverrides) throws EAIException {

      // Do not add null values to the collection
    if( theConfigOverrides == null) { return;}

      // If relative ConfigOverrides is null, perform normal add operation
    if( theRelativeConfigOverrides == null) {
      addConfigOverridesPR( theCtxt, theConfigOverrides);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc[] someConfigOverrides = getConfigOverridesPrivileged( theCtxt);
    if( someConfigOverrides == null) { return;}


      // Get index of relative ConfigOverrides
    int aRelativeIndex = indexOfConfigOverridesPR( theCtxt, theRelativeConfigOverrides);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addConfigOverridesPR( theCtxt, theConfigOverrides);
    }

      // Get length of ConfigOverrides array
    int aConfigOverridesLength = someConfigOverrides.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aConfigOverridesLength) {
      addConfigOverridesPR( theCtxt, theConfigOverrides);
    }

      // Check for new ConfigOverrides already in collection
    if( hasConfigOverridesPR( theCtxt, theConfigOverrides)) { return;}


    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv aNewConfigOverrides = (com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv) theConfigOverrides;

      // Link reverse ref to this object
    aNewConfigOverrides.unsetAndSetOverrideWithPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship ConfigOverrides
      // Grow collection and add new ConfigOverrides element
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] otherConfigOverrides = new com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[ aConfigOverridesLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someConfigOverrides, 0, otherConfigOverrides, 0, aRelativeIndex );
      }
      System.arraycopy( someConfigOverrides, aRelativeIndex, otherConfigOverrides, aRelativeIndex + 1, aConfigOverridesLength - aRelativeIndex);
      otherConfigOverrides[ aRelativeIndex] = aNewConfigOverrides;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addConfigOverridesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addConfigOverridesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addConfigOverridesBefore", null); return;}

      // Set the new collection
    setConfigOverridesPrivileged( theCtxt, otherConfigOverrides);
  }





    /* Public Write accessor for role ConfigOverrides
     */
  public void removeConfigOverridesPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException {

      // Do not add null values to the collection
    if( theConfigOverrides == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc[] someConfigOverrides = getConfigOverridesPrivileged( theCtxt);
    if( someConfigOverrides == null) { return;}

      // Check for new ConfigOverrides not in collection
    int aConfigOverridesLength = someConfigOverrides.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aConfigOverridesLength ; anIndex++) {
      if( theConfigOverrides.sameAs( theCtxt, someConfigOverrides[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv aNewConfigOverrides = (com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv) theConfigOverrides;

      // Unlink reverse ref from the new related object
    aNewConfigOverrides.unsetOverrideWithPrivileged( theCtxt);

      // Shrink collection removing ConfigOverrides element
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] otherConfigOverrides = new com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[ aConfigOverridesLength - 1];
    try {
      System.arraycopy( someConfigOverrides, 0, otherConfigOverrides, 0, aFoundIndex);
      System.arraycopy( someConfigOverrides, aFoundIndex + 1, otherConfigOverrides, aFoundIndex, aConfigOverridesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeConfigOverrides", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeConfigOverrides", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeConfigOverrides", null); return;}

      // Set the new collection
    setConfigOverridesPrivileged( theCtxt, otherConfigOverrides);
  }




    /* Public reorder accessor for role ConfigOverrides
     */
  public void moveConfigOverridesBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theRelativeConfigOverrides) throws EAIException {

      // Null value is nothing to move
    if( theConfigOverrides == null) { return;}

      // If relative ConfigOverrides is null, perform move to last position
    if( theRelativeConfigOverrides == null) {
      moveConfigOverridesToLastPR( theCtxt, theConfigOverrides);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc[] someConfigOverrides = getConfigOverridesPrivileged( theCtxt);
    if( someConfigOverrides == null) { return;}

      // Get length of ConfigOverrides array
    int aConfigOverridesLength = someConfigOverrides.length;

      // Get index of ConfigOverrides to move
    int aToMoveIndex = indexOfConfigOverridesPR( theCtxt, theConfigOverrides);
      // If toMove ConfigOverrides not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aConfigOverridesLength) {
      moveConfigOverridesToLastPR( theCtxt, theConfigOverrides);
    }

      // Get index of relative ConfigOverrides
    int aRelativeIndex = indexOfConfigOverridesPR( theCtxt, theRelativeConfigOverrides);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveConfigOverridesToLastPR( theCtxt, theConfigOverrides);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aConfigOverridesLength) {
      moveConfigOverridesToLastPR( theCtxt, theConfigOverrides);
    }

      // ToMove and relative ConfigOverrides are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv aToMoveConfigOverrides = (com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv) theConfigOverrides;

      // Allocate new array for new version of state of relationship ConfigOverrides
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] otherConfigOverrides = new com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[ aConfigOverridesLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someConfigOverrides, 0, otherConfigOverrides, 0, aToMoveIndex );
        System.arraycopy( someConfigOverrides, aToMoveIndex + 1, otherConfigOverrides, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherConfigOverrides[ aRelativeIndex - 1] = aToMoveConfigOverrides;
        System.arraycopy( someConfigOverrides, aRelativeIndex, otherConfigOverrides, aRelativeIndex, aConfigOverridesLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someConfigOverrides, 0, otherConfigOverrides, 0, aRelativeIndex );
        otherConfigOverrides[ aRelativeIndex ] = aToMoveConfigOverrides;
        System.arraycopy( someConfigOverrides, aRelativeIndex, otherConfigOverrides, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aConfigOverridesLength - 1) {
          System.arraycopy( someConfigOverrides, aToMoveIndex + 1, otherConfigOverrides, aToMoveIndex + 1, aConfigOverridesLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveConfigOverridesBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveConfigOverridesBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveConfigOverridesBefore", null); return;}

      // Set the new collection
    setConfigOverridesPrivileged( theCtxt, otherConfigOverrides);
  }





    /* Public move to last accessor for role ConfigOverrides
     */
  public void moveConfigOverridesToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc theConfigOverrides) throws EAIException {

      // Null value is nothing to move
    if( theConfigOverrides == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc[] someConfigOverrides = getConfigOverridesPrivileged( theCtxt);
    if( someConfigOverrides == null) { return;}

      // Get length of ConfigOverrides array
    int aConfigOverridesLength = someConfigOverrides.length;

      // Get index of ConfigOverrides to move
    int aToMoveIndex = indexOfConfigOverridesPR( theCtxt, theConfigOverrides);

      // If toMove ConfigOverrides not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aConfigOverridesLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv aToMoveConfigOverrides = (com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv) theConfigOverrides;

      // Allocate new array for new version of state of relationship ConfigOverrides
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] otherConfigOverrides = new com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[ aConfigOverridesLength];
    try {
      System.arraycopy( someConfigOverrides, 0, otherConfigOverrides, 0, aToMoveIndex );
      System.arraycopy( someConfigOverrides, aToMoveIndex + 1, otherConfigOverrides, aToMoveIndex, aConfigOverridesLength - aToMoveIndex - 1);
      otherConfigOverrides[ aConfigOverridesLength - 1] = aToMoveConfigOverrides;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveConfigOverridesToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveConfigOverridesToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveConfigOverridesToLast", null); return;}

      // Set the new collection
    setConfigOverridesPrivileged( theCtxt, otherConfigOverrides);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship ConfigOverrides
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role ConfigOverrides
     */
  public void addConfigOverridesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv theConfigOverrides) throws EAIException {

      // Do not add null values to the collection
    if( theConfigOverrides == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc[] someConfigOverrides = getConfigOverridesPrivileged( theCtxt);
    if( someConfigOverrides == null) { return;}

      // Check for new ConfigOverrides already in collection
    int aConfigOverridesLength = someConfigOverrides.length;
    for( int anIndex = 0 ; anIndex < aConfigOverridesLength ; anIndex++) {
      if( theConfigOverrides.sameAs( theCtxt, someConfigOverrides[ anIndex])) { return;}
    }

      // Grow collection and add new ConfigOverrides element
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] otherConfigOverrides = new com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[ aConfigOverridesLength + 1];
    try {
      System.arraycopy( someConfigOverrides, 0, otherConfigOverrides, 0, aConfigOverridesLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addConfigOverridesPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addConfigOverridesPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addConfigOverridesPrivileged", null); return;}

    otherConfigOverrides[ aConfigOverridesLength] = theConfigOverrides;

      // Set the new collection
    setConfigOverridesPrivileged( theCtxt, otherConfigOverrides);
  }









    /* Privileged Write accessor for role ConfigOverrides
     */
  public void removeConfigOverridesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv theConfigOverrides) throws EAIException {

      // Do not add null values to the collection
    if( theConfigOverrides == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] someConfigOverrides = getConfigOverridesPrivileged( theCtxt);
    if( someConfigOverrides == null) { return;}

      // Check for new ConfigOverrides not in collection
    int aConfigOverridesLength = someConfigOverrides.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aConfigOverridesLength ; anIndex++) {
      if( theConfigOverrides.sameAs( theCtxt, someConfigOverrides[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing ConfigOverrides element
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] otherConfigOverrides = new com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[ aConfigOverridesLength - 1];
    try {
      System.arraycopy( someConfigOverrides, 0, otherConfigOverrides, 0, aFoundIndex);
      System.arraycopy( someConfigOverrides, aFoundIndex + 1, otherConfigOverrides, aFoundIndex, aConfigOverridesLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeConfigOverridesPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeConfigOverridesPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeConfigOverridesPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv.class}); return;}

      // Set the new collection
    setConfigOverridesPrivileged( theCtxt, otherConfigOverrides);
  }






    /* Privileged Read accessor for role ConfigOverrides
     * Guaranteed to return object with same identity of the ConfigOverrides
     */
  public com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] getConfigOverridesPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrConfigOverrides;
  }




    /* Set reference in role ConfigOverrides
     * Used by relationship maintenance machinery
     */
  public void setConfigOverridesPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] theConfigOverridesCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3ConfigOverridePriv[] aConfigOverrides = vrConfigOverrides;
    vrConfigOverrides = theConfigOverridesCollection;
      // Propagate change
    change( theCtxt, "ConfigOverrides", aConfigOverrides, vrConfigOverrides, "vrConfigOverrides");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship Model
 ****************************************************************************/


    /* Public Read accessor for role Model
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc getModel( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModelIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getModelPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getModelPR( theCtxt);
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

    /* Public Model number access
     */
  public int numModel( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numModelPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numModelPR( theCtxt);
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



    /* Public Model read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc getModelAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModelIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getModelAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getModelAtPR( theCtxt, theIndex);
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


    /* Public Model finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc findModelNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3ModelIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findModelNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findModelNamedPR( theCtxt, theMMName);
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




    /* Public Model is related predicate
     */
  public boolean hasModelNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasModelNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasModelNamedPR( theCtxt, theMMName);
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



    /* Transactional Model is related  predicate
     */
  public boolean hasModel( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theModel) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasModelPR( theCtxt, theModel);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasModelPR( theCtxt, theModel);
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


    /* Public Model index access
     */
  public int indexOfModel( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theModel) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfModelPR( theCtxt, theModel);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfModelPR( theCtxt, theModel);
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




    /* Public Write accessor for role Model
     */
  public void setModel( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theModel) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setModelPR( theCtxt, theModel);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setModelPR( theCtxt, theModel);
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
 *  Implementation of internal operations for relationship Model
 ****************************************************************************/


    /* Public Read accessor for role Model
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc getModelPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getModelPrivileged( theCtxt);
  }


    /* Public Model number access
     */
  public int numModelPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getModelPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public Model read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc getModelAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getModelPrivileged( theCtxt);
  }


    /* Public Model finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3ModelIfc findModelNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = getModelPrivileged( theCtxt);
    if( aModel == null) { return null;}

    if( !aModel.sameNameAs( theCtxt, theMMName)) { return null;}

    return aModel;
  }


    /* Public Model finder predicate by name
     */
  public boolean hasModelNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = getModelPrivileged( theCtxt);
    if( aModel == null) { return false;}

    return aModel.sameNameAs( theCtxt, theMMName);
  }



    /* Public Model is related predicate
     */
  public boolean hasModelPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theModel) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = getModelPrivileged( theCtxt);
    if( aModel == null) { return false;}

    return aModel.sameAs( theCtxt, theModel);
  }




    /* Public Model index access
     */
  public int indexOfModelPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theModel) throws EAIException {
    if( !hasModelPR( theCtxt, theModel)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role Model
     */
  public void setModelPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3ModelIfc theModel) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3ModelPriv aModel = getModelPrivileged( theCtxt);
      // Check for new Model same as current one
    if( aModel != null && aModel.sameAs( theCtxt, theModel)) { return;}

    if( aModel != null) {
      aModel.removeTraversalConfigsPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetModelPrivileged();
      */
    }

    if( theModel != null) {
      com.dosmil_e.m3.core.priv.M3ModelPriv aNewModel = (com.dosmil_e.m3.core.priv.M3ModelPriv) theModel;
      aNewModel.addTraversalConfigsPrivileged( theCtxt, this);
      setModelPrivileged( theCtxt, aNewModel);
    }
    else {
      setModelPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship Model
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role Model
     * Guaranteed to return object with same identity of the Model
     */
  public com.dosmil_e.m3.core.priv.M3ModelPriv getModelPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrModel;
  }




    /* Remove current reference in role Model
     * Used by relationship maintenance machinery
     */
  public void unsetModelPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = vrModel;
    vrModel = null;
      // If there was change, propagate
    if( aModel != null) {
      change( theCtxt, "Model", aModel, vrModel, "vrModel");
    }
  }





    /* Set reference in role Model
     * Used by relationship maintenance machinery
     */
  public void setModelPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModelPriv theModel) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3ModelIfc aModel = vrModel;
    vrModel = theModel;
      // If there was change, propagate
    if( (aModel != null && !aModel.sameAs( theCtxt, theModel)) || (aModel == null && theModel != null)) {
      change( theCtxt, "Model", aModel, vrModel, "vrModel");
    }
  }





    /* Unset currently related Model and
     * Set reference in role Model
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetModelPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3ModelPriv theModel) throws EAIException {
    com.dosmil_e.m3.core.priv.M3ModelPriv aModel = vrModel;
    if( aModel != null) {
      aModel.removeTraversalConfigsPrivileged( theCtxt, this);
    }
    vrModel = theModel;
      // If there was change, propagate
    if( (aModel != null && !aModel.sameAs( theCtxt, theModel)) || (aModel == null && theModel != null)) {
      change( theCtxt, "Model", aModel, vrModel, "vrModel");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship FieldMgrs
 ****************************************************************************/


    /* Public Read accessor for role FieldMgrs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc[] getFieldMgrs( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getFieldMgrsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getFieldMgrsPR( theCtxt);
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

    /* Public FieldMgrs number access
     */
  public int numFieldMgrs( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numFieldMgrsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numFieldMgrsPR( theCtxt);
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



    /* Public FieldMgrs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc getFieldMgrsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getFieldMgrsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getFieldMgrsAtPR( theCtxt, theIndex);
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


    /* Public FieldMgrs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc findFieldMgrsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findFieldMgrsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findFieldMgrsNamedPR( theCtxt, theMMName);
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




    /* Public FieldMgrs is related predicate
     */
  public boolean hasFieldMgrsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasFieldMgrsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasFieldMgrsNamedPR( theCtxt, theMMName);
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



    /* Transactional FieldMgrs is related  predicate
     */
  public boolean hasFieldMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasFieldMgrsPR( theCtxt, theFieldMgrs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasFieldMgrsPR( theCtxt, theFieldMgrs);
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


    /* Public FieldMgrs index access
     */
  public int indexOfFieldMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfFieldMgrsPR( theCtxt, theFieldMgrs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfFieldMgrsPR( theCtxt, theFieldMgrs);
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
  public void addFieldMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addFieldMgrsPR( theCtxt, theFieldMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addFieldMgrsPR( theCtxt, theFieldMgrs);
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
  public void addFieldMgrsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theRelativeFieldMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addFieldMgrsBeforePR( theCtxt, theFieldMgrs, theRelativeFieldMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addFieldMgrsBeforePR( theCtxt, theFieldMgrs, theRelativeFieldMgrs);
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





    /* Transactional Public Write Remove accessor for role FieldMgrs
     */
  public void removeFieldMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeFieldMgrsPR( theCtxt, theFieldMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeFieldMgrsPR( theCtxt, theFieldMgrs);
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



    /* Public reorder accessor for role FieldMgrs
     */
  public void moveFieldMgrsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theRelativeFieldMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveFieldMgrsBeforePR( theCtxt, theFieldMgrs, theRelativeFieldMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveFieldMgrsBeforePR( theCtxt, theFieldMgrs, theRelativeFieldMgrs);
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



    /* Public reorder accessor for role FieldMgrs
     */
  public void moveFieldMgrsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveFieldMgrsToLastPR( theCtxt, theFieldMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveFieldMgrsToLastPR( theCtxt, theFieldMgrs);
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
 *  Implementation of internal operations for relationship FieldMgrs
 ****************************************************************************/


    /* Public Read accessor for role FieldMgrs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc[] getFieldMgrsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] someFieldMgrs = getFieldMgrsPrivileged( theCtxt);
    if( someFieldMgrs == null) { return null;}

    int aFieldMgrsLength = someFieldMgrs.length;
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc[] otherFieldMgrs = new com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc[ aFieldMgrsLength];
    try { System.arraycopy( someFieldMgrs, 0, otherFieldMgrs, 0, aFieldMgrsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getFieldMgrs", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getFieldMgrs", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getFieldMgrs", null); return null;}


    return otherFieldMgrs;
  }



    /* Public FieldMgrs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc findFieldMgrsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] someFieldMgrs = getFieldMgrsPrivileged( theCtxt);
    if( someFieldMgrs == null) { return null;}

      // Check for new FieldMgrs already in collection
    int aFieldMgrsLength = someFieldMgrs.length;
    for( int anIndex = 0 ; anIndex < aFieldMgrsLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv aFieldMgrs = someFieldMgrs[ anIndex];
      if( aFieldMgrs.sameNameAs( theCtxt, theMMName)) { return aFieldMgrs;}
    }
    return null;
  }



    /* Public FieldMgrs finder predicate by name
     */
  public boolean hasFieldMgrsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findFieldMgrsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public FieldMgrs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc getFieldMgrsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] someFieldMgrs = getFieldMgrsPrivileged( theCtxt);
    if( someFieldMgrs == null) { return null;}

      // Get number of FieldMgrs
    int aFieldMgrsLength = someFieldMgrs.length;

      // Verify index within array length
    if( theIndex >= aFieldMgrsLength) { return null;}

      // Get indexed FieldMgrs
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aFieldMgrs = someFieldMgrs[ theIndex];

    return aFieldMgrs;
  }



    /* Public FieldMgrs is related predicate
     */
  public boolean hasFieldMgrsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException {
    return indexOfFieldMgrsPR( theCtxt, theFieldMgrs) >= 0;
  }


    /* Public FieldMgrs index access
     */
  public int indexOfFieldMgrsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException {
      // Do not add null values to the collection
    if( theFieldMgrs == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] someFieldMgrs = getFieldMgrsPrivileged( theCtxt);
    if( someFieldMgrs == null) { return -1;}

      // Check for new FieldMgrs already in collection
    int aFieldMgrsLength = someFieldMgrs.length;
    for( int anIndex = 0 ; anIndex < aFieldMgrsLength ; anIndex++) {
      if( someFieldMgrs[ anIndex].sameAs( theCtxt, theFieldMgrs)) { return anIndex;}
    }
    return -1;
  }


    /* Public FieldMgrs number access
     */
  public int numFieldMgrsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] someFieldMgrs = getFieldMgrsPrivileged( theCtxt);
    if( someFieldMgrs == null) { return 0;}

      // Check for new FieldMgrs already in collection
    int aFieldMgrsLength = someFieldMgrs.length;
    return aFieldMgrsLength;
  }




    /* Public Write accessor for role FieldMgrs
     */
  public void addFieldMgrsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theFieldMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc[] someFieldMgrs = getFieldMgrsPrivileged( theCtxt);
    if( someFieldMgrs == null) { return;}

      // Check for new FieldMgrs already in collection
    int aFieldMgrsLength = someFieldMgrs.length;
    for( int anIndex = 0 ; anIndex < aFieldMgrsLength ; anIndex++) {
      if( theFieldMgrs.sameAs( theCtxt, someFieldMgrs[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv aNewFieldMgrs = (com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv) theFieldMgrs;

      // Link reverse ref to this object
    aNewFieldMgrs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Grow collection and add new FieldMgrs element
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] otherFieldMgrs = new com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[ aFieldMgrsLength + 1];
    try { System.arraycopy( someFieldMgrs, 0, otherFieldMgrs, 0, aFieldMgrsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addFieldMgrs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addFieldMgrs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addFieldMgrs", null); return;}
    otherFieldMgrs[ aFieldMgrsLength] = aNewFieldMgrs;

      // Set the new collection
    setFieldMgrsPrivileged( theCtxt, otherFieldMgrs);
  }




    /* Public ordered Write accessor for role FieldMgrs
     */
  public void addFieldMgrsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theRelativeFieldMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theFieldMgrs == null) { return;}

      // If relative FieldMgrs is null, perform normal add operation
    if( theRelativeFieldMgrs == null) {
      addFieldMgrsPR( theCtxt, theFieldMgrs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc[] someFieldMgrs = getFieldMgrsPrivileged( theCtxt);
    if( someFieldMgrs == null) { return;}


      // Get index of relative FieldMgrs
    int aRelativeIndex = indexOfFieldMgrsPR( theCtxt, theRelativeFieldMgrs);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addFieldMgrsPR( theCtxt, theFieldMgrs);
    }

      // Get length of FieldMgrs array
    int aFieldMgrsLength = someFieldMgrs.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aFieldMgrsLength) {
      addFieldMgrsPR( theCtxt, theFieldMgrs);
    }

      // Check for new FieldMgrs already in collection
    if( hasFieldMgrsPR( theCtxt, theFieldMgrs)) { return;}


    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv aNewFieldMgrs = (com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv) theFieldMgrs;

      // Link reverse ref to this object
    aNewFieldMgrs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship FieldMgrs
      // Grow collection and add new FieldMgrs element
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] otherFieldMgrs = new com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[ aFieldMgrsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someFieldMgrs, 0, otherFieldMgrs, 0, aRelativeIndex );
      }
      System.arraycopy( someFieldMgrs, aRelativeIndex, otherFieldMgrs, aRelativeIndex + 1, aFieldMgrsLength - aRelativeIndex);
      otherFieldMgrs[ aRelativeIndex] = aNewFieldMgrs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addFieldMgrsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addFieldMgrsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addFieldMgrsBefore", null); return;}

      // Set the new collection
    setFieldMgrsPrivileged( theCtxt, otherFieldMgrs);
  }





    /* Public Write accessor for role FieldMgrs
     */
  public void removeFieldMgrsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theFieldMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc[] someFieldMgrs = getFieldMgrsPrivileged( theCtxt);
    if( someFieldMgrs == null) { return;}

      // Check for new FieldMgrs not in collection
    int aFieldMgrsLength = someFieldMgrs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aFieldMgrsLength ; anIndex++) {
      if( theFieldMgrs.sameAs( theCtxt, someFieldMgrs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv aNewFieldMgrs = (com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv) theFieldMgrs;

      // Unlink reverse ref from the new related object
    aNewFieldMgrs.unsetTraversalConfigPrivileged( theCtxt);

      // Shrink collection removing FieldMgrs element
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] otherFieldMgrs = new com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[ aFieldMgrsLength - 1];
    try {
      System.arraycopy( someFieldMgrs, 0, otherFieldMgrs, 0, aFoundIndex);
      System.arraycopy( someFieldMgrs, aFoundIndex + 1, otherFieldMgrs, aFoundIndex, aFieldMgrsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeFieldMgrs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeFieldMgrs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeFieldMgrs", null); return;}

      // Set the new collection
    setFieldMgrsPrivileged( theCtxt, otherFieldMgrs);
  }




    /* Public reorder accessor for role FieldMgrs
     */
  public void moveFieldMgrsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theRelativeFieldMgrs) throws EAIException {

      // Null value is nothing to move
    if( theFieldMgrs == null) { return;}

      // If relative FieldMgrs is null, perform move to last position
    if( theRelativeFieldMgrs == null) {
      moveFieldMgrsToLastPR( theCtxt, theFieldMgrs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc[] someFieldMgrs = getFieldMgrsPrivileged( theCtxt);
    if( someFieldMgrs == null) { return;}

      // Get length of FieldMgrs array
    int aFieldMgrsLength = someFieldMgrs.length;

      // Get index of FieldMgrs to move
    int aToMoveIndex = indexOfFieldMgrsPR( theCtxt, theFieldMgrs);
      // If toMove FieldMgrs not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aFieldMgrsLength) {
      moveFieldMgrsToLastPR( theCtxt, theFieldMgrs);
    }

      // Get index of relative FieldMgrs
    int aRelativeIndex = indexOfFieldMgrsPR( theCtxt, theRelativeFieldMgrs);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveFieldMgrsToLastPR( theCtxt, theFieldMgrs);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aFieldMgrsLength) {
      moveFieldMgrsToLastPR( theCtxt, theFieldMgrs);
    }

      // ToMove and relative FieldMgrs are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv aToMoveFieldMgrs = (com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv) theFieldMgrs;

      // Allocate new array for new version of state of relationship FieldMgrs
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] otherFieldMgrs = new com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[ aFieldMgrsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someFieldMgrs, 0, otherFieldMgrs, 0, aToMoveIndex );
        System.arraycopy( someFieldMgrs, aToMoveIndex + 1, otherFieldMgrs, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherFieldMgrs[ aRelativeIndex - 1] = aToMoveFieldMgrs;
        System.arraycopy( someFieldMgrs, aRelativeIndex, otherFieldMgrs, aRelativeIndex, aFieldMgrsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someFieldMgrs, 0, otherFieldMgrs, 0, aRelativeIndex );
        otherFieldMgrs[ aRelativeIndex ] = aToMoveFieldMgrs;
        System.arraycopy( someFieldMgrs, aRelativeIndex, otherFieldMgrs, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aFieldMgrsLength - 1) {
          System.arraycopy( someFieldMgrs, aToMoveIndex + 1, otherFieldMgrs, aToMoveIndex + 1, aFieldMgrsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveFieldMgrsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveFieldMgrsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveFieldMgrsBefore", null); return;}

      // Set the new collection
    setFieldMgrsPrivileged( theCtxt, otherFieldMgrs);
  }





    /* Public move to last accessor for role FieldMgrs
     */
  public void moveFieldMgrsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theFieldMgrs) throws EAIException {

      // Null value is nothing to move
    if( theFieldMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc[] someFieldMgrs = getFieldMgrsPrivileged( theCtxt);
    if( someFieldMgrs == null) { return;}

      // Get length of FieldMgrs array
    int aFieldMgrsLength = someFieldMgrs.length;

      // Get index of FieldMgrs to move
    int aToMoveIndex = indexOfFieldMgrsPR( theCtxt, theFieldMgrs);

      // If toMove FieldMgrs not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aFieldMgrsLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv aToMoveFieldMgrs = (com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv) theFieldMgrs;

      // Allocate new array for new version of state of relationship FieldMgrs
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] otherFieldMgrs = new com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[ aFieldMgrsLength];
    try {
      System.arraycopy( someFieldMgrs, 0, otherFieldMgrs, 0, aToMoveIndex );
      System.arraycopy( someFieldMgrs, aToMoveIndex + 1, otherFieldMgrs, aToMoveIndex, aFieldMgrsLength - aToMoveIndex - 1);
      otherFieldMgrs[ aFieldMgrsLength - 1] = aToMoveFieldMgrs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveFieldMgrsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveFieldMgrsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveFieldMgrsToLast", null); return;}

      // Set the new collection
    setFieldMgrsPrivileged( theCtxt, otherFieldMgrs);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship FieldMgrs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role FieldMgrs
     */
  public void addFieldMgrsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv theFieldMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theFieldMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc[] someFieldMgrs = getFieldMgrsPrivileged( theCtxt);
    if( someFieldMgrs == null) { return;}

      // Check for new FieldMgrs already in collection
    int aFieldMgrsLength = someFieldMgrs.length;
    for( int anIndex = 0 ; anIndex < aFieldMgrsLength ; anIndex++) {
      if( theFieldMgrs.sameAs( theCtxt, someFieldMgrs[ anIndex])) { return;}
    }

      // Grow collection and add new FieldMgrs element
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] otherFieldMgrs = new com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[ aFieldMgrsLength + 1];
    try {
      System.arraycopy( someFieldMgrs, 0, otherFieldMgrs, 0, aFieldMgrsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addFieldMgrsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addFieldMgrsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addFieldMgrsPrivileged", null); return;}

    otherFieldMgrs[ aFieldMgrsLength] = theFieldMgrs;

      // Set the new collection
    setFieldMgrsPrivileged( theCtxt, otherFieldMgrs);
  }









    /* Privileged Write accessor for role FieldMgrs
     */
  public void removeFieldMgrsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv theFieldMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theFieldMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] someFieldMgrs = getFieldMgrsPrivileged( theCtxt);
    if( someFieldMgrs == null) { return;}

      // Check for new FieldMgrs not in collection
    int aFieldMgrsLength = someFieldMgrs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aFieldMgrsLength ; anIndex++) {
      if( theFieldMgrs.sameAs( theCtxt, someFieldMgrs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing FieldMgrs element
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] otherFieldMgrs = new com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[ aFieldMgrsLength - 1];
    try {
      System.arraycopy( someFieldMgrs, 0, otherFieldMgrs, 0, aFoundIndex);
      System.arraycopy( someFieldMgrs, aFoundIndex + 1, otherFieldMgrs, aFoundIndex, aFieldMgrsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeFieldMgrsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeFieldMgrsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeFieldMgrsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv.class}); return;}

      // Set the new collection
    setFieldMgrsPrivileged( theCtxt, otherFieldMgrs);
  }






    /* Privileged Read accessor for role FieldMgrs
     * Guaranteed to return object with same identity of the FieldMgrs
     */
  public com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] getFieldMgrsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrFieldMgrs;
  }




    /* Set reference in role FieldMgrs
     * Used by relationship maintenance machinery
     */
  public void setFieldMgrsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] theFieldMgrsCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv[] aFieldMgrs = vrFieldMgrs;
    vrFieldMgrs = theFieldMgrsCollection;
      // Propagate change
    change( theCtxt, "FieldMgrs", aFieldMgrs, vrFieldMgrs, "vrFieldMgrs");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship BranchMgrs
 ****************************************************************************/


    /* Public Read accessor for role BranchMgrs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc[] getBranchMgrs( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getBranchMgrsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getBranchMgrsPR( theCtxt);
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

    /* Public BranchMgrs number access
     */
  public int numBranchMgrs( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numBranchMgrsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numBranchMgrsPR( theCtxt);
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



    /* Public BranchMgrs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc getBranchMgrsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getBranchMgrsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getBranchMgrsAtPR( theCtxt, theIndex);
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


    /* Public BranchMgrs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc findBranchMgrsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findBranchMgrsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findBranchMgrsNamedPR( theCtxt, theMMName);
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




    /* Public BranchMgrs is related predicate
     */
  public boolean hasBranchMgrsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasBranchMgrsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasBranchMgrsNamedPR( theCtxt, theMMName);
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



    /* Transactional BranchMgrs is related  predicate
     */
  public boolean hasBranchMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasBranchMgrsPR( theCtxt, theBranchMgrs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasBranchMgrsPR( theCtxt, theBranchMgrs);
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


    /* Public BranchMgrs index access
     */
  public int indexOfBranchMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfBranchMgrsPR( theCtxt, theBranchMgrs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfBranchMgrsPR( theCtxt, theBranchMgrs);
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
  public void addBranchMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addBranchMgrsPR( theCtxt, theBranchMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addBranchMgrsPR( theCtxt, theBranchMgrs);
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
  public void addBranchMgrsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theRelativeBranchMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addBranchMgrsBeforePR( theCtxt, theBranchMgrs, theRelativeBranchMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addBranchMgrsBeforePR( theCtxt, theBranchMgrs, theRelativeBranchMgrs);
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





    /* Transactional Public Write Remove accessor for role BranchMgrs
     */
  public void removeBranchMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeBranchMgrsPR( theCtxt, theBranchMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeBranchMgrsPR( theCtxt, theBranchMgrs);
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



    /* Public reorder accessor for role BranchMgrs
     */
  public void moveBranchMgrsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theRelativeBranchMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveBranchMgrsBeforePR( theCtxt, theBranchMgrs, theRelativeBranchMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveBranchMgrsBeforePR( theCtxt, theBranchMgrs, theRelativeBranchMgrs);
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



    /* Public reorder accessor for role BranchMgrs
     */
  public void moveBranchMgrsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveBranchMgrsToLastPR( theCtxt, theBranchMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveBranchMgrsToLastPR( theCtxt, theBranchMgrs);
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
 *  Implementation of internal operations for relationship BranchMgrs
 ****************************************************************************/


    /* Public Read accessor for role BranchMgrs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc[] getBranchMgrsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] someBranchMgrs = getBranchMgrsPrivileged( theCtxt);
    if( someBranchMgrs == null) { return null;}

    int aBranchMgrsLength = someBranchMgrs.length;
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc[] otherBranchMgrs = new com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc[ aBranchMgrsLength];
    try { System.arraycopy( someBranchMgrs, 0, otherBranchMgrs, 0, aBranchMgrsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getBranchMgrs", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getBranchMgrs", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getBranchMgrs", null); return null;}


    return otherBranchMgrs;
  }



    /* Public BranchMgrs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc findBranchMgrsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] someBranchMgrs = getBranchMgrsPrivileged( theCtxt);
    if( someBranchMgrs == null) { return null;}

      // Check for new BranchMgrs already in collection
    int aBranchMgrsLength = someBranchMgrs.length;
    for( int anIndex = 0 ; anIndex < aBranchMgrsLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv aBranchMgrs = someBranchMgrs[ anIndex];
      if( aBranchMgrs.sameNameAs( theCtxt, theMMName)) { return aBranchMgrs;}
    }
    return null;
  }



    /* Public BranchMgrs finder predicate by name
     */
  public boolean hasBranchMgrsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findBranchMgrsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public BranchMgrs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc getBranchMgrsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] someBranchMgrs = getBranchMgrsPrivileged( theCtxt);
    if( someBranchMgrs == null) { return null;}

      // Get number of BranchMgrs
    int aBranchMgrsLength = someBranchMgrs.length;

      // Verify index within array length
    if( theIndex >= aBranchMgrsLength) { return null;}

      // Get indexed BranchMgrs
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aBranchMgrs = someBranchMgrs[ theIndex];

    return aBranchMgrs;
  }



    /* Public BranchMgrs is related predicate
     */
  public boolean hasBranchMgrsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException {
    return indexOfBranchMgrsPR( theCtxt, theBranchMgrs) >= 0;
  }


    /* Public BranchMgrs index access
     */
  public int indexOfBranchMgrsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException {
      // Do not add null values to the collection
    if( theBranchMgrs == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] someBranchMgrs = getBranchMgrsPrivileged( theCtxt);
    if( someBranchMgrs == null) { return -1;}

      // Check for new BranchMgrs already in collection
    int aBranchMgrsLength = someBranchMgrs.length;
    for( int anIndex = 0 ; anIndex < aBranchMgrsLength ; anIndex++) {
      if( someBranchMgrs[ anIndex].sameAs( theCtxt, theBranchMgrs)) { return anIndex;}
    }
    return -1;
  }


    /* Public BranchMgrs number access
     */
  public int numBranchMgrsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] someBranchMgrs = getBranchMgrsPrivileged( theCtxt);
    if( someBranchMgrs == null) { return 0;}

      // Check for new BranchMgrs already in collection
    int aBranchMgrsLength = someBranchMgrs.length;
    return aBranchMgrsLength;
  }




    /* Public Write accessor for role BranchMgrs
     */
  public void addBranchMgrsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc[] someBranchMgrs = getBranchMgrsPrivileged( theCtxt);
    if( someBranchMgrs == null) { return;}

      // Check for new BranchMgrs already in collection
    int aBranchMgrsLength = someBranchMgrs.length;
    for( int anIndex = 0 ; anIndex < aBranchMgrsLength ; anIndex++) {
      if( theBranchMgrs.sameAs( theCtxt, someBranchMgrs[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv aNewBranchMgrs = (com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv) theBranchMgrs;

      // Link reverse ref to this object
    aNewBranchMgrs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Grow collection and add new BranchMgrs element
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] otherBranchMgrs = new com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[ aBranchMgrsLength + 1];
    try { System.arraycopy( someBranchMgrs, 0, otherBranchMgrs, 0, aBranchMgrsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchMgrs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchMgrs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchMgrs", null); return;}
    otherBranchMgrs[ aBranchMgrsLength] = aNewBranchMgrs;

      // Set the new collection
    setBranchMgrsPrivileged( theCtxt, otherBranchMgrs);
  }




    /* Public ordered Write accessor for role BranchMgrs
     */
  public void addBranchMgrsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theRelativeBranchMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchMgrs == null) { return;}

      // If relative BranchMgrs is null, perform normal add operation
    if( theRelativeBranchMgrs == null) {
      addBranchMgrsPR( theCtxt, theBranchMgrs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc[] someBranchMgrs = getBranchMgrsPrivileged( theCtxt);
    if( someBranchMgrs == null) { return;}


      // Get index of relative BranchMgrs
    int aRelativeIndex = indexOfBranchMgrsPR( theCtxt, theRelativeBranchMgrs);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addBranchMgrsPR( theCtxt, theBranchMgrs);
    }

      // Get length of BranchMgrs array
    int aBranchMgrsLength = someBranchMgrs.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aBranchMgrsLength) {
      addBranchMgrsPR( theCtxt, theBranchMgrs);
    }

      // Check for new BranchMgrs already in collection
    if( hasBranchMgrsPR( theCtxt, theBranchMgrs)) { return;}


    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv aNewBranchMgrs = (com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv) theBranchMgrs;

      // Link reverse ref to this object
    aNewBranchMgrs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship BranchMgrs
      // Grow collection and add new BranchMgrs element
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] otherBranchMgrs = new com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[ aBranchMgrsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someBranchMgrs, 0, otherBranchMgrs, 0, aRelativeIndex );
      }
      System.arraycopy( someBranchMgrs, aRelativeIndex, otherBranchMgrs, aRelativeIndex + 1, aBranchMgrsLength - aRelativeIndex);
      otherBranchMgrs[ aRelativeIndex] = aNewBranchMgrs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchMgrsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchMgrsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchMgrsBefore", null); return;}

      // Set the new collection
    setBranchMgrsPrivileged( theCtxt, otherBranchMgrs);
  }





    /* Public Write accessor for role BranchMgrs
     */
  public void removeBranchMgrsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc[] someBranchMgrs = getBranchMgrsPrivileged( theCtxt);
    if( someBranchMgrs == null) { return;}

      // Check for new BranchMgrs not in collection
    int aBranchMgrsLength = someBranchMgrs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aBranchMgrsLength ; anIndex++) {
      if( theBranchMgrs.sameAs( theCtxt, someBranchMgrs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv aNewBranchMgrs = (com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv) theBranchMgrs;

      // Unlink reverse ref from the new related object
    aNewBranchMgrs.unsetTraversalConfigPrivileged( theCtxt);

      // Shrink collection removing BranchMgrs element
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] otherBranchMgrs = new com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[ aBranchMgrsLength - 1];
    try {
      System.arraycopy( someBranchMgrs, 0, otherBranchMgrs, 0, aFoundIndex);
      System.arraycopy( someBranchMgrs, aFoundIndex + 1, otherBranchMgrs, aFoundIndex, aBranchMgrsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchMgrs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchMgrs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchMgrs", null); return;}

      // Set the new collection
    setBranchMgrsPrivileged( theCtxt, otherBranchMgrs);
  }




    /* Public reorder accessor for role BranchMgrs
     */
  public void moveBranchMgrsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theRelativeBranchMgrs) throws EAIException {

      // Null value is nothing to move
    if( theBranchMgrs == null) { return;}

      // If relative BranchMgrs is null, perform move to last position
    if( theRelativeBranchMgrs == null) {
      moveBranchMgrsToLastPR( theCtxt, theBranchMgrs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc[] someBranchMgrs = getBranchMgrsPrivileged( theCtxt);
    if( someBranchMgrs == null) { return;}

      // Get length of BranchMgrs array
    int aBranchMgrsLength = someBranchMgrs.length;

      // Get index of BranchMgrs to move
    int aToMoveIndex = indexOfBranchMgrsPR( theCtxt, theBranchMgrs);
      // If toMove BranchMgrs not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aBranchMgrsLength) {
      moveBranchMgrsToLastPR( theCtxt, theBranchMgrs);
    }

      // Get index of relative BranchMgrs
    int aRelativeIndex = indexOfBranchMgrsPR( theCtxt, theRelativeBranchMgrs);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveBranchMgrsToLastPR( theCtxt, theBranchMgrs);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aBranchMgrsLength) {
      moveBranchMgrsToLastPR( theCtxt, theBranchMgrs);
    }

      // ToMove and relative BranchMgrs are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv aToMoveBranchMgrs = (com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv) theBranchMgrs;

      // Allocate new array for new version of state of relationship BranchMgrs
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] otherBranchMgrs = new com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[ aBranchMgrsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someBranchMgrs, 0, otherBranchMgrs, 0, aToMoveIndex );
        System.arraycopy( someBranchMgrs, aToMoveIndex + 1, otherBranchMgrs, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherBranchMgrs[ aRelativeIndex - 1] = aToMoveBranchMgrs;
        System.arraycopy( someBranchMgrs, aRelativeIndex, otherBranchMgrs, aRelativeIndex, aBranchMgrsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someBranchMgrs, 0, otherBranchMgrs, 0, aRelativeIndex );
        otherBranchMgrs[ aRelativeIndex ] = aToMoveBranchMgrs;
        System.arraycopy( someBranchMgrs, aRelativeIndex, otherBranchMgrs, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aBranchMgrsLength - 1) {
          System.arraycopy( someBranchMgrs, aToMoveIndex + 1, otherBranchMgrs, aToMoveIndex + 1, aBranchMgrsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchMgrsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchMgrsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchMgrsBefore", null); return;}

      // Set the new collection
    setBranchMgrsPrivileged( theCtxt, otherBranchMgrs);
  }





    /* Public move to last accessor for role BranchMgrs
     */
  public void moveBranchMgrsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc theBranchMgrs) throws EAIException {

      // Null value is nothing to move
    if( theBranchMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc[] someBranchMgrs = getBranchMgrsPrivileged( theCtxt);
    if( someBranchMgrs == null) { return;}

      // Get length of BranchMgrs array
    int aBranchMgrsLength = someBranchMgrs.length;

      // Get index of BranchMgrs to move
    int aToMoveIndex = indexOfBranchMgrsPR( theCtxt, theBranchMgrs);

      // If toMove BranchMgrs not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aBranchMgrsLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv aToMoveBranchMgrs = (com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv) theBranchMgrs;

      // Allocate new array for new version of state of relationship BranchMgrs
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] otherBranchMgrs = new com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[ aBranchMgrsLength];
    try {
      System.arraycopy( someBranchMgrs, 0, otherBranchMgrs, 0, aToMoveIndex );
      System.arraycopy( someBranchMgrs, aToMoveIndex + 1, otherBranchMgrs, aToMoveIndex, aBranchMgrsLength - aToMoveIndex - 1);
      otherBranchMgrs[ aBranchMgrsLength - 1] = aToMoveBranchMgrs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchMgrsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchMgrsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveBranchMgrsToLast", null); return;}

      // Set the new collection
    setBranchMgrsPrivileged( theCtxt, otherBranchMgrs);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship BranchMgrs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role BranchMgrs
     */
  public void addBranchMgrsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv theBranchMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc[] someBranchMgrs = getBranchMgrsPrivileged( theCtxt);
    if( someBranchMgrs == null) { return;}

      // Check for new BranchMgrs already in collection
    int aBranchMgrsLength = someBranchMgrs.length;
    for( int anIndex = 0 ; anIndex < aBranchMgrsLength ; anIndex++) {
      if( theBranchMgrs.sameAs( theCtxt, someBranchMgrs[ anIndex])) { return;}
    }

      // Grow collection and add new BranchMgrs element
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] otherBranchMgrs = new com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[ aBranchMgrsLength + 1];
    try {
      System.arraycopy( someBranchMgrs, 0, otherBranchMgrs, 0, aBranchMgrsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchMgrsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchMgrsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addBranchMgrsPrivileged", null); return;}

    otherBranchMgrs[ aBranchMgrsLength] = theBranchMgrs;

      // Set the new collection
    setBranchMgrsPrivileged( theCtxt, otherBranchMgrs);
  }









    /* Privileged Write accessor for role BranchMgrs
     */
  public void removeBranchMgrsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv theBranchMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theBranchMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] someBranchMgrs = getBranchMgrsPrivileged( theCtxt);
    if( someBranchMgrs == null) { return;}

      // Check for new BranchMgrs not in collection
    int aBranchMgrsLength = someBranchMgrs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aBranchMgrsLength ; anIndex++) {
      if( theBranchMgrs.sameAs( theCtxt, someBranchMgrs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing BranchMgrs element
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] otherBranchMgrs = new com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[ aBranchMgrsLength - 1];
    try {
      System.arraycopy( someBranchMgrs, 0, otherBranchMgrs, 0, aFoundIndex);
      System.arraycopy( someBranchMgrs, aFoundIndex + 1, otherBranchMgrs, aFoundIndex, aBranchMgrsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchMgrsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchMgrsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeBranchMgrsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv.class}); return;}

      // Set the new collection
    setBranchMgrsPrivileged( theCtxt, otherBranchMgrs);
  }






    /* Privileged Read accessor for role BranchMgrs
     * Guaranteed to return object with same identity of the BranchMgrs
     */
  public com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] getBranchMgrsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrBranchMgrs;
  }




    /* Set reference in role BranchMgrs
     * Used by relationship maintenance machinery
     */
  public void setBranchMgrsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] theBranchMgrsCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv[] aBranchMgrs = vrBranchMgrs;
    vrBranchMgrs = theBranchMgrsCollection;
      // Propagate change
    change( theCtxt, "BranchMgrs", aBranchMgrs, vrBranchMgrs, "vrBranchMgrs");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship NodeMgrs
 ****************************************************************************/


    /* Public Read accessor for role NodeMgrs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] getNodeMgrs( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getNodeMgrsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getNodeMgrsPR( theCtxt);
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

    /* Public NodeMgrs number access
     */
  public int numNodeMgrs( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numNodeMgrsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numNodeMgrsPR( theCtxt);
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



    /* Public NodeMgrs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc getNodeMgrsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getNodeMgrsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getNodeMgrsAtPR( theCtxt, theIndex);
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


    /* Public NodeMgrs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc findNodeMgrsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findNodeMgrsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findNodeMgrsNamedPR( theCtxt, theMMName);
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




    /* Public NodeMgrs is related predicate
     */
  public boolean hasNodeMgrsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasNodeMgrsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasNodeMgrsNamedPR( theCtxt, theMMName);
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



    /* Transactional NodeMgrs is related  predicate
     */
  public boolean hasNodeMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasNodeMgrsPR( theCtxt, theNodeMgrs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasNodeMgrsPR( theCtxt, theNodeMgrs);
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


    /* Public NodeMgrs index access
     */
  public int indexOfNodeMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfNodeMgrsPR( theCtxt, theNodeMgrs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfNodeMgrsPR( theCtxt, theNodeMgrs);
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
  public void addNodeMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addNodeMgrsPR( theCtxt, theNodeMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addNodeMgrsPR( theCtxt, theNodeMgrs);
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
  public void addNodeMgrsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theRelativeNodeMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addNodeMgrsBeforePR( theCtxt, theNodeMgrs, theRelativeNodeMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addNodeMgrsBeforePR( theCtxt, theNodeMgrs, theRelativeNodeMgrs);
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





    /* Transactional Public Write Remove accessor for role NodeMgrs
     */
  public void removeNodeMgrs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeNodeMgrsPR( theCtxt, theNodeMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeNodeMgrsPR( theCtxt, theNodeMgrs);
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



    /* Public reorder accessor for role NodeMgrs
     */
  public void moveNodeMgrsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theRelativeNodeMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveNodeMgrsBeforePR( theCtxt, theNodeMgrs, theRelativeNodeMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveNodeMgrsBeforePR( theCtxt, theNodeMgrs, theRelativeNodeMgrs);
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



    /* Public reorder accessor for role NodeMgrs
     */
  public void moveNodeMgrsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveNodeMgrsToLastPR( theCtxt, theNodeMgrs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveNodeMgrsToLastPR( theCtxt, theNodeMgrs);
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
 *  Implementation of internal operations for relationship NodeMgrs
 ****************************************************************************/


    /* Public Read accessor for role NodeMgrs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] getNodeMgrsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] someNodeMgrs = getNodeMgrsPrivileged( theCtxt);
    if( someNodeMgrs == null) { return null;}

    int aNodeMgrsLength = someNodeMgrs.length;
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] otherNodeMgrs = new com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[ aNodeMgrsLength];
    try { System.arraycopy( someNodeMgrs, 0, otherNodeMgrs, 0, aNodeMgrsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getNodeMgrs", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getNodeMgrs", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getNodeMgrs", null); return null;}


    return otherNodeMgrs;
  }



    /* Public NodeMgrs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc findNodeMgrsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] someNodeMgrs = getNodeMgrsPrivileged( theCtxt);
    if( someNodeMgrs == null) { return null;}

      // Check for new NodeMgrs already in collection
    int aNodeMgrsLength = someNodeMgrs.length;
    for( int anIndex = 0 ; anIndex < aNodeMgrsLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv aNodeMgrs = someNodeMgrs[ anIndex];
      if( aNodeMgrs.sameNameAs( theCtxt, theMMName)) { return aNodeMgrs;}
    }
    return null;
  }



    /* Public NodeMgrs finder predicate by name
     */
  public boolean hasNodeMgrsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findNodeMgrsNamedPR( theCtxt, theMMName) != null;
  }


    /* Public NodeMgrs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc getNodeMgrsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] someNodeMgrs = getNodeMgrsPrivileged( theCtxt);
    if( someNodeMgrs == null) { return null;}

      // Get number of NodeMgrs
    int aNodeMgrsLength = someNodeMgrs.length;

      // Verify index within array length
    if( theIndex >= aNodeMgrsLength) { return null;}

      // Get indexed NodeMgrs
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aNodeMgrs = someNodeMgrs[ theIndex];

    return aNodeMgrs;
  }



    /* Public NodeMgrs is related predicate
     */
  public boolean hasNodeMgrsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException {
    return indexOfNodeMgrsPR( theCtxt, theNodeMgrs) >= 0;
  }


    /* Public NodeMgrs index access
     */
  public int indexOfNodeMgrsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException {
      // Do not add null values to the collection
    if( theNodeMgrs == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] someNodeMgrs = getNodeMgrsPrivileged( theCtxt);
    if( someNodeMgrs == null) { return -1;}

      // Check for new NodeMgrs already in collection
    int aNodeMgrsLength = someNodeMgrs.length;
    for( int anIndex = 0 ; anIndex < aNodeMgrsLength ; anIndex++) {
      if( someNodeMgrs[ anIndex].sameAs( theCtxt, theNodeMgrs)) { return anIndex;}
    }
    return -1;
  }


    /* Public NodeMgrs number access
     */
  public int numNodeMgrsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] someNodeMgrs = getNodeMgrsPrivileged( theCtxt);
    if( someNodeMgrs == null) { return 0;}

      // Check for new NodeMgrs already in collection
    int aNodeMgrsLength = someNodeMgrs.length;
    return aNodeMgrsLength;
  }




    /* Public Write accessor for role NodeMgrs
     */
  public void addNodeMgrsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theNodeMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] someNodeMgrs = getNodeMgrsPrivileged( theCtxt);
    if( someNodeMgrs == null) { return;}

      // Check for new NodeMgrs already in collection
    int aNodeMgrsLength = someNodeMgrs.length;
    for( int anIndex = 0 ; anIndex < aNodeMgrsLength ; anIndex++) {
      if( theNodeMgrs.sameAs( theCtxt, someNodeMgrs[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv aNewNodeMgrs = (com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv) theNodeMgrs;

      // Link reverse ref to this object
    aNewNodeMgrs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Grow collection and add new NodeMgrs element
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] otherNodeMgrs = new com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[ aNodeMgrsLength + 1];
    try { System.arraycopy( someNodeMgrs, 0, otherNodeMgrs, 0, aNodeMgrsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeMgrs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeMgrs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeMgrs", null); return;}
    otherNodeMgrs[ aNodeMgrsLength] = aNewNodeMgrs;

      // Set the new collection
    setNodeMgrsPrivileged( theCtxt, otherNodeMgrs);
  }




    /* Public ordered Write accessor for role NodeMgrs
     */
  public void addNodeMgrsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theRelativeNodeMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theNodeMgrs == null) { return;}

      // If relative NodeMgrs is null, perform normal add operation
    if( theRelativeNodeMgrs == null) {
      addNodeMgrsPR( theCtxt, theNodeMgrs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] someNodeMgrs = getNodeMgrsPrivileged( theCtxt);
    if( someNodeMgrs == null) { return;}


      // Get index of relative NodeMgrs
    int aRelativeIndex = indexOfNodeMgrsPR( theCtxt, theRelativeNodeMgrs);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addNodeMgrsPR( theCtxt, theNodeMgrs);
    }

      // Get length of NodeMgrs array
    int aNodeMgrsLength = someNodeMgrs.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aNodeMgrsLength) {
      addNodeMgrsPR( theCtxt, theNodeMgrs);
    }

      // Check for new NodeMgrs already in collection
    if( hasNodeMgrsPR( theCtxt, theNodeMgrs)) { return;}


    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv aNewNodeMgrs = (com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv) theNodeMgrs;

      // Link reverse ref to this object
    aNewNodeMgrs.unsetAndSetTraversalConfigPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship NodeMgrs
      // Grow collection and add new NodeMgrs element
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] otherNodeMgrs = new com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[ aNodeMgrsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someNodeMgrs, 0, otherNodeMgrs, 0, aRelativeIndex );
      }
      System.arraycopy( someNodeMgrs, aRelativeIndex, otherNodeMgrs, aRelativeIndex + 1, aNodeMgrsLength - aRelativeIndex);
      otherNodeMgrs[ aRelativeIndex] = aNewNodeMgrs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeMgrsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeMgrsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeMgrsBefore", null); return;}

      // Set the new collection
    setNodeMgrsPrivileged( theCtxt, otherNodeMgrs);
  }





    /* Public Write accessor for role NodeMgrs
     */
  public void removeNodeMgrsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theNodeMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] someNodeMgrs = getNodeMgrsPrivileged( theCtxt);
    if( someNodeMgrs == null) { return;}

      // Check for new NodeMgrs not in collection
    int aNodeMgrsLength = someNodeMgrs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aNodeMgrsLength ; anIndex++) {
      if( theNodeMgrs.sameAs( theCtxt, someNodeMgrs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv aNewNodeMgrs = (com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv) theNodeMgrs;

      // Unlink reverse ref from the new related object
    aNewNodeMgrs.unsetTraversalConfigPrivileged( theCtxt);

      // Shrink collection removing NodeMgrs element
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] otherNodeMgrs = new com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[ aNodeMgrsLength - 1];
    try {
      System.arraycopy( someNodeMgrs, 0, otherNodeMgrs, 0, aFoundIndex);
      System.arraycopy( someNodeMgrs, aFoundIndex + 1, otherNodeMgrs, aFoundIndex, aNodeMgrsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeNodeMgrs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeNodeMgrs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeNodeMgrs", null); return;}

      // Set the new collection
    setNodeMgrsPrivileged( theCtxt, otherNodeMgrs);
  }




    /* Public reorder accessor for role NodeMgrs
     */
  public void moveNodeMgrsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theRelativeNodeMgrs) throws EAIException {

      // Null value is nothing to move
    if( theNodeMgrs == null) { return;}

      // If relative NodeMgrs is null, perform move to last position
    if( theRelativeNodeMgrs == null) {
      moveNodeMgrsToLastPR( theCtxt, theNodeMgrs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] someNodeMgrs = getNodeMgrsPrivileged( theCtxt);
    if( someNodeMgrs == null) { return;}

      // Get length of NodeMgrs array
    int aNodeMgrsLength = someNodeMgrs.length;

      // Get index of NodeMgrs to move
    int aToMoveIndex = indexOfNodeMgrsPR( theCtxt, theNodeMgrs);
      // If toMove NodeMgrs not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aNodeMgrsLength) {
      moveNodeMgrsToLastPR( theCtxt, theNodeMgrs);
    }

      // Get index of relative NodeMgrs
    int aRelativeIndex = indexOfNodeMgrsPR( theCtxt, theRelativeNodeMgrs);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveNodeMgrsToLastPR( theCtxt, theNodeMgrs);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aNodeMgrsLength) {
      moveNodeMgrsToLastPR( theCtxt, theNodeMgrs);
    }

      // ToMove and relative NodeMgrs are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv aToMoveNodeMgrs = (com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv) theNodeMgrs;

      // Allocate new array for new version of state of relationship NodeMgrs
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] otherNodeMgrs = new com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[ aNodeMgrsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someNodeMgrs, 0, otherNodeMgrs, 0, aToMoveIndex );
        System.arraycopy( someNodeMgrs, aToMoveIndex + 1, otherNodeMgrs, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherNodeMgrs[ aRelativeIndex - 1] = aToMoveNodeMgrs;
        System.arraycopy( someNodeMgrs, aRelativeIndex, otherNodeMgrs, aRelativeIndex, aNodeMgrsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someNodeMgrs, 0, otherNodeMgrs, 0, aRelativeIndex );
        otherNodeMgrs[ aRelativeIndex ] = aToMoveNodeMgrs;
        System.arraycopy( someNodeMgrs, aRelativeIndex, otherNodeMgrs, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aNodeMgrsLength - 1) {
          System.arraycopy( someNodeMgrs, aToMoveIndex + 1, otherNodeMgrs, aToMoveIndex + 1, aNodeMgrsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveNodeMgrsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveNodeMgrsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveNodeMgrsBefore", null); return;}

      // Set the new collection
    setNodeMgrsPrivileged( theCtxt, otherNodeMgrs);
  }





    /* Public move to last accessor for role NodeMgrs
     */
  public void moveNodeMgrsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc theNodeMgrs) throws EAIException {

      // Null value is nothing to move
    if( theNodeMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] someNodeMgrs = getNodeMgrsPrivileged( theCtxt);
    if( someNodeMgrs == null) { return;}

      // Get length of NodeMgrs array
    int aNodeMgrsLength = someNodeMgrs.length;

      // Get index of NodeMgrs to move
    int aToMoveIndex = indexOfNodeMgrsPR( theCtxt, theNodeMgrs);

      // If toMove NodeMgrs not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aNodeMgrsLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv aToMoveNodeMgrs = (com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv) theNodeMgrs;

      // Allocate new array for new version of state of relationship NodeMgrs
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] otherNodeMgrs = new com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[ aNodeMgrsLength];
    try {
      System.arraycopy( someNodeMgrs, 0, otherNodeMgrs, 0, aToMoveIndex );
      System.arraycopy( someNodeMgrs, aToMoveIndex + 1, otherNodeMgrs, aToMoveIndex, aNodeMgrsLength - aToMoveIndex - 1);
      otherNodeMgrs[ aNodeMgrsLength - 1] = aToMoveNodeMgrs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveNodeMgrsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveNodeMgrsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveNodeMgrsToLast", null); return;}

      // Set the new collection
    setNodeMgrsPrivileged( theCtxt, otherNodeMgrs);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship NodeMgrs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role NodeMgrs
     */
  public void addNodeMgrsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv theNodeMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theNodeMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] someNodeMgrs = getNodeMgrsPrivileged( theCtxt);
    if( someNodeMgrs == null) { return;}

      // Check for new NodeMgrs already in collection
    int aNodeMgrsLength = someNodeMgrs.length;
    for( int anIndex = 0 ; anIndex < aNodeMgrsLength ; anIndex++) {
      if( theNodeMgrs.sameAs( theCtxt, someNodeMgrs[ anIndex])) { return;}
    }

      // Grow collection and add new NodeMgrs element
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] otherNodeMgrs = new com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[ aNodeMgrsLength + 1];
    try {
      System.arraycopy( someNodeMgrs, 0, otherNodeMgrs, 0, aNodeMgrsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeMgrsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeMgrsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addNodeMgrsPrivileged", null); return;}

    otherNodeMgrs[ aNodeMgrsLength] = theNodeMgrs;

      // Set the new collection
    setNodeMgrsPrivileged( theCtxt, otherNodeMgrs);
  }









    /* Privileged Write accessor for role NodeMgrs
     */
  public void removeNodeMgrsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv theNodeMgrs) throws EAIException {

      // Do not add null values to the collection
    if( theNodeMgrs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] someNodeMgrs = getNodeMgrsPrivileged( theCtxt);
    if( someNodeMgrs == null) { return;}

      // Check for new NodeMgrs not in collection
    int aNodeMgrsLength = someNodeMgrs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aNodeMgrsLength ; anIndex++) {
      if( theNodeMgrs.sameAs( theCtxt, someNodeMgrs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing NodeMgrs element
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] otherNodeMgrs = new com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[ aNodeMgrsLength - 1];
    try {
      System.arraycopy( someNodeMgrs, 0, otherNodeMgrs, 0, aFoundIndex);
      System.arraycopy( someNodeMgrs, aFoundIndex + 1, otherNodeMgrs, aFoundIndex, aNodeMgrsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeNodeMgrsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeNodeMgrsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeNodeMgrsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv.class}); return;}

      // Set the new collection
    setNodeMgrsPrivileged( theCtxt, otherNodeMgrs);
  }






    /* Privileged Read accessor for role NodeMgrs
     * Guaranteed to return object with same identity of the NodeMgrs
     */
  public com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] getNodeMgrsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrNodeMgrs;
  }




    /* Set reference in role NodeMgrs
     * Used by relationship maintenance machinery
     */
  public void setNodeMgrsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] theNodeMgrsCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv[] aNodeMgrs = vrNodeMgrs;
    vrNodeMgrs = theNodeMgrsCollection;
      // Propagate change
    change( theCtxt, "NodeMgrs", aNodeMgrs, vrNodeMgrs, "vrNodeMgrs");
  }








/****************************************************************************
 *  Implementation of  internal destructor of M3TraversalConfig
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 

 
      // When deleting : delete related RootTypeNodeConfigs
    com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc[] someRootTypeNodeConfigs = getRootTypeNodeConfigs( theCtxt);
    if( someRootTypeNodeConfigs != null) {
      int aRootTypeNodeConfigsLength = someRootTypeNodeConfigs.length;
      for( int anIndex = 0 ; anIndex < aRootTypeNodeConfigsLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3RootTypeNodeConfigIfc aRootTypeNodeConfigs = someRootTypeNodeConfigs[ anIndex];
        if( aRootTypeNodeConfigs != null) {
          com.dosmil_e.m3.traversal.impl.M3RootTypeNodeConfigImpl aRootTypeNodeConfigsImpl = null;
          try { aRootTypeNodeConfigsImpl = (com.dosmil_e.m3.traversal.impl.M3RootTypeNodeConfigImpl) aRootTypeNodeConfigs;} catch( ClassCastException anEx) {}
          if( aRootTypeNodeConfigsImpl != null) {
            aRootTypeNodeConfigsImpl.delete( theCtxt);
          }
        }
      }
    }
    

      // When deleting : delete related BranchConfigs
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someBranchConfigs = getBranchConfigs( theCtxt);
    if( someBranchConfigs != null) {
      int aBranchConfigsLength = someBranchConfigs.length;
      for( int anIndex = 0 ; anIndex < aBranchConfigsLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aBranchConfigs = someBranchConfigs[ anIndex];
        if( aBranchConfigs != null) {
          com.dosmil_e.m3.traversal.impl.M3BranchConfigImpl aBranchConfigsImpl = null;
          try { aBranchConfigsImpl = (com.dosmil_e.m3.traversal.impl.M3BranchConfigImpl) aBranchConfigs;} catch( ClassCastException anEx) {}
          if( aBranchConfigsImpl != null) {
            aBranchConfigsImpl.delete( theCtxt);
          }
        }
      }
    }
    

      // When deleting : delete related NodeConfigs
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someNodeConfigs = getNodeConfigs( theCtxt);
    if( someNodeConfigs != null) {
      int aNodeConfigsLength = someNodeConfigs.length;
      for( int anIndex = 0 ; anIndex < aNodeConfigsLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aNodeConfigs = someNodeConfigs[ anIndex];
        if( aNodeConfigs != null) {
          com.dosmil_e.m3.traversal.impl.M3NodeConfigImpl aNodeConfigsImpl = null;
          try { aNodeConfigsImpl = (com.dosmil_e.m3.traversal.impl.M3NodeConfigImpl) aNodeConfigs;} catch( ClassCastException anEx) {}
          if( aNodeConfigsImpl != null) {
            aNodeConfigsImpl.delete( theCtxt);
          }
        }
      }
    }
    

      // When deleting : delete related AttributeConfigs
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someAttributeConfigs = getAttributeConfigs( theCtxt);
    if( someAttributeConfigs != null) {
      int aAttributeConfigsLength = someAttributeConfigs.length;
      for( int anIndex = 0 ; anIndex < aAttributeConfigsLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aAttributeConfigs = someAttributeConfigs[ anIndex];
        if( aAttributeConfigs != null) {
          com.dosmil_e.m3.traversal.impl.M3AttributeConfigImpl aAttributeConfigsImpl = null;
          try { aAttributeConfigsImpl = (com.dosmil_e.m3.traversal.impl.M3AttributeConfigImpl) aAttributeConfigs;} catch( ClassCastException anEx) {}
          if( aAttributeConfigsImpl != null) {
            aAttributeConfigsImpl.delete( theCtxt);
          }
        }
      }
    }
    

      // When deleting : unlink related ConfigOverrides
    com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc[] someConfigOverrides = getConfigOverrides( theCtxt);
    if( someConfigOverrides != null) {
      int aConfigOverridesLength = someConfigOverrides.length;
      for( int anIndex = 0 ; anIndex < aConfigOverridesLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3ConfigOverrideIfc aConfigOverrides = someConfigOverrides[ anIndex];
        if( aConfigOverrides != null) {
          removeConfigOverrides( theCtxt, aConfigOverrides);
        }
      }
    }


    // When deleting unlink related Model
  setModel( theCtxt, null);


      // When deleting : delete related FieldMgrs
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc[] someFieldMgrs = getFieldMgrs( theCtxt);
    if( someFieldMgrs != null) {
      int aFieldMgrsLength = someFieldMgrs.length;
      for( int anIndex = 0 ; anIndex < aFieldMgrsLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aFieldMgrs = someFieldMgrs[ anIndex];
        if( aFieldMgrs != null) {
          com.dosmil_e.m3.traversal.impl.M3FieldMgrImpl aFieldMgrsImpl = null;
          try { aFieldMgrsImpl = (com.dosmil_e.m3.traversal.impl.M3FieldMgrImpl) aFieldMgrs;} catch( ClassCastException anEx) {}
          if( aFieldMgrsImpl != null) {
            aFieldMgrsImpl.delete( theCtxt);
          }
        }
      }
    }
    

      // When deleting : delete related BranchMgrs
    com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc[] someBranchMgrs = getBranchMgrs( theCtxt);
    if( someBranchMgrs != null) {
      int aBranchMgrsLength = someBranchMgrs.length;
      for( int anIndex = 0 ; anIndex < aBranchMgrsLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3BranchMgrIfc aBranchMgrs = someBranchMgrs[ anIndex];
        if( aBranchMgrs != null) {
          com.dosmil_e.m3.traversal.impl.M3BranchMgrImpl aBranchMgrsImpl = null;
          try { aBranchMgrsImpl = (com.dosmil_e.m3.traversal.impl.M3BranchMgrImpl) aBranchMgrs;} catch( ClassCastException anEx) {}
          if( aBranchMgrsImpl != null) {
            aBranchMgrsImpl.delete( theCtxt);
          }
        }
      }
    }
    

      // When deleting : delete related NodeMgrs
    com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc[] someNodeMgrs = getNodeMgrs( theCtxt);
    if( someNodeMgrs != null) {
      int aNodeMgrsLength = someNodeMgrs.length;
      for( int anIndex = 0 ; anIndex < aNodeMgrsLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3NodeMgrIfc aNodeMgrs = someNodeMgrs[ anIndex];
        if( aNodeMgrs != null) {
          com.dosmil_e.m3.traversal.impl.M3NodeMgrImpl aNodeMgrsImpl = null;
          try { aNodeMgrsImpl = (com.dosmil_e.m3.traversal.impl.M3NodeMgrImpl) aNodeMgrs;} catch( ClassCastException anEx) {}
          if( aNodeMgrsImpl != null) {
            aNodeMgrsImpl.delete( theCtxt);
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
      vm3Type = com.dosmil_e.m3.traversal.meta.M3TraversalConfigMeta.getStaticM3Type( theCtxt);
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


