package com.dosmil_e.m3.traversal.base;

import com.dosmil_e.modelbase.support.*;
import com.dosmil_e.modelbase.flattrx.*;

import java.lang.reflect.Field;

public class M3AttributeConfigBase
   extends com.dosmil_e.m3.withm3.impl.MMElementWithM3Impl
    implements com.dosmil_e.m3.traversal.priv.M3AttributeConfigPriv   {

/****************************************************************************
 *  Static metainformation for Type of the EAIProject metamodel element
 ****************************************************************************/
  public static com.dosmil_e.m3.core.ifc.M3TypeIfc vm3Type;



/****************************************************************************
 *  State storage for Attributes of the M3AttributeConfig metamodel element
 ****************************************************************************/



/****************************************************************************
 *  State storage for the Relationships of the M3AttributeConfig metamodel element
 ****************************************************************************/
	protected com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] vrInverseOFattributeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[0]; 

	protected com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv vrTraversalConfig; 

	protected com.dosmil_e.m3.core.priv.M3AttributePriv vrMetaAttribute; 

	protected com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv vrMetaFieldMgr; 






/****************************************************************************
 *  Constructors of the M3AttributeConfig metamodel element
 ****************************************************************************/

  public M3AttributeConfigBase() {
    super();
  }


  public M3AttributeConfigBase( EAIMMCtxtIfc theCtxt) {
    super( theCtxt);
  }

  public M3AttributeConfigBase( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theName) {
    super( theCtxt, theName);
  }


/****************************************************************************
 *  Implementation of the M3AttributeConfigIfc and M3AttributeConfigPriv interfaces
 ****************************************************************************/

/****************************************************************************
 *  Implementation of attributes of M3AttributeConfig
 ****************************************************************************/

 




/****************************************************************************
 *  Implementation of relationships of M3AttributeConfig
 ****************************************************************************/

 
/****************************************************************************
 *  Implementation of public interface for MANY to MANY relationship InverseOFattributeConfigs
 ****************************************************************************/


    /* Public Read accessor for role InverseOFattributeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFattributeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFattributeConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFattributeConfigsPR( theCtxt);
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

    /* Public InverseOFattributeConfigs number access
     */
  public int numInverseOFattributeConfigs( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numInverseOFattributeConfigsPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numInverseOFattributeConfigsPR( theCtxt);
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



    /* Public InverseOFattributeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getInverseOFattributeConfigsAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getInverseOFattributeConfigsAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getInverseOFattributeConfigsAtPR( theCtxt, theIndex);
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


    /* Public InverseOFattributeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findInverseOFattributeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findInverseOFattributeConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findInverseOFattributeConfigsNamedPR( theCtxt, theMMName);
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




    /* Public InverseOFattributeConfigs is related predicate
     */
  public boolean hasInverseOFattributeConfigsNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFattributeConfigsNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFattributeConfigsNamedPR( theCtxt, theMMName);
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



    /* Transactional InverseOFattributeConfigs is related  predicate
     */
  public boolean hasInverseOFattributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs);
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


    /* Public InverseOFattributeConfigs index access
     */
  public int indexOfInverseOFattributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs);
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
  public void addInverseOFattributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs);
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
  public void addInverseOFattributeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFattributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      addInverseOFattributeConfigsBeforePR( theCtxt, theInverseOFattributeConfigs, theRelativeInverseOFattributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        addInverseOFattributeConfigsBeforePR( theCtxt, theInverseOFattributeConfigs, theRelativeInverseOFattributeConfigs);
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





    /* Transactional Public Write Remove accessor for role InverseOFattributeConfigs
     */
  public void removeInverseOFattributeConfigs( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      removeInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        removeInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs);
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



    /* Public reorder accessor for role InverseOFattributeConfigs
     */
  public void moveInverseOFattributeConfigsBefore( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFattributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFattributeConfigsBeforePR( theCtxt, theInverseOFattributeConfigs, theRelativeInverseOFattributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFattributeConfigsBeforePR( theCtxt, theInverseOFattributeConfigs, theRelativeInverseOFattributeConfigs);
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



    /* Public reorder accessor for role InverseOFattributeConfigs
     */
  public void moveInverseOFattributeConfigsToLast( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      moveInverseOFattributeConfigsToLastPR( theCtxt, theInverseOFattributeConfigs);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        moveInverseOFattributeConfigsToLastPR( theCtxt, theInverseOFattributeConfigs);
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
 *  Implementation of internal operations for relationship InverseOFattributeConfigs
 ****************************************************************************/


    /* Public Read accessor for role InverseOFattributeConfigs
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] getInverseOFattributeConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFattributeConfigs = getInverseOFattributeConfigsPrivileged( theCtxt);
    if( someInverseOFattributeConfigs == null) { return null;}

    int aInverseOFattributeConfigsLength = someInverseOFattributeConfigs.length;
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] otherInverseOFattributeConfigs = new com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[ aInverseOFattributeConfigsLength];
    try { System.arraycopy( someInverseOFattributeConfigs, 0, otherInverseOFattributeConfigs, 0, aInverseOFattributeConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFattributeConfigs", null); return null;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFattributeConfigs", null); return null;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "getInverseOFattributeConfigs", null); return null;}


    return otherInverseOFattributeConfigs;
  }





    /* Public InverseOFattributeConfigs finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc findInverseOFattributeConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

      // Do not add null values to the collection
    if( theMMName == null) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFattributeConfigs = getInverseOFattributeConfigsPrivileged( theCtxt);
    if( someInverseOFattributeConfigs == null) { return null;}

      // Check for new InverseOFattributeConfigs already in collection
    int aInverseOFattributeConfigsLength = someInverseOFattributeConfigs.length;
    for( int anIndex = 0 ; anIndex < aInverseOFattributeConfigsLength ; anIndex++) {
      com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aInverseOFattributeConfigs = someInverseOFattributeConfigs[ anIndex];
      if( aInverseOFattributeConfigs.sameNameAs( theCtxt, theMMName)) { return aInverseOFattributeConfigs;}
    }
    return null;
  }



    /* Public InverseOFattributeConfigs finder predicate by name
     */
  public boolean hasInverseOFattributeConfigsNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    return findInverseOFattributeConfigsNamedPR( theCtxt, theMMName) != null;
  }



    /* Public InverseOFattributeConfigs read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc getInverseOFattributeConfigsAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {

      // No indexes < 0
    if( theIndex < 0) { return null;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFattributeConfigs = getInverseOFattributeConfigsPrivileged( theCtxt);
    if( someInverseOFattributeConfigs == null) { return null;}

      // Get number of InverseOFattributeConfigs
    int aInverseOFattributeConfigsLength = someInverseOFattributeConfigs.length;

      // Verify index within array length
    if( theIndex >= aInverseOFattributeConfigsLength) { return null;}

      // Get indexed InverseOFattributeConfigs
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aInverseOFattributeConfigs = someInverseOFattributeConfigs[ theIndex];

    return aInverseOFattributeConfigs;
  }



    /* Public InverseOFattributeConfigs is related predicate
     */
  public boolean hasInverseOFattributeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException {
    return indexOfInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs) >= 0;
  }


    /* Public InverseOFattributeConfigs index access
     */
  public int indexOfInverseOFattributeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException {
      // Do not add null values to the collection
    if( theInverseOFattributeConfigs == null) { return -1;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFattributeConfigs = getInverseOFattributeConfigsPrivileged( theCtxt);
    if( someInverseOFattributeConfigs == null) { return -1;}

      // Check for new InverseOFattributeConfigs already in collection
    int aInverseOFattributeConfigsLength = someInverseOFattributeConfigs.length;
    for( int anIndex = 0 ; anIndex < aInverseOFattributeConfigsLength ; anIndex++) {
      if( someInverseOFattributeConfigs[ anIndex].sameAs( theCtxt, theInverseOFattributeConfigs)) { return anIndex;}
    }
    return -1;
  }


    /* Public InverseOFattributeConfigs number access
     */
  public int numInverseOFattributeConfigsPR( EAIMMCtxtIfc theCtxt) throws EAIException {
      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFattributeConfigs = getInverseOFattributeConfigsPrivileged( theCtxt);
    if( someInverseOFattributeConfigs == null) { return 0;}

      // Check for new InverseOFattributeConfigs already in collection
    int aInverseOFattributeConfigsLength = someInverseOFattributeConfigs.length;
    return aInverseOFattributeConfigsLength;
  }




    /* Public Write accessor for role InverseOFattributeConfigs
     */
  public void addInverseOFattributeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFattributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFattributeConfigs = getInverseOFattributeConfigsPrivileged( theCtxt);
    if( someInverseOFattributeConfigs == null) { return;}

      // Check for new InverseOFattributeConfigs already in collection
    int aInverseOFattributeConfigsLength = someInverseOFattributeConfigs.length;
    for( int anIndex = 0 ; anIndex < aInverseOFattributeConfigsLength ; anIndex++) {
      if( theInverseOFattributeConfigs.sameAs( theCtxt, someInverseOFattributeConfigs[ anIndex])) { return;}
    }

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewInverseOFattributeConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFattributeConfigs;

      // Link reverse ref to this object
    aNewInverseOFattributeConfigs.addAttributeConfigsPrivileged( theCtxt, this);

      // Grow collection and add new InverseOFattributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFattributeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFattributeConfigsLength + 1];
    try { System.arraycopy( someInverseOFattributeConfigs, 0, otherInverseOFattributeConfigs, 0, aInverseOFattributeConfigsLength); }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFattributeConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFattributeConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFattributeConfigs", null); return;}
    otherInverseOFattributeConfigs[ aInverseOFattributeConfigsLength] = aNewInverseOFattributeConfigs;

      // Set the new collection
    setInverseOFattributeConfigsPrivileged( theCtxt, otherInverseOFattributeConfigs);
  }


    /* Public ordered Write accessor for role InverseOFattributeConfigs
     */
  public void addInverseOFattributeConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFattributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFattributeConfigs == null) { return;}

      // If relative InverseOFattributeConfigs is null, perform normal add operation
    if( theRelativeInverseOFattributeConfigs == null) {
      addInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFattributeConfigs = getInverseOFattributeConfigsPrivileged( theCtxt);
    if( someInverseOFattributeConfigs == null) { return;}


      // Get index of relative InverseOFattributeConfigs
    int aRelativeIndex = indexOfInverseOFattributeConfigsPR( theCtxt, theRelativeInverseOFattributeConfigs);

      // If relative not found, perform normal add operation
    if( aRelativeIndex < 0) {
      addInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs);
    }

      // Get length of InverseOFattributeConfigs array
    int aInverseOFattributeConfigsLength = someInverseOFattributeConfigs.length;

      // If relative index not within array boundary, perform normal add operation (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFattributeConfigsLength) {
      addInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs);
    }

      // Check for new InverseOFattributeConfigs already in collection
    if( hasInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs)) { return;}


    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewInverseOFattributeConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFattributeConfigs;

      // Link reverse ref to this object
    aNewInverseOFattributeConfigs.addAttributeConfigsPrivileged( theCtxt, this);

      // Allocate new array for new version of state of relationship InverseOFattributeConfigs
      // Grow collection and add new InverseOFattributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFattributeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFattributeConfigsLength + 1];
    try {
      if( aRelativeIndex > 0) {
        System.arraycopy( someInverseOFattributeConfigs, 0, otherInverseOFattributeConfigs, 0, aRelativeIndex );
      }
      System.arraycopy( someInverseOFattributeConfigs, aRelativeIndex, otherInverseOFattributeConfigs, aRelativeIndex + 1, aInverseOFattributeConfigsLength - aRelativeIndex);
      otherInverseOFattributeConfigs[ aRelativeIndex] = aNewInverseOFattributeConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFattributeConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFattributeConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFattributeConfigsBefore", null); return;}

      // Set the new collection
    setInverseOFattributeConfigsPrivileged( theCtxt, otherInverseOFattributeConfigs);
  }



    /* Public Write accessor for role InverseOFattributeConfigs
     */
  public void removeInverseOFattributeConfigsPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFattributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFattributeConfigs = getInverseOFattributeConfigsPrivileged( theCtxt);
    if( someInverseOFattributeConfigs == null) { return;}

      // Check for new InverseOFattributeConfigs not in collection
    int aInverseOFattributeConfigsLength = someInverseOFattributeConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFattributeConfigsLength ; anIndex++) {
      if( theInverseOFattributeConfigs.sameAs( theCtxt, someInverseOFattributeConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aNewInverseOFattributeConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFattributeConfigs;

      // Unlink reverse ref from the new related object
    aNewInverseOFattributeConfigs.removeAttributeConfigsPrivileged( theCtxt, this);

      // Shrink collection removing InverseOFattributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFattributeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFattributeConfigsLength - 1];
    try {
      System.arraycopy( someInverseOFattributeConfigs, 0, otherInverseOFattributeConfigs, 0, aFoundIndex);
      System.arraycopy( someInverseOFattributeConfigs, aFoundIndex + 1, otherInverseOFattributeConfigs, aFoundIndex, aInverseOFattributeConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFattributeConfigs", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFattributeConfigs", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFattributeConfigs", null); return;}

      // Set the new collection
    setInverseOFattributeConfigsPrivileged( theCtxt, otherInverseOFattributeConfigs);
  }




    /* Public reorder accessor for role InverseOFattributeConfigs
     */
  public void moveInverseOFattributeConfigsBeforePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theRelativeInverseOFattributeConfigs) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFattributeConfigs == null) { return;}

      // If relative InverseOFattributeConfigs is null, perform move to last position
    if( theRelativeInverseOFattributeConfigs == null) {
      moveInverseOFattributeConfigsToLastPR( theCtxt, theInverseOFattributeConfigs);
    }

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFattributeConfigs = getInverseOFattributeConfigsPrivileged( theCtxt);
    if( someInverseOFattributeConfigs == null) { return;}

      // Get length of InverseOFattributeConfigs array
    int aInverseOFattributeConfigsLength = someInverseOFattributeConfigs.length;

      // Get index of InverseOFattributeConfigs to move
    int aToMoveIndex = indexOfInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs);
      // If toMove InverseOFattributeConfigs not found,nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index not within array boundary, perform move to last position (even if this is an internal error)
    if( aToMoveIndex >= aInverseOFattributeConfigsLength) {
      moveInverseOFattributeConfigsToLastPR( theCtxt, theInverseOFattributeConfigs);
    }

      // Get index of relative InverseOFattributeConfigs
    int aRelativeIndex = indexOfInverseOFattributeConfigsPR( theCtxt, theRelativeInverseOFattributeConfigs);

      // If relative not found, perform move to last position
    if( aRelativeIndex < 0) {
      moveInverseOFattributeConfigsToLastPR( theCtxt, theInverseOFattributeConfigs);
    }

      // If relative index not within array boundary, perform move to last position (even if this is an internal error)
    if( aRelativeIndex >= aInverseOFattributeConfigsLength) {
      moveInverseOFattributeConfigsToLastPR( theCtxt, theInverseOFattributeConfigs);
    }

      // ToMove and relative InverseOFattributeConfigs are same : no move
    if( aToMoveIndex == aRelativeIndex) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aToMoveInverseOFattributeConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFattributeConfigs;

      // Allocate new array for new version of state of relationship InverseOFattributeConfigs
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFattributeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFattributeConfigsLength];
    try {
      if( aToMoveIndex < aRelativeIndex) {
        System.arraycopy( someInverseOFattributeConfigs, 0, otherInverseOFattributeConfigs, 0, aToMoveIndex );
        System.arraycopy( someInverseOFattributeConfigs, aToMoveIndex + 1, otherInverseOFattributeConfigs, aToMoveIndex, aRelativeIndex - aToMoveIndex - 1);
        otherInverseOFattributeConfigs[ aRelativeIndex - 1] = aToMoveInverseOFattributeConfigs;
        System.arraycopy( someInverseOFattributeConfigs, aRelativeIndex, otherInverseOFattributeConfigs, aRelativeIndex, aInverseOFattributeConfigsLength - aRelativeIndex);
      }
      else {
        System.arraycopy( someInverseOFattributeConfigs, 0, otherInverseOFattributeConfigs, 0, aRelativeIndex );
        otherInverseOFattributeConfigs[ aRelativeIndex ] = aToMoveInverseOFattributeConfigs;
        System.arraycopy( someInverseOFattributeConfigs, aRelativeIndex, otherInverseOFattributeConfigs, aRelativeIndex + 1, aToMoveIndex - aRelativeIndex);
        if( aToMoveIndex < aInverseOFattributeConfigsLength - 1) {
          System.arraycopy( someInverseOFattributeConfigs, aToMoveIndex + 1, otherInverseOFattributeConfigs, aToMoveIndex + 1, aInverseOFattributeConfigsLength - aToMoveIndex - 1);
        }
      }
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFattributeConfigsBefore", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFattributeConfigsBefore", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFattributeConfigsBefore", null); return;}

      // Set the new collection
    setInverseOFattributeConfigsPrivileged( theCtxt, otherInverseOFattributeConfigs);
  }





    /* Public move to last accessor for role InverseOFattributeConfigs
     */
  public void moveInverseOFattributeConfigsToLastPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc theInverseOFattributeConfigs) throws EAIException {

      // Null value is nothing to move
    if( theInverseOFattributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFattributeConfigs = getInverseOFattributeConfigsPrivileged( theCtxt);
    if( someInverseOFattributeConfigs == null) { return;}

      // Get length of InverseOFattributeConfigs array
    int aInverseOFattributeConfigsLength = someInverseOFattributeConfigs.length;

      // Get index of InverseOFattributeConfigs to move
    int aToMoveIndex = indexOfInverseOFattributeConfigsPR( theCtxt, theInverseOFattributeConfigs);

      // If toMove InverseOFattributeConfigs not found, nothing to move
    if( aToMoveIndex < 0) { return;}

      // If toMove index is last, or not within array boundary, move to last is already done
    if( aToMoveIndex >= aInverseOFattributeConfigsLength - 1) { return;}

    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv aToMoveInverseOFattributeConfigs = (com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv) theInverseOFattributeConfigs;

      // Allocate new array for new version of state of relationship InverseOFattributeConfigs
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFattributeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFattributeConfigsLength];
    try {
      System.arraycopy( someInverseOFattributeConfigs, 0, otherInverseOFattributeConfigs, 0, aToMoveIndex );
      System.arraycopy( someInverseOFattributeConfigs, aToMoveIndex + 1, otherInverseOFattributeConfigs, aToMoveIndex, aInverseOFattributeConfigsLength - aToMoveIndex - 1);
      otherInverseOFattributeConfigs[ aInverseOFattributeConfigsLength - 1] = aToMoveInverseOFattributeConfigs;
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFattributeConfigsToLast", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFattributeConfigsToLast", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "moveInverseOFattributeConfigsToLast", null); return;}

      // Set the new collection
    setInverseOFattributeConfigsPrivileged( theCtxt, otherInverseOFattributeConfigs);
  }







/****************************************************************************
 *  Implementation of privileged interface for relationship InverseOFattributeConfigs
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Write accessor for role InverseOFattributeConfigs
     */
  public void addInverseOFattributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFattributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFattributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFattributeConfigs = getInverseOFattributeConfigsPrivileged( theCtxt);
    if( someInverseOFattributeConfigs == null) { return;}

      // Check for new InverseOFattributeConfigs already in collection
    int aInverseOFattributeConfigsLength = someInverseOFattributeConfigs.length;
    for( int anIndex = 0 ; anIndex < aInverseOFattributeConfigsLength ; anIndex++) {
      if( theInverseOFattributeConfigs.sameAs( theCtxt, someInverseOFattributeConfigs[ anIndex])) { return;}
    }

      // Grow collection and add new InverseOFattributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFattributeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFattributeConfigsLength + 1];
    try {
      System.arraycopy( someInverseOFattributeConfigs, 0, otherInverseOFattributeConfigs, 0, aInverseOFattributeConfigsLength);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFattributeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFattributeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "addInverseOFattributeConfigsPrivileged", new Class[] { com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv.class}); return;}

    otherInverseOFattributeConfigs[ aInverseOFattributeConfigsLength] = theInverseOFattributeConfigs;

      // Set the new collection
    setInverseOFattributeConfigsPrivileged( theCtxt, otherInverseOFattributeConfigs);
  }









    /* Privileged Write accessor for role InverseOFattributeConfigs
     */
  public void removeInverseOFattributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv theInverseOFattributeConfigs) throws EAIException {

      // Do not add null values to the collection
    if( theInverseOFattributeConfigs == null) { return;}

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] someInverseOFattributeConfigs = getInverseOFattributeConfigsPrivileged( theCtxt);
    if( someInverseOFattributeConfigs == null) { return;}

      // Check for new InverseOFattributeConfigs not in collection
    int aInverseOFattributeConfigsLength = someInverseOFattributeConfigs.length;
    int aFoundIndex = -1;
    for( int anIndex = 0 ; anIndex < aInverseOFattributeConfigsLength ; anIndex++) {
      if( theInverseOFattributeConfigs.sameAs( theCtxt, someInverseOFattributeConfigs[ anIndex])) { aFoundIndex = anIndex;}
    }
    if( aFoundIndex < 0) { return;}

      // Shrink collection removing InverseOFattributeConfigs element
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] otherInverseOFattributeConfigs = new com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[ aInverseOFattributeConfigsLength - 1];
    try {
      System.arraycopy( someInverseOFattributeConfigs, 0, otherInverseOFattributeConfigs, 0, aFoundIndex);
      System.arraycopy( someInverseOFattributeConfigs, aFoundIndex + 1, otherInverseOFattributeConfigs, aFoundIndex, aInverseOFattributeConfigsLength - aFoundIndex - 1);
    }
    catch( IndexOutOfBoundsException  anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFattributeConfigsPrivileged", null); return;}
    catch( ArrayStoreException        anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFattributeConfigsPrivileged", null); return;}
    catch( NullPointerException       anException) { notifyFatalException( theCtxt,  anException, this.getClass(), "removeInverseOFattributeConfigsPrivileged", null); return;}

      // Set the new collection
    setInverseOFattributeConfigsPrivileged( theCtxt, otherInverseOFattributeConfigs);
  }






    /* Privileged Read accessor for role InverseOFattributeConfigs
     * Guaranteed to return object with same identity of the InverseOFattributeConfigs
     */
  public com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] getInverseOFattributeConfigsPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrInverseOFattributeConfigs;
  }




    /* Set reference in role InverseOFattributeConfigs
     * Used by relationship maintenance machinery
     */
  public void setInverseOFattributeConfigsPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] theInverseOFattributeConfigsCollection) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3NodeConfigPriv[] aInverseOFattributeConfigs = vrInverseOFattributeConfigs;
    vrInverseOFattributeConfigs = theInverseOFattributeConfigsCollection;
      // Propagate change
    change( theCtxt, "InverseOFattributeConfigs", aInverseOFattributeConfigs, vrInverseOFattributeConfigs, "vrInverseOFattributeConfigs");
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
      aTraversalConfig.removeAttributeConfigsPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetTraversalConfigPrivileged();
      */
    }

    if( theTraversalConfig != null) {
      com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv aNewTraversalConfig = (com.dosmil_e.m3.traversal.priv.M3TraversalConfigPriv) theTraversalConfig;
      aNewTraversalConfig.addAttributeConfigsPrivileged( theCtxt, this);
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
      aTraversalConfig.removeAttributeConfigsPrivileged( theCtxt, this);
    }
    vrTraversalConfig = theTraversalConfig;
      // If there was change, propagate
    if( (aTraversalConfig != null && !aTraversalConfig.sameAs( theCtxt, theTraversalConfig)) || (aTraversalConfig == null && theTraversalConfig != null)) {
      change( theCtxt, "TraversalConfig", aTraversalConfig, vrTraversalConfig, "vrTraversalConfig");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship MetaAttribute
 ****************************************************************************/


    /* Public Read accessor for role MetaAttribute
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getMetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaAttributePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaAttributePR( theCtxt);
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

    /* Public MetaAttribute number access
     */
  public int numMetaAttribute( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numMetaAttributePR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numMetaAttributePR( theCtxt);
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



    /* Public MetaAttribute read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getMetaAttributeAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaAttributeAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaAttributeAtPR( theCtxt, theIndex);
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


    /* Public MetaAttribute finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findMetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.core.ifc.M3AttributeIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findMetaAttributeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findMetaAttributeNamedPR( theCtxt, theMMName);
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




    /* Public MetaAttribute is related predicate
     */
  public boolean hasMetaAttributeNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasMetaAttributeNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasMetaAttributeNamedPR( theCtxt, theMMName);
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



    /* Transactional MetaAttribute is related  predicate
     */
  public boolean hasMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theMetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasMetaAttributePR( theCtxt, theMetaAttribute);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasMetaAttributePR( theCtxt, theMetaAttribute);
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


    /* Public MetaAttribute index access
     */
  public int indexOfMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theMetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfMetaAttributePR( theCtxt, theMetaAttribute);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfMetaAttributePR( theCtxt, theMetaAttribute);
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




    /* Public Write accessor for role MetaAttribute
     */
  public void setMetaAttribute( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theMetaAttribute) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setMetaAttributePR( theCtxt, theMetaAttribute);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setMetaAttributePR( theCtxt, theMetaAttribute);
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
 *  Implementation of internal operations for relationship MetaAttribute
 ****************************************************************************/


    /* Public Read accessor for role MetaAttribute
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getMetaAttributePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getMetaAttributePrivileged( theCtxt);
  }


    /* Public MetaAttribute number access
     */
  public int numMetaAttributePR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getMetaAttributePrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public MetaAttribute read accessor by index
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc getMetaAttributeAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getMetaAttributePrivileged( theCtxt);
  }


    /* Public MetaAttribute finder by name
     */
  public com.dosmil_e.m3.core.ifc.M3AttributeIfc findMetaAttributeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aMetaAttribute = getMetaAttributePrivileged( theCtxt);
    if( aMetaAttribute == null) { return null;}

    if( !aMetaAttribute.sameNameAs( theCtxt, theMMName)) { return null;}

    return aMetaAttribute;
  }


    /* Public MetaAttribute finder predicate by name
     */
  public boolean hasMetaAttributeNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aMetaAttribute = getMetaAttributePrivileged( theCtxt);
    if( aMetaAttribute == null) { return false;}

    return aMetaAttribute.sameNameAs( theCtxt, theMMName);
  }



    /* Public MetaAttribute is related predicate
     */
  public boolean hasMetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theMetaAttribute) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aMetaAttribute = getMetaAttributePrivileged( theCtxt);
    if( aMetaAttribute == null) { return false;}

    return aMetaAttribute.sameAs( theCtxt, theMetaAttribute);
  }




    /* Public MetaAttribute index access
     */
  public int indexOfMetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theMetaAttribute) throws EAIException {
    if( !hasMetaAttributePR( theCtxt, theMetaAttribute)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role MetaAttribute
     */
  public void setMetaAttributePR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.ifc.M3AttributeIfc theMetaAttribute) throws EAIException {

      // Get current value
    com.dosmil_e.m3.core.priv.M3AttributePriv aMetaAttribute = getMetaAttributePrivileged( theCtxt);
      // Check for new MetaAttribute same as current one
    if( aMetaAttribute != null && aMetaAttribute.sameAs( theCtxt, theMetaAttribute)) { return;}

    if( aMetaAttribute != null) {
      aMetaAttribute.removeInverseOFmetaAttributePrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetMetaAttributePrivileged();
      */
    }

    if( theMetaAttribute != null) {
      com.dosmil_e.m3.core.priv.M3AttributePriv aNewMetaAttribute = (com.dosmil_e.m3.core.priv.M3AttributePriv) theMetaAttribute;
      aNewMetaAttribute.addInverseOFmetaAttributePrivileged( theCtxt, this);
      setMetaAttributePrivileged( theCtxt, aNewMetaAttribute);
    }
    else {
      setMetaAttributePrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship MetaAttribute
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role MetaAttribute
     * Guaranteed to return object with same identity of the MetaAttribute
     */
  public com.dosmil_e.m3.core.priv.M3AttributePriv getMetaAttributePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrMetaAttribute;
  }




    /* Remove current reference in role MetaAttribute
     * Used by relationship maintenance machinery
     */
  public void unsetMetaAttributePrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aMetaAttribute = vrMetaAttribute;
    vrMetaAttribute = null;
      // If there was change, propagate
    if( aMetaAttribute != null) {
      change( theCtxt, "MetaAttribute", aMetaAttribute, vrMetaAttribute, "vrMetaAttribute");
    }
  }





    /* Set reference in role MetaAttribute
     * Used by relationship maintenance machinery
     */
  public void setMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theMetaAttribute) throws EAIException {
    com.dosmil_e.m3.core.ifc.M3AttributeIfc aMetaAttribute = vrMetaAttribute;
    vrMetaAttribute = theMetaAttribute;
      // If there was change, propagate
    if( (aMetaAttribute != null && !aMetaAttribute.sameAs( theCtxt, theMetaAttribute)) || (aMetaAttribute == null && theMetaAttribute != null)) {
      change( theCtxt, "MetaAttribute", aMetaAttribute, vrMetaAttribute, "vrMetaAttribute");
    }
  }





    /* Unset currently related MetaAttribute and
     * Set reference in role MetaAttribute
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetMetaAttributePrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.core.priv.M3AttributePriv theMetaAttribute) throws EAIException {
    com.dosmil_e.m3.core.priv.M3AttributePriv aMetaAttribute = vrMetaAttribute;
    if( aMetaAttribute != null) {
      aMetaAttribute.removeInverseOFmetaAttributePrivileged( theCtxt, this);
    }
    vrMetaAttribute = theMetaAttribute;
      // If there was change, propagate
    if( (aMetaAttribute != null && !aMetaAttribute.sameAs( theCtxt, theMetaAttribute)) || (aMetaAttribute == null && theMetaAttribute != null)) {
      change( theCtxt, "MetaAttribute", aMetaAttribute, vrMetaAttribute, "vrMetaAttribute");
    }
  }











/****************************************************************************
 *  Implementation of public interface for ONE to MANY, side ONE relationship MetaFieldMgr
 ****************************************************************************/


    /* Public Read accessor for role MetaFieldMgr
     * Returns a copy of the collection, to avoid external changes to the relationship
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc getMetaFieldMgr( EAIMMCtxtIfc theCtxt) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaFieldMgrPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaFieldMgrPR( theCtxt);
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

    /* Public MetaFieldMgr number access
     */
  public int numMetaFieldMgr( EAIMMCtxtIfc theCtxt) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = 0;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = numMetaFieldMgrPR( theCtxt);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = numMetaFieldMgrPR( theCtxt);
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



    /* Public MetaFieldMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc getMetaFieldMgrAt( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = getMetaFieldMgrAtPR( theCtxt, theIndex);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = getMetaFieldMgrAtPR( theCtxt, theIndex);
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


    /* Public MetaFieldMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc findMetaFieldMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {

    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aResult = null;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = findMetaFieldMgrNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = findMetaFieldMgrNamedPR( theCtxt, theMMName);
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




    /* Public MetaFieldMgr is related predicate
     */
  public boolean hasMetaFieldMgrNamed( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasMetaFieldMgrNamedPR( theCtxt, theMMName);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasMetaFieldMgrNamedPR( theCtxt, theMMName);
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



    /* Transactional MetaFieldMgr is related  predicate
     */
  public boolean hasMetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theMetaFieldMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean aResult = false;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = hasMetaFieldMgrPR( theCtxt, theMetaFieldMgr);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = hasMetaFieldMgrPR( theCtxt, theMetaFieldMgr);
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


    /* Public MetaFieldMgr index access
     */
  public int indexOfMetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theMetaFieldMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    int aResult = -1;

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return aResult;}
    if( aTrxMgr.inTransaction()) {
      aResult = indexOfMetaFieldMgrPR( theCtxt, theMetaFieldMgr);
      return aResult;
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        aResult = indexOfMetaFieldMgrPR( theCtxt, theMetaFieldMgr);
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




    /* Public Write accessor for role MetaFieldMgr
     */
  public void setMetaFieldMgr( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theMetaFieldMgr) throws EAIException {
    if( theCtxt == null) { throw new EAIFlatTransactionWrongUseException();}

    EAIFlatTransactionMgrIfc aTrxMgr = theCtxt.getFlatTrxMgr();
    if( aTrxMgr == null)                  { return;}
    if( aTrxMgr.inTransaction()) {
      setMetaFieldMgrPR( theCtxt, theMetaFieldMgr);
    }

    EAIFlatTrxBlockId aBlockId = theCtxt.getFlatTrxMgr().newBlockId();
    if( aBlockId == null) { throw new EAIFlatTransactionWrongUseException();}
    boolean anIsDone = false;
    try {
      try {
        setMetaFieldMgrPR( theCtxt, theMetaFieldMgr);
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
 *  Implementation of internal operations for relationship MetaFieldMgr
 ****************************************************************************/


    /* Public Read accessor for role MetaFieldMgr
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc getMetaFieldMgrPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getMetaFieldMgrPrivileged( theCtxt);
  }


    /* Public MetaFieldMgr number access
     */
  public int numMetaFieldMgrPR( EAIMMCtxtIfc theCtxt) throws EAIException {
    return getMetaFieldMgrPrivileged( theCtxt) == null ? 0 : 1;
  }

    /* Public MetaFieldMgr read accessor by index
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc getMetaFieldMgrAtPR( EAIMMCtxtIfc theCtxt, int theIndex) throws EAIException {
    if( theIndex != 0 ) { return null;}
    return getMetaFieldMgrPrivileged( theCtxt);
  }


    /* Public MetaFieldMgr finder by name
     */
  public com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc findMetaFieldMgrNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    if( theMMName == null ) { return null;}
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aMetaFieldMgr = getMetaFieldMgrPrivileged( theCtxt);
    if( aMetaFieldMgr == null) { return null;}

    if( !aMetaFieldMgr.sameNameAs( theCtxt, theMMName)) { return null;}

    return aMetaFieldMgr;
  }


    /* Public MetaFieldMgr finder predicate by name
     */
  public boolean hasMetaFieldMgrNamedPR( EAIMMCtxtIfc theCtxt, EAIMMNameIfc theMMName) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aMetaFieldMgr = getMetaFieldMgrPrivileged( theCtxt);
    if( aMetaFieldMgr == null) { return false;}

    return aMetaFieldMgr.sameNameAs( theCtxt, theMMName);
  }



    /* Public MetaFieldMgr is related predicate
     */
  public boolean hasMetaFieldMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theMetaFieldMgr) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aMetaFieldMgr = getMetaFieldMgrPrivileged( theCtxt);
    if( aMetaFieldMgr == null) { return false;}

    return aMetaFieldMgr.sameAs( theCtxt, theMetaFieldMgr);
  }




    /* Public MetaFieldMgr index access
     */
  public int indexOfMetaFieldMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theMetaFieldMgr) throws EAIException {
    if( !hasMetaFieldMgrPR( theCtxt, theMetaFieldMgr)) { return -1;}

    return 0;
  }





    /* Public Write accessor for role MetaFieldMgr
     */
  public void setMetaFieldMgrPR( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc theMetaFieldMgr) throws EAIException {

      // Get current value
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv aMetaFieldMgr = getMetaFieldMgrPrivileged( theCtxt);
      // Check for new MetaFieldMgr same as current one
    if( aMetaFieldMgr != null && aMetaFieldMgr.sameAs( theCtxt, theMetaFieldMgr)) { return;}

    if( aMetaFieldMgr != null) {
      aMetaFieldMgr.removeInverseOFmetaFieldMgrPrivileged( theCtxt, this);
      /* Removed, to avoid double change propagation
      * unsetMetaFieldMgrPrivileged();
      */
    }

    if( theMetaFieldMgr != null) {
      com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv aNewMetaFieldMgr = (com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv) theMetaFieldMgr;
      aNewMetaFieldMgr.addInverseOFmetaFieldMgrPrivileged( theCtxt, this);
      setMetaFieldMgrPrivileged( theCtxt, aNewMetaFieldMgr);
    }
    else {
      setMetaFieldMgrPrivileged( theCtxt, null);
    }

  }





/****************************************************************************
 *  Implementation of privileged interface for relationship MetaFieldMgr
 *  used by related model elements to maintain bidirectional relationships
 ****************************************************************************/


    /* Privileged Read accessor for role MetaFieldMgr
     * Guaranteed to return object with same identity of the MetaFieldMgr
     */
  public com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv getMetaFieldMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    return vrMetaFieldMgr;
  }




    /* Remove current reference in role MetaFieldMgr
     * Used by relationship maintenance machinery
     */
  public void unsetMetaFieldMgrPrivileged( EAIMMCtxtIfc theCtxt) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aMetaFieldMgr = vrMetaFieldMgr;
    vrMetaFieldMgr = null;
      // If there was change, propagate
    if( aMetaFieldMgr != null) {
      change( theCtxt, "MetaFieldMgr", aMetaFieldMgr, vrMetaFieldMgr, "vrMetaFieldMgr");
    }
  }





    /* Set reference in role MetaFieldMgr
     * Used by relationship maintenance machinery
     */
  public void setMetaFieldMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv theMetaFieldMgr) throws EAIException {
    com.dosmil_e.m3.traversal.ifc.M3FieldMgrIfc aMetaFieldMgr = vrMetaFieldMgr;
    vrMetaFieldMgr = theMetaFieldMgr;
      // If there was change, propagate
    if( (aMetaFieldMgr != null && !aMetaFieldMgr.sameAs( theCtxt, theMetaFieldMgr)) || (aMetaFieldMgr == null && theMetaFieldMgr != null)) {
      change( theCtxt, "MetaFieldMgr", aMetaFieldMgr, vrMetaFieldMgr, "vrMetaFieldMgr");
    }
  }





    /* Unset currently related MetaFieldMgr and
     * Set reference in role MetaFieldMgr
     * Used by relationship maintenance machinery
     */
  public void unsetAndSetMetaFieldMgrPrivileged( EAIMMCtxtIfc theCtxt, com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv theMetaFieldMgr) throws EAIException {
    com.dosmil_e.m3.traversal.priv.M3FieldMgrPriv aMetaFieldMgr = vrMetaFieldMgr;
    if( aMetaFieldMgr != null) {
      aMetaFieldMgr.removeInverseOFmetaFieldMgrPrivileged( theCtxt, this);
    }
    vrMetaFieldMgr = theMetaFieldMgr;
      // If there was change, propagate
    if( (aMetaFieldMgr != null && !aMetaFieldMgr.sameAs( theCtxt, theMetaFieldMgr)) || (aMetaFieldMgr == null && theMetaFieldMgr != null)) {
      change( theCtxt, "MetaFieldMgr", aMetaFieldMgr, vrMetaFieldMgr, "vrMetaFieldMgr");
    }
  }















/****************************************************************************
 *  Implementation of  internal destructor of M3AttributeConfig
 ****************************************************************************/
  public void deletePR( EAIMMCtxtIfc theCtxt)  throws EAIException {

    super.deletePR( theCtxt);

 

 
      // When deleting : unlink related InverseOFattributeConfigs
    com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc[] someInverseOFattributeConfigs = getInverseOFattributeConfigs( theCtxt);
    if( someInverseOFattributeConfigs != null) {
      int aInverseOFattributeConfigsLength = someInverseOFattributeConfigs.length;
      for( int anIndex = 0 ; anIndex < aInverseOFattributeConfigsLength ; anIndex++) {
        com.dosmil_e.m3.traversal.ifc.M3NodeConfigIfc aInverseOFattributeConfigs = someInverseOFattributeConfigs[ anIndex];
        if( aInverseOFattributeConfigs != null) {
          removeInverseOFattributeConfigs( theCtxt, aInverseOFattributeConfigs);
        }
      }
    }
    

    // When deleting unlink related TraversalConfig
  setTraversalConfig( theCtxt, null);


    // When deleting unlink related MetaAttribute
  setMetaAttribute( theCtxt, null);


    // When deleting unlink related MetaFieldMgr
  setMetaFieldMgr( theCtxt, null);



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
      vm3Type = com.dosmil_e.m3.traversal.meta.M3AttributeConfigMeta.getStaticM3Type( theCtxt);
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


