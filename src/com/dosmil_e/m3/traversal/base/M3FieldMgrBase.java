package com.dosmil_e.m3.traversal.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3FieldMgrBase
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3FieldMgr metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the M3FieldMgr metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] vrInverseOFmetaFieldMgr = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv vrTraversalConfig; 






/****************************************************************************
 *  Constructors of the M3FieldMgr metamodel element
 ****************************************************************************/

  public M3FieldMgrBase() {
    super();
  }


  public M3FieldMgrBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3FieldMgrBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3FieldMgrIfc and M3FieldMgrPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3FieldMgr
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of M3FieldMgr
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for ONE to MANY side MANY relationship InverseOFmetaFieldMgr
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaFieldMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] getInverseOFmetaFieldMgr( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFmetaFieldMgrPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFmetaFieldMgrPR( theCtxt);
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

    /* Public InverseOFmetaFieldMgr number access
     */
  public int numInverseOFmetaFieldMgr( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFmetaFieldMgrPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFmetaFieldMgrPR( theCtxt);
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



    /* Public InverseOFmetaFieldMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc getInverseOFmetaFieldMgrAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFmetaFieldMgrAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFmetaFieldMgrAtPR( theCtxt, theIndex);
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


    /* Public InverseOFmetaFieldMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc findInverseOFmetaFieldMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFmetaFieldMgrNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFmetaFieldMgrNamedPR( theCtxt, theMMName);
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




    /* Public InverseOFmetaFieldMgr is related predicate
     */
  public boolean hasInverseOFmetaFieldMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFmetaFieldMgrNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFmetaFieldMgrNamedPR( theCtxt, theMMName);
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



    /* Transactional InverseOFmetaFieldMgr is related  predicate
     */
  public boolean hasInverseOFmetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr);
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


    /* Public InverseOFmetaFieldMgr index access
     */
  public int indexOfInverseOFmetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr);
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
  public void addInverseOFmetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr);
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
  public void addInverseOFmetaFieldMgrBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeInverseOFmetaFieldMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFmetaFieldMgrBeforePR( theCtxt, theInverseOFmetaFieldMgr, theRelativeInverseOFmetaFieldMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFmetaFieldMgrBeforePR( theCtxt, theInverseOFmetaFieldMgr, theRelativeInverseOFmetaFieldMgr);
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





    /* Transactional Public Write Remove accessor for role InverseOFmetaFieldMgr
     */
  public void removeInverseOFmetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr);
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



    /* Public reorder accessor for role InverseOFmetaFieldMgr
     */
  public void moveInverseOFmetaFieldMgrBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeInverseOFmetaFieldMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFmetaFieldMgrBeforePR( theCtxt, theInverseOFmetaFieldMgr, theRelativeInverseOFmetaFieldMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFmetaFieldMgrBeforePR( theCtxt, theInverseOFmetaFieldMgr, theRelativeInverseOFmetaFieldMgr);
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



    /* Public reorder accessor for role InverseOFmetaFieldMgr
     */
  public void moveInverseOFmetaFieldMgrToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFmetaFieldMgrToLastPR( theCtxt, theInverseOFmetaFieldMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFmetaFieldMgrToLastPR( theCtxt, theInverseOFmetaFieldMgr);
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
 *  Implementation of internal operations for relationship InverseOFmetaFieldMgr
 ****************************************************************************/


    /* Public Read accessor for role InverseOFmetaFieldMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] getInverseOFmetaFieldMgrPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someInverseOFmetaFieldMgr = getInverseOFmetaFieldMgrPrivileged( theCtxt);
    if( someInverseOFmetaFieldMgr == null) { return null;}

    int aInverseOFmetaFieldMgrLength = someInverseOFmetaFieldMgr.length;
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] otherInverseOFmetaFieldMgr = new com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[ aInverseOFmetaFieldMgrLength];
    try { System.arraycopy( someInverseOFmetaFieldMgr, 0, otherInverseOFmetaFieldMgr, 0, aInverseOFmetaFieldMgrLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaFieldMgr", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaFieldMgr", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFmetaFieldMgr", null); return null;}


    return otherInverseOFmetaFieldMgr;
  }



    /* Public InverseOFmetaFieldMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc findInverseOFmetaFieldMgrNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someInverseOFmetaFieldMgr = getInverseOFmetaFieldMgrPrivileged( theCtxt);
    if( someInverseOFmetaFieldMgr == null) { return null;}

      // Check for new InverseOFmetaFieldMgr already in collection
    int aInverseOFmetaFieldMgrLength = someInverseOFmetaFieldMgr.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaFieldMgrLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aInverseOFmetaFieldMgr = someInverseOFmetaFieldMgr[ anIndex];
      if( aInverseOFmetaFieldMgr.sameNameAs( theCtxt, theMMName)) { return aInverseOFmetaFieldMgr;}
    }
    return null;
  }



    /* Public InverseOFmetaFieldMgr finder predicate by name
     */
  public boolean hasInverseOFmetaFieldMgrNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFmetaFieldMgrNamedPR( theCtxt, theMMName) != null;
  }


    /* Public InverseOFmetaFieldMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc getInverseOFmetaFieldMgrAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someInverseOFmetaFieldMgr = getInverseOFmetaFieldMgrPrivileged( theCtxt);
    if( someInverseOFmetaFieldMgr == null) { return null;}

      // Get number of InverseOFmetaFieldMgr
    int aInverseOFmetaFieldMgrLength = someInverseOFmetaFieldMgr.length;

      // Verify index within array length
    if( theIndex >= aInverseOFmetaFieldMgrLength) { return null;}

      // Get indexed InverseOFmetaFieldMgr
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aInverseOFmetaFieldMgr = someInverseOFmetaFieldMgr[ theIndex];

    return aInverseOFmetaFieldMgr;
  }



    /* Public InverseOFmetaFieldMgr is related predicate
     */
  public boolean hasInverseOFmetaFieldMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException {
    return indexOfInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr) >= 0;
  }


    /* Public InverseOFmetaFieldMgr index access
     */
  public int indexOfInverseOFmetaFieldMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFmetaFieldMgr == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someInverseOFmetaFieldMgr = getInverseOFmetaFieldMgrPrivileged( theCtxt);
    if( someInverseOFmetaFieldMgr == null) { return -1;}

      // Check for new InverseOFmetaFieldMgr already in collection
    int aInverseOFmetaFieldMgrLength = someInverseOFmetaFieldMgr.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaFieldMgrLength ; anIndex++) {
      if( someInverseOFmetaFieldMgr[ anIndex].sameAs( theCtxt, theInverseOFmetaFieldMgr)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFmetaFieldMgr number access
     */
  public int numInverseOFmetaFieldMgrPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someInverseOFmetaFieldMgr = getInverseOFmetaFieldMgrPrivileged( theCtxt);
    if( someInverseOFmetaFieldMgr == null) { return 0;}

      // Check for new InverseOFmetaFieldMgr already in collection
    int aInverseOFmetaFieldMgrLength = someInverseOFmetaFieldMgr.length;
    return aInverseOFmetaFieldMgrLength;
  }




    /* Public Write accessor for role InverseOFmetaFieldMgr
     */
  public void addInverseOFmetaFieldMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaFieldMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaFieldMgr = getInverseOFmetaFieldMgrPrivileged( theCtxt);
    if( someInverseOFmetaFieldMgr == null) { return;}

      // Check for new InverseOFmetaFieldMgr already in collection
    int aInverseOFmetaFieldMgrLength = someInverseOFmetaFieldMgr.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaFieldMgrLength ; anIndex++) {
      if( theInverseOFmetaFieldMgr.sameAs( theCtxt, someInverseOFmetaFieldMgr[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aNewInverseOFmetaFieldMgr = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theInverseOFmetaFieldMgr;

      // Link reverse ref to this object
    aNewInverseOFmetaFieldMgr.unsetAndSetMetaFieldMgrPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFmetaFieldMgr element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaFieldMgr = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaFieldMgrLength + 1];
    try { System.arraycopy( someInverseOFmetaFieldMgr, 0, otherInverseOFmetaFieldMgr, 0, aInverseOFmetaFieldMgrLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaFieldMgr", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaFieldMgr", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaFieldMgr", null); return;}
    otherInverseOFmetaFieldMgr[ aInverseOFmetaFieldMgrLength] = aNewInverseOFmetaFieldMgr;

      // Set the new collection
    setInverseOFmetaFieldMgrPrivileged( theCtxt, otherInverseOFmetaFieldMgr);
  }




    /* Public ordered Write accessor for role InverseOFmetaFieldMgr
     */
  public void addInverseOFmetaFieldMgrBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeInverseOFmetaFieldMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaFieldMgr == null) { return;}

      // If relative InverseOFmetaFieldMgr is null, perform normal add operation
    if( theRelativeInverseOFmetaFieldMgr == null) {
      addInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaFieldMgr = getInverseOFmetaFieldMgrPrivileged( theCtxt);
    if( someInverseOFmetaFieldMgr == null) { return;}


      // Get index of relative InverseOFmetaFieldMgr
    int aRelativeIndex = indexOfInverseOFmetaFieldMgrPR( theCtxt, theRelativeInverseOFmetaFieldMgr);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr);
    }

      // Get length of InverseOFmetaFieldMgr array
    int aInverseOFmetaFieldMgrLength = someInverseOFmetaFieldMgr.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFmetaFieldMgrLength) {
      addInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr);
    }

      // Check for new InverseOFmetaFieldMgr already in collection
    if( hasInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr)) { return;}


    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aNewInverseOFmetaFieldMgr = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theInverseOFmetaFieldMgr;

      // Link reverse ref to this object
    aNewInverseOFmetaFieldMgr.unsetAndSetMetaFieldMgrPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFmetaFieldMgr
      // Grow collection and add new InverseOFmetaFieldMgr element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaFieldMgr = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaFieldMgrLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFmetaFieldMgr, 0, otherInverseOFmetaFieldMgr, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFmetaFieldMgr, aRelativeIndex, otherInverseOFmetaFieldMgr, aRelativeIndex + 1, aInverseOFmetaFieldMgrLength - aRelativeIndex);
      otherInverseOFmetaFieldMgr[ aRelativeIndex] = aNewInverseOFmetaFieldMgr;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaFieldMgrBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaFieldMgrBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaFieldMgrBefore", null); return;}

      // Set the new collection
    setInverseOFmetaFieldMgrPrivileged( theCtxt, otherInverseOFmetaFieldMgr);
  }





    /* Public Write accessor for role InverseOFmetaFieldMgr
     */
  public void removeInverseOFmetaFieldMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaFieldMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaFieldMgr = getInverseOFmetaFieldMgrPrivileged( theCtxt);
    if( someInverseOFmetaFieldMgr == null) { return;}

      // Check for new InverseOFmetaFieldMgr not in collection
    int aInverseOFmetaFieldMgrLength = someInverseOFmetaFieldMgr.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaFieldMgrLength ; anIndex++) {
      if( theInverseOFmetaFieldMgr.sameAs( theCtxt, someInverseOFmetaFieldMgr[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aNewInverseOFmetaFieldMgr = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theInverseOFmetaFieldMgr;

      // Unlink reverse ref from the new related object
    aNewInverseOFmetaFieldMgr.unsetMetaFieldMgrPrivileged( theCtxt);

      // Shrink collection removing InverseOFmetaFieldMgr element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaFieldMgr = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaFieldMgrLength - 1];
    try {
      System.arraycopy( someInverseOFmetaFieldMgr, 0, otherInverseOFmetaFieldMgr, 0, aFoundIndex);
      System.arraycopy( someInverseOFmetaFieldMgr, aFoundIndex + 1, otherInverseOFmetaFieldMgr, aFoundIndex, aInverseOFmetaFieldMgrLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaFieldMgr", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaFieldMgr", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaFieldMgr", null); return;}

      // Set the new collection
    setInverseOFmetaFieldMgrPrivileged( theCtxt, otherInverseOFmetaFieldMgr);
  }




    /* Public reorder accessor for role InverseOFmetaFieldMgr
     */
  public void moveInverseOFmetaFieldMgrBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theRelativeInverseOFmetaFieldMgr) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFmetaFieldMgr == null) { return;}

      // If relative InverseOFmetaFieldMgr is null, perform move to last position
    if( theRelativeInverseOFmetaFieldMgr == null) {
      moveInverseOFmetaFieldMgrToLastPR( theCtxt, theInverseOFmetaFieldMgr);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaFieldMgr = getInverseOFmetaFieldMgrPrivileged( theCtxt);
    if( someInverseOFmetaFieldMgr == null) { return;}

      // Get length of InverseOFmetaFieldMgr array
    int aInverseOFmetaFieldMgrLength = someInverseOFmetaFieldMgr.length;

      // Get index of InverseOFmetaFieldMgr to move
    int aToMoveIndex = indexOfInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr);
      // If toMove InverseOFmetaFieldMgr not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFmetaFieldMgrLength) {
      moveInverseOFmetaFieldMgrToLastPR( theCtxt, theInverseOFmetaFieldMgr);
    }

      // Get index of relative InverseOFmetaFieldMgr
    int aRelativeIndex = indexOfInverseOFmetaFieldMgrPR( theCtxt, theRelativeInverseOFmetaFieldMgr);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFmetaFieldMgrToLastPR( theCtxt, theInverseOFmetaFieldMgr);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFmetaFieldMgrLength) {
      moveInverseOFmetaFieldMgrToLastPR( theCtxt, theInverseOFmetaFieldMgr);
    }

      // ToMove and relative InverseOFmetaFieldMgr are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aToMoveInverseOFmetaFieldMgr = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theInverseOFmetaFieldMgr;

      // Allocate new array for new version of state of relationship InverseOFmetaFieldMgr
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaFieldMgr = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaFieldMgrLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFmetaFieldMgr, 0, otherInverseOFmetaFieldMgr, 0, aToMoveIndex );
        System.arraycopy( someInverseOFmetaFieldMgr, aToMoveIndex + 1, otherInverseOFmetaFieldMgr, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFmetaFieldMgr[ aRelativeIndex - 1] = aToMoveInverseOFmetaFieldMgr;
        System.arraycopy( someInverseOFmetaFieldMgr, aRelativeIndex, otherInverseOFmetaFieldMgr, aRelativeIndex, aInverseOFmetaFieldMgrLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFmetaFieldMgr, 0, otherInverseOFmetaFieldMgr, 0, aRelativeIndex );
        otherInverseOFmetaFieldMgr[ aRelativeIndex ] = aToMoveInverseOFmetaFieldMgr;
        System.arraycopy( someInverseOFmetaFieldMgr, aRelativeIndex, otherInverseOFmetaFieldMgr, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFmetaFieldMgrLength - 1) {
          System.arraycopy( someInverseOFmetaFieldMgr, aToMoveIndex + 1, otherInverseOFmetaFieldMgr, aToMoveIndex + 1, aInverseOFmetaFieldMgrLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaFieldMgrBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaFieldMgrBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaFieldMgrBefore", null); return;}

      // Set the new collection
    setInverseOFmetaFieldMgrPrivileged( theCtxt, otherInverseOFmetaFieldMgr);
  }





    /* Public move to last accessor for role InverseOFmetaFieldMgr
     */
  public void moveInverseOFmetaFieldMgrToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc theInverseOFmetaFieldMgr) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFmetaFieldMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaFieldMgr = getInverseOFmetaFieldMgrPrivileged( theCtxt);
    if( someInverseOFmetaFieldMgr == null) { return;}

      // Get length of InverseOFmetaFieldMgr array
    int aInverseOFmetaFieldMgrLength = someInverseOFmetaFieldMgr.length;

      // Get index of InverseOFmetaFieldMgr to move
    int aToMoveIndex = indexOfInverseOFmetaFieldMgrPR( theCtxt, theInverseOFmetaFieldMgr);

      // If toMove InverseOFmetaFieldMgr not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFmetaFieldMgrLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv aToMoveInverseOFmetaFieldMgr = (com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv) theInverseOFmetaFieldMgr;

      // Allocate new array for new version of state of relationship InverseOFmetaFieldMgr
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaFieldMgr = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaFieldMgrLength];
    try {
      System.arraycopy( someInverseOFmetaFieldMgr, 0, otherInverseOFmetaFieldMgr, 0, aToMoveIndex );
      System.arraycopy( someInverseOFmetaFieldMgr, aToMoveIndex + 1, otherInverseOFmetaFieldMgr, aToMoveIndex, aInverseOFmetaFieldMgrLength - aToMoveIndex - 1);
      otherInverseOFmetaFieldMgr[ aInverseOFmetaFieldMgrLength - 1] = aToMoveInverseOFmetaFieldMgr;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaFieldMgrToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaFieldMgrToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFmetaFieldMgrToLast", null); return;}

      // Set the new collection
    setInverseOFmetaFieldMgrPrivileged( theCtxt, otherInverseOFmetaFieldMgr);
  }








/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFmetaFieldMgr
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFmetaFieldMgr
     */
  public void addInverseOFmetaFieldMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv theInverseOFmetaFieldMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaFieldMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaFieldMgr = getInverseOFmetaFieldMgrPrivileged( theCtxt);
    if( someInverseOFmetaFieldMgr == null) { return;}

      // Check for new InverseOFmetaFieldMgr already in collection
    int aInverseOFmetaFieldMgrLength = someInverseOFmetaFieldMgr.length;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaFieldMgrLength ; anIndex++) {
      if( theInverseOFmetaFieldMgr.sameAs( theCtxt, someInverseOFmetaFieldMgr[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFmetaFieldMgr element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaFieldMgr = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaFieldMgrLength + 1];
    try {
      System.arraycopy( someInverseOFmetaFieldMgr, 0, otherInverseOFmetaFieldMgr, 0, aInverseOFmetaFieldMgrLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaFieldMgrPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaFieldMgrPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFmetaFieldMgrPrivileged", null); return;}

    otherInverseOFmetaFieldMgr[ aInverseOFmetaFieldMgrLength] = theInverseOFmetaFieldMgr;

      // Set the new collection
    setInverseOFmetaFieldMgrPrivileged( theCtxt, otherInverseOFmetaFieldMgr);
  }









    /* Privileged Write accessor for role InverseOFmetaFieldMgr
     */
  public void removeInverseOFmetaFieldMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv theInverseOFmetaFieldMgr) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFmetaFieldMgr == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] someInverseOFmetaFieldMgr = getInverseOFmetaFieldMgrPrivileged( theCtxt);
    if( someInverseOFmetaFieldMgr == null) { return;}

      // Check for new InverseOFmetaFieldMgr not in collection
    int aInverseOFmetaFieldMgrLength = someInverseOFmetaFieldMgr.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFmetaFieldMgrLength ; anIndex++) {
      if( theInverseOFmetaFieldMgr.sameAs( theCtxt, someInverseOFmetaFieldMgr[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFmetaFieldMgr element
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] otherInverseOFmetaFieldMgr = new com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[ aInverseOFmetaFieldMgrLength - 1];
    try {
      System.arraycopy( someInverseOFmetaFieldMgr, 0, otherInverseOFmetaFieldMgr, 0, aFoundIndex);
      System.arraycopy( someInverseOFmetaFieldMgr, aFoundIndex + 1, otherInverseOFmetaFieldMgr, aFoundIndex, aInverseOFmetaFieldMgrLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaFieldMgrPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaFieldMgrPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFmetaFieldMgrPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv.class}); return;}

      // Set the new collection
    setInverseOFmetaFieldMgrPrivileged( theCtxt, otherInverseOFmetaFieldMgr);
  }






    /* Privileged Read accessor for role InverseOFmetaFieldMgr
     * Guaranteed to return object with same identity of the InverseOFmetaFieldMgr
     */
  public com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] getInverseOFmetaFieldMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFmetaFieldMgr;
  }




    /* Set reference in role InverseOFmetaFieldMgr
     * Used by relationship maintenance machinery
     */
  public void setInverseOFmetaFieldMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] theInverseOFmetaFieldMgrCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv[] aInverseOFmetaFieldMgr = vrInverseOFmetaFieldMgr;
    vrInverseOFmetaFieldMgr = theInverseOFmetaFieldMgrCollection;
      // Propagate change
    change( theCtxt, "InverseOFmetaFieldMgr", aInverseOFmetaFieldMgr, vrInverseOFmetaFieldMgr, "vrInverseOFmetaFieldMgr");
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
      aTraversalConfig.removeFieldMgrsPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetTraversalConfigPrivileged();
      */
    }

    if( theTraversalConfig != null) {
      com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aNewTraversalConfig = (com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv) theTraversalConfig;
      aNewTraversalConfig.addFieldMgrsPrivileged( theCtxt, this);
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
      aTraversalConfig.removeFieldMgrsPrivileged( theCtxt, this);
    }
    vrTraversalConfig = theTraversalConfig;
      // If there was change, propagate
    if( (aTraversalConfig != null && !aTraversalConfig.sameAs( theCtxt, theTraversalConfig)) || (aTraversalConfig == null && theTraversalConfig != null)) {
      change( theCtxt, "TraversalConfig", aTraversalConfig, vrTraversalConfig, "vrTraversalConfig");
    }
  }















/****************************************************************************
 *  Implementation of  internal destructor of M3FieldMgr
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 

 
      // When deleting : unlink related InverseOFmetaFieldMgr
    com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc[] someInverseOFmetaFieldMgr = getInverseOFmetaFieldMgr( theCtxt);
    if( someInverseOFmetaFieldMgr != null) {
      int aInverseOFmetaFieldMgrLength = someInverseOFmetaFieldMgr.length;
      for( int anIndex = 0 ; anIndex < aInverseOFmetaFieldMgrLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3AttributeConfigIfc aInverseOFmetaFieldMgr = someInverseOFmetaFieldMgr[ anIndex];
        if( aInverseOFmetaFieldMgr != null) {
          removeInverseOFmetaFieldMgr( theCtxt, aInverseOFmetaFieldMgr);
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
      vm3Type = com.dosmil_e.m3.traversal.meta.M3FieldMgrMeta.getStaticM3Type( theCtxt);
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


