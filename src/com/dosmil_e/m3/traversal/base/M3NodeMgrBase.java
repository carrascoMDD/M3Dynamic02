package com.dosmil_e.m3.traversal.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3NodeMgrBase
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.m3.traversal.priv.M3NodeMgrPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3NodeMgr metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the M3NodeMgr metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] vrInverseOFmetaNodeMgr = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv vrTraversalConfig; 






/****************************************************************************
 *  Constructors of the M3NodeMgr metamodel element
 ****************************************************************************/

  public M3NodeMgrBase() {
    super();
  }


  public M3NodeMgrBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3NodeMgrBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3NodeMgrIfc and M3NodeMgrPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3NodeMgr
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of M3NodeMgr
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFmetaNodeMgr
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaNodeMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFmetaNodeMgr( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFmetaNodeMgrPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFmetaNodeMgrPR( theCtxt);
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

    /* Public InverseOFmetaNodeMgr number access
     */
  public int numInverseOFmetaNodeMgr( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFmetaNodeMgrPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFmetaNodeMgrPR( theCtxt);
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



    /* Public InverseOFmetaNodeMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getInverseOFmetaNodeMgrAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFmetaNodeMgrAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFmetaNodeMgrAtPR( theCtxt, theIndex);
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


    /* Public InverseOFmetaNodeMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findInverseOFmetaNodeMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFmetaNodeMgrNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFmetaNodeMgrNamedPR( theCtxt, theMMName);
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




    /* Public InverseOFmetaNodeMgr is related predicate
     */
  public boolean hasInverseOFmetaNodeMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFmetaNodeMgrNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFmetaNodeMgrNamedPR( theCtxt, theMMName);
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



    /* Transactional InverseOFmetaNodeMgr is related  predicate
     */
  public boolean hasInverseOFmetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr);
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


    /* Public InverseOFmetaNodeMgr index access
     */
  public int indexOfInverseOFmetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr);
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
  public void addInverseOFmetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr);
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
  public void addInverseOFmetaNodeMgrBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFmetaNodeMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFmetaNodeMgrBeforePR( theCtxt, theInverseOFmetaNodeMgr, theRelativeInverseOFmetaNodeMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFmetaNodeMgrBeforePR( theCtxt, theInverseOFmetaNodeMgr, theRelativeInverseOFmetaNodeMgr);
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





    /* Transactional Public Write Remove accessor for role InverseOFmetaNodeMgr
     */
  public void removeInverseOFmetaNodeMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr);
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



    /* Public reorder accessor for role InverseOFmetaNodeMgr
     */
  public void moveInverseOFmetaNodeMgrBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFmetaNodeMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFmetaNodeMgrBeforePR( theCtxt, theInverseOFmetaNodeMgr, theRelativeInverseOFmetaNodeMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFmetaNodeMgrBeforePR( theCtxt, theInverseOFmetaNodeMgr, theRelativeInverseOFmetaNodeMgr);
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



    /* Public reorder accessor for role InverseOFmetaNodeMgr
     */
  public void moveInverseOFmetaNodeMgrToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFmetaNodeMgrToLastPR( theCtxt, theInverseOFmetaNodeMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFmetaNodeMgrToLastPR( theCtxt, theInverseOFmetaNodeMgr);
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
 *  Implementation of internal operations for relationship InverseOFmetaNodeMgr
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaNodeMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFmetaNodeMgrPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFmetaNodeMgr = getInverseOFmetaNodeMgrPrivileged( theCtxt);
    if( someInverseOFmetaNodeMgr == null) { return null;}

    int aInverseOFmetaNodeMgrLength = someInverseOFmetaNodeMgr.length;
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] otherInverseOFmetaNodeMgr = new com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[ aInverseOFmetaNodeMgrLength];
    try { System.arraycopy( someInverseOFmetaNodeMgr, 0, otherInverseOFmetaNodeMgr, 0, aInverseOFmetaNodeMgrLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaNodeMgr", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaNodeMgr", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaNodeMgr", null); return null;}


    return otherInverseOFmetaNodeMgr;
  }



    /* Public InverseOFmetaNodeMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findInverseOFmetaNodeMgrNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFmetaNodeMgr = getInverseOFmetaNodeMgrPrivileged( theCtxt);
    if( someInverseOFmetaNodeMgr == null) { return null;}

      // Check for new InverseOFmetaNodeMgr already in collection
    int aInverseOFmetaNodeMgrLength = someInverseOFmetaNodeMgr.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaNodeMgrLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aInverseOFmetaNodeMgr = someInverseOFmetaNodeMgr[ anIndex];
      if( aInverseOFmetaNodeMgr.sameNameAs( theCtxt, theMMName)) { return aInverseOFmetaNodeMgr;}
    }
    return null;
  }



    /* Public InverseOFmetaNodeMgr finder predicate by name
     */
  public boolean hasInverseOFmetaNodeMgrNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFmetaNodeMgrNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFmetaNodeMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getInverseOFmetaNodeMgrAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFmetaNodeMgr = getInverseOFmetaNodeMgrPrivileged( theCtxt);
    if( someInverseOFmetaNodeMgr == null) { return null;}

      // Get number of InverseOFmetaNodeMgr
    int aInverseOFmetaNodeMgrLength = someInverseOFmetaNodeMgr.length;

      // Verify index within array length
    if( theIndex >= aInverseOFmetaNodeMgrLength) { return null;}

      // Get indexed InverseOFmetaNodeMgr
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aInverseOFmetaNodeMgr = someInverseOFmetaNodeMgr[ theIndex];

    return aInverseOFmetaNodeMgr;
  }



    /* Public InverseOFmetaNodeMgr is related predicate
     */
  public boolean hasInverseOFmetaNodeMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException {
    return indexOfInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr) >= 0;
  }


    /* Public InverseOFmetaNodeMgr index access
     */
  public int indexOfInverseOFmetaNodeMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFmetaNodeMgr == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFmetaNodeMgr = getInverseOFmetaNodeMgrPrivileged( theCtxt);
    if( someInverseOFmetaNodeMgr == null) { return -1;}

      // Check for new InverseOFmetaNodeMgr already in collection
    int aInverseOFmetaNodeMgrLength = someInverseOFmetaNodeMgr.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaNodeMgrLength ; anIndex++) {
      if( someInverseOFmetaNodeMgr[ anIndex].sameAs( theCtxt, theInverseOFmetaNodeMgr)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFmetaNodeMgr number access
     */
  public int numInverseOFmetaNodeMgrPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFmetaNodeMgr = getInverseOFmetaNodeMgrPrivileged( theCtxt);
    if( someInverseOFmetaNodeMgr == null) { return 0;}

      // Check for new InverseOFmetaNodeMgr already in collection
    int aInverseOFmetaNodeMgrLength = someInverseOFmetaNodeMgr.length;
    return aInverseOFmetaNodeMgrLength;
  }




    /* Public Write accessor for role InverseOFmetaNodeMgr
     */
  public void addInverseOFmetaNodeMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaNodeMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaNodeMgr = getInverseOFmetaNodeMgrPrivileged( theCtxt);
    if( someInverseOFmetaNodeMgr == null) { return;}

      // Check for new InverseOFmetaNodeMgr already in collection
    int aInverseOFmetaNodeMgrLength = someInverseOFmetaNodeMgr.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaNodeMgrLength ; anIndex++) {
      if( theInverseOFmetaNodeMgr.sameAs( theCtxt, someInverseOFmetaNodeMgr[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewInverseOFmetaNodeMgr = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFmetaNodeMgr;

      // Link reverse ref to this object
    aNewInverseOFmetaNodeMgr.unsetAndSetMetaNodeMgrPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFmetaNodeMgr element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaNodeMgr = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaNodeMgrLength + 1];
    try { System.arraycopy( someInverseOFmetaNodeMgr, 0, otherInverseOFmetaNodeMgr, 0, aInverseOFmetaNodeMgrLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaNodeMgr", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaNodeMgr", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaNodeMgr", null); return;}
    otherInverseOFmetaNodeMgr[ aInverseOFmetaNodeMgrLength] = aNewInverseOFmetaNodeMgr;

      // Set the new collection
    setInverseOFmetaNodeMgrPrivileged( theCtxt, otherInverseOFmetaNodeMgr);
  }




    /* Public ordered Write accessor for role InverseOFmetaNodeMgr
     */
  public void addInverseOFmetaNodeMgrBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFmetaNodeMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaNodeMgr == null) { return;}

      // If relative InverseOFmetaNodeMgr is null, perform normal add operation
    if( theRelativeInverseOFmetaNodeMgr == null) {
      addInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaNodeMgr = getInverseOFmetaNodeMgrPrivileged( theCtxt);
    if( someInverseOFmetaNodeMgr == null) { return;}


      // Get index of relative InverseOFmetaNodeMgr
    int aRelativeIndex = indexOfInverseOFmetaNodeMgrPR( theCtxt, theRelativeInverseOFmetaNodeMgr);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr);
    }

      // Get length of InverseOFmetaNodeMgr array
    int aInverseOFmetaNodeMgrLength = someInverseOFmetaNodeMgr.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFmetaNodeMgrLength) {
      addInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr);
    }

      // Check for new InverseOFmetaNodeMgr already in collection
    if( hasInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr)) { return;}


    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewInverseOFmetaNodeMgr = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFmetaNodeMgr;

      // Link reverse ref to this object
    aNewInverseOFmetaNodeMgr.unsetAndSetMetaNodeMgrPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFmetaNodeMgr
      // Grow collection and add new InverseOFmetaNodeMgr element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaNodeMgr = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaNodeMgrLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFmetaNodeMgr, 0, otherInverseOFmetaNodeMgr, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFmetaNodeMgr, aRelativeIndex, otherInverseOFmetaNodeMgr, aRelativeIndex + 1, aInverseOFmetaNodeMgrLength - aRelativeIndex);
      otherInverseOFmetaNodeMgr[ aRelativeIndex] = aNewInverseOFmetaNodeMgr;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaNodeMgrBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaNodeMgrBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaNodeMgrBefore", null); return;}

      // Set the new collection
    setInverseOFmetaNodeMgrPrivileged( theCtxt, otherInverseOFmetaNodeMgr);
  }





    /* Public Write accessor for role InverseOFmetaNodeMgr
     */
  public void removeInverseOFmetaNodeMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaNodeMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaNodeMgr = getInverseOFmetaNodeMgrPrivileged( theCtxt);
    if( someInverseOFmetaNodeMgr == null) { return;}

      // Check for new InverseOFmetaNodeMgr not in collection
    int aInverseOFmetaNodeMgrLength = someInverseOFmetaNodeMgr.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaNodeMgrLength ; anIndex++) {
      if( theInverseOFmetaNodeMgr.sameAs( theCtxt, someInverseOFmetaNodeMgr[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewInverseOFmetaNodeMgr = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFmetaNodeMgr;

      // Unlink reverse ref from the new related object
    aNewInverseOFmetaNodeMgr.unsetMetaNodeMgrPrivileged( theCtxt);

      // Shrink collection removing InverseOFmetaNodeMgr element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaNodeMgr = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaNodeMgrLength - 1];
    try {
      System.arraycopy( someInverseOFmetaNodeMgr, 0, otherInverseOFmetaNodeMgr, 0, aFoundIndex);
      System.arraycopy( someInverseOFmetaNodeMgr, aFoundIndex + 1, otherInverseOFmetaNodeMgr, aFoundIndex, aInverseOFmetaNodeMgrLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaNodeMgr", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaNodeMgr", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaNodeMgr", null); return;}

      // Set the new collection
    setInverseOFmetaNodeMgrPrivileged( theCtxt, otherInverseOFmetaNodeMgr);
  }




    /* Public reorder accessor for role InverseOFmetaNodeMgr
     */
  public void moveInverseOFmetaNodeMgrBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFmetaNodeMgr) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFmetaNodeMgr == null) { return;}

      // If relative InverseOFmetaNodeMgr is null, perform move to last position
    if( theRelativeInverseOFmetaNodeMgr == null) {
      moveInverseOFmetaNodeMgrToLastPR( theCtxt, theInverseOFmetaNodeMgr);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaNodeMgr = getInverseOFmetaNodeMgrPrivileged( theCtxt);
    if( someInverseOFmetaNodeMgr == null) { return;}

      // Get length of InverseOFmetaNodeMgr array
    int aInverseOFmetaNodeMgrLength = someInverseOFmetaNodeMgr.length;

      // Get index of InverseOFmetaNodeMgr to move
    int aToMoveIndex = indexOfInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr);
      // If toMove InverseOFmetaNodeMgr not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFmetaNodeMgrLength) {
      moveInverseOFmetaNodeMgrToLastPR( theCtxt, theInverseOFmetaNodeMgr);
    }

      // Get index of relative InverseOFmetaNodeMgr
    int aRelativeIndex = indexOfInverseOFmetaNodeMgrPR( theCtxt, theRelativeInverseOFmetaNodeMgr);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFmetaNodeMgrToLastPR( theCtxt, theInverseOFmetaNodeMgr);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFmetaNodeMgrLength) {
      moveInverseOFmetaNodeMgrToLastPR( theCtxt, theInverseOFmetaNodeMgr);
    }

      // ToMove and relative InverseOFmetaNodeMgr are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aToMoveInverseOFmetaNodeMgr = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFmetaNodeMgr;

      // Allocate new array for new version of state of relationship InverseOFmetaNodeMgr
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaNodeMgr = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaNodeMgrLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFmetaNodeMgr, 0, otherInverseOFmetaNodeMgr, 0, aToMoveIndex );
        System.arraycopy( someInverseOFmetaNodeMgr, aToMoveIndex + 1, otherInverseOFmetaNodeMgr, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFmetaNodeMgr[ aRelativeIndex - 1] = aToMoveInverseOFmetaNodeMgr;
        System.arraycopy( someInverseOFmetaNodeMgr, aRelativeIndex, otherInverseOFmetaNodeMgr, aRelativeIndex, aInverseOFmetaNodeMgrLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFmetaNodeMgr, 0, otherInverseOFmetaNodeMgr, 0, aRelativeIndex );
        otherInverseOFmetaNodeMgr[ aRelativeIndex ] = aToMoveInverseOFmetaNodeMgr;
        System.arraycopy( someInverseOFmetaNodeMgr, aRelativeIndex, otherInverseOFmetaNodeMgr, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFmetaNodeMgrLength - 1) {
          System.arraycopy( someInverseOFmetaNodeMgr, aToMoveIndex + 1, otherInverseOFmetaNodeMgr, aToMoveIndex + 1, aInverseOFmetaNodeMgrLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaNodeMgrBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaNodeMgrBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaNodeMgrBefore", null); return;}

      // Set the new collection
    setInverseOFmetaNodeMgrPrivileged( theCtxt, otherInverseOFmetaNodeMgr);
  }





    /* Public move to last accessor for role InverseOFmetaNodeMgr
     */
  public void moveInverseOFmetaNodeMgrToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFmetaNodeMgr) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFmetaNodeMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaNodeMgr = getInverseOFmetaNodeMgrPrivileged( theCtxt);
    if( someInverseOFmetaNodeMgr == null) { return;}

      // Get length of InverseOFmetaNodeMgr array
    int aInverseOFmetaNodeMgrLength = someInverseOFmetaNodeMgr.length;

      // Get index of InverseOFmetaNodeMgr to move
    int aToMoveIndex = indexOfInverseOFmetaNodeMgrPR( theCtxt, theInverseOFmetaNodeMgr);

      // If toMove InverseOFmetaNodeMgr not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFmetaNodeMgrLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aToMoveInverseOFmetaNodeMgr = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFmetaNodeMgr;

      // Allocate new array for new version of state of relationship InverseOFmetaNodeMgr
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaNodeMgr = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaNodeMgrLength];
    try {
      System.arraycopy( someInverseOFmetaNodeMgr, 0, otherInverseOFmetaNodeMgr, 0, aToMoveIndex );
      System.arraycopy( someInverseOFmetaNodeMgr, aToMoveIndex + 1, otherInverseOFmetaNodeMgr, aToMoveIndex, aInverseOFmetaNodeMgrLength - aToMoveIndex - 1);
      otherInverseOFmetaNodeMgr[ aInverseOFmetaNodeMgrLength - 1] = aToMoveInverseOFmetaNodeMgr;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaNodeMgrToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaNodeMgrToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaNodeMgrToLast", null); return;}

      // Set the new collection
    setInverseOFmetaNodeMgrPrivileged( theCtxt, otherInverseOFmetaNodeMgr);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFmetaNodeMgr
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFmetaNodeMgr
     */
  public void addInverseOFmetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFmetaNodeMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaNodeMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaNodeMgr = getInverseOFmetaNodeMgrPrivileged( theCtxt);
    if( someInverseOFmetaNodeMgr == null) { return;}

      // Check for new InverseOFmetaNodeMgr already in collection
    int aInverseOFmetaNodeMgrLength = someInverseOFmetaNodeMgr.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaNodeMgrLength ; anIndex++) {
      if( theInverseOFmetaNodeMgr.sameAs( theCtxt, someInverseOFmetaNodeMgr[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFmetaNodeMgr element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaNodeMgr = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaNodeMgrLength + 1];
    try {
      System.arraycopy( someInverseOFmetaNodeMgr, 0, otherInverseOFmetaNodeMgr, 0, aInverseOFmetaNodeMgrLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaNodeMgrPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaNodeMgrPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaNodeMgrPrivileged", null); return;}

    otherInverseOFmetaNodeMgr[ aInverseOFmetaNodeMgrLength] = theInverseOFmetaNodeMgr;

      // Set the new collection
    setInverseOFmetaNodeMgrPrivileged( theCtxt, otherInverseOFmetaNodeMgr);
  }









    /* Privileged Write accessor for role InverseOFmetaNodeMgr
     */
  public void removeInverseOFmetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFmetaNodeMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaNodeMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFmetaNodeMgr = getInverseOFmetaNodeMgrPrivileged( theCtxt);
    if( someInverseOFmetaNodeMgr == null) { return;}

      // Check for new InverseOFmetaNodeMgr not in collection
    int aInverseOFmetaNodeMgrLength = someInverseOFmetaNodeMgr.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaNodeMgrLength ; anIndex++) {
      if( theInverseOFmetaNodeMgr.sameAs( theCtxt, someInverseOFmetaNodeMgr[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFmetaNodeMgr element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFmetaNodeMgr = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFmetaNodeMgrLength - 1];
    try {
      System.arraycopy( someInverseOFmetaNodeMgr, 0, otherInverseOFmetaNodeMgr, 0, aFoundIndex);
      System.arraycopy( someInverseOFmetaNodeMgr, aFoundIndex + 1, otherInverseOFmetaNodeMgr, aFoundIndex, aInverseOFmetaNodeMgrLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaNodeMgrPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaNodeMgrPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaNodeMgrPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFmetaNodeMgrPrivileged( theCtxt, otherInverseOFmetaNodeMgr);
  }






    /* Privileged Read accessor for role InverseOFmetaNodeMgr
     * Guaranteed to return object with same identity of the InverseOFmetaNodeMgr
     */
  public com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] getInverseOFmetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFmetaNodeMgr;
  }




    /* Set reference in role InverseOFmetaNodeMgr
     * Used by relationship maintenance machinery
     */
  public void setInverseOFmetaNodeMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] theInverseOFmetaNodeMgrCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] aInverseOFmetaNodeMgr = vrInverseOFmetaNodeMgr;
    vrInverseOFmetaNodeMgr = theInverseOFmetaNodeMgrCollection;
      // Propagate change
    change( theCtxt, "InverseOFmetaNodeMgr", aInverseOFmetaNodeMgr, vrInverseOFmetaNodeMgr, "vrInverseOFmetaNodeMgr");
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
      aTraversalConfig.removeNodeMgrsPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetTraversalConfigPrivileged();
      */
    }

    if( theTraversalConfig != null) {
      com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aNewTraversalConfig = (com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv) theTraversalConfig;
      aNewTraversalConfig.addNodeMgrsPrivileged( theCtxt, this);
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
      aTraversalConfig.removeNodeMgrsPrivileged( theCtxt, this);
    }
    vrTraversalConfig = theTraversalConfig;
      // If there was change, propagate
    if( (aTraversalConfig != null && !aTraversalConfig.sameAs( theCtxt, theTraversalConfig)) || (aTraversalConfig == null && theTraversalConfig != null)) {
      change( theCtxt, "TraversalConfig", aTraversalConfig, vrTraversalConfig, "vrTraversalConfig");
    }
  }















/****************************************************************************
 *  Implementation of  internal destructor of M3NodeMgr
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 

 
      // When deleting : unlink related InverseOFmetaNodeMgr
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFmetaNodeMgr = getInverseOFmetaNodeMgr( theCtxt);
    if( someInverseOFmetaNodeMgr != null) {
      int aInverseOFmetaNodeMgrLength = someInverseOFmetaNodeMgr.length;
      for( int anIndex = 0 ; anIndex < aInverseOFmetaNodeMgrLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aInverseOFmetaNodeMgr = someInverseOFmetaNodeMgr[ anIndex];
        if( aInverseOFmetaNodeMgr != null) {
          removeInverseOFmetaNodeMgr( theCtxt, aInverseOFmetaNodeMgr);
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
      vm3Type = com.dosmil_e.m3.traversal.meta.M3NodeMgrMeta.getStaticM3Type( theCtxt);
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


