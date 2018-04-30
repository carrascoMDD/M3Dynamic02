package com.dosmil_e.m3.traversal.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3BranchMgrBase
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.m3.traversal.priv.M3BranchMgrPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3BranchMgr metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the M3BranchMgr metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] vrInverseOFmetaBranchMgr = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv vrTraversalConfig; 






/****************************************************************************
 *  Constructors of the M3BranchMgr metamodel element
 ****************************************************************************/

  public M3BranchMgrBase() {
    super();
  }


  public M3BranchMgrBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3BranchMgrBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3BranchMgrIfc and M3BranchMgrPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3BranchMgr
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of M3BranchMgr
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFmetaBranchMgr
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaBranchMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getInverseOFmetaBranchMgr( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFmetaBranchMgrPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFmetaBranchMgrPR( theCtxt);
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

    /* Public InverseOFmetaBranchMgr number access
     */
  public int numInverseOFmetaBranchMgr( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFmetaBranchMgrPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFmetaBranchMgrPR( theCtxt);
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



    /* Public InverseOFmetaBranchMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc getInverseOFmetaBranchMgrAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFmetaBranchMgrAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFmetaBranchMgrAtPR( theCtxt, theIndex);
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


    /* Public InverseOFmetaBranchMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc findInverseOFmetaBranchMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFmetaBranchMgrNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFmetaBranchMgrNamedPR( theCtxt, theMMName);
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




    /* Public InverseOFmetaBranchMgr is related predicate
     */
  public boolean hasInverseOFmetaBranchMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFmetaBranchMgrNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFmetaBranchMgrNamedPR( theCtxt, theMMName);
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



    /* Transactional InverseOFmetaBranchMgr is related  predicate
     */
  public boolean hasInverseOFmetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr);
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


    /* Public InverseOFmetaBranchMgr index access
     */
  public int indexOfInverseOFmetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr);
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
  public void addInverseOFmetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr);
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
  public void addInverseOFmetaBranchMgrBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeInverseOFmetaBranchMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFmetaBranchMgrBeforePR( theCtxt, theInverseOFmetaBranchMgr, theRelativeInverseOFmetaBranchMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFmetaBranchMgrBeforePR( theCtxt, theInverseOFmetaBranchMgr, theRelativeInverseOFmetaBranchMgr);
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





    /* Transactional Public Write Remove accessor for role InverseOFmetaBranchMgr
     */
  public void removeInverseOFmetaBranchMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr);
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



    /* Public reorder accessor for role InverseOFmetaBranchMgr
     */
  public void moveInverseOFmetaBranchMgrBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeInverseOFmetaBranchMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFmetaBranchMgrBeforePR( theCtxt, theInverseOFmetaBranchMgr, theRelativeInverseOFmetaBranchMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFmetaBranchMgrBeforePR( theCtxt, theInverseOFmetaBranchMgr, theRelativeInverseOFmetaBranchMgr);
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



    /* Public reorder accessor for role InverseOFmetaBranchMgr
     */
  public void moveInverseOFmetaBranchMgrToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFmetaBranchMgrToLastPR( theCtxt, theInverseOFmetaBranchMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFmetaBranchMgrToLastPR( theCtxt, theInverseOFmetaBranchMgr);
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
 *  Implementation of internal operations for relationship InverseOFmetaBranchMgr
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaBranchMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] getInverseOFmetaBranchMgrPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someInverseOFmetaBranchMgr = getInverseOFmetaBranchMgrPrivileged( theCtxt);
    if( someInverseOFmetaBranchMgr == null) { return null;}

    int aInverseOFmetaBranchMgrLength = someInverseOFmetaBranchMgr.length;
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] otherInverseOFmetaBranchMgr = new com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[ aInverseOFmetaBranchMgrLength];
    try { System.arraycopy( someInverseOFmetaBranchMgr, 0, otherInverseOFmetaBranchMgr, 0, aInverseOFmetaBranchMgrLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaBranchMgr", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaBranchMgr", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaBranchMgr", null); return null;}


    return otherInverseOFmetaBranchMgr;
  }



    /* Public InverseOFmetaBranchMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc findInverseOFmetaBranchMgrNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someInverseOFmetaBranchMgr = getInverseOFmetaBranchMgrPrivileged( theCtxt);
    if( someInverseOFmetaBranchMgr == null) { return null;}

      // Check for new InverseOFmetaBranchMgr already in collection
    int aInverseOFmetaBranchMgrLength = someInverseOFmetaBranchMgr.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaBranchMgrLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aInverseOFmetaBranchMgr = someInverseOFmetaBranchMgr[ anIndex];
      if( aInverseOFmetaBranchMgr.sameNameAs( theCtxt, theMMName)) { return aInverseOFmetaBranchMgr;}
    }
    return null;
  }



    /* Public InverseOFmetaBranchMgr finder predicate by name
     */
  public boolean hasInverseOFmetaBranchMgrNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFmetaBranchMgrNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFmetaBranchMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc getInverseOFmetaBranchMgrAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someInverseOFmetaBranchMgr = getInverseOFmetaBranchMgrPrivileged( theCtxt);
    if( someInverseOFmetaBranchMgr == null) { return null;}

      // Get number of InverseOFmetaBranchMgr
    int aInverseOFmetaBranchMgrLength = someInverseOFmetaBranchMgr.length;

      // Verify index within array length
    if( theIndex >= aInverseOFmetaBranchMgrLength) { return null;}

      // Get indexed InverseOFmetaBranchMgr
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aInverseOFmetaBranchMgr = someInverseOFmetaBranchMgr[ theIndex];

    return aInverseOFmetaBranchMgr;
  }



    /* Public InverseOFmetaBranchMgr is related predicate
     */
  public boolean hasInverseOFmetaBranchMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException {
    return indexOfInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr) >= 0;
  }


    /* Public InverseOFmetaBranchMgr index access
     */
  public int indexOfInverseOFmetaBranchMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFmetaBranchMgr == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someInverseOFmetaBranchMgr = getInverseOFmetaBranchMgrPrivileged( theCtxt);
    if( someInverseOFmetaBranchMgr == null) { return -1;}

      // Check for new InverseOFmetaBranchMgr already in collection
    int aInverseOFmetaBranchMgrLength = someInverseOFmetaBranchMgr.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaBranchMgrLength ; anIndex++) {
      if( someInverseOFmetaBranchMgr[ anIndex].sameAs( theCtxt, theInverseOFmetaBranchMgr)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFmetaBranchMgr number access
     */
  public int numInverseOFmetaBranchMgrPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someInverseOFmetaBranchMgr = getInverseOFmetaBranchMgrPrivileged( theCtxt);
    if( someInverseOFmetaBranchMgr == null) { return 0;}

      // Check for new InverseOFmetaBranchMgr already in collection
    int aInverseOFmetaBranchMgrLength = someInverseOFmetaBranchMgr.length;
    return aInverseOFmetaBranchMgrLength;
  }




    /* Public Write accessor for role InverseOFmetaBranchMgr
     */
  public void addInverseOFmetaBranchMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaBranchMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaBranchMgr = getInverseOFmetaBranchMgrPrivileged( theCtxt);
    if( someInverseOFmetaBranchMgr == null) { return;}

      // Check for new InverseOFmetaBranchMgr already in collection
    int aInverseOFmetaBranchMgrLength = someInverseOFmetaBranchMgr.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaBranchMgrLength ; anIndex++) {
      if( theInverseOFmetaBranchMgr.sameAs( theCtxt, someInverseOFmetaBranchMgr[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aNewInverseOFmetaBranchMgr = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theInverseOFmetaBranchMgr;

      // Link reverse ref to this object
    aNewInverseOFmetaBranchMgr.unsetAndSetMetaBranchMgrPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFmetaBranchMgr element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaBranchMgr = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaBranchMgrLength + 1];
    try { System.arraycopy( someInverseOFmetaBranchMgr, 0, otherInverseOFmetaBranchMgr, 0, aInverseOFmetaBranchMgrLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaBranchMgr", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaBranchMgr", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaBranchMgr", null); return;}
    otherInverseOFmetaBranchMgr[ aInverseOFmetaBranchMgrLength] = aNewInverseOFmetaBranchMgr;

      // Set the new collection
    setInverseOFmetaBranchMgrPrivileged( theCtxt, otherInverseOFmetaBranchMgr);
  }




    /* Public ordered Write accessor for role InverseOFmetaBranchMgr
     */
  public void addInverseOFmetaBranchMgrBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeInverseOFmetaBranchMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaBranchMgr == null) { return;}

      // If relative InverseOFmetaBranchMgr is null, perform normal add operation
    if( theRelativeInverseOFmetaBranchMgr == null) {
      addInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaBranchMgr = getInverseOFmetaBranchMgrPrivileged( theCtxt);
    if( someInverseOFmetaBranchMgr == null) { return;}


      // Get index of relative InverseOFmetaBranchMgr
    int aRelativeIndex = indexOfInverseOFmetaBranchMgrPR( theCtxt, theRelativeInverseOFmetaBranchMgr);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr);
    }

      // Get length of InverseOFmetaBranchMgr array
    int aInverseOFmetaBranchMgrLength = someInverseOFmetaBranchMgr.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFmetaBranchMgrLength) {
      addInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr);
    }

      // Check for new InverseOFmetaBranchMgr already in collection
    if( hasInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr)) { return;}


    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aNewInverseOFmetaBranchMgr = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theInverseOFmetaBranchMgr;

      // Link reverse ref to this object
    aNewInverseOFmetaBranchMgr.unsetAndSetMetaBranchMgrPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFmetaBranchMgr
      // Grow collection and add new InverseOFmetaBranchMgr element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaBranchMgr = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaBranchMgrLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFmetaBranchMgr, 0, otherInverseOFmetaBranchMgr, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFmetaBranchMgr, aRelativeIndex, otherInverseOFmetaBranchMgr, aRelativeIndex + 1, aInverseOFmetaBranchMgrLength - aRelativeIndex);
      otherInverseOFmetaBranchMgr[ aRelativeIndex] = aNewInverseOFmetaBranchMgr;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaBranchMgrBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaBranchMgrBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaBranchMgrBefore", null); return;}

      // Set the new collection
    setInverseOFmetaBranchMgrPrivileged( theCtxt, otherInverseOFmetaBranchMgr);
  }





    /* Public Write accessor for role InverseOFmetaBranchMgr
     */
  public void removeInverseOFmetaBranchMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaBranchMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaBranchMgr = getInverseOFmetaBranchMgrPrivileged( theCtxt);
    if( someInverseOFmetaBranchMgr == null) { return;}

      // Check for new InverseOFmetaBranchMgr not in collection
    int aInverseOFmetaBranchMgrLength = someInverseOFmetaBranchMgr.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaBranchMgrLength ; anIndex++) {
      if( theInverseOFmetaBranchMgr.sameAs( theCtxt, someInverseOFmetaBranchMgr[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aNewInverseOFmetaBranchMgr = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theInverseOFmetaBranchMgr;

      // Unlink reverse ref from the new related object
    aNewInverseOFmetaBranchMgr.unsetMetaBranchMgrPrivileged( theCtxt);

      // Shrink collection removing InverseOFmetaBranchMgr element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaBranchMgr = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaBranchMgrLength - 1];
    try {
      System.arraycopy( someInverseOFmetaBranchMgr, 0, otherInverseOFmetaBranchMgr, 0, aFoundIndex);
      System.arraycopy( someInverseOFmetaBranchMgr, aFoundIndex + 1, otherInverseOFmetaBranchMgr, aFoundIndex, aInverseOFmetaBranchMgrLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaBranchMgr", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaBranchMgr", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaBranchMgr", null); return;}

      // Set the new collection
    setInverseOFmetaBranchMgrPrivileged( theCtxt, otherInverseOFmetaBranchMgr);
  }




    /* Public reorder accessor for role InverseOFmetaBranchMgr
     */
  public void moveInverseOFmetaBranchMgrBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theRelativeInverseOFmetaBranchMgr) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFmetaBranchMgr == null) { return;}

      // If relative InverseOFmetaBranchMgr is null, perform move to last position
    if( theRelativeInverseOFmetaBranchMgr == null) {
      moveInverseOFmetaBranchMgrToLastPR( theCtxt, theInverseOFmetaBranchMgr);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaBranchMgr = getInverseOFmetaBranchMgrPrivileged( theCtxt);
    if( someInverseOFmetaBranchMgr == null) { return;}

      // Get length of InverseOFmetaBranchMgr array
    int aInverseOFmetaBranchMgrLength = someInverseOFmetaBranchMgr.length;

      // Get index of InverseOFmetaBranchMgr to move
    int aToMoveIndex = indexOfInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr);
      // If toMove InverseOFmetaBranchMgr not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFmetaBranchMgrLength) {
      moveInverseOFmetaBranchMgrToLastPR( theCtxt, theInverseOFmetaBranchMgr);
    }

      // Get index of relative InverseOFmetaBranchMgr
    int aRelativeIndex = indexOfInverseOFmetaBranchMgrPR( theCtxt, theRelativeInverseOFmetaBranchMgr);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFmetaBranchMgrToLastPR( theCtxt, theInverseOFmetaBranchMgr);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFmetaBranchMgrLength) {
      moveInverseOFmetaBranchMgrToLastPR( theCtxt, theInverseOFmetaBranchMgr);
    }

      // ToMove and relative InverseOFmetaBranchMgr are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aToMoveInverseOFmetaBranchMgr = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theInverseOFmetaBranchMgr;

      // Allocate new array for new version of state of relationship InverseOFmetaBranchMgr
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaBranchMgr = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaBranchMgrLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFmetaBranchMgr, 0, otherInverseOFmetaBranchMgr, 0, aToMoveIndex );
        System.arraycopy( someInverseOFmetaBranchMgr, aToMoveIndex + 1, otherInverseOFmetaBranchMgr, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFmetaBranchMgr[ aRelativeIndex - 1] = aToMoveInverseOFmetaBranchMgr;
        System.arraycopy( someInverseOFmetaBranchMgr, aRelativeIndex, otherInverseOFmetaBranchMgr, aRelativeIndex, aInverseOFmetaBranchMgrLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFmetaBranchMgr, 0, otherInverseOFmetaBranchMgr, 0, aRelativeIndex );
        otherInverseOFmetaBranchMgr[ aRelativeIndex ] = aToMoveInverseOFmetaBranchMgr;
        System.arraycopy( someInverseOFmetaBranchMgr, aRelativeIndex, otherInverseOFmetaBranchMgr, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFmetaBranchMgrLength - 1) {
          System.arraycopy( someInverseOFmetaBranchMgr, aToMoveIndex + 1, otherInverseOFmetaBranchMgr, aToMoveIndex + 1, aInverseOFmetaBranchMgrLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaBranchMgrBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaBranchMgrBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaBranchMgrBefore", null); return;}

      // Set the new collection
    setInverseOFmetaBranchMgrPrivileged( theCtxt, otherInverseOFmetaBranchMgr);
  }





    /* Public move to last accessor for role InverseOFmetaBranchMgr
     */
  public void moveInverseOFmetaBranchMgrToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc theInverseOFmetaBranchMgr) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFmetaBranchMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaBranchMgr = getInverseOFmetaBranchMgrPrivileged( theCtxt);
    if( someInverseOFmetaBranchMgr == null) { return;}

      // Get length of InverseOFmetaBranchMgr array
    int aInverseOFmetaBranchMgrLength = someInverseOFmetaBranchMgr.length;

      // Get index of InverseOFmetaBranchMgr to move
    int aToMoveIndex = indexOfInverseOFmetaBranchMgrPR( theCtxt, theInverseOFmetaBranchMgr);

      // If toMove InverseOFmetaBranchMgr not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFmetaBranchMgrLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv aToMoveInverseOFmetaBranchMgr = (com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv) theInverseOFmetaBranchMgr;

      // Allocate new array for new version of state of relationship InverseOFmetaBranchMgr
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaBranchMgr = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaBranchMgrLength];
    try {
      System.arraycopy( someInverseOFmetaBranchMgr, 0, otherInverseOFmetaBranchMgr, 0, aToMoveIndex );
      System.arraycopy( someInverseOFmetaBranchMgr, aToMoveIndex + 1, otherInverseOFmetaBranchMgr, aToMoveIndex, aInverseOFmetaBranchMgrLength - aToMoveIndex - 1);
      otherInverseOFmetaBranchMgr[ aInverseOFmetaBranchMgrLength - 1] = aToMoveInverseOFmetaBranchMgr;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaBranchMgrToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaBranchMgrToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaBranchMgrToLast", null); return;}

      // Set the new collection
    setInverseOFmetaBranchMgrPrivileged( theCtxt, otherInverseOFmetaBranchMgr);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFmetaBranchMgr
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFmetaBranchMgr
     */
  public void addInverseOFmetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theInverseOFmetaBranchMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaBranchMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaBranchMgr = getInverseOFmetaBranchMgrPrivileged( theCtxt);
    if( someInverseOFmetaBranchMgr == null) { return;}

      // Check for new InverseOFmetaBranchMgr already in collection
    int aInverseOFmetaBranchMgrLength = someInverseOFmetaBranchMgr.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaBranchMgrLength ; anIndex++) {
      if( theInverseOFmetaBranchMgr.sameAs( theCtxt, someInverseOFmetaBranchMgr[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFmetaBranchMgr element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaBranchMgr = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaBranchMgrLength + 1];
    try {
      System.arraycopy( someInverseOFmetaBranchMgr, 0, otherInverseOFmetaBranchMgr, 0, aInverseOFmetaBranchMgrLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaBranchMgrPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaBranchMgrPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaBranchMgrPrivileged", null); return;}

    otherInverseOFmetaBranchMgr[ aInverseOFmetaBranchMgrLength] = theInverseOFmetaBranchMgr;

      // Set the new collection
    setInverseOFmetaBranchMgrPrivileged( theCtxt, otherInverseOFmetaBranchMgr);
  }









    /* Privileged Write accessor for role InverseOFmetaBranchMgr
     */
  public void removeInverseOFmetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv theInverseOFmetaBranchMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaBranchMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] someInverseOFmetaBranchMgr = getInverseOFmetaBranchMgrPrivileged( theCtxt);
    if( someInverseOFmetaBranchMgr == null) { return;}

      // Check for new InverseOFmetaBranchMgr not in collection
    int aInverseOFmetaBranchMgrLength = someInverseOFmetaBranchMgr.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaBranchMgrLength ; anIndex++) {
      if( theInverseOFmetaBranchMgr.sameAs( theCtxt, someInverseOFmetaBranchMgr[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFmetaBranchMgr element
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] otherInverseOFmetaBranchMgr = new com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[ aInverseOFmetaBranchMgrLength - 1];
    try {
      System.arraycopy( someInverseOFmetaBranchMgr, 0, otherInverseOFmetaBranchMgr, 0, aFoundIndex);
      System.arraycopy( someInverseOFmetaBranchMgr, aFoundIndex + 1, otherInverseOFmetaBranchMgr, aFoundIndex, aInverseOFmetaBranchMgrLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaBranchMgrPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaBranchMgrPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaBranchMgrPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFmetaBranchMgrPrivileged( theCtxt, otherInverseOFmetaBranchMgr);
  }






    /* Privileged Read accessor for role InverseOFmetaBranchMgr
     * Guaranteed to return object with same identity of the InverseOFmetaBranchMgr
     */
  public com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] getInverseOFmetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFmetaBranchMgr;
  }




    /* Set reference in role InverseOFmetaBranchMgr
     * Used by relationship maintenance machinery
     */
  public void setInverseOFmetaBranchMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] theInverseOFmetaBranchMgrCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3BranchConfigPriv[] aInverseOFmetaBranchMgr = vrInverseOFmetaBranchMgr;
    vrInverseOFmetaBranchMgr = theInverseOFmetaBranchMgrCollection;
      // Propagate change
    change( theCtxt, "InverseOFmetaBranchMgr", aInverseOFmetaBranchMgr, vrInverseOFmetaBranchMgr, "vrInverseOFmetaBranchMgr");
  }




/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship TraversalConfig
 ****************************************************************************/


    /* Public Read accessor for role TraversalConfig
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalConfig( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTraversalConfigPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTraversalConfigPR( theCtxt);
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

    /* Public TraversalConfig number access
     */
  public int numTraversalConfig( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numTraversalConfigPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numTraversalConfigPR( theCtxt);
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



    /* Public TraversalConfig read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalConfigAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getTraversalConfigAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getTraversalConfigAtPR( theCtxt, theIndex);
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


    /* Public TraversalConfig finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc findTraversalConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findTraversalConfigNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findTraversalConfigNamedPR( theCtxt, theMMName);
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




    /* Public TraversalConfig is related predicate
     */
  public boolean hasTraversalConfigNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTraversalConfigNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTraversalConfigNamedPR( theCtxt, theMMName);
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



    /* Transactional TraversalConfig is related  predicate
     */
  public boolean hasTraversalConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasTraversalConfigPR( theCtxt, theTraversalConfig);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasTraversalConfigPR( theCtxt, theTraversalConfig);
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


    /* Public TraversalConfig index access
     */
  public int indexOfTraversalConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfTraversalConfigPR( theCtxt, theTraversalConfig);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfTraversalConfigPR( theCtxt, theTraversalConfig);
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




    /* Public Write accessor for role TraversalConfig
     */
  public void setTraversalConfig( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setTraversalConfigPR( theCtxt, theTraversalConfig);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setTraversalConfigPR( theCtxt, theTraversalConfig);
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
 *  Implementation of internal operations for relationship TraversalConfig
 ****************************************************************************/


    /* Public Read accessor for role TraversalConfig
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalConfigPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTraversalConfigPrivileged( theCtxt);
  }


    /* Public TraversalConfig number access
     */
  public int numTraversalConfigPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getTraversalConfigPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public TraversalConfig read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc getTraversalConfigAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getTraversalConfigPrivileged( theCtxt);
  }


    /* Public TraversalConfig finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc findTraversalConfigNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = getTraversalConfigPrivileged( theCtxt);
    if( aTraversalConfig == null) { return null;}

    if( !aTraversalConfig.sameNameAs( theCtxt, theMMName)) { return null;}

    return aTraversalConfig;
  }


    /* Public TraversalConfig finder predicate by name
     */
  public boolean hasTraversalConfigNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = getTraversalConfigPrivileged( theCtxt);
    if( aTraversalConfig == null) { return false;}

    return aTraversalConfig.sameNameAs( theCtxt, theMMName);
  }



    /* Public TraversalConfig is related predicate
     */
  public boolean hasTraversalConfigPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = getTraversalConfigPrivileged( theCtxt);
    if( aTraversalConfig == null) { return false;}

    return aTraversalConfig.sameAs( theCtxt, theTraversalConfig);
  }




    /* Public TraversalConfig index access
     */
  public int indexOfTraversalConfigPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException {
    if( !hasTraversalConfigPR( theCtxt, theTraversalConfig)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role TraversalConfig
     */
  public void setTraversalConfigPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc theTraversalConfig) throws EAIException {

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aTraversalConfig = getTraversalConfigPrivileged( theCtxt);
      // Check for new TraversalConfig same as current one
    if( aTraversalConfig != null && aTraversalConfig.sameAs( theCtxt, theTraversalConfig)) { return;}

    if( aTraversalConfig != null) {
      aTraversalConfig.removeBranchMgrsPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetTraversalConfigPrivileged();
      */
    }

    if( theTraversalConfig != null) {
      com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aNewTraversalConfig = (com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv) theTraversalConfig;
      aNewTraversalConfig.addBranchMgrsPrivileged( theCtxt, this);
      setTraversalConfigPrivileged( theCtxt, aNewTraversalConfig);
    }
    else {
      setTraversalConfigPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship TraversalConfig
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role TraversalConfig
     * Guaranteed to return object with same identity of the TraversalConfig
     */
  public com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv getTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrTraversalConfig;
  }




    /* Remove current reference in role TraversalConfig
     * Used by relationship maintenance machinery
     */
  public void unsetTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = vrTraversalConfig;
    vrTraversalConfig = null;
      // If there was change, propagate
    if( aTraversalConfig != null) {
      change( theCtxt, "TraversalConfig", aTraversalConfig, vrTraversalConfig, "vrTraversalConfig");
    }
  }





    /* Set reference in role TraversalConfig
     * Used by relationship maintenance machinery
     */
  public void setTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theTraversalConfig) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3TraversalConfigIfc aTraversalConfig = vrTraversalConfig;
    vrTraversalConfig = theTraversalConfig;
      // If there was change, propagate
    if( (aTraversalConfig != null && !aTraversalConfig.sameAs( theCtxt, theTraversalConfig)) || (aTraversalConfig == null && theTraversalConfig != null)) {
      change( theCtxt, "TraversalConfig", aTraversalConfig, vrTraversalConfig, "vrTraversalConfig");
    }
  }





    /* Unset currently related TraversalConfig and
     * Set reference in role TraversalConfig
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetTraversalConfigPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv theTraversalConfig) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aTraversalConfig = vrTraversalConfig;
    if( aTraversalConfig != null) {
      aTraversalConfig.removeBranchMgrsPrivileged( theCtxt, this);
    }
    vrTraversalConfig = theTraversalConfig;
      // If there was change, propagate
    if( (aTraversalConfig != null && !aTraversalConfig.sameAs( theCtxt, theTraversalConfig)) || (aTraversalConfig == null && theTraversalConfig != null)) {
      change( theCtxt, "TraversalConfig", aTraversalConfig, vrTraversalConfig, "vrTraversalConfig");
    }
  }















/****************************************************************************
 *  Implementation of  internal destructor of M3BranchMgr
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 

 
      // When deleting : unlink related InverseOFmetaBranchMgr
    com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc[] someInverseOFmetaBranchMgr = getInverseOFmetaBranchMgr( theCtxt);
    if( someInverseOFmetaBranchMgr != null) {
      int aInverseOFmetaBranchMgrLength = someInverseOFmetaBranchMgr.length;
      for( int anIndex = 0 ; anIndex < aInverseOFmetaBranchMgrLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3BranchConfigIfc aInverseOFmetaBranchMgr = someInverseOFmetaBranchMgr[ anIndex];
        if( aInverseOFmetaBranchMgr != null) {
          removeInverseOFmetaBranchMgr( theCtxt, aInverseOFmetaBranchMgr);
        }
      }
    }


    // When deleting unlink related TraversalConfig
  setTraversalConfig( theCtxt, null);



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
      vm3Type = com.dosmil_e.m3.traversal.meta.M3BranchMgrMeta.getStaticM3Type( theCtxt);
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


